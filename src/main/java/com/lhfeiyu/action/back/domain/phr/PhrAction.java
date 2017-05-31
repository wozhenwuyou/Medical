package com.lhfeiyu.action.back.domain.phr;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.PhrBasicInfo;
import com.lhfeiyu.po.User;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.PhrBasicInfoService;
import com.lhfeiyu.service.UserService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.vo.PhrBasicInfoCmd;

/**
 * 健康档案管理控制器
 * 
 * @author （zouwenji）
 *
 */
@Controller
public class PhrAction {

	// 日志支持
	private static Logger logger = Logger.getLogger(PhrAction.class);

	@Autowired
	private PhrBasicInfoService phrBasicInfoService;// 业务支持
	@Autowired
	private DoctorService doctorService;// 医生
	@Autowired
	private UserService userService;//用户业务

	@InitBinder
	public void initBinder(ServletRequestDataBinder bin) {
		CustomDateEditor cust = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		bin.registerCustomEditor(Date.class, cust);
	}

	/**
	 * 列表页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/phr/doctor/phrList")
	public ModelAndView phrListGET(ModelMap modelMap, HttpServletRequest request) {
		String path = PagePath.FRONT_DOMAIN_DOCTOR_PHR_LIST;
		try {
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == session_doctor)
				return Result.userSessionInvalid(modelMap, PagePath.doDctorLogin);
			// modelMap =
			// doctorService.getFansData(modelMap,session_doctor,null);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Diagnose-PAGE-/phrList-加载居民健康档案出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}

	/**
	 * 列表页面POST请求
	 * 
	 * @param cmd
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/phr/doctor/phrList", method = RequestMethod.POST)
	public JSONObject phrListPOST(PhrBasicInfoCmd cmd, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			// 验证session是否过期s
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == session_doctor)
				return Result.userSessionInvalid(json, "doctor");
			
			List<PhrBasicInfo> hospitalList = phrBasicInfoService.selectListByCondition(cmd);
			if(hospitalList != null && hospitalList.size() > 0){
				for(PhrBasicInfo one : hospitalList){
					one.setMine(session_doctor.getId().equals(one.getDoctorId()));
				}
			}
			
			Integer total = phrBasicInfoService.selectCountByCondition(cmd);
			Result.gridData(hospitalList, total, json);
			Result.success(json, "健康档案管理页面加载成功", null);

		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Hospital-AJAX-/phr/doctor/phrList-健康档案管理页面出现异常", json);
		}
		return json;
	}

	/**
	 * 添加页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/phr/doctor/phrAdd")
	public ModelAndView phrAddGET(ModelMap modelMap, HttpServletRequest request) {
		String path = PagePath.FRONT_DOMAIN_DOCTOR_PHR_ADD;
		try {
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == session_doctor)
				return Result.userSessionInvalid(modelMap, PagePath.doDctorLogin);
			modelMap = doctorService.getFansData(modelMap, session_doctor, null);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Diagnose-PAGE-/phr/doctor/phrAdd-加载添加居民健康档案出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}

	/**
	 * 详情页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/phr/doctor/phrDetail/{id}")
	public ModelAndView phrDetail(ModelMap modelMap, HttpServletRequest request, @PathVariable("id") Integer id) {
		String path = PagePath.FRONT_DOMAIN_DOCTOR_PHR_DETAIL;
		try {
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == session_doctor)
				return Result.userSessionInvalid(modelMap, PagePath.doDctorLogin);
			
			//加载基本信息
			PhrBasicInfo basicInfo = phrBasicInfoService.findById(id);
			modelMap.put("phrBasicInfo", basicInfo);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Diagnose-PAGE-/phr/doctor/phrDetail-加载添加居民健康档案详情出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}
	
	/**
	 * 编辑页面GET请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/phr/doctor/phrEdit/{id}")
	public ModelAndView phrEditGet(ModelMap modelMap, HttpServletRequest request, @PathVariable("id") Integer id) {
		String path = PagePath.FRONT_DOMAIN_DOCTOR_PHR_EDIT;
		try {
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == session_doctor)
				return Result.userSessionInvalid(modelMap, PagePath.doDctorLogin);
			
			//加载基本信息
			PhrBasicInfo basicInfo = phrBasicInfoService.findById(id);
			modelMap.put("phrBasicInfo", basicInfo);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Diagnose-PAGE-/phr/doctor/phrEdit-加载添加居民健康档案详情出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}
	
	/**
	 * 编辑POST请求
	 * 
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/phr/doctor/phrEdit/{id}", method=RequestMethod.POST)
	public JSONObject phrEditPOST(PhrBasicInfoCmd cmd, HttpServletRequest request, @PathVariable("id") Integer id) {
		JSONObject json = new JSONObject();
		try {
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == db_doctor)
				return Result.userSessionInvalid(json, "doctor");
			cmd.setCreateUserId(db_doctor.getId());//创建者id
			cmd.setDoctorId(db_doctor.getId());//医生id
			cmd.setLastUpdateTime(new Date());//最后修改时间
			cmd.setId(id);//设置id
			//设置患者的信息
			phrBasicInfoService.savePhrBasicInfo(cmd);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/phr/doctor/phrEdit-修改健康档案出现异常", json);
		}
		return Result.success(json);
	}
	
	/**
	 * 添加页面POST请求
	 * 
	 * @param user
	 * @param request
	 * @return
	 */

	@ResponseBody
	@RequestMapping(value = "/phr/doctor/phrAdd", method = RequestMethod.POST)
	public JSONObject phrAddPOST(PhrBasicInfoCmd cmd, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == db_doctor)
				return Result.userSessionInvalid(json, "doctor");
			cmd.setCreateUserId(db_doctor.getId());//创建者id
			cmd.setDoctorId(db_doctor.getId());//医生id
			cmd.setCreateTime(new Date());//创建时间
			cmd.setLastUpdateTime(cmd.getCreateTime());//最后修改时间
			//设置患者的信息
			phrBasicInfoService.savePhrBasicInfo(cmd);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/phr/doctor/phrAdd-添加健康档案出现异常", json);
		}
		return Result.success(json);
	}
	
	@ResponseBody
	@RequestMapping(value = "/phr/doctor/phrDelete/{id}")
	public JSONObject phrAddPOST(HttpServletRequest request, @PathVariable Integer id) {
		JSONObject json = new JSONObject();
		try {
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == db_doctor)
				return Result.userSessionInvalid(json, "doctor");
			//设置患者的信息
			phrBasicInfoService.deletePhrBasicInfo(id);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/phr/doctor/phrAdd-添加健康档案出现异常", json);
		}
		return Result.success(json);
	}
	
	// -------------------------------------------back---------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 健康档案列表页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/back/phr/list", method = RequestMethod.GET)
	public ModelAndView listPage(HttpServletRequest request, ModelMap modelMap) {
		String path = PagePath.BACK_DOMAIN_PHR_LIST;
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (admin.getRoleId() == 3) {
				modelMap.put("notAdmin", 1);
			}
			Result.success(modelMap, "健康档案管理页面加载成功", null);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Hospital-PAGE-/back/phr/list-健康档案管理页面出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}

	@ResponseBody
	@RequestMapping(value = "/back/phr/phrAdd", method = RequestMethod.POST)
	public JSONObject backPhrAddPOST(PhrBasicInfoCmd cmd, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (null == admin)
				return Result.userSessionInvalid(json, "admin");
			cmd.setCreateUserId(admin.getId());//创建者id
			cmd.setCreateTime(new Date());//创建时间
			cmd.setLastUpdateTime(cmd.getCreateTime());//最后修改时间
			//设置患者的信息
			phrBasicInfoService.savePhrBasicInfo(cmd);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/back/phr/phrAdd添加健康档案出现异常", json);
		}
		return Result.success(json);
	}
	
	@ResponseBody
	@RequestMapping(value = "/back/phr/phrDelete/{id}")
	public JSONObject phrDelete(HttpServletRequest request, @PathVariable Integer id) {
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (null == admin)
				return Result.userSessionInvalid(json, "admin");
			//设置患者的信息
			phrBasicInfoService.deletePhrBasicInfo(id);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/back/phr/phrDelete/{id}-删除健康档案出现异常", json);
		}
		return Result.success(json);
	}
	
	//-恢复
	@ResponseBody
	@RequestMapping(value = "/back/phr/phrRecover")
	public JSONObject phrRecover(HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (null == admin)
				return Result.userSessionInvalid(json, "admin");
			String ids = request.getParameter("ids");
			//设置患者的信息
			phrBasicInfoService.recoverPhrBasicInfo(ids);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-DoctorPatient-AJAX-/back/phr/phrRecover-phr恢复出现异常", json);
		}
		return Result.success(json);
	}
	
	
	@RequestMapping(value = "/back/phr/phrBasicInfoForm", method = RequestMethod.GET)
	public ModelAndView phrBasicInfoForm(HttpServletRequest request, ModelMap modelMap) {
		String path = PagePath.BACK_DOMAIN_PHR_BSAICINFOFORM;
		try {
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());// 验证session中的user，存在即返回
			if (admin.getRoleId() == 3) {
				modelMap.put("notAdmin", 1);
			}
			
			String id = request.getParameter("id");
			if(StringUtils.isNotBlank(id)){
				modelMap.put("model", phrBasicInfoService.findById(Integer.valueOf(id)));
				modelMap.put("openType", request.getParameter("openType"));
			}
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-Hospital-PAGE-/back/phr/phrBasicInfoForm-出现异常", modelMap);
		}
		return new ModelAndView(path, modelMap);
	}

	
	
	/**
	 * 健康档案列表页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/back/phr/list", method = RequestMethod.POST)
	public JSONObject list(PhrBasicInfoCmd cmd, HttpServletRequest request) {

		JSONObject json = new JSONObject();

		try {
			// 验证session是否过期s
			Admin admin = ActionUtil.checkSession4Admin(request.getSession());
			if (null == admin) {
				return Result.adminSessionInvalid(json);
			}

			List<PhrBasicInfo> hospitalList = phrBasicInfoService.selectListByCondition(cmd);
			Integer total = phrBasicInfoService.selectCountByCondition(cmd);
			Result.gridData(hospitalList, total, json);
			Result.success(json, "健康档案管理页面加载成功", null);

		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Hospital-AJAX-/back/list-健康档案管理页面出现异常", json);
		}
		return json;
	}
	
	
	/**
	 * 得到患者的信息
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/phr/doctor/getPatient/{id}", method = RequestMethod.POST)
	public JSONObject getPatientById(@PathVariable("id")Integer id, HttpServletRequest request) {

		JSONObject json = new JSONObject();

		try {
			Doctor db_doctor = ActionUtil.checkSession4Doctor(request.getSession());// 验证session中的user，存在即返回
			if (null == db_doctor)
				return Result.userSessionInvalid(json, "doctor");
			User user = userService.selectByPrimaryKey(id);
			json.put("success", true);
			json.put("patient", user);
			Result.success(json, "加载患者信息成功", null);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-Hospital-AJAX-/back/list-健康档案管理页面出现异常", json);
		}
		return json;
	}
	
}