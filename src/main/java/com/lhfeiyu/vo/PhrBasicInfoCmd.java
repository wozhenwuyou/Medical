package com.lhfeiyu.vo;

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

}
