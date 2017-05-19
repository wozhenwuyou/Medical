package com.lhfeiyu.action.front.domain.doctor;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.AssetsPath;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Dict;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.DoctorPatient;
import com.lhfeiyu.po.ProvinceCityArea;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.DictService;
import com.lhfeiyu.service.DoctorPatientService;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.ProvinceCityAreaService;
import com.lhfeiyu.service.UserService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.Md5Util;
import com.lhfeiyu.util.RequestUtil;

@Controller
public class DoctorPatientAction {
	@Autowired
	private DoctorPatientService dpService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private UserService userService;
	@Autowired
	private ProvinceCityAreaService provinceCityAreaService;
	@Autowired
	private DictService dictService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "/patientAddOrUpdate")
	public ModelAndView addOrUpdatePatient(ModelMap modelMap,HttpServletRequest request
			,@RequestParam(required=false) Integer patientId
			,@RequestParam(required=false) String opt) {
		String path = PagePath.addOrUpdatePatient;
		try {
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == db_doctor)return Result.userSessionInvalid(modelMap,PagePath.doDctorLogin,"doctor");
			modelMap = doctorService.getDoctorData(modelMap,db_doctor,null,false);
			if(null != patientId){
				User user = userService.selectByPrimaryKey(patientId);
				modelMap.put("user", user);
			}
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("higherIdISNULL", 1);
			map.put("mainStatus", 1);
			map.put("orderBy", "id");
			map.put("ascOrdesc", "asc");
			List<ProvinceCityArea> provinceCityAreaList = provinceCityAreaService.selectListByCondition(map);
			modelMap.put("provinceCityAreaList", provinceCityAreaList);
			map.clear();
			map.put("parentCode", "job");
			List<Dict> dictList = dictService.selectListByCondition(map);
			modelMap.put("jobList", dictList);
			modelMap.put("opt", opt);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-PAGE-/addOrUpdatePatient-加载医生添加或修改患者出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/addOrUpdatePatient", method = RequestMethod.POST)
	public JSONObject addOrUpdatePatient(@ModelAttribute User user,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == db_doctor)return Result.userSessionInvalid(json,"doctor");
			
			Date date = new Date();
			
			if(null == user.getId()){//添加
				user.setCreateDoctorId(db_doctor.getId());
				String idCard = user.getIdcardNum();
				Map<String,Object> map = CommonGenerator.getHashMap();
				map.put("idcardNum", idCard);
				int count = userService.selectCountByCondition(map);
				if(count > 0)return Result.failure(json, "该身份证号码已经存在，请重新输入", "idNum_repeat");
				if(Check.isNull(idCard))return Result.failure(json, "请填写身份证号码", "idNum_null");
				
				
				//DiagnoseService addDiagnose 有重复代码
				/*User user = new User();
				user.setSex(diagnose.getPatientSex());
				user.setPhone(diagnose.getPatientPhone());
				if(Check.isNotNull(diagnose.getPatientBirthday())){
					user.setBirthday( DateFormat.getStringToFormatDate(diagnose.getPatientBirthday(), "yyyy-MM-dd") );
				}
				if(Check.isNotNull(diagnose.getPatientJob())){
					user.setJobId(Integer.valueOf(diagnose.getPatientJob()));
				}
				user.setIdcardNum(diagnose.getPatientIdcardNum());
				user.setUsername(diagnose.getPatientName());
				user.setCreateDoctorId(sessionDoctor.getId());*/
				
				user.setCreateDoctorId(db_doctor.getId());
				user.setCreatedAt(date);
				user.setCreatedBy(db_doctor.getRealname());
				user.setMainStatus(1);//医生添加的患者默认停用状态:改为默认广收启用
				if(Check.isNull(user.getPassword())){
					String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultUserPassword);
					user.setPassword(Md5Util.encrypt(dictValue));
				}
				String dictValue = dictService.getDictValueByCode(AssetsPath.code_defaultUserAvatar);
				user.setAvatar(dictValue);
				/*user.setProvince(db_doctor.getProvince());
				user.setCity(db_doctor.getCity());不默认使用医生的省市地址*/
				userService.insert(user);
				
				//if(null != user.getAddDoctorPatient()){}
				map.clear();
				map.put("userId", user.getId());
				map.put("doctorId", db_doctor.getId());
				DoctorPatient doctorPatient = dpService.selectByCondition(map);
				if(null == doctorPatient){
					DoctorPatient dp = new DoctorPatient();
					dp.setDoctorId(db_doctor.getId());
					dp.setUserId(user.getId());
					user.setCreatedAt(date);
					user.setCreatedBy(db_doctor.getRealname());
					dpService.insert(dp);
				}
				
			}else{
				User oldAdmin = userService.selectByPrimaryKey(user.getId());
				if( Check.integerEqual(db_doctor.getId(), oldAdmin.getCreateDoctorId()) ){//自行添加的用户
					
					String phone = user.getPhone();
					String idcardNum = user.getIdcardNum();
					if(Check.isNull(phone)){
						return Result.failure(json, "请输入手机号码", "phone_null");
					}
					if(Check.isNull(idcardNum)){
						return Result.failure(json, "请输入身份证号码", "idcardNum_null");
					}
					Integer adminId = user.getId();
					if(null != adminId){
						boolean checkPhone = true;
						boolean checkIdcardNum = true;
						//User oldAdmin = userService.selectByPrimaryKey(adminId);
						if(null != oldAdmin.getPhone() && phone.equals(oldAdmin.getPhone())){
							checkPhone = false;
						}
						if(null != oldAdmin.getIdcardNum() && idcardNum.equals(oldAdmin.getIdcardNum())){
							checkIdcardNum = false;
						}
						
						Map<String, Object> map = CommonGenerator.getHashMap();
						if(checkPhone){
							map.put("phoneCheck", phone);
							int count = userService.selectCountByCondition(map);
							if(count > 0){
								return Result.failure(json, "手机号码已存在，请重新输入", "phone_repeat");
							}
						}
						if(checkIdcardNum){
							map.clear();
							map.put("idcardNumCheck", idcardNum);
							int count2 = userService.selectCountByCondition(map);
							if(count2 > 0){
								return Result.failure(json, "身份证号码已存在，请重新输入", "idcardNum_repeat");
							}
						}
					}
					
					user.setPassword(null);
					user.setCreateDoctorId(null);
					user.setMainStatus(1);//医生添加的患者默认停用状态:改为默认广收启用
					userService.updateByPrimaryKeySelective(user);
				}else{
					return Result.failure(json, "该患者不是您手动添加的患者，不能修改该患者信息", "auth_lack");
				}
			}
			json.put("id", user.getId());
		}catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/addOrUpdatePatient-医生添加或修改患者出现异常", json);
		}
		return Result.success(json);
	}
	
	/*@ResponseBody
	@RequestMapping(value = "/addOrUpdateDoctorPatient", method = RequestMethod.POST)
	public JSONObject addOrUpdateDoctorPatient(@ModelAttribute User user,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == db_doctor)return Result.userSessionInvalid(json,"doctor");
			if(null == user.getId()){//添加
				user.setCreateDoctorId(db_doctor.getId());
				String idCard = user.getIdcardNum();
				Map<String,Object> map = CommonGenerator.getHashMap();
				map.put("idcardNum", idCard);
				int count = userService.selectCountByCondition(map);
				if(count > 0)return Result.failure(json, "该身份证号码已经存在，请重新输入", "idNum_repeat");
				if(Check.isNull(idCard))return Result.failure(json, "请填写身份证号码", "idNum_null");
				userService.insert(user);
			}
			DoctorPatient dp = new DoctorPatient();
			dp.setDoctorId(db_doctor.getId());
			dp.setUserId(user.getId());
			dpService.insert(dp);
			json.put("id", user.getId());
		}catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/addOrUpdatePatient-医生添加或修改患者出现异常", json);
		}
		return Result.success(json);
	}*/
	
	@ResponseBody
	@RequestMapping(value = "/updatePatientDelete",method=RequestMethod.POST)
	public JSONObject updatePatientDelete(HttpServletRequest request, @RequestParam Integer patientId) {
		JSONObject json = new JSONObject();
		try {
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == session_doctor)return Result.userSessionInvalid(json,"doctor");
			User user = userService.selectByPrimaryKey(patientId);
			if(null == user){
				return Result.failure(json, "患者不存在", "doctor_null");
			}
			//TODO 暂未做权限
			/*Integer sessionDoctorId = db_doctor.getId();
			Integer hospitalId = patient.getHospitalId();
			if(!Check.integerEqual(sessionDoctorId, hospitalId)){
				return Result.failure(json, "您没有权限删除该患者", "authority_error");
			}*/
			Map<String, Object> map = CommonGenerator.getHashMap();
			map.put("userId", patientId);
			map.put("doctorId", session_doctor.getId());
			DoctorPatient dp = dpService.selectByCondition(map);
			if(null != dp){
				dpService.deleteByPrimaryKey(dp.getId());
				if( Check.integerEqual(session_doctor.getId(), user.getCreateDoctorId()) ){//自行添加的用户
					userService.updateDeletedNowById(patientId, session_doctor.getUsername());
				}
			}
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/updatePatientDelete-删除患者出现异常", json);
		}
		return Result.success(json);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getPatientList", method=RequestMethod.POST)
	public JSONObject getPatientList(HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == session_doctor)return Result.userSessionInvalid(json, "doctor");
			HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
			map.put("belongDoctorId", session_doctor.getId());
			List<User> userList = userService.selectListByCondition(map);
			for(User user : userList){
				if(null != user.getCreateDoctorId() && Check.integerEqual(user.getCreateDoctorId(), session_doctor.getId())){
					user.setCanUpdate(1);
				}
			}
			Integer total = userService.selectCountByCondition(map);
			Result.gridData(userList, total, json);
			Result.success(json, "数据加载成功", null);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-User-AJAX-/getPatientList-加载患者列表出现异常", json);
		}
		return json;
	}
	
	
}
