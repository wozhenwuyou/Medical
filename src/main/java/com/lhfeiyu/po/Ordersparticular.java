package com.lhfeiyu.po;

public class Ordersparticular {
	
    private Integer ordersparticularid;

    private String ordersno;

    private String productname;

    private Integer productid;

    private String size;

    private Integer num;

    private String mununit;

    private String createproduct;

    private String producttypeid;

    private Integer supplierid;
    
    private Integer ordersid;

    public Integer getOrdersparticularid() {
        return ordersparticularid;
    }

    public void setOrdersparticularid(Integer ordersparticularid) {
        this.ordersparticularid = ordersparticularid;
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

    public String getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(String producttypeid) {
        this.producttypeid = producttypeid == null ? null : producttypeid.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

	public Integer getOrdersid() {
		return ordersid;
	}

	public void setOrdersid(Integer ordersid) {
		this.ordersid = ordersid;
	}

}