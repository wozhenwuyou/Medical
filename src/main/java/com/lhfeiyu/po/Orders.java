package com.lhfeiyu.po;

import java.util.Date;
import java.util.List;

public class Orders {
	
    private Integer ordersid;

    private Date inserttime;

    private Date createtime;

    private Integer createuserid;

    private Integer updateuserid;

    private Date updatetime;

    private Integer inuserid;
    
    //订单明细
    private List<Ordersparticular> ordersdetails;
    //创建人
    private Admin cuser;
    //入库人
    private Admin inuser;
    
	public Integer getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(Integer ordersid) {
		this.ordersid = ordersid;
	}
	public Date getInserttime() {
		return inserttime;
	}
	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getCreateuserid() {
		return createuserid;
	}
	public void setCreateuserid(Integer createuserid) {
		this.createuserid = createuserid;
	}
	public Integer getUpdateuserid() {
		return updateuserid;
	}
	public void setUpdateuserid(Integer updateuserid) {
		this.updateuserid = updateuserid;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public Integer getInuserid() {
		return inuserid;
	}
	public void setInuserid(Integer inuserid) {
		this.inuserid = inuserid;
	}
	public Admin getCuser() {
		return cuser;
	}
	public void setCuser(Admin cuser) {
		this.cuser = cuser;
	}
	public Admin getInuser() {
		return inuser;
	}
	public void setInuser(Admin inuser) {
		this.inuser = inuser;
	}
	public List<Ordersparticular> getOrdersdetails() {
		return ordersdetails;
	}
	public void setOrdersdetails(List<Ordersparticular> ordersdetails) {
		this.ordersdetails = ordersdetails;
	}
    
}