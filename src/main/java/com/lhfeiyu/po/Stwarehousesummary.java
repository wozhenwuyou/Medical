package com.lhfeiyu.po;

import java.util.Date;

public class Stwarehousesummary {
    private Integer id;

    private String productname;

    private Integer producttypeid;

    private String size;

    private Integer num;

    private String mununit;

    private String lot;

    private Date expirationdate;

    private String equipmentnb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
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
}