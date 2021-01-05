package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:EAJ_ZLJD表映射
 * Project Name:spxt
 * File Name:EajZljd
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/5 19:43   hebq         1.0       1.0 Version
 **/
@TableName("EAJ_ZLJD")
public class EajZljd {

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableField("AJZT")
    private String ajzt;

    @TableField("SALB")
    private String salb;

    @TableField("SAYY")
    private String sayy;

    @TableField("CLBH")
    private String clbh;

    @TableField("YSFG")
    private String ysfg;

    @TableField("YSAH")
    private String ysah;

    @TableField("ZCBM")
    private String zcbm;

    @TableField("ZCR")
    private String zcr;

    @TableField("ZCYY")
    private String zcyy;

    @TableField("ZCYJ")
    private String zcyj;

    @TableField("ZCJZRQ")
    private String zcjzrq;

    @TableField("YSHCRQ")
    private String yshcrq;

    @TableField("HCYY")
    private String hcyy;

    @TableField("HCYJ")
    private String hcyj;

    @TableField("HCJL")
    private String hcjl;

    @TableField("HCRQ")
    private String hcrq;

    @TableField("SFWJ")
    private String sfwj;

    @TableField("WFWJ")
    private String wfwj;

    @TableField("HCJLLY")
    private String hcjlly;

    @TableField("HCJLMS")
    private String hcjlms;

    @TableField("FQSB")
    private String fqsb;

    @TableField("SWHRQ")
    private String swhrq;

    @TableField("JAFL")
    private String jafl;

    @TableField("ZJJG")
    private String zjjg;

    @TableField("DARQ")
    private String darq;

    @TableField("SFHC")
    private String sfhc;

    @TableField("DJR")
    private String djr;

    @TableField("DJRQ")
    private String djrq;

    @TableField("ZCBG")
    private String zcbg;

    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtcreat;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getAjzt() {
        return ajzt;
    }

    public void setAjzt(String ajzt) {
        this.ajzt = ajzt;
    }

    public String getSalb() {
        return salb;
    }

    public void setSalb(String salb) {
        this.salb = salb;
    }

    public String getSayy() {
        return sayy;
    }

    public void setSayy(String sayy) {
        this.sayy = sayy;
    }

    public String getClbh() {
        return clbh;
    }

    public void setClbh(String clbh) {
        this.clbh = clbh;
    }

    public String getYsfg() {
        return ysfg;
    }

    public void setYsfg(String ysfg) {
        this.ysfg = ysfg;
    }

    public String getYsah() {
        return ysah;
    }

    public void setYsah(String ysah) {
        this.ysah = ysah;
    }

    public String getZcbm() {
        return zcbm;
    }

    public void setZcbm(String zcbm) {
        this.zcbm = zcbm;
    }

    public String getZcr() {
        return zcr;
    }

    public void setZcr(String zcr) {
        this.zcr = zcr;
    }

    public String getZcyy() {
        return zcyy;
    }

    public void setZcyy(String zcyy) {
        this.zcyy = zcyy;
    }

    public String getZcyj() {
        return zcyj;
    }

    public void setZcyj(String zcyj) {
        this.zcyj = zcyj;
    }

    public String getZcjzrq() {
        return zcjzrq;
    }

    public void setZcjzrq(String zcjzrq) {
        this.zcjzrq = zcjzrq;
    }

    public String getYshcrq() {
        return yshcrq;
    }

    public void setYshcrq(String yshcrq) {
        this.yshcrq = yshcrq;
    }

    public String getHcyy() {
        return hcyy;
    }

    public void setHcyy(String hcyy) {
        this.hcyy = hcyy;
    }

    public String getHcyj() {
        return hcyj;
    }

    public void setHcyj(String hcyj) {
        this.hcyj = hcyj;
    }

    public String getHcjl() {
        return hcjl;
    }

    public void setHcjl(String hcjl) {
        this.hcjl = hcjl;
    }

    public String getHcrq() {
        return hcrq;
    }

    public void setHcrq(String hcrq) {
        this.hcrq = hcrq;
    }

    public String getSfwj() {
        return sfwj;
    }

    public void setSfwj(String sfwj) {
        this.sfwj = sfwj;
    }

    public String getWfwj() {
        return wfwj;
    }

    public void setWfwj(String wfwj) {
        this.wfwj = wfwj;
    }

    public String getHcjlly() {
        return hcjlly;
    }

    public void setHcjlly(String hcjlly) {
        this.hcjlly = hcjlly;
    }

    public String getHcjlms() {
        return hcjlms;
    }

    public void setHcjlms(String hcjlms) {
        this.hcjlms = hcjlms;
    }

    public String getFqsb() {
        return fqsb;
    }

    public void setFqsb(String fqsb) {
        this.fqsb = fqsb;
    }

    public String getSwhrq() {
        return swhrq;
    }

    public void setSwhrq(String swhrq) {
        this.swhrq = swhrq;
    }

    public String getJafl() {
        return jafl;
    }

    public void setJafl(String jafl) {
        this.jafl = jafl;
    }

    public String getZjjg() {
        return zjjg;
    }

    public void setZjjg(String zjjg) {
        this.zjjg = zjjg;
    }

    public String getDarq() {
        return darq;
    }

    public void setDarq(String darq) {
        this.darq = darq;
    }

    public String getSfhc() {
        return sfhc;
    }

    public void setSfhc(String sfhc) {
        this.sfhc = sfhc;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getZcbg() {
        return zcbg;
    }

    public void setZcbg(String zcbg) {
        this.zcbg = zcbg;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
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

    public Date getGmtcreat() {
        return gmtcreat;
    }

    public void setGmtcreat(Date gmtcreat) {
        this.gmtcreat = gmtcreat;
    }
}
