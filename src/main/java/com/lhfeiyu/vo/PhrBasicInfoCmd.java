package com.lhfeiyu.vo;

import java.util.Date;

import com.lhfeiyu.po.Admin;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.PhrBasicInfo;

/**
 * @author （zouwenji）
 *
 */
public class PhrBasicInfoCmd extends PhrBasicInfo {
	
	private Integer page;
	private Integer rows;
	private String sort;
	private String order;
	
	private String type;
	
	private Integer queryScope;
	
	private Doctor doctor;
	private Admin admin;
	private Hospital hospital;
	
	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	private Date createTimeBegin;
	private Date createTimeEnd;
	
	public Date getCreateTimeBegin() {
		return createTimeBegin;
	}

	public void setCreateTimeBegin(Date createTimeBegin) {
		this.createTimeBegin = createTimeBegin;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getQueryScope() {
		return queryScope;
	}

	public void setQueryScope(Integer queryScope) {
		this.queryScope = queryScope;
	}

}
