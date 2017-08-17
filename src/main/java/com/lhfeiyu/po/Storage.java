package com.lhfeiyu.po;

import java.util.Date;

public class Storage {
    private Integer id;

    private Integer ordersid;

    private Integer insertstorageid;

    private String productname;

    private Integer productid;

    private Integer num;

    private String mununit;

    private Integer producttypeid;

    private String size;

    private String lot;

    private Date expirationdate;

    private String equipmentnb;

    private String receivingunit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }

    public Integer getInsertstorageid() {
        return insertstorageid;
    }

    public void setInsertstorageid(Integer insertstorageid) {
        this.insertstorageid = insertstorageid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getMununit() {
        return mununit;
    }

    public void setMununit(String mununit) {
        this.mununit = mununit == null ? null : mununit.trim();
    }

    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot == null ? null : lot.trim();
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getEquipmentnb() {
        return equipmentnb;
    }

    public void setEquipmentnb(String equipmentnb) {
        this.equipmentnb = equipmentnb == null ? null : equipmentnb.trim();
    }

    public String getReceivingunit() {
        return receivingunit;
    }

    public void setReceivingunit(String receivingunit) {
        this.receivingunit = receivingunit == null ? null : receivingunit.trim();
    }
}