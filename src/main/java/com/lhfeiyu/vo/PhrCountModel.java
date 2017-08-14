package com.lhfeiyu.vo;

public class PhrCountModel {

	private String provinceName;// 省名称
	private String cityName;// 城市名称
	private String hospitalName;// 诊所名
	private String hospitalAddress;// 诊所地址
	private Integer archiveCount;// 档案数目

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public Integer getArchiveCount() {
		return archiveCount;
	}

	public void setArchiveCount(Integer archiveCount) {
		this.archiveCount = archiveCount;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
}
