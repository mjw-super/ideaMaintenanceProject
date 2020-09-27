package com.idea_xmwh.idea_code.kscfile.po.dajg;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:DAJG_SSDSRXX表映射
 * Project Name:spxt
 * File Name:DajgSsdsrxx
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/10 17:47   hebq         1.0       1.0 Version
 **/
@TableName("DAJG_SSDSRXX")
public class DajgSsdsrxx {

    @TableField("LSH")
    private String lsh;

    @TableField("XH")
    private Integer xh;

    @TableField("SSDW")
    private String ssdw;

    @TableField("XM")
    private String xm;

    @TableField("XB")
    private String xb;

    @TableField("DWXZ")
    private String dwxz;

    @TableField("NL")
    private Short nl;

    @TableField("GJ")
    private String gj;

    @TableField("JG")
    private String jg;

    @TableField("FDDBR")
    private String fddbr;

    @TableField("ZY")
    private String zy;

    @TableField("WHCD")
    private String whcd;

    @TableField("CSRQ")
    private String csrq;

    @TableField("ZJZL")
    private String zjzl;

    @TableField("ZJHM")
    private String zjhm;

    @TableField("LXDH")
    private String lxdh;

    @TableField("DZ")
    private String dz;

    @TableField("YSJG")
    private String ysjg;

    @TableField("ESJG")
    private String esjg;

    @TableField("ZSJG")
    private String zsjg;

    public DajgSsdsrxx() {
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getSsdw() {
        return ssdw;
    }

    public void setSsdw(String ssdw) {
        this.ssdw = ssdw;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getDwxz() {
        return dwxz;
    }

    public void setDwxz(String dwxz) {
        this.dwxz = dwxz;
    }

    public Short getNl() {
        return nl;
    }

    public void setNl(Short nl) {
        this.nl = nl;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getFddbr() {
        return fddbr;
    }

    public void setFddbr(String fddbr) {
        this.fddbr = fddbr;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getZjzl() {
        return zjzl;
    }

    public void setZjzl(String zjzl) {
        this.zjzl = zjzl;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getYsjg() {
        return ysjg;
    }

    public void setYsjg(String ysjg) {
        this.ysjg = ysjg;
    }

    public String getEsjg() {
        return esjg;
    }

    public void setEsjg(String esjg) {
        this.esjg = esjg;
    }

    public String getZsjg() {
        return zsjg;
    }

    public void setZsjg(String zsjg) {
        this.zsjg = zsjg;
    }
}
