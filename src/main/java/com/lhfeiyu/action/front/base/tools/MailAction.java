package com.lhfeiyu.action.front.base.tools;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.Const;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.HospitalService;
import com.lhfeiyu.service.UserService;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.DateFormat;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.Md5Util;
import com.lhfeiyu.util.SendMail;
import com.lhfeiyu.util.SendMsgUtil;

@Controller
public class MailAction {
	
	@Autowired
	private UserService userService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private HospitalService hospitalService;
	
	private static Logger logger = Logger.getLogger("R");
	
	/*@RequestMapping(value="/loginPasswordReset")
	public ModelAndView  loginPasswordReset(ModelMap modelMap){
		String path = PagePath.loginPasswordReset;
		try{
		}catch(Exception e){
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-MailAction-PAGE-/loginPasswordReset", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}*/
	
	@ResponseBody
	@RequestMapping(value = "/sendMailForResetPassword", method=RequestMethod.POST)
	public JSONObject sendMailForResetPassword(HttpSession session, 
			@RequestParam Integer userType, @RequestParam String loginAccount) {
		JSONObject json = new JSONObject();
		try {
			Map<String,Object> map = CommonGenerator.getHashMap();
			map.put("loginAccount", loginAccount);
			map.put("mainStatus", 1);
			String email = null;
			if(userType == 1){//用户
				User user = userService.selectByCondition(map);
				if(null == user){
					return Result.failure(json, "该账号不存在，请重新输入", "loginAccount_null");
				}
				email = user.getEmail();
			}else if(userType == 2){//医生
				Doctor doctor = doctorService.selectByCondition(map);
				if(null == doctor){
					return Result.failure(json, "该账号不存在，请重新输入", "loginAccount_null");
				}
				email = doctor.getEmail();
			}else if(userType == 3){//诊所
				Hospital hospital = hospitalService.selectByCondition(map);
				if(null == hospital){
					return Result.failure(json, "该账号不存在，请重新输入", "loginAccount_null");
				}
				email = hospital.getEmail();
			}
			if(Check.isNull(email)){
				return Result.failure(json, "您的账号尚未绑定邮箱，无法通过邮箱重置密码，请直接联系客服进行密码重置吧", "mail_invalid");
			}
			
			int verifyCodeNum = 1;
			Object verifyCodeNumObj = session.getAttribute("verifyCodeNum");
			if(null != verifyCodeNumObj){
				verifyCodeNum = (Integer)verifyCodeNumObj;
				if(verifyCodeNum>20){
					return Result.failure(json, "请求验证码的次数太多，请直接联系客服进行密码重置吧", "max_invalid");
				}
			}
			//phone : 短信接口发送短信验证码
			String verifycode = SendMsgUtil.createRandomVcode();
			System.out.println("email_verifycode: "+verifycode);
			
			Date date = new Date();
			String dateStamp = DateFormat.getDateToFormatString(date, "yyyy-MM-dd HH:mm:ss");
			
			session.setAttribute("email_verifycode", verifycode);
			session.setAttribute("email_verifycode_loginAccount", loginAccount);
			session.setAttribute("email_verifycode_time", dateStamp);
			json.put("msg","验证码已发送到您的邮箱,请及时查看！");
			session.setAttribute("verifyCodeNum", ++verifyCodeNum);
			
			String sendTo = email;
			String content = Const.mail_passwordResetContentTemplate.replace("_@REPLACE@_", verifycode);
			
			SendMail.sendMailUser(Const.mail_host, Const.mail_auth, Const.mail_user, Const.mail_password, 
					Const.mail_sendFrom, sendTo, Const.mail_passwordResetTitle, content);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Tools-AJAX-/sendMailForResetPassword", json);
		}
		return Result.success(json);
	}
	
	@ResponseBody
	@RequestMapping(value = "/resetPassword", method=RequestMethod.POST)
	public JSONObject getDictArray(HttpSession session, 
			@RequestParam Integer userType, @RequestParam String emailVerifyCode, 
			@RequestParam String newPassword) {
		JSONObject json = new JSONObject();
		try {
			//Date date = new Date();
			Object verifycodeObj = session.getAttribute("email_verifycode");
			Object loginAccountObj = session.getAttribute("email_verifycode_loginAccount");
			Object dateStampObj = session.getAttribute("email_verifycode_time");
			if(null == verifycodeObj || null == dateStampObj){
				return Result.failure(json, "您尚未正确获取验证码，请重新获取验证码", "verifycode_null");
			}
			Date lastDate = DateFormat.getStringToFormatDate((String)dateStampObj, "yyyy-MM-dd HH:mm:ss");
			Calendar now = Calendar.getInstance();
			Calendar lastTime = Calendar.getInstance();
			lastTime.setTime(lastDate);
			lastTime.add(Calendar.MINUTE, 30);
			if(lastTime.before(now)){
				return Result.failure(json, "验证码已过期，请重新获取验证码", "email_verifycode_overtime");
			}
			if(Check.isNull(newPassword) || newPassword.length()<5){
				return Result.failure(json, "请输入您的新密码，长度不能少于5个字符", "newPassword_null");
			}
			String verifycode = (String)verifycodeObj;
			if(!verifycode.equals(emailVerifyCode)){
				return Result.failure(json, "您输入的验证码不正确", "verifycode_invalid");
			}
			
			String encrypt_pswd = Md5Util.encrypt(newPassword);
			String loginAccount = (String)loginAccountObj;
			Map<String,Object> map = CommonGenerator.getHashMap();
			map.put("loginAccount", loginAccount);
			map.put("mainStatus", 1);
			if(userType == 1){//用户
				User user = userService.selectByCondition(map);
				if(null == user){
					return Result.failure(json, "该账号不存在", "loginAccount_null");
				}
				User user1 = new User();
				user1.setId(user.getId());
				user1.setPassword(encrypt_pswd);
				userService.updateByPrimaryKeySelective(user1);
			}else if(userType == 2){//医生
				Doctor doctor = doctorService.selectByCondition(map);
				if(null == doctor){
					return Result.failure(json, "该账号不存在", "loginAccount_null");
				}
				Doctor doctor1 = new Doctor();
				doctor1.setId(doctor.getId());
				doctor1.setPassword(encrypt_pswd);
				doctorService.updateByPrimaryKeySelective(doctor);
			}else if(userType == 3){//诊所
				Hospital hospital = hospitalService.selectByCondition(map);
				if(null == hospital){
					return Result.failure(json, "该账号不存在", "loginAccount_null");
				}
				Hospital hospital1 = new Hospital();
				hospital1.setId(hospital.getId());
				hospital1.setPassword(encrypt_pswd);
				hospitalService.updateByPrimaryKeySelective(hospital1);
			}
			
			session.removeAttribute("email_verifycode");
			session.removeAttribute("email_verifycode_loginAccount");
			session.removeAttribute("email_verifycode_time");
			
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Tools-AJAX-/resetPassword", json);
		}
		return Result.success(json);
	}
	
	
}

