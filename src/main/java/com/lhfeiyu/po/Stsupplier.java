package com.lhfeiyu.po;

import java.util.Date;

public class Stsupplier {
    private Integer id;

    private String suppliername;

    private String createproduct;

    private String principalpeople;

    private String phone;

    private String address;

    private Integer createuserid;

    private Date createtime;

    private Integer updateuserid;

    private Date updatetime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getCreateproduct() {
        return createproduct;
    }

    public void setCreateproduct(String createproduct) {
        this.createproduct = createproduct == null ? null : createproduct.trim();
    }

    public String getPrincipalpeople() {
        return principalpeople;
    }

    public void setPrincipalpeople(String principalpeople) {
        this.principalpeople = principalpeople == null ? null : principalpeople.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}