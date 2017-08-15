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
public class DataHospital extends Parent {

	/**============================== 自定义字段 开始 _@CAUTION_SELF_FIELD_BEGIN@_ ==============================*/
	private String hospitalTypeName;
	private String adminUserName;
	private String provinceName;
	private String cityName;
	private String doctorListStr;
	private Integer doctorListStrSUM;  //医生合计
	private String nurseListStr;
	private String visitListStr;
	private String isDoctorStr;
	private String contractListStr;
	private String contractSerialStr;
	private String contractStartDateStr;
	private String contractLimitStr;
	private String contractRemarkStr;
	
	private String isLegalPersonStr;
	private String isAdvertisementStr;
	private String haveVisitValidStr;
	private String isAssignContractStr;
	private String isAssignIntentionStr;
	private String hygienismConditionStr;
	private String createdAtStr;
	private String updatedAtStr;
	/**============================== 自定义字段 结束 _@CAUTION_SELF_FIELD_FINISH@_ ==============================*/

	/** 自增整型ID  */
	private Integer id;
	
	/** 简称  */
	private String briefName;
	
	/** 全称  */
	private String wholeName;
	
	/** 诊所类型  */
	private String typeName;
	
	/** 负责人  */
	private Integer adminId;
	
	/** 用户密码  */
	private String password;
	
	/** 图标  */
	private String logo;
	
	/** LOGO-图片表中对应的ID  */
	private Integer logoPicId;
	
	/**   */
	private String website;
	
	/** 省  */
	private Integer province;
	
	/** 市  */
	private Integer city;
	
	/** 地址  */
	private String address;
	
	/** 邮箱  */
	private String email;
	
	/** 登录id  */
	private String loginName;
	
	/** 最后登录时间  */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastLoginTime;
	
	/** 手机  */
	private String phone;
	
	/** 座机  */
	private String tel;
	
	/** 传真  */
	private String fax;
	
	/** QQ  */
	private String qq;
	
	/** 微信  */
	private String weixin;
	
	/** 微博  */
	private String weibo;
	
	/** 面积  */
	private String area;
	
	/** 医生人数  */
	private Integer doctorNum;
	
	/** 医生信息  */
	private String doctorInfo;
	
	/** 护士人数  */
	private Integer nurseNum;
	
	/** 护士简介  */
	private String nurseInfo;
	
	/** 负责人姓名  */
	private String adminName;
	
	/** 室内照片  */
	private String indoorPicPaths;
	
	/** 室外照片  */
	private String outdoorPicPaths;
	
	/** 年龄区间  */
	private String ageBetween;
	
	/** 联系方式  */
	private String contactWay;
	
	/** 药品进货来源  */
	private String medicalFrom;
	
	/** 进货方式  */
	private String stockWay;
	
	/** 是否医生  */
	private Integer isDoctor;
	
	/** 是否法人  */
	private Integer isLegalPerson;
	
	/** 诊所声誉  */
	private String reputition;
	
	/** 患者流量  */
	private String patientFlow;
	
	/** 健康档案  */
	private String healthDoc;
	
	/** 室内有无产品宣传广告  */
	private Integer isAdvertisement;
	
	/** 床位  */
	private String bed;
	
	/** 卫生条件  */
	private String hygienismCondition;
	
	/** GPS定位值  */
	private String gps;
	
	/** 合作状态  */
	private String coporationAttitude;
	
	/** 走访信息  */
	private String visitInfo;
	
	/** 是否签合同  */
	private Integer isAssignContract;
	
	/** 合同信息  */
	private String contractInfo;
	
	/** 是否签意向书  */
	private Integer isAssignIntention;
	
	/** 是否有效走访  */
	private Integer haveVisitValid;
	
	/** 其他配套设施  */
	private String otherFacility;
	
	/** 二维码  */
	private String qrCode;
	
	/** 二维码2  */
	private String qrCode2;
	
	/** 简介  */
	private String introduction;
	
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
	
	/** 业务状态  */
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
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		 this.briefName = briefName == null ? null : briefName.trim();
	}
	public String getWholeName() {
		return wholeName;
	}
	public void setWholeName(String wholeName) {
		 this.wholeName = wholeName == null ? null : wholeName.trim();
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		 this.typeName = typeName == null ? null : typeName.trim();
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		 this.password = password == null ? null : password.trim();
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		 this.logo = logo == null ? null : logo.trim();
	}
	public Integer getLogoPicId() {
		return logoPicId;
	}
	public void setLogoPicId(Integer logoPicId) {
		this.logoPicId = logoPicId;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		 this.website = website == null ? null : website.trim();
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		 this.address = address == null ? null : address.trim();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		 this.email = email == null ? null : email.trim();
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		 this.loginName = loginName == null ? null : loginName.trim();
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		 this.phone = phone == null ? null : phone.trim();
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		 this.tel = tel == null ? null : tel.trim();
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		 this.fax = fax == null ? null : fax.trim();
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		 this.qq = qq == null ? null : qq.trim();
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		 this.weixin = weixin == null ? null : weixin.trim();
	}
	public String getWeibo() {
		return weibo;
	}
	public void setWeibo(String weibo) {
		 this.weibo = weibo == null ? null : weibo.trim();
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		 this.area = area == null ? null : area.trim();
	}
	public Integer getDoctorNum() {
		return doctorNum;
	}
	public void setDoctorNum(Integer doctorNum) {
		this.doctorNum = doctorNum;
	}
	public String getDoctorInfo() {
		return doctorInfo;
	}
	public void setDoctorInfo(String doctorInfo) {
		 this.doctorInfo = doctorInfo == null ? null : doctorInfo.trim();
	}
	public Integer getNurseNum() {
		return nurseNum;
	}
	public void setNurseNum(Integer nurseNum) {
		this.nurseNum = nurseNum;
	}
	public String getNurseInfo() {
		return nurseInfo;
	}
	public void setNurseInfo(String nurseInfo) {
		 this.nurseInfo = nurseInfo == null ? null : nurseInfo.trim();
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		 this.adminName = adminName == null ? null : adminName.trim();
	}
	public String getIndoorPicPaths() {
		return indoorPicPaths;
	}
	public void setIndoorPicPaths(String indoorPicPaths) {
		 this.indoorPicPaths = indoorPicPaths == null ? null : indoorPicPaths.trim();
	}
	public String getOutdoorPicPaths() {
		return outdoorPicPaths;
	}
	public void setOutdoorPicPaths(String outdoorPicPaths) {
		 this.outdoorPicPaths = outdoorPicPaths == null ? null : outdoorPicPaths.trim();
	}
	public String getAgeBetween() {
		return ageBetween;
	}
	public void setAgeBetween(String ageBetween) {
		 this.ageBetween = ageBetween == null ? null : ageBetween.trim();
	}
	public String getContactWay() {
		return contactWay;
	}
	public void setContactWay(String contactWay) {
		 this.contactWay = contactWay == null ? null : contactWay.trim();
	}
	public String getMedicalFrom() {
		return medicalFrom;
	}
	public void setMedicalFrom(String medicalFrom) {
		 this.medicalFrom = medicalFrom == null ? null : medicalFrom.trim();
	}
	public String getStockWay() {
		return stockWay;
	}
	public void setStockWay(String stockWay) {
		 this.stockWay = stockWay == null ? null : stockWay.trim();
	}
	public Integer getIsDoctor() {
		return isDoctor;
	}
	public void setIsDoctor(Integer isDoctor) {
		this.isDoctor = isDoctor;
	}
	public Integer getIsLegalPerson() {
		return isLegalPerson;
	}
	public void setIsLegalPerson(Integer isLegalPerson) {
		this.isLegalPerson = isLegalPerson;
	}
	public String getReputition() {
		return reputition;
	}
	public void setReputition(String reputition) {
		 this.reputition = reputition == null ? null : reputition.trim();
	}
	public String getPatientFlow() {
		return patientFlow;
	}
	public void setPatientFlow(String patientFlow) {
		 this.patientFlow = patientFlow == null ? null : patientFlow.trim();
	}
	public String getHealthDoc() {
		return healthDoc;
	}
	public void setHealthDoc(String healthDoc) {
		 this.healthDoc = healthDoc == null ? null : healthDoc.trim();
	}
	public Integer getIsAdvertisement() {
		return isAdvertisement;
	}
	public void setIsAdvertisement(Integer isAdvertisement) {
		this.isAdvertisement = isAdvertisement;
	}
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		 this.bed = bed == null ? null : bed.trim();
	}
	public String getHygienismCondition() {
		return hygienismCondition;
	}
	public void setHygienismCondition(String hygienismCondition) {
		 this.hygienismCondition = hygienismCondition == null ? null : hygienismCondition.trim();
	}
	public String getGps() {
		return gps;
	}
	public void setGps(String gps) {
		 this.gps = gps == null ? null : gps.trim();
	}
	public String getCoporationAttitude() {
		return coporationAttitude;
	}
	public void setCoporationAttitude(String coporationAttitude) {
		 this.coporationAttitude = coporationAttitude == null ? null : coporationAttitude.trim();
	}
	public String getVisitInfo() {
		return visitInfo;
	}
	public void setVisitInfo(String visitInfo) {
		 this.visitInfo = visitInfo == null ? null : visitInfo.trim();
	}
	public Integer getIsAssignContract() {
		return isAssignContract;
	}
	public void setIsAssignContract(Integer isAssignContract) {
		this.isAssignContract = isAssignContract;
	}
	public String getContractInfo() {
		return contractInfo;
	}
	public void setContractInfo(String contractInfo) {
		 this.contractInfo = contractInfo == null ? null : contractInfo.trim();
	}
	public Integer getIsAssignIntention() {
		return isAssignIntention;
	}
	public void setIsAssignIntention(Integer isAssignIntention) {
		this.isAssignIntention = isAssignIntention;
	}
	public Integer getHaveVisitValid() {
		return haveVisitValid;
	}
	public void setHaveVisitValid(Integer haveVisitValid) {
		this.haveVisitValid = haveVisitValid;
	}
	public String getOtherFacility() {
		return otherFacility;
	}
	public void setOtherFacility(String otherFacility) {
		 this.otherFacility = otherFacility == null ? null : otherFacility.trim();
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		 this.qrCode = qrCode == null ? null : qrCode.trim();
	}
	public String getQrCode2() {
		return qrCode2;
	}
	public void setQrCode2(String qrCode2) {
		 this.qrCode2 = qrCode2 == null ? null : qrCode2.trim();
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		 this.introduction = introduction == null ? null : introduction.trim();
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
	public String getHospitalTypeName() {
		return hospitalTypeName;
	}

	public void setHospitalTypeName(String hospitalTypeName) {
		this.hospitalTypeName = hospitalTypeName;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDoctorListStr() {
		return doctorListStr;
	}

	public void setDoctorListStr(String doctorListStr) {
		this.doctorListStr = doctorListStr;
	}

	
	public Integer getDoctorListStrSUM() {
		return doctorListStrSUM;
	}

	public void setDoctorListStrSUM(Integer doctorListStrSUM) {
		this.doctorListStrSUM = doctorListStrSUM;
	}	
	
	public String getNurseListStr() {
		return nurseListStr;
	}

	public void setNurseListStr(String nurseListStr) {
		this.nurseListStr = nurseListStr;
	}

	public String getVisitListStr() {
		return visitListStr;
	}

	public void setVisitListStr(String visitListStr) {
		this.visitListStr = visitListStr;
	}

	public String getContractListStr() {
		return contractListStr;
	}

	public void setContractListStr(String contractListStr) {
		this.contractListStr = contractListStr;
	}

	public String getIsDoctorStr() {
		return isDoctorStr;
	}

	public void setIsDoctorStr(String isDoctorStr) {
		this.isDoctorStr = isDoctorStr;
	}

	public String getIsLegalPersonStr() {
		return isLegalPersonStr;
	}

	public void setIsLegalPersonStr(String isLegalPersonStr) {
		this.isLegalPersonStr = isLegalPersonStr;
	}

	public String getIsAdvertisementStr() {
		return isAdvertisementStr;
	}

	public void setIsAdvertisementStr(String isAdvertisementStr) {
		this.isAdvertisementStr = isAdvertisementStr;
	}

	public String getHaveVisitValidStr() {
		return haveVisitValidStr;
	}

	public void setHaveVisitValidStr(String haveVisitValidStr) {
		this.haveVisitValidStr = haveVisitValidStr;
	}

	public String getIsAssignContractStr() {
		return isAssignContractStr;
	}

	public void setIsAssignContractStr(String isAssignContractStr) {
		this.isAssignContractStr = isAssignContractStr;
	}

	public String getIsAssignIntentionStr() {
		return isAssignIntentionStr;
	}

	public String getContractSerialStr() {
		return contractSerialStr;
	}

	public void setContractSerialStr(String contractSerialStr) {
		this.contractSerialStr = contractSerialStr;
	}

	public String getContractStartDateStr() {
		return contractStartDateStr;
	}

	public void setContractStartDateStr(String contractStartDateStr) {
		this.contractStartDateStr = contractStartDateStr;
	}

	public String getContractLimitStr() {
		return contractLimitStr;
	}

	public void setContractLimitStr(String contractLimitStr) {
		this.contractLimitStr = contractLimitStr;
	}

	public void setIsAssignIntentionStr(String isAssignIntentionStr) {
		this.isAssignIntentionStr = isAssignIntentionStr;
	}

	public String getHygienismConditionStr() {
		return hygienismConditionStr;
	}

	public void setHygienismConditionStr(String hygienismConditionStr) {
		this.hygienismConditionStr = hygienismConditionStr;
	}

	public String getContractRemarkStr() {
		return contractRemarkStr;
	}

	public void setContractRemarkStr(String contractRemarkStr) {
		this.contractRemarkStr = contractRemarkStr;
	}

	public String getCreatedAtStr() {
		return createdAtStr;
	}

	public void setCreatedAtStr(String createdAtStr) {
		this.createdAtStr = createdAtStr;
	}

	public String getUpdatedAtStr() {
		return updatedAtStr;
	}

	public void setUpdatedAtStr(String updatedAtStr) {
		this.updatedAtStr = updatedAtStr;
	}
	
	/**=========================== 自定义GETSET方法结束 _@CAUTION_SELF_GETSET_FINISH@_ ===========================*/
	
}