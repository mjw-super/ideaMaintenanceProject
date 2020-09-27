package com.idea_xmwh.idea_code.kscfile.po.dajg;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:DAJG_SSQSCL表映射
 * Project Name:spxt
 * File Name:DajgSsqscl
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/10 18:20   hebq         1.0       1.0 Version
 **/
@TableName("DAJG_SSQSCL")
public class DajgSsqscl {

    @TableField("LSH")
    private String lsh;

    @TableField("XH")
    private Integer xh;

    @TableField("AH")
    private String ah;

    @TableField("CBRR")
    private String cbrr;

    @TableField("DSR")
    private String dsr;

    @TableField("AJXZ")
    private String ajxz;

    @TableField("JARQ")
    private String jarq;

    @TableField("CLBT")
    private String clbt;

    @TableField("BQRQ")
    private String bqrq;

    @TableField("JZRQ")
    private String jzrq;

    @TableField("SFBQ")
    private String sfbq;

    @TableField("JSRR")
    private String jsrr;

    @TableField("QSYM")
    private Integer qsym;

    @TableField("JSYM")
    private Integer jsym;

    public DajgSsqscl() {
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

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getCbrr() {
        return cbrr;
    }

    public void setCbrr(String cbrr) {
        this.cbrr = cbrr;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public String getAjxz() {
        return ajxz;
    }

    public void setAjxz(String ajxz) {
        this.ajxz = ajxz;
    }

    public String getJarq() {
        return jarq;
    }

    public void setJarq(String jarq) {
        this.jarq = jarq;
    }

    public String getClbt() {
        return clbt;
    }

    public void setClbt(String clbt) {
        this.clbt = clbt;
    }

    public String getBqrq() {
        return bqrq;
    }

    public void setBqrq(String bqrq) {
        this.bqrq = bqrq;
    }

    public String getJzrq() {
        return jzrq;
    }

    public void setJzrq(String jzrq) {
        this.jzrq = jzrq;
    }

    public String getSfbq() {
        return sfbq;
    }

    public void setSfbq(String sfbq) {
        this.sfbq = sfbq;
    }

    public String getJsrr() {
        return jsrr;
    }

    public void setJsrr(String jsrr) {
        this.jsrr = jsrr;
    }

    public Integer getQsym() {
        return qsym;
    }

    public void setQsym(Integer qsym) {
        this.qsym = qsym;
    }

    public Integer getJsym() {
        return jsym;
    }

    public void setJsym(Integer jsym) {
        this.jsym = jsym;
    }
}
