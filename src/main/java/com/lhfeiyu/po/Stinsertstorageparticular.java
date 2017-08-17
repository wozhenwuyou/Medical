package com.lhfeiyu.po;

import java.util.Date;

public class Stinsertstorageparticular {
    private Integer id;

    private Integer insertstorageid;

    private Integer productid;

    private String productname;

    private Integer num;

    private String mununit;

    private Integer producttypeid;

    private String size;

    private String lot;

    private Date expirationdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInsertstorageid() {
        return insertstorageid;
    }

    public void setInsertstorageid(Integer insertstorageid) {
        this.insertstorageid = insertstorageid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
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
}