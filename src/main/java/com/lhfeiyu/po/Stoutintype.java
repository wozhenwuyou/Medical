package com.lhfeiyu.po;

public class Stoutintype {
    private Integer id;

    private String outintypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutintypename() {
        return outintypename;
    }

    public void setOutintypename(String outintypename) {
        this.outintypename = outintypename == null ? null : outintypename.trim();
    }
}