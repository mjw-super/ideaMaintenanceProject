package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:EAJ_ZXLASQ表映射
 * Project Name:spxt
 * File Name:EajZxlasq
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/5 18:08   hebq         1.0       1.0 Version
 **/
@TableName("EAJ_ZXLASQ")
public class EajZxlasq {
    @TableId(value = "LSH", type = IdType.INPUT)
    private String lsh;

    @TableField("AHDM")
    private String ahdm;

    @TableField("XH")
    private Integer xh;

    @TableField("SYSBM")
    private String sysbm;

    @TableField("YSBM")
    private String ysbm;

    @TableField("AY")
    private Integer ay;

    @TableField("AYMS")
    private String ayms;

    @TableField("SQR")
    private String sqr;

    @TableField("SQRMC")
    private String sqrmc;

    @TableField("BZXR")
    private String bzxr;

    @TableField("BZXRMC")
    private String bzxrmc;

    @TableField("BZXRDZ")
    private String bzxrdz;

    @TableField("YSCL")
    private String yscl;

    @TableField("CPWS")
    private String cpws;

    @TableField("CPWSMC")
    private String cpwsmc;

    @TableField("SXRQ")
    private String sxrq;

    @TableField("YWQX")
    private String ywqx;

    @TableField("ZXSX")
    private String zxsx;

    @TableField("YSYY")
    private String ysyy;

    @TableField("ZYSX")
    private String zysx;

    @TableField("JBR")
    private String jbr;

    @TableField("JBRSPSJ")
    private String jbrspsj;

    @TableField("JBRSPYJ")
    private String jbrspyj;

    @TableField("TZ")
    private String tz;

    @TableField("TZSPSJ")
    private String tzspsj;

    @TableField("TZSPYJ")
    private String tzspyj;

    @TableField("YSR")
    private String ysr;

    @TableField("YSRLXFS")
    private String ysrlxfs;

    @TableField("YSRQ")
    private String ysrq;

    @TableField("JSR")
    private String jsr;

    @TableField("JSRQ")
    private String jsrq;

    @TableField("WSLALSH")
    private String wslalsh;

    @TableField("SLH")
    private String slh;

    @TableField("ZXYJDW")
    private String zxyjdw;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtCreat;

    @TableField("CLJG")
    private String cljg;

    @TableField("FWLSH")
    private String fwlsh;

    @TableField("SYSRY")
    private String sysry;

    @TableField("ZXAH")
    private String zxah;

    @TableField("ZXAHDM")
    private String zxahdm;

    @TableField("THYY")
    private String thyy;

    @TableField("ZXAJBM")
    private String zxajbm;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

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

    public String getSysbm() {
        return sysbm;
    }

    public void setSysbm(String sysbm) {
        this.sysbm = sysbm;
    }

    public String getYsbm() {
        return ysbm;
    }

    public void setYsbm(String ysbm) {
        this.ysbm = ysbm;
    }

    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    public String getAyms() {
        return ayms;
    }

    public void setAyms(String ayms) {
        this.ayms = ayms;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getSqrmc() {
        return sqrmc;
    }

    public void setSqrmc(String sqrmc) {
        this.sqrmc = sqrmc;
    }

    public String getBzxr() {
        return bzxr;
    }

    public void setBzxr(String bzxr) {
        this.bzxr = bzxr;
    }

    public String getBzxrmc() {
        return bzxrmc;
    }

    public void setBzxrmc(String bzxrmc) {
        this.bzxrmc = bzxrmc;
    }

    public String getBzxrdz() {
        return bzxrdz;
    }

    public void setBzxrdz(String bzxrdz) {
        this.bzxrdz = bzxrdz;
    }

    public String getYscl() {
        return yscl;
    }

    public void setYscl(String yscl) {
        this.yscl = yscl;
    }

    public String getCpws() {
        return cpws;
    }

    public void setCpws(String cpws) {
        this.cpws = cpws;
    }

    public String getCpwsmc() {
        return cpwsmc;
    }

    public void setCpwsmc(String cpwsmc) {
        this.cpwsmc = cpwsmc;
    }

    public String getSxrq() {
        return sxrq;
    }

    public void setSxrq(String sxrq) {
        this.sxrq = sxrq;
    }

    public String getYwqx() {
        return ywqx;
    }

    public void setYwqx(String ywqx) {
        this.ywqx = ywqx;
    }

    public String getZxsx() {
        return zxsx;
    }

    public void setZxsx(String zxsx) {
        this.zxsx = zxsx;
    }

    public String getYsyy() {
        return ysyy;
    }

    public void setYsyy(String ysyy) {
        this.ysyy = ysyy;
    }

    public String getZysx() {
        return zysx;
    }

    public void setZysx(String zysx) {
        this.zysx = zysx;
    }

    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    public String getJbrspsj() {
        return jbrspsj;
    }

    public void setJbrspsj(String jbrspsj) {
        this.jbrspsj = jbrspsj;
    }

    public String getJbrspyj() {
        return jbrspyj;
    }

    public void setJbrspyj(String jbrspyj) {
        this.jbrspyj = jbrspyj;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getTzspsj() {
        return tzspsj;
    }

    public void setTzspsj(String tzspsj) {
        this.tzspsj = tzspsj;
    }

    public String getTzspyj() {
        return tzspyj;
    }

    public void setTzspyj(String tzspyj) {
        this.tzspyj = tzspyj;
    }

    public String getYsr() {
        return ysr;
    }

    public void setYsr(String ysr) {
        this.ysr = ysr;
    }

    public String getYsrlxfs() {
        return ysrlxfs;
    }

    public void setYsrlxfs(String ysrlxfs) {
        this.ysrlxfs = ysrlxfs;
    }

    public String getYsrq() {
        return ysrq;
    }

    public void setYsrq(String ysrq) {
        this.ysrq = ysrq;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    public String getWslalsh() {
        return wslalsh;
    }

    public void setWslalsh(String wslalsh) {
        this.wslalsh = wslalsh;
    }

    public String getSlh() {
        return slh;
    }

    public void setSlh(String slh) {
        this.slh = slh;
    }

    public String getZxyjdw() {
        return zxyjdw;
    }

    public void setZxyjdw(String zxyjdw) {
        this.zxyjdw = zxyjdw;
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

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }

    public String getCljg() {
        return cljg;
    }

    public void setCljg(String cljg) {
        this.cljg = cljg;
    }

    public String getFwlsh() {
        return fwlsh;
    }

    public void setFwlsh(String fwlsh) {
        this.fwlsh = fwlsh;
    }

    public String getSysry() {
        return sysry;
    }

    public void setSysry(String sysry) {
        this.sysry = sysry;
    }

    public String getZxah() {
        return zxah;
    }

    public void setZxah(String zxah) {
        this.zxah = zxah;
    }

    public String getZxahdm() {
        return zxahdm;
    }

    public void setZxahdm(String zxahdm) {
        this.zxahdm = zxahdm;
    }

    public String getThyy() {
        return thyy;
    }

    public void setThyy(String thyy) {
        this.thyy = thyy;
    }

    public String getZxajbm() {
        return zxajbm;
    }

    public void setZxajbm(String zxajbm) {
        this.zxajbm = zxajbm;
    }
}
