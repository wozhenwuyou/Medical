package com.lhfeiyu.po;

public class Stordersparticular {
    private Integer id;

    private String ordersno;

    private String productname;

    private Integer productid;

    private String size;

    private Integer num;

    private String mununit;

    private String createproduct;

    private Integer producttypeid;

    private Integer supplierid;

    private Integer ordersId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersno() {
        return ordersno;
    }

    public void setOrdersno(String ordersno) {
        this.ordersno = ordersno == null ? null : ordersno.trim();
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

    public String getCreateproduct() {
        return createproduct;
    }

    public void setCreateproduct(String createproduct) {
        this.createproduct = createproduct == null ? null : createproduct.trim();
    }

    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }
}