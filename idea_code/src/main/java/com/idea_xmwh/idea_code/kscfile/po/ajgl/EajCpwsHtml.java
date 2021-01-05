package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:EAJ_CPWS_HTML表映射
 * Project Name:spxt
 * File Name:EajCpwsHtml
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/22 11:52   hebq         1.0       1.0 Version
 **/
@TableName("EAJ_CPWS_HTML")
public class EajCpwsHtml {
    @TableField("AHDM")
    private String ahdm;

    @TableField("XH")
    private String xh;

    @TableField("HTML")
    private byte[] html;

    @TableField("LB")
    private String lb;

    @TableField("MC")
    private String mc;

    @TableField("ZZR")
    private String zzr;

    @TableField("ZZSJ")
    private Date zzsj;

    @TableField("LASTUPDATE")
    private Date lastupdate;

    @TableField("ZT")
    private String zt;

    @TableField("FYDM")
    private String fydm;

    @TableField("FYMC")
    private String fymc;

    @TableField("IS_DELETED")
    private String IsDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtCreat;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public byte[] getHtml() {
        return html;
    }

    public void setHtml(byte[] html) {
        this.html = html;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getZzr() {
        return zzr;
    }

    public void setZzr(String zzr) {
        this.zzr = zzr;
    }

    public Date getZzsj() {
        return zzsj;
    }

    public void setZzsj(Date zzsj) {
        this.zzsj = zzsj;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getFymc() {
        return fymc;
    }

    public void setFymc(String fymc) {
        this.fymc = fymc;
    }

    public String getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        IsDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }
}
