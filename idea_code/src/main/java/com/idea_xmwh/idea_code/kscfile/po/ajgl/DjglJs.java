package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * Description:DJGL_JS(调卷管理-接收)
 * Project Name:spxt
 * File Name:DjglJs
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/14 9:50  zhongcg         1.0       1.0 Version
 **/
@TableName("DJGL_JS")
public class DjglJs implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    @TableId(value = "LSH",type = IdType.INPUT)
    private String lsh;
    //接收单位
    @TableId(value = "JSDW",type = IdType.INPUT)
    private String jsdw;
    //状态
    @TableField("ZT")
    private String zt;
    @TableField("SDDJRQ")
    private String sddjrq;
    @TableField("JQJZRQ")
    private String jqjzrq;
    @TableField("JQJZCS")
    private Integer jqjzcs;
    @TableField("WFASDJYY")
    private String wfasdjyy;
    @TableField("JQJZR")
    private String jqjzr;
    @TableField("JSBM")
    private String jsbm;
    @TableField("JSRDH")
    private String jsrdh;
    @TableField("JSR")
    private String jsr;
    @TableField("BSBM")
    private String bsbm;
    @TableField("BSR")
    private String bsr;
    @TableField("DZJBSSJ")
    private String dzjbssj;
    @TableField("ZZJBSSJ")
    private String zzjbssj;
    @TableField("BSRDH")
    private String bsrdh;
    @TableField("FWLSH")
    private String fwlsh;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getSddjrq() {
        return sddjrq;
    }

    public void setSddjrq(String sddjrq) {
        this.sddjrq = sddjrq;
    }

    public String getJqjzrq() {
        return jqjzrq;
    }

    public void setJqjzrq(String jqjzrq) {
        this.jqjzrq = jqjzrq;
    }

    public Integer getJqjzcs() {
        return jqjzcs;
    }

    public void setJqjzcs(Integer jqjzcs) {
        this.jqjzcs = jqjzcs;
    }

    public String getWfasdjyy() {
        return wfasdjyy;
    }

    public void setWfasdjyy(String wfasdjyy) {
        this.wfasdjyy = wfasdjyy;
    }

    public String getJqjzr() {
        return jqjzr;
    }

    public void setJqjzr(String jqjzr) {
        this.jqjzr = jqjzr;
    }

    public String getJsbm() {
        return jsbm;
    }

    public void setJsbm(String jsbm) {
        this.jsbm = jsbm;
    }

    public String getJsrdh() {
        return jsrdh;
    }

    public void setJsrdh(String jsrdh) {
        this.jsrdh = jsrdh;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getBsbm() {
        return bsbm;
    }

    public void setBsbm(String bsbm) {
        this.bsbm = bsbm;
    }

    public String getBsr() {
        return bsr;
    }

    public void setBsr(String bsr) {
        this.bsr = bsr;
    }

    public String getDzjbssj() {
        return dzjbssj;
    }

    public void setDzjbssj(String dzjbssj) {
        this.dzjbssj = dzjbssj;
    }

    public String getZzjbssj() {
        return zzjbssj;
    }

    public void setZzjbssj(String zzjbssj) {
        this.zzjbssj = zzjbssj;
    }

    public String getBsrdh() {
        return bsrdh;
    }

    public void setBsrdh(String bsrdh) {
        this.bsrdh = bsrdh;
    }

    public String getFwlsh() {
        return fwlsh;
    }

    public void setFwlsh(String fwlsh) {
        this.fwlsh = fwlsh;
    }
}
