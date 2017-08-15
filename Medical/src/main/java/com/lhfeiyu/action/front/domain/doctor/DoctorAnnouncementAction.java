package com.lhfeiyu.action.front.domain.doctor;


import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Announcement;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.service.AnnouncementService;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
@RequestMapping(value="/doctor")
public class DoctorAnnouncementAction {
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private AnnouncementService announcementService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "/announcement")
	public ModelAndView announcement(ModelMap modelMap,HttpServletRequest request) {
		String path = PagePath.doctorAnnouncement;
		try {
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == session_doctor)return Result.userSessionInvalid(modelMap,PagePath.doDctorLogin,"doctor");
			modelMap = doctorService.getFansData(modelMap,session_doctor,null);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-HospitalAnnouncement-PAGE-/announcement-加载诊所文章添加或修改出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getAnnouncementList", method=RequestMethod.POST)
	public JSONObject getAnnouncementList(ModelMap modelMap,HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			Doctor session_doctor = ActionUtil.checkSession4Doctor(request.getSession());//验证session中的user，存在即返回
			if(null == session_doctor)return Result.userSessionInvalid(json, "doctor");
			HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
			//map.put("adiconBarcode", session_hospital.getThirdId());
			map.put("hospitalId", session_doctor.getHospitalId());
			List<Announcement> dataList = announcementService.selectListByCondition(map);
			Integer total = announcementService.selectCountByCondition(map);
			Result.gridData(dataList, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-HospitalAnnouncementAction-AJAX-/getAnnouncementList-加载公告列表出现异常", json);
		}
		return json;
	}
	
}
