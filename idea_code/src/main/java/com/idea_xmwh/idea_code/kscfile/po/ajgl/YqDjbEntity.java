package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:YQ_DJB
 * Project Name:spxt
 * File Name:YqDjbEntity
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/11 10:59   zhongcg         1.0       1.0 Version
 **/
@TableName("YQ_DJB")
public class YqDjbEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField("AHDM")
    private String ahdm;
    @TableField("XH")
    private Integer xh;
    @TableField("PGRQ")
    private String pgrq;
    @TableField("PGR")
    private String pgr;
    @TableField("PGDJ")
    private String pgdj;
    @TableField("YQXGRY")
    private String yqxgry;
    @TableField("PGBM")
    private String pgbm;
    @TableField("TITLE")
    private String title;
    @TableField("SUMMARY")
    private String summary;
    @TableField("POSTINFORMATION")
    private String posiinformation;
    @TableField("DETAILSANDREASON")
    private String detailsandreason;
    @TableField("SITUATION")
    private String situation;
    @TableField("YDJY")
    private String ydjy;
    @TableField("BMLDSPYJ")
    private String bmldspyj;
    @TableField("PGJD")
    private String pgjd;
    @TableField("PGBXH")
    private String pgbxh;
    @TableField("FYDM")
    private String dydm;
    @TableField("DLRHBHR")
    private String dlrhbhr;
    @TableField("PJLY")
    private String pjly;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

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

    public String getPgrq() {
        return pgrq;
    }

    public void setPgrq(String pgrq) {
        this.pgrq = pgrq;
    }

    public String getPgr() {
        return pgr;
    }

    public void setPgr(String pgr) {
        this.pgr = pgr;
    }

    public String getPgdj() {
        return pgdj;
    }

    public void setPgdj(String pgdj) {
        this.pgdj = pgdj;
    }

    public String getYqxgry() {
        return yqxgry;
    }

    public void setYqxgry(String yqxgry) {
        this.yqxgry = yqxgry;
    }

    public String getPgbm() {
        return pgbm;
    }

    public void setPgbm(String pgbm) {
        this.pgbm = pgbm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPosiinformation() {
        return posiinformation;
    }

    public void setPosiinformation(String posiinformation) {
        this.posiinformation = posiinformation;
    }

    public String getDetailsandreason() {
        return detailsandreason;
    }

    public void setDetailsandreason(String detailsandreason) {
        this.detailsandreason = detailsandreason;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getYdjy() {
        return ydjy;
    }

    public void setYdjy(String ydjy) {
        this.ydjy = ydjy;
    }

    public String getBmldspyj() {
        return bmldspyj;
    }

    public void setBmldspyj(String bmldspyj) {
        this.bmldspyj = bmldspyj;
    }

    public String getPgjd() {
        return pgjd;
    }

    public void setPgjd(String pgjd) {
        this.pgjd = pgjd;
    }

    public String getPgbxh() {
        return pgbxh;
    }

    public void setPgbxh(String pgbxh) {
        this.pgbxh = pgbxh;
    }

    public String getDydm() {
        return dydm;
    }

    public void setDydm(String dydm) {
        this.dydm = dydm;
    }

    public String getDlrhbhr() {
        return dlrhbhr;
    }

    public void setDlrhbhr(String dlrhbhr) {
        this.dlrhbhr = dlrhbhr;
    }

    public String getPjly() {
        return pjly;
    }

    public void setPjly(String pjly) {
        this.pjly = pjly;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
