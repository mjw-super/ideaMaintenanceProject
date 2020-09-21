package com.idea_xmwh.idea_code.kscfile.po.wsla;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:WslaDlr
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/12 16:30   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("WSLA_DSR_QT")
public class WslaDsrQt {


    @TableId(value = "LSH",type = IdType.INPUT)
     private String	lsh;
     @TableField("XH")
     private String	xh;
     @TableField("LX")
     private String	lx;
     @TableField("SSDW1")
     private String	ssdw1;
     @TableField("MC")
     private String	mc;
     @TableField("SFZHM")
     private String	sfzhm;
     @TableField("ZZJGDM")
     private String	zzjgdm;
     @TableField("DZ")
     private String	dz;
     @TableField("SDDZ")
     private String	sddz;
     @TableField("SFDZSD")
     private Integer	sfdzsd;
     @TableField("SJHM")
     private String	sjhm;
     @TableField("XB")
     private String	xb;
     @TableField("GJ")
     private String	gj;
     @TableField("MZ")
     private String	mz;
     @TableField("PXH")
     private Integer	pxh;
     @TableField("FDDBR")
     private String	fddbr;
     @TableField("LB")
     private String	lb;
     @TableField("BHLX")
     private String	bhlx;
     @TableField("CSRQ")
     private String	csrq;
     @TableField("SZDW")
     private String	szdw;
     @TableField("ZW")
     private String	zw;
     @TableField("DZYX")
     private String	dzyx;
     @TableField("DWXZ")
     private String	dwxz;
     @TableField("WHCD")
     private String	whcd;
     @TableField("NL")
     private Integer	nl;
     @TableField("ZY")
     private String	zy;
     @TableField("LXDH")
     private String	lxdh;
     @TableField("FYDM")
     private String	fydm;
     @TableField("LASTUPDATE")
     private Date	lastupdate;
     @TableField("QTZJZL")
     private String	qtzjzl;
     @TableField("QTZJHM")
     private String	qtzjhm;
     @TableField("DSRXH")
     private String	dsrxh;
     @TableField("LSZYZGZH")
     private String	lszyzgzh;
     @TableField("YDSRGX")
     private String	ydsrgx;
     @TableField("DLRLX")
     private String	dlrlx;
     @TableField("SFFLYZ")
     private String	sfflyz;


    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getSsdw1() {
        return ssdw1;
    }

    public void setSsdw1(String ssdw1) {
        this.ssdw1 = ssdw1;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public String getZzjgdm() {
        return zzjgdm;
    }

    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getSddz() {
        return sddz;
    }

    public void setSddz(String sddz) {
        this.sddz = sddz;
    }

    public Integer getSfdzsd() {
        return sfdzsd;
    }

    public void setSfdzsd(Integer sfdzsd) {
        this.sfdzsd = sfdzsd;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public Integer getPxh() {
        return pxh;
    }

    public void setPxh(Integer pxh) {
        this.pxh = pxh;
    }

    public String getFddbr() {
        return fddbr;
    }

    public void setFddbr(String fddbr) {
        this.fddbr = fddbr;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getBhlx() {
        return bhlx;
    }

    public void setBhlx(String bhlx) {
        this.bhlx = bhlx;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getSzdw() {
        return szdw;
    }

    public void setSzdw(String szdw) {
        this.szdw = szdw;
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
    }

    public String getDwxz() {
        return dwxz;
    }

    public void setDwxz(String dwxz) {
        this.dwxz = dwxz;
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    public Integer getNl() {
        return nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getQtzjzl() {
        return qtzjzl;
    }

    public void setQtzjzl(String qtzjzl) {
        this.qtzjzl = qtzjzl;
    }

    public String getQtzjhm() {
        return qtzjhm;
    }

    public void setQtzjhm(String qtzjhm) {
        this.qtzjhm = qtzjhm;
    }

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public String getLszyzgzh() {
        return lszyzgzh;
    }

    public void setLszyzgzh(String lszyzgzh) {
        this.lszyzgzh = lszyzgzh;
    }

    public String getYdsrgx() {
        return ydsrgx;
    }

    public void setYdsrgx(String ydsrgx) {
        this.ydsrgx = ydsrgx;
    }

    public String getDlrlx() {
        return dlrlx;
    }

    public void setDlrlx(String dlrlx) {
        this.dlrlx = dlrlx;
    }

    public String getSfflyz() {
        return sfflyz;
    }

    public void setSfflyz(String sfflyz) {
        this.sfflyz = sfflyz;
    }
}
