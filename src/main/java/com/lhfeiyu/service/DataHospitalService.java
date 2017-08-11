package com.lhfeiyu.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.DataHospitalContractMapper;
import com.lhfeiyu.dao.DataHospitalDoctorMapper;
import com.lhfeiyu.dao.DataHospitalMapper;
import com.lhfeiyu.dao.DataHospitalNurseMapper;
import com.lhfeiyu.dao.DataHospitalVisitMapper;
import com.lhfeiyu.po.DataHospital;
import com.lhfeiyu.po.DataHospitalContract;
import com.lhfeiyu.po.DataHospitalDoctor;
import com.lhfeiyu.po.DataHospitalNurse;
import com.lhfeiyu.po.DataHospitalVisit;
import com.lhfeiyu.tools.Check;
import com.lhfeiyu.tools.CommonGenerator;
import com.lhfeiyu.tools.DateFormat;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-DataHospital <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class DataHospitalService extends CommonService<DataHospital> {

	@Autowired
	DataHospitalMapper dataHospitalMapper;
	@Autowired
	DataHospitalDoctorMapper dhdMapper;
	@Autowired
	DataHospitalNurseMapper dhnMapper;
	@Autowired
	DataHospitalVisitMapper dhvMapper;
	@Autowired
	DataHospitalContractMapper dhcMapper;
	
	public DataHospital selectService(Map<String, Object> paramMap) {
		return super.selectByCondition(paramMap);
	}
	
	public List<DataHospital> selectListService(Map<String, Object> paramMap) {
		return super.selectListByCondition(paramMap);
	}
	
	public int updateService(DataHospital dataHospital) {
		return super.updateByPrimaryKeySelective(dataHospital);
	}
	
	public int insertService(DataHospital dataHospital) {
		return super.insertSelective(dataHospital);
	}
	
	public int updateDeleteService(Integer id, String updatedBy) {
		return super.updateDeletedNowById(id, updatedBy);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}
	
	public List<DataHospital> selectListWitdhSubData(Map<String, Object> paramMap) {
		List<DataHospital> dataList = super.selectListByCondition(paramMap);
		Map<String, Object> map = CommonGenerator.getHashMap();
		for(DataHospital data : dataList){
			Integer mainId = data.getId();
			Integer isDoctor = data.getIsDoctor();
			Integer isLegalPerson = data.getIsLegalPerson();
			Integer haveVisitValid = data.getHaveVisitValid();
			Integer isAssignContract = data.getIsAssignContract();
			Integer isAssignIntention = data.getIsAssignIntention();
			Integer isAdvertisement = data.getIsAdvertisement();
			String hygienismCondition = data.getHygienismCondition();
			
			if(null != data.getCreatedAt()){
				data.setCreatedAtStr(DateFormat.getDateToFormatString(data.getCreatedAt(), DateFormat.SECONDS_FORMAT));
			}
			if(null != data.getUpdatedAt()){
				data.setUpdatedAtStr(DateFormat.getDateToFormatString(data.getUpdatedAt(), DateFormat.SECONDS_FORMAT));
			}
			
			if(null != isDoctor && 1 == isDoctor){
				data.setIsDoctorStr("否");
			}else if(null != isDoctor && 2 == isDoctor){
				data.setIsDoctorStr("是");
			}
			if(null != isLegalPerson && 1 == isLegalPerson){
				data.setIsLegalPersonStr("否");
			}else if(null != isLegalPerson && 2 == isLegalPerson){
				data.setIsLegalPersonStr("是");
			}
			if(null != haveVisitValid && 1 == haveVisitValid){
				data.setHaveVisitValidStr("否");
			}else if(null != haveVisitValid && 2 == haveVisitValid){
				data.setHaveVisitValidStr("是");
			}
			if(null != isAssignContract && 1 == isAssignContract){
				data.setIsAssignContractStr("否");
			}else if(null != isAssignContract && 2 == isAssignContract){
				data.setIsAssignContractStr("是");
			}
			if(null != isAssignIntention && 1 == isAssignIntention){
				data.setIsAssignIntentionStr("否");
			}else if(null != isAssignIntention && 2 == isAssignIntention){
				data.setIsAssignIntentionStr("是");
			}
			
			if(null != isAdvertisement && 1 == isAdvertisement){
				data.setIsAdvertisementStr("否");
			}else if(null != isAdvertisement && 2 == isAdvertisement){
				data.setIsAdvertisementStr("是");
			}
			
			if(null != hygienismCondition && "75".equals(hygienismCondition)){
				data.setHygienismConditionStr("优");
			}else if(null != isAssignIntention && "76".equals(hygienismCondition)){
				data.setHygienismConditionStr("中");
			}else if(null != isAssignIntention && "77".equals(hygienismCondition)){
				data.setHygienismConditionStr("差");
			}
			
			if(Check.isNotNull(mainId)){
				String doctorListStr = "";
				String nurseListStr = "";
				String visitListStr = "";
				String contractListStr = "";
				
				String contractSerialStr = "";//合同的三个分开字段
				String contractStartDateStr = "";
				String contractLimitStr = "";
				String contractRemarkStr = "";
				map.put("dataHospitalId", mainId);
				List<DataHospitalDoctor> subDataList1 = dhdMapper.selectListByCondition(map);
				for(DataHospitalDoctor subData1 : subDataList1){
					String realname = subData1.getRealname();
					String phone = subData1.getPhone();
					String goodAt = subData1.getGoodAt();
					String educationBackground = subData1.getEducationBackground();
					String introduction = subData1.getIntroduction();
					doctorListStr += "姓名："+realname+" 电话："+phone+" 擅长："+goodAt+" 教育背景："+educationBackground+" 从业简介："+introduction+"；\n";
				}
				List<DataHospitalNurse> subDataList2 = dhnMapper.selectListByCondition(map);
				for(DataHospitalNurse subData2 : subDataList2){
					String realname = subData2.getRealname();
					String phone = subData2.getPhone();
					String educationBackground = subData2.getEducationBackground();
					String introduction = subData2.getIntroduction();
					nurseListStr += "姓名："+realname+" 电话："+phone+" 教育背景："+educationBackground+" 从业简介："+introduction+"；\n";
				}
				List<DataHospitalVisit> subDataList3 = dhvMapper.selectListByCondition(map);
				for(DataHospitalVisit subData3 : subDataList3){
					Date visitDate = subData3.getVisitDate();
					String visitDateStr = "";
					if(null != visitDate){
						visitDateStr = DateFormat.getDateToFormatString(visitDate, "yyyy-MM-dd");
					}
					String getVisitAnalysis = subData3.getVisitAnalysis();
					visitListStr += "走访日期："+visitDateStr+" 走访分析："+getVisitAnalysis+"；\n";
				}
				List<DataHospitalContract> subDataList4 = dhcMapper.selectListByCondition(map);
				for(DataHospitalContract subData4 : subDataList4){
					String contractSerial = subData4.getContractSerial();
					Date contractStartDate = subData4.getContractStartDate();
					String contractStartDateStr2 = "";
					if(null != contractStartDate){
						contractStartDateStr2 = DateFormat.getDateToFormatString(contractStartDate, "yyyy-MM-dd");
					}
					String contractTimeLimit = subData4.getContractTimeLimit();
					String remark = subData4.getRemark();
					contractListStr += "合同编号："+contractSerial+" 合同开始日期："+contractStartDateStr+" 合同期限："+contractTimeLimit+" 备注："+remark+"；\r\n";
					contractSerialStr += contractSerial+"\n";
					contractStartDateStr += contractStartDateStr2+"\n";
					contractLimitStr += contractTimeLimit+"\n";
					contractRemarkStr += remark+"\n";
				}
				data.setDoctorListStr(doctorListStr);
				data.setNurseListStr(nurseListStr);
				data.setVisitListStr(visitListStr);
				data.setContractListStr(contractListStr);
				
				data.setContractSerialStr(contractSerialStr);
				data.setContractStartDateStr(contractStartDateStr);
				data.setContractLimitStr(contractLimitStr);
				data.setContractRemarkStr(contractRemarkStr);
				
			}
		}
		return dataList;
	}

}