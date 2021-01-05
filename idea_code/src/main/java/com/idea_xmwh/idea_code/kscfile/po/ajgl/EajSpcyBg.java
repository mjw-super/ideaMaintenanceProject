package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:eaj_spcy_bg
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/7 17:07   xiongsc         1.0       1.0 Version
 **/
@TableName("EAJ_SPCY_BG")
public class EajSpcyBg {

    @TableField("AHDM")
    private String ahdm;

    @TableField("XH")
    private Integer xh;

    @TableField("JS")
    private String js;

    @TableField("YCY")
    private String ycy;


    @TableField("XCY")
    private String xcy;

    @TableField("BGRQ")
    private String bgrq;

    @TableField("BGYY")
    private String bgyy;


    @TableField("LASTUPDATE")
    private Date lastupdate;

    @TableField("TZTA")
    private String tzta;


    @TableField("PSYYQF")
    private String psyyqf;


    @TableField("BEIZ")
    private String beiz;


    @TableField("FYDM")
    private String fydm;


    @TableField("BGRY")
    private String bgry;

    @TableField("ROWUUID")
    private String rowuuid;


    @TableField("SLH")
    private String slh;

    @TableField("IS_DELETED")
    private Integer is_deleted;//是否删除
    @TableField("CREATE_BY")
    private String create_by;//提交人
    @TableField("UPDATE_BY")
    private String update_by;//最近修改人
    @TableField("GMT_CREAT")
    private Date gmt_creat;//插入时间

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getYcy() {
        return ycy;
    }

    public void setYcy(String ycy) {
        this.ycy = ycy;
    }

    public String getXcy() {
        return xcy;
    }

    public void setXcy(String xcy) {
        this.xcy = xcy;
    }

    public String getBgrq() {
        return bgrq;
    }

    public void setBgrq(String bgrq) {
        this.bgrq = bgrq;
    }

    public String getBgyy() {
        return bgyy;
    }

    public void setBgyy(String bgyy) {
        this.bgyy = bgyy;
    }

    public String getBgry() {
        return bgry;
    }

    public void setBgry(String bgry) {
        this.bgry = bgry;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getTzta() {
        return tzta;
    }

    public void setTzta(String tzta) {
        this.tzta = tzta;
    }

    public String getPsyyqf() {
        return psyyqf;
    }

    public void setPsyyqf(String psyyqf) {
        this.psyyqf = psyyqf;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getSlh() {
        return slh;
    }

    public void setSlh(String slh) {
        this.slh = slh;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(Date gmt_creat) {
        this.gmt_creat = gmt_creat;
    }
}
