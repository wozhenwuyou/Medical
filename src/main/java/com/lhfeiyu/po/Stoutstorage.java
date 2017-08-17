package com.lhfeiyu.po;

import java.util.Date;

public class Stoutstorage {
    private Integer id;

    private Date createtime;

    private Date updatetime;

    private Integer userid;

    private Date outstoragetime;

    private Integer outstoragetypeid;

    private Integer useridOut;

    private Date receivingtime;

    private Integer receivinguserid;

    private String receivingarea;

    private Integer auditoruserid;

    private Date auditortime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOutstoragetime() {
        return outstoragetime;
    }

    public void setOutstoragetime(Date outstoragetime) {
        this.outstoragetime = outstoragetime;
    }

    public Integer getOutstoragetypeid() {
        return outstoragetypeid;
    }

    public void setOutstoragetypeid(Integer outstoragetypeid) {
        this.outstoragetypeid = outstoragetypeid;
    }

    public Integer getUseridOut() {
        return useridOut;
    }

    public void setUseridOut(Integer useridOut) {
        this.useridOut = useridOut;
    }

    public Date getReceivingtime() {
        return receivingtime;
    }

    public void setReceivingtime(Date receivingtime) {
        this.receivingtime = receivingtime;
    }

    public Integer getReceivinguserid() {
        return receivinguserid;
    }

    public void setReceivinguserid(Integer receivinguserid) {
        this.receivinguserid = receivinguserid;
    }

    public String getReceivingarea() {
        return receivingarea;
    }

    public void setReceivingarea(String receivingarea) {
        this.receivingarea = receivingarea == null ? null : receivingarea.trim();
    }

    public Integer getAuditoruserid() {
        return auditoruserid;
    }

    public void setAuditoruserid(Integer auditoruserid) {
        this.auditoruserid = auditoruserid;
    }

    public Date getAuditortime() {
        return auditortime;
    }

    public void setAuditortime(Date auditortime) {
        this.auditortime = auditortime;
    }
}