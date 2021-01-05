package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:
 * Project Name:spxt
 * File Name:TBarzsz
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/21 14:59   xiongsc         1.0       1.0 Version
 **/
@TableName("T_BARZSZ")
public class TBarzsz {

    @TableField("GNDM")
    private String gndm;
    @TableField("GNMC")
    private String gnmc;
    @TableField("GNSM")
    private String gnsm;
    @TableField("XZMC")
    private String xzmc;
    @TableField("XZPXH")
    private Integer xzpxh;
    @TableField("GNPXH")
    private Integer gnpxh;
    @TableField("JZBCRZ")
    private String jzbcrz;
    @TableField("XTRZFG")
    private String xtrzfg;
    @TableField("JZSCRZ")
    private String jzscrz;
    @TableField("BCRZYS")
    private String bcrzys;
    @TableField("SCRZYS")
    private String scrzys;
    @TableField("STBHC")
    private String stbhc;
    @TableField("TAB")
    private String tab;

    public String getGndm() {
        return gndm;
    }

    public void setGndm(String gndm) {
        this.gndm = gndm;
    }

    public String getGnmc() {
        return gnmc;
    }

    public void setGnmc(String gnmc) {
        this.gnmc = gnmc;
    }

    public String getGnsm() {
        return gnsm;
    }

    public void setGnsm(String gnsm) {
        this.gnsm = gnsm;
    }

    public String getXzmc() {
        return xzmc;
    }

    public void setXzmc(String xzmc) {
        this.xzmc = xzmc;
    }

    public Integer getXzpxh() {
        return xzpxh;
    }

    public void setXzpxh(Integer xzpxh) {
        this.xzpxh = xzpxh;
    }

    public Integer getGnpxh() {
        return gnpxh;
    }

    public void setGnpxh(Integer gnpxh) {
        this.gnpxh = gnpxh;
    }

    public String getJzbcrz() {
        return jzbcrz;
    }

    public void setJzbcrz(String jzbcrz) {
        this.jzbcrz = jzbcrz;
    }

    public String getXtrzfg() {
        return xtrzfg;
    }

    public void setXtrzfg(String xtrzfg) {
        this.xtrzfg = xtrzfg;
    }

    public String getJzscrz() {
        return jzscrz;
    }

    public void setJzscrz(String jzscrz) {
        this.jzscrz = jzscrz;
    }

    public String getBcrzys() {
        return bcrzys;
    }

    public void setBcrzys(String bcrzys) {
        this.bcrzys = bcrzys;
    }

    public String getScrzys() {
        return scrzys;
    }

    public void setScrzys(String scrzys) {
        this.scrzys = scrzys;
    }

    public String getStbhc() {
        return stbhc;
    }

    public void setStbhc(String stbhc) {
        this.stbhc = stbhc;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }
}
