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
public class Patient extends Parent {

	/**============================== 自定义字段 开始 _@CAUTION_SELF_FIELD_BEGIN@_ ==============================*/
	
	/**============================== 自定义字段 结束 _@CAUTION_SELF_FIELD_FINISH@_ ==============================*/

	/**   */
	private Integer id;
	
	/** 医生id  */
	private Integer doctorId;
	
	/** 艾迪康条码  */
	private String adiconBarcode;
	
	/** 用户名  */
	private String username;
	
	/** 用户密码  */
	private String password;
	
	/** 真实姓名  */
	private String realName;
	
	/** 性别：1女，2：男  */
	private String sex;
	
	/**   */
	private String age;
	
	/** 用户手机号码  */
	private String phone;
	
	/** 座机  */
	private String tel;
	
	/**   */
	private String idcardNum;
	
	/** 邮箱  */
	private String email;
	
	/** 用户头像  */
	private String avatar;
	
	/** 详细地址  */
	private String address;
	
	/** 省份  */
	private String province;
	
	/** 城市  */
	private String city;
	
	/** 微信  */
	private String weixin;
	
	/** QQ  */
	private String qq;
	
	/**   */
	private String job;
	
	/**   */
	private Integer jobId;
	
	/** 出生日期  */
	private String birthday;
	
	/** 二维码  */
	private String qrCode;
	
	/** 描述  */
	private String description;
	
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
	
	/** 备用字段-字符串  */
	private String attrStr;
	
	/** 备用字段-整型  */
	private Integer attrInt;
	
	/** 排列顺序  */
	private Integer sequence;
	
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
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getAdiconBarcode() {
		return adiconBarcode;
	}
	public void setAdiconBarcode(String adiconBarcode) {
		 this.adiconBarcode = adiconBarcode == null ? null : adiconBarcode.trim();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		 this.username = username == null ? null : username.trim();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		 this.password = password == null ? null : password.trim();
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		 this.realName = realName == null ? null : realName.trim();
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
	public String getIdcardNum() {
		return idcardNum;
	}
	public void setIdcardNum(String idcardNum) {
		 this.idcardNum = idcardNum == null ? null : idcardNum.trim();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		 this.email = email == null ? null : email.trim();
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		 this.avatar = avatar == null ? null : avatar.trim();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		 this.address = address == null ? null : address.trim();
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		 this.province = province == null ? null : province.trim();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		 this.city = city == null ? null : city.trim();
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		 this.weixin = weixin == null ? null : weixin.trim();
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		 this.qq = qq == null ? null : qq.trim();
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		 this.job = job == null ? null : job.trim();
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		 this.birthday = birthday == null ? null : birthday.trim();
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		 this.qrCode = qrCode == null ? null : qrCode.trim();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		 this.description = description == null ? null : description.trim();
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
	public String getAttrStr() {
		return attrStr;
	}
	public void setAttrStr(String attrStr) {
		 this.attrStr = attrStr == null ? null : attrStr.trim();
	}
	public Integer getAttrInt() {
		return attrInt;
	}
	public void setAttrInt(Integer attrInt) {
		this.attrInt = attrInt;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
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
	
	/**=========================== 自定义GETSET方法结束 _@CAUTION_SELF_GETSET_FINISH@_ ===========================*/
	
}