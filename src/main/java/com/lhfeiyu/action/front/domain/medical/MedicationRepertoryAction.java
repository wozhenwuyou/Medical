package com.lhfeiyu.action.front.domain.medical;

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
import com.lhfeiyu.config.PagePath;
import com.lhfeiyu.config.Table;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.MedicationLog;
import com.lhfeiyu.po.MedicationRepertory;
import com.lhfeiyu.po.MedicationType;
import com.lhfeiyu.service.AA_UtilService;
import com.lhfeiyu.service.HospitalService;
import com.lhfeiyu.service.MedicationLogService;
import com.lhfeiyu.service.MedicationRepertoryService;
import com.lhfeiyu.service.MedicationTypeService;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.tools.Result;

@Controller
@RequestMapping(value="/hospital")
public class MedicationRepertoryAction {
	
	@Autowired
	private MedicationRepertoryService medicationRepertoryService;
	@Autowired
	private MedicationLogService medicationLogService;
	@Autowired
	private MedicationTypeService  medicationTypeService;
	/*@Autowired
	private MedicationService medicationService;
	*/
	@Autowired
	private AA_UtilService  utilService;
	@Autowired
	private HospitalService  hospitalService;
	
	private static Logger logger = Logger.getLogger("R");
	
	@RequestMapping(value = "/medicationRepertory")
	public ModelAndView medicationRepertory(ModelMap modelMap,HttpServletRequest request) {
		String path = PagePath.medicationRepertory;
		try {
			Hospital db_hospitalhospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospitalhospital)return Result.userSessionInvalid(modelMap,PagePath.doHspitalLogin,"hospiatl");
			//modelMap = medicationService.getMedicationData(modelMap,db_hospitalhospital,null);
			modelMap = hospitalService.getHospitalData(modelMap,db_hospitalhospital,null);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("mainStatus", 1);
			map.put("orderBy", "updated_at");
			map.put("ascOrdesc", "DESC");
			List<MedicationType> medicationTypeList = medicationTypeService.selectListByCondition(map);
			modelMap.put("medicationTypeList", medicationTypeList);
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-HospitalMedication-PAGE-/medicationRepertory-加载诊所药物出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@RequestMapping(value = "/addOrUpdateMedicationRepertory")
	public ModelAndView addOrUpdateMedicationRepertory(ModelMap modelMap,HttpServletRequest request
			,@RequestParam(required=false) Integer medicationId) {
		String path = PagePath.addOrUpdateMedicationRepertory;
		try {
			Hospital db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(modelMap,PagePath.doHspitalLogin,"hospiatl");
			//modelMap = medicationService.getMedicationData(modelMap,db_hospital,null);
			modelMap = hospitalService.getHospitalData(modelMap,db_hospital,null);
			if(null != medicationId){
				//modelMap = medicationService.getMedicationData(modelMap,db_hospital,medicationId);
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("id", medicationId);
				MedicationRepertory medication = medicationRepertoryService.selectByCondition(map);
				if(null != medication){
					modelMap.put("medication", medication);
				}
			}
		} catch (Exception e) {
			path = PagePath.error;
			Result.catchError(e, logger, "LH_ERROR-HospitalMedication-PAGE-/addOrUpdateMedicationRepertory-加载诊所药物添加或修改出现异常", modelMap);
		}
		return new ModelAndView(path,modelMap);
	}
	
	@ResponseBody
	@RequestMapping(value = "/addOrUpdateMedicationRepertory", method = RequestMethod.POST)
	public JSONObject addOrUpdateMedicationRepertory(@ModelAttribute MedicationRepertory medicationRepertory,HttpServletRequest request){
		JSONObject json = new JSONObject();
		try {
			Hospital  db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(json,"hospital");
			medicationRepertory.setHospitalId(db_hospital.getId());
			Integer medicationId = medicationRepertory.getMedicationId();
			Integer hospitalId = db_hospital.getId();
			Date date = new Date();
			String username = db_hospital.getWholeName();
			if(null == medicationRepertory.getId()){//添加
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("medicationId", medicationId);
				map.put("hospitalId", hospitalId);
				int count = medicationRepertoryService.selectCountByCondition(map);
				if(count > 0){
					return Result.failure(json, "该诊所下已有该药品,请不要重复添加", "aleady_exist");
				}
				MedicationLog medicationLog = new MedicationLog();//新增药品出入库记录
				medicationLog.setInOrOut(1);//1.入库2.出库
				medicationLog.setInOrOutTime(date);
				medicationLog.setMainStatus(1);
				medicationLog.setMedicationId(medicationId);
				medicationLog.setHospitalId(hospitalId);
				medicationLog.setNum(medicationRepertory.getRemainNum());
				medicationLog.setCreatedAt(date);
				medicationLog.setOptUsername(username);
				medicationLog.setCreatedBy(username);
				medicationLogService.insert(medicationLog);
				
				medicationRepertoryService.insert(medicationRepertory);
			}else{
				Map<String,Object> map = new HashMap<String,Object>();
				
				map.put("medicationId", medicationId);
				map.put("hospitalId", hospitalId);
				int count = medicationRepertoryService.selectCountByCondition(map);
				if(count > 1){
					return Result.failure(json, "该诊所下已有该药品,请不要重复添加", "aleady_exist");
				}
				
				MedicationRepertory dbMR = medicationRepertoryService.selectByPrimaryKey(medicationRepertory.getId());
				Integer dbNum = dbMR.getRemainNum();
				Integer num = medicationRepertory.getRemainNum();
				medicationRepertory.setUpdatedAt(date);
				medicationRepertory.setUpdatedBy(username);
				medicationRepertoryService.updateByPrimaryKeySelective(medicationRepertory);
				
				Integer updateNum = num - dbNum;
				if(updateNum == 0){
					return Result.success(json);
				}
				MedicationLog medicationLog = new MedicationLog();
				if(updateNum > 0){
					medicationLog.setInOrOut(1);//1.入库2.出库
				}else if(updateNum < 0){
					medicationLog.setInOrOut(2);//1.入库2.出库
				}
				if(num < dbNum){
					updateNum = dbNum - num;
				}
				medicationLog.setInOrOutTime(date);
				medicationLog.setMainStatus(1);
				medicationLog.setMedicationId(medicationId);
				medicationLog.setHospitalId(hospitalId);
				medicationLog.setNum(updateNum);
				medicationLog.setCreatedAt(date);
				medicationLog.setOptUsername(username);
				medicationLog.setCreatedBy(username);
				medicationLogService.insert(medicationLog);
			}
			json.put("id", medicationRepertory.getId());
			Result.success(json);
		}catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-HospitalMedication-AJAX-/addOrUpdateMedication-新增或修改药物出现异常", json);
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateMedicationRepertoryDelete",method=RequestMethod.POST)
	public JSONObject updateMedicationRepertoryDelete(HttpServletRequest request, @RequestParam Integer medicationId) {
		JSONObject json = new JSONObject();
		try {
			Hospital  db_hospital = ActionUtil.checkSession4Hospital(request.getSession());//验证session中的user，存在即返回
			if(null == db_hospital)return Result.userSessionInvalid(json, "hospital");
			String username = db_hospital.getBriefName();
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("ids", medicationId);
			map.put("table", Table.medication_repertory);
			map.put("username", username);
			utilService.updateDeletedNowByIds(map);
			Result.success(json, "数据删除成功", null);
		} catch (Exception e) {
			Result.catchError(e, logger, "LH_ERROR-HospitalMedication-AJAX-/updateMedicationDelete-删除药物出现异常", json);
		}
		return json;
	}
	
	
}
