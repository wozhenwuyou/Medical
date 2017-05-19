package com.lhfeiyu.action.front.domain.hospital;


import java.util.HashMap;
import java.util.List;

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
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Announcement;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.service.AnnouncementService;
import com.lhfeiyu.service.HospitalService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
@RequestMapping(value="/hospital")
public class HospitalAnnouncementAction {
	@Autowired
	private HospitalService hospitalService;
	@Autowired
	private AnnouncementService announcementService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "/announcement")
	public ModelAndView announcement(ModelMap modelMap,HttpServletRequest request) {
		String path = PagePath.hospitalAnnouncement;
		try {
			Hospital db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(modelMap,PagePath.doHspitalLogin, "hospiatl");
			modelMap = hospitalService.getHospitalData(modelMap,db_hospital,null);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-HospitalAnnouncement-PAGE-/announcement-加载诊所文章添加或修改出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/announcementAddOrUpdate")
	public ModelAndView addOrUpdateAnnouncementForHospital(ModelMap modelMap,HttpServletRequest request, 
			@RequestParam(required=false) Integer mainId) {
		String path = PagePath.addOrUpdateAnnouncementForHospital;
		try {
			JSONObject json = new JSONObject();
			Hospital db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(modelMap,PagePath.doHspitalLogin, "hospiatl");
			modelMap = hospitalService.getHospitalData(modelMap,db_hospital,null);
			Announcement announcement = announcementService.selectByPrimaryKey(mainId);
			modelMap.put("anno", announcement);
			json.put("anno", announcement);
			modelMap.put("paramJson", json);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-HospitalAnnouncement-PAGE-/addOrUpdateAnnouncementForHospital-加载诊所文章添加或修改出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/addOrUpdateAnnouncement", method = RequestMethod.POST)
	public JSONObject addOrUpdateAnnouncementForHospital(@ModelAttribute Announcement announcement,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Hospital db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(json,"hospital");
			if(null == announcement.getId()){//添加
				announcementService.insertService(json, announcement, db_hospital);
			}else{//修改
				announcementService.updateService(json, announcement, db_hospital);
			}
			json.put("id", announcement.getId());
			Result.success(json, "添加或修改文章成功", null);
		}catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-HospitalAnnouncement-AJAX-/addOrUpdateAnnouncementForHospital-新增或修改诊所文章出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/getAnnouncementList", method=RequestMethod.POST)
	public JSONObject getAnnouncementList(HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			Hospital session_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的hospital，存在即返回
			if(null == session_hospital)return Result.userSessionInvalid(json, "hospital");
			HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
			//map.put("adiconBarcode", session_hospital.getThirdId());
			map.put("hospitalId", session_hospital.getId());
			List<Announcement> dataList = announcementService.selectListByCondition(map);
			Integer total = announcementService.selectCountByCondition(map);
			Result.gridData(dataList, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-HospitalAnnouncementAction-AJAX-/getAnnouncementList-加载公告列表出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateAnnouncementDelete",method=RequestMethod.POST)
	public JSONObject updateAnnouncementDelete(HttpServletRequest request, @RequestParam Integer mainId) {
		JSONObject json = new JSONObject();
		try {
			Hospital hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == hospital)return Result.userSessionInvalid(json, "hospital");
			Announcement anno = announcementService.selectByPrimaryKey(mainId);
			if(null == anno){
				return Result.failure(json, "公告不存在", "announcement_null");
			}
			Integer sessionHospitalId = hospital.getId();
			Integer hospitalId = anno.getHospitalId();
			if(!Check.integerEqual(sessionHospitalId, hospitalId)){
				return Result.failure(json, "您没有权限删除该公告", "authority_error");
			}
			announcementService.updateDeletedNowById(mainId, hospital.getWholeName());
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-HospitalAnnouncementAction-AJAX-/updateAnnouncementDelete-删除公告出现异常", json);
		}
		return json;
	}
	
	
	
}
