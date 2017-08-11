package com.lhfeiyu.action.front.domain.hospital;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.PatientReport;
import com.lhfeiyu.po.PatientReportDetail;
import com.lhfeiyu.service.HospitalService;
import com.lhfeiyu.service.PatientReportDetailService;
import com.lhfeiyu.service.PatientReportService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.Pagination;
import com.lhfeiyu.tools.Result;
import com.lhfeiyu.util.RequestUtil;

@Controller
@RequestMapping(value="/hospital")
public class HospitalPatientReportAction {
	
	@Autowired
	private HospitalService  hospitalService;
	@Autowired
	private PatientReportService  patientReportService;
	@Autowired
	private PatientReportDetailService prdService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value="/hospitalUserReportDetail/{id}")
	public ModelAndView  hospitalUserReportDetail(ModelMap modelMap,HttpServletRequest request,
			@PathVariable Integer id){
		String path = PagePath.hospitalUserReportDetail;
		try{
			Hospital db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(modelMap,PagePath.doHspitalLogin,"hospiatl");
			modelMap = hospitalService.getHospitalData(modelMap,db_hospital,null);
			if(null != id){
				Map<String, Object> map = CommonGenerator.getHashMap();
				map.put("id", id);
				PatientReport patientReport = patientReportService.selectByCondition(map);
				String barCode = patientReport.getAdiconBarcode();
				map.clear();
				map.put("adiconBarcode", barCode);
				List<PatientReportDetail> prdList = prdService.selectListByCondition(map);
				modelMap.put("prdList", prdList);
				modelMap.put("patientReport", patientReport);
			}
		}catch(Exception e){
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-hospitalPatientReport-PAGE-/hospitalUserReportDetail-加载用户检测报告详情页面出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value="/hospitalUserReportList")
	public ModelAndView  hospitalUserReportList(ModelMap modelMap,HttpServletRequest request){
		String path = PagePath.hospitalUserReportList;
		try{
			Hospital db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(modelMap,PagePath.doHspitalLogin,"hospiatl");
			modelMap = hospitalService.getHospitalData(modelMap,db_hospital,null);
		}catch(Exception e){
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-hospitalPatientReport-PAGE-/hospitalUserReportList-加载用户检测报告列表出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/gethospitalUserReportList", method=RequestMethod.POST)
	public JSONObject gethospitalReportList(HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {//自动获取所有参数（查询条件）
			Hospital session_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的hospital，存在即返回
			if(null == session_hospital)return Result.userSessionInvalid(json,"hospital");
			/*String adiconBarcode = null;
			Map<String,Object> hospitalmap = new HashMap<String,Object>();
			Integer hospitalId = session_hospital.getId();
			hospitalmap.put("hospitalId", hospitalId);
			List<Doctor> doctorList = doctorService.selectListByCondition(hospitalmap);
			if(null != doctorList && doctorList.size() > 0){
				for(Doctor d:doctorList){
					hospitalmap.clear();
					hospitalmap.put("doctorId", d.getId());
					List<Patient> patientList = patientService.selectListByCondition(hospitalmap);
					if(patientList.size() > 0 && null != patientList){
						for(Patient p:patientList){
							adiconBarcode += ","+"\""+p.getAdiconBarcode()+"\"";
						}
					}
				}
			}*/
			HashMap<String, Object> map = Pagination.getOrderByAndPage(RequestUtil.getRequestParam(request), request);
			map.put("hospitalId", session_hospital.getId());
			map.put("doctor", 1);
			map.put("hospital", 1);
			String searchType = request.getParameter("searchType");
			if(Check.isNotNull(searchType)){
				if(searchType.equals("1")){
					map.put("selfOrder", 1);
					map.put("orderBy", "c.name");
				}else if(searchType.equals("2")){
					map.put("orderBy", "report_date");
				}else if(searchType.equals("3")){
					map.put("orderBy", "result_hint");
				}/*else if(searchType.equals("4")){
					map.put("orderBy", "d1.username");
				}*/
			}
			List<PatientReport> patientReportList = patientReportService.selectListByCondition(map);
			Integer total = patientReportService.selectCountByCondition(map);
			Result.gridData(patientReportList, total, json);
			Result.success(json, "数据加载成功", null);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-hospitalPatientReport-AJAX-/gethospitalUserReportList-加载用户检测报告列表出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateReportDoctorResult", method=RequestMethod.POST)
	public JSONObject updateReportDoctorResult(HttpServletRequest request, @ModelAttribute PatientReport patientReport) {
		JSONObject json = new JSONObject();
		try {
			Hospital session_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的hospital，存在即返回
			if(null == session_hospital)return Result.userSessionInvalid(json,"hospital");
			Integer prId = patientReport.getId();
			if(null == prId)return Result.failure(json, "编号不能为空", "prId_null");
			Map<String,Object> map = CommonGenerator.getHashMap();
			map.put("id", prId);
			/*PatientReport dbPatientReport = patientReportService.selectByCondition(map);
			if(!Check.integerEqual(dbPatientReport.getDoctorId(), session_doctor.getId())){
				return Result.failure(json, "该检测档案不是您创建的，您不能进行修改", "auth_lack");
			}*/
			PatientReport pr = new PatientReport();
			pr.setId(prId);
			pr.setDoctorResult(patientReport.getDoctorResult());
			pr.setUpdatedAt(new Date());
			pr.setUpdatedBy(session_hospital.getWholeName());
			patientReportService.updateByPrimaryKeySelective(pr);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-doctorPatientReport-AJAX-/updateReportDoctorResult-添加用户检测报告列表出现异常", json);
		}
		return Result.success(json);
	}
	
	@RequestMapping(value="/prdPrint/{reportId}")
	public ModelAndView  prdPrint(ModelMap modelMap, @PathVariable Integer reportId){
		String path = PagePath.backPrdPrint;
		try{
			Map<String, Object> map = CommonGenerator.getHashMap();
			map.put("id", reportId);
			PatientReport patientReport = patientReportService.selectByCondition(map);
			map.clear();
			map.put("adiconBarcode", patientReport.getAdiconBarcode());
			List<PatientReportDetail> prdList = prdService.selectListByCondition(map);
			
			modelMap.put("patientReport", patientReport);
			modelMap.put("prdList", prdList);
			Result.success(modelMap, "患者报告页面加载成功", null);
		}catch(Exception e){
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-PatientReport-PAGE-/back/prdPrint-加载患者报告出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
}
