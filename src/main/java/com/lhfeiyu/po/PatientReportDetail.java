package com.lhfeiyu.po;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.JSONObject;

/**
 * <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 持久层对象 <p>
 * <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
 * <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
 * <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司<p>
 * <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 1.0<p>
 */
public class PatientReportDetail extends Parent {

	/**============================== 自定义字段 开始 _@CAUTION_SELF_FIELD_BEGIN@_ ==============================*/
	private String resultTip;
	/**============================== 自定义字段 结束 _@CAUTION_SELF_FIELD_FINISH@_ ==============================*/

	/** 自增整型ID  */
	private Integer id;
	
	/** 艾迪康条码  */
	private String adiconBarcode;
	
	/** 病人姓名  */
	private String patientName;
	
	/** 性别  */
	private String sex;
	
	/** 年龄  */
	private String age;
	
	/** 年龄类型（单位）  */
	private String ageType;
	
	/** 医院科室  */
	private String department;
	
	/** 病人床号  */
	private String bedNo;
	
	/** 标本采集时间（医院采集）  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date collectionDate;
	
	/** 标本接受时间（艾迪康接收标本）  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date receivedDate;
	
	/** 标本测试时间（艾迪康检测）  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lisDate;
	
	/** 标本报告时间（艾迪康检验完发报告）  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date reportDate;
	
	/** 医院条码  */
	private String customerBarcode;
	
	/** 送检医生  */
	private String doctor;
	
	/** 检验医生  */
	private String technician;
	
	/** 审核医生  */
	private String checkedBy;
	
	/** 仪器代号  */
	private String instrument;
	
	/** 样本标号（系列号）  */
	private Integer serialNumber;
	
	/** 样本种类  */
	private String sampleType;
	
	/** 诊断结果  */
	private String clinicalDiagnosis;
	
	/** 代号(艾迪康内部)  */
	private String itemCode;
	
	/** 项目名称(中文)  */
	private String itemName_CN;
	
	/** 项目名称(英文)  */
	private String itemName_EN;
	
	/** 项目测定值  */
	private String result;
	
	/** 高低标记(g:高,z:正常,d:低)  */
	private String resultHint;
	
	/** 参考值  */
	private String resultReference;
	
	/** 测量值单位  */
	private String resultUnit;
	
	/** 检测方法(中文)  */
	private String testMethod;
	
	/** 检测方法(英文)  */
	private String testMethod_EN;
	
	/** 病理结果  */
	private String resultPathology;
	
	/** 临床症状  */
	private String sampleChar;
	
	/** 患者病区  */
	private String patientNumber;
	
	/** 患者电话  */
	private String patientPhone;
	
	/** 备用字段1  */
	private String str1;
	
	/** 备用字段2  */
	private String str2;
	
	/** 备用字段3  */
	private String str3;
	
	/** 备用字段4  */
	private String str4;
	
	/** 备用字段5  */
	private String str5;
	
	/** (1：不是2：是)  */
	private String serviceFlag;
	
	/** 序号  */
	private String serial;
	
	/** 类型ID  */
	private Integer typeId;
	
	/** 关联ID  */
	private Integer linkId;
	
	/** 组ID  */
	private Integer groupId;
	
	/** 等级  */
	private Integer gradeId;
	
	/** 业务状态(1未出报告2.已出报告)  */
	private Integer mainStatus;
	
	/** 逻辑状态  */
	private Integer logicStatus;
	
	/** BigDecimal  */
	private BigDecimal attrDecimal;
	
	/** ID串  */
	private String mainIds;
	
	/** 备用字段-字符串  */
	private String attrStr;
	
	/** 备用字段-字符串2  */
	private String attrStr2;
	
	/** 备用字段-整型  */
	private Integer attrInt;
	
	/** 备用字段-整型2  */
	private Integer attrInt2;
	
	/** 备用字段-数字  */
	private BigDecimal attrNum;
	
	/** 备用字段-日期  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date attrDate;
	
	/** 备用字段-日期时间  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date attrDatetime;
	
	/** 排列顺序  */
	private Integer sequence;
	
	/** 描述  */
	private String description;
	
	/** 备注  */
	private String remark;
	
	/** 删除时间  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date deletedAt;
	
	/** 删除人  */
	private String deletedBy;
	
	/** 创建时间  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdAt;
	
	/** 创建人  */
	private String createdBy;
	
	/** 更新时间  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updatedAt;
	
	/** 更新人  */
	private String updatedBy;
	
	
	public String toString(){
    	return JSONObject.toJSONString(this);
    }
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdiconBarcode() {
		return adiconBarcode;
	}
	public void setAdiconBarcode(String adiconBarcode) {
		 this.adiconBarcode = adiconBarcode == null ? null : adiconBarcode.trim();
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		 this.patientName = patientName == null ? null : patientName.trim();
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		 this.sex = sex == null ? null : sex.trim();
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		 this.age = age == null ? null : age.trim();
	}
	public String getAgeType() {
		return ageType;
	}
	public void setAgeType(String ageType) {
		 this.ageType = ageType == null ? null : ageType.trim();
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		 this.department = department == null ? null : department.trim();
	}
	public String getBedNo() {
		return bedNo;
	}
	public void setBedNo(String bedNo) {
		 this.bedNo = bedNo == null ? null : bedNo.trim();
	}
	public Date getCollectionDate() {
		return collectionDate;
	}
	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public Date getLisDate() {
		return lisDate;
	}
	public void setLisDate(Date lisDate) {
		this.lisDate = lisDate;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public String getCustomerBarcode() {
		return customerBarcode;
	}
	public void setCustomerBarcode(String customerBarcode) {
		 this.customerBarcode = customerBarcode == null ? null : customerBarcode.trim();
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		 this.doctor = doctor == null ? null : doctor.trim();
	}
	public String getTechnician() {
		return technician;
	}
	public void setTechnician(String technician) {
		 this.technician = technician == null ? null : technician.trim();
	}
	public String getCheckedBy() {
		return checkedBy;
	}
	public void setCheckedBy(String checkedBy) {
		 this.checkedBy = checkedBy == null ? null : checkedBy.trim();
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		 this.instrument = instrument == null ? null : instrument.trim();
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		 this.sampleType = sampleType == null ? null : sampleType.trim();
	}
	public String getClinicalDiagnosis() {
		return clinicalDiagnosis;
	}
	public void setClinicalDiagnosis(String clinicalDiagnosis) {
		 this.clinicalDiagnosis = clinicalDiagnosis == null ? null : clinicalDiagnosis.trim();
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		 this.itemCode = itemCode == null ? null : itemCode.trim();
	}
	public String getItemName_CN() {
		return itemName_CN;
	}
	public void setItemName_CN(String itemName_CN) {
		 this.itemName_CN = itemName_CN == null ? null : itemName_CN.trim();
	}
	public String getItemName_EN() {
		return itemName_EN;
	}
	public void setItemName_EN(String itemName_EN) {
		 this.itemName_EN = itemName_EN == null ? null : itemName_EN.trim();
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		 this.result = result == null ? null : result.trim();
	}
	public String getResultHint() {
		return resultHint;
	}
	public void setResultHint(String resultHint) {
		 this.resultHint = resultHint == null ? null : resultHint.trim();
	}
	public String getResultReference() {
		return resultReference;
	}
	public void setResultReference(String resultReference) {
		 this.resultReference = resultReference == null ? null : resultReference.trim();
	}
	public String getResultUnit() {
		return resultUnit;
	}
	public void setResultUnit(String resultUnit) {
		 this.resultUnit = resultUnit == null ? null : resultUnit.trim();
	}
	public String getTestMethod() {
		return testMethod;
	}
	public void setTestMethod(String testMethod) {
		 this.testMethod = testMethod == null ? null : testMethod.trim();
	}
	public String getTestMethod_EN() {
		return testMethod_EN;
	}
	public void setTestMethod_EN(String testMethod_EN) {
		 this.testMethod_EN = testMethod_EN == null ? null : testMethod_EN.trim();
	}
	public String getResultPathology() {
		return resultPathology;
	}
	public void setResultPathology(String resultPathology) {
		 this.resultPathology = resultPathology == null ? null : resultPathology.trim();
	}
	public String getSampleChar() {
		return sampleChar;
	}
	public void setSampleChar(String sampleChar) {
		 this.sampleChar = sampleChar == null ? null : sampleChar.trim();
	}
	public String getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(String patientNumber) {
		 this.patientNumber = patientNumber == null ? null : patientNumber.trim();
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		 this.patientPhone = patientPhone == null ? null : patientPhone.trim();
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		 this.str1 = str1 == null ? null : str1.trim();
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		 this.str2 = str2 == null ? null : str2.trim();
	}
	public String getStr3() {
		return str3;
	}
	public void setStr3(String str3) {
		 this.str3 = str3 == null ? null : str3.trim();
	}
	public String getStr4() {
		return str4;
	}
	public void setStr4(String str4) {
		 this.str4 = str4 == null ? null : str4.trim();
	}
	public String getStr5() {
		return str5;
	}
	public void setStr5(String str5) {
		 this.str5 = str5 == null ? null : str5.trim();
	}
	public String getServiceFlag() {
		return serviceFlag;
	}
	public void setServiceFlag(String serviceFlag) {
		 this.serviceFlag = serviceFlag == null ? null : serviceFlag.trim();
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		 this.serial = serial == null ? null : serial.trim();
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getLinkId() {
		return linkId;
	}
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Integer getMainStatus() {
		return mainStatus;
	}
	public void setMainStatus(Integer mainStatus) {
		this.mainStatus = mainStatus;
	}
	public Integer getLogicStatus() {
		return logicStatus;
	}
	public void setLogicStatus(Integer logicStatus) {
		this.logicStatus = logicStatus;
	}
	public BigDecimal getAttrDecimal() {
		return attrDecimal;
	}
	public void setAttrDecimal(BigDecimal attrDecimal) {
		this.attrDecimal = attrDecimal;
	}
	public String getMainIds() {
		return mainIds;
	}
	public void setMainIds(String mainIds) {
		 this.mainIds = mainIds == null ? null : mainIds.trim();
	}
	public String getAttrStr() {
		return attrStr;
	}
	public void setAttrStr(String attrStr) {
		 this.attrStr = attrStr == null ? null : attrStr.trim();
	}
	public String getAttrStr2() {
		return attrStr2;
	}
	public void setAttrStr2(String attrStr2) {
		 this.attrStr2 = attrStr2 == null ? null : attrStr2.trim();
	}
	public Integer getAttrInt() {
		return attrInt;
	}
	public void setAttrInt(Integer attrInt) {
		this.attrInt = attrInt;
	}
	public Integer getAttrInt2() {
		return attrInt2;
	}
	public void setAttrInt2(Integer attrInt2) {
		this.attrInt2 = attrInt2;
	}
	public BigDecimal getAttrNum() {
		return attrNum;
	}
	public void setAttrNum(BigDecimal attrNum) {
		this.attrNum = attrNum;
	}
	public Date getAttrDate() {
		return attrDate;
	}
	public void setAttrDate(Date attrDate) {
		this.attrDate = attrDate;
	}
	public Date getAttrDatetime() {
		return attrDatetime;
	}
	public void setAttrDatetime(Date attrDatetime) {
		this.attrDatetime = attrDatetime;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		 this.description = description == null ? null : description.trim();
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		 this.remark = remark == null ? null : remark.trim();
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		 this.deletedBy = deletedBy == null ? null : deletedBy.trim();
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		 this.createdBy = createdBy == null ? null : createdBy.trim();
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		 this.updatedBy = updatedBy == null ? null : updatedBy.trim();
	}
	
	/**=========================== 自定义GETSET方法开始 _@CAUTION_SELF_GETSET_BEGIN@_ ===========================*/
	public String getResultTip() {
		return resultTip;
	}

	public void setResultTip(String resultTip) {
		this.resultTip = resultTip;
	}
	
	
	/**=========================== 自定义GETSET方法结束 _@CAUTION_SELF_GETSET_FINISH@_ ===========================*/
	
}