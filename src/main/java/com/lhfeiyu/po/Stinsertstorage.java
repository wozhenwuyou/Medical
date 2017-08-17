package com.lhfeiyu.po;

import java.util.Date;

public class Stinsertstorage {
    private Integer id;

    private Date inserttime;

    private String dealer;

    private String createproduct;

    private Integer userid;

    private Date updatetime;

    private String address;

    private String remarks;

    private Integer inorouttypeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        this.dealer = dealer == null ? null : dealer.trim();
    }

    public String getCreateproduct() {
        return createproduct;
    }

    public void setCreateproduct(String createproduct) {
        this.createproduct = createproduct == null ? null : createproduct.trim();
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
        this.address = address == null ? null : address.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getInorouttypeid() {
        return inorouttypeid;
    }

    public void setInorouttypeid(Integer inorouttypeid) {
        this.inorouttypeid = inorouttypeid;
    }
}