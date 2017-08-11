package com.lhfeiyu.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.dao.MedicationLogMapper;
import com.lhfeiyu.dao.MedicationRepertoryMapper;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.MedicationLog;
import com.lhfeiyu.po.MedicationRepertory;
import com.lhfeiyu.tools.Result;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-MedicationRepertory <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class MedicationRepertoryService extends CommonService<MedicationRepertory> {

	@Autowired
	MedicationRepertoryMapper medicationRepertoryMapper;
	@Autowired
	MedicationLogMapper medicationLogMapper;
	
	public MedicationRepertory selectService(Map<String, Object> map) {
		return super.selectByCondition(map);
	}
	
	public List<MedicationRepertory> selectListService(Map<String, Object> map) {
		return super.selectListByCondition(map);
	}
	
	public int updateService(MedicationRepertory medicationRepertory) {
		return super.updateByPrimaryKeySelective(medicationRepertory);
	}
	
	public int insertService(MedicationRepertory medicationRepertory) {
		return super.insertSelective(medicationRepertory);
	}
	
	public int updateDeleteService(Integer id, String updatedBy) {
		return super.updateDeletedNowById(id, updatedBy);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}

	public JSONObject insertData(JSONObject json, MedicationRepertory medicationRepertory, Admin admin) {
		Date date = new Date();
		/*Integer num = medicationRepertory.getRemainNum();*/
		Integer medicationId = medicationRepertory.getMedicationId();
		Integer hospitalId = medicationRepertory.getHospitalId();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("medicationId", medicationId);
		map.put("hospitalId", hospitalId);
		int count = medicationRepertoryMapper.selectCountByCondition(map);
		if(count > 0){
			return Result.failure(json, "该诊所下已有该药品,请不要重复添加", "aleady_exist");
		}
		String username = admin.getUsername();
		medicationRepertory.setCreatedAt(date);
		medicationRepertory.setCreatedBy(username);
		medicationRepertoryMapper.insert(medicationRepertory);

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
		medicationLogMapper.insert(medicationLog);
		
		return Result.success(json);
		
	}

	public JSONObject updateData(JSONObject json, MedicationRepertory medicationRepertory, Admin admin) {
		Date date = new Date();
		Integer medicationId = medicationRepertory.getMedicationId();
		Integer hospitalId = medicationRepertory.getHospitalId();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("medicationId", medicationId);
		map.put("hospitalId",  hospitalId);
		int count = medicationRepertoryMapper.selectCountByCondition(map);
		if(count > 1){
			return Result.failure(json, "该诊所下已有该药品,请不要重复添加", "aleady_exist");
		}
		
		MedicationRepertory dbMR = medicationRepertoryMapper.selectByPrimaryKey(medicationRepertory.getId());
		Integer dbNum = dbMR.getRemainNum();
		
		Integer num = medicationRepertory.getRemainNum();
		String username = admin.getUsername();
		medicationRepertory.setUpdatedAt(date);
		medicationRepertory.setUpdatedBy(username);
		medicationRepertoryMapper.updateByPrimaryKeySelective(medicationRepertory);
		
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
		medicationLogMapper.insert(medicationLog);
		return Result.success(json);
		
	}
	
	/**
	 * 查询药品剩余库存数量
	 * @param map
	 * @return
	 */
	public Integer selectMedicationNumberRemaining(Map<String, Object> map){
		return medicationRepertoryMapper.selectMedicationNumberRemaining(map);
	}

}