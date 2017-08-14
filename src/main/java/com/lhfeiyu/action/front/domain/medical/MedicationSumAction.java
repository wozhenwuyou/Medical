package com.lhfeiyu.action.front.domain.medical;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.MedicationLog;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.HospitalService;
import com.lhfeiyu.service.MedicationLogService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
@RequestMapping(value="/hospital")
public class MedicationSumAction {
	@Autowired
	private MedicationLogService medicationLogService;
	@Autowired
	private DoctorService doctorService;
	/*@Autowired
	private MedicationRepertoryService medicationRepertoryService;*/
	@Autowired
	private HospitalService  hospitalService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "/medicationSumList")
	public ModelAndView medicationSumList(ModelMap modelMap,HttpServletRequest request) {
		String path = PagePath.medicationSumList;
		try {
			Hospital db_hospitalhospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospitalhospital)return Result.userSessionInvalid(modelMap,PagePath.doHspitalLogin,"hospiatl");
			//modelMap = medicationLogService.getMedicationLogData(modelMap,db_hospitalhospital,null);
			Integer hospitalId = db_hospitalhospital.getId();
			modelMap = hospitalService.getHospitalData(modelMap,db_hospitalhospital,null);
			Map<String,Object> map = CommonGenerator.getHashMap();
			map.put("hospitalId", hospitalId);
			List<Doctor> doctorList = doctorService.selectListByCondition(map);
			modelMap.put("doctorList", doctorList);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-medicationSum-PAGE-/medicationSum-加载诊所药物出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getMedicationSumList", method=RequestMethod.POST)
	public JSONObject getMedicationSumList(HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			Hospital  db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(json, "hospital");
			HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
			map.put("hospitalId", db_hospital.getId());
			String searchType = request.getParameter("searchType");
			if(Check.isNotNull(searchType)){
				if(searchType.equals("1")){
					map.put("orderBy", "in_or_out_time");
					map.put("ascOrdesc", "asc");
				}else if(searchType.equals("2")){
					map.put("orderBy", "in_or_out_time");
					map.put("ascOrdesc", "desc");
				}else if(searchType.equals("3")){
					map.put("selfOrder", 1);
					map.put("orderBy", "m.name");
					map.put("ascOrdesc", "asc");
				}else if(searchType.equals("4")){
					map.put("selfOrder", 1);
					map.put("orderBy", "m.name");
					map.put("ascOrdesc", "desc");
				}
			}
			List<MedicationLog> medicationLogList = medicationLogService.selectOutSumList(map);
			Integer total = medicationLogService.selectOutSumCount(map);
			Result.gridData(medicationLogList, total, json);
			Result.success(json);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-MedicationLog-AJAX-/getMedicationSumList-加载药物列表出现异常", json);
		}
		return json;
	}
	
	
}
