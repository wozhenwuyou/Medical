package com.lhfeiyu.po;

import java.util.Date;

//入库类
public class Insertstorage {

	private Integer  insertstorageid;
	private Date inserttime;
	private String dealer;//经销商
	private String createproduct;//生产商
	private Integer userid;//入库人id
	private Date updatetime;
	private String address;
	private String remarks; //备注
	private Integer inorouttypeid;//入库类型ID
	
	private Admin admin;//入库人
	
	
	public Integer getInsertstorageid() {
		return insertstorageid;
	}
	public void setInsertstorageid(Integer insertstorageid) {
		this.insertstorageid = insertstorageid;
	}
	public Date getInserttime() {
		return inserttime;
	}
	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public String getCreateproduct() {
		return createproduct;
	}
	public void setCreateproduct(String createproduct) {
		this.createproduct = createproduct;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getInorouttypeid() {
		return inorouttypeid;
	}
	public void setInorouttypeid(Integer inorouttypeid) {
		this.inorouttypeid = inorouttypeid;
	}

}
