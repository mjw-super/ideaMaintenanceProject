package com.idea_xmwh.idea_code.kscfile.po.dajg;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:DAJG_SSFZXX表映射
 * Project Name:spxt
 * File Name:DajgSsfzxx
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/10 15:49   hebq         1.0       1.0 Version
 **/
@TableName("DAJG_SSFZXX")
public class DajgSsfzxx {

    @TableId(value = "LSH", type = IdType.INPUT)
    private String lsh;

    @TableField("GCPH")
    private String gcph;

    @TableField("AJZCS")
    private Short ajzcs;

    @TableField("ZJCS")
    private Integer zjcs;

    @TableField("FJCS")
    private Integer fjcs;

    @TableField("ZJYS")
    private Integer zjys;

    @TableField("FJYS")
    private Integer fjys;

    @TableField("YSJCS")
    private Short ysjcs;

    @TableField("JCJCS")
    private Integer jcjcs;

    @TableField("GAJCS")
    private Integer gajcs;

    @TableField("ZJJCS")
    private Integer zjjcs;

    @TableField("ZWDSL")
    private Integer zwdsl;

    @TableField("GPSL")
    private Integer gpsl;


    @TableField("QTJCS")
    private Short qtjcs;

    @TableField("YSJS")
    private Integer ysjs;

    @TableField("BJQK")
    private String bjqk;

    @TableField("JDQK")
    private String jdqk;

    @TableField("ZWQK")
    private String zwqk;

    @TableField("BEIZ")
    private String beiz;

    @TableField("YSYS")
    private Integer ysys;

    @TableField("YSJYS")
    private Integer ysjys;

    @TableField("GAJYS")
    private Integer gajys;

    @TableField("JCJYS")
    private Integer jcjys;

    @TableField("ZJJYS")
    private Integer zjjys;

    @TableField("SFTJ")
    private String sftj;

    @TableField("JDR")
    private String jdr;

    @TableField("QYR")
    private String qyr;

    @TableField("QYRQ")
    private String qyrq;

    @TableField("XHRQ")
    private String xhrq;

    public DajgSsfzxx() {
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getGcph() {
        return gcph;
    }

    public void setGcph(String gcph) {
        this.gcph = gcph;
    }

    public Short getAjzcs() {
        return ajzcs;
    }

    public void setAjzcs(Short ajzcs) {
        this.ajzcs = ajzcs;
    }

    public Integer getZjcs() {
        return zjcs;
    }

    public void setZjcs(Integer zjcs) {
        this.zjcs = zjcs;
    }

    public Integer getFjcs() {
        return fjcs;
    }

    public void setFjcs(Integer fjcs) {
        this.fjcs = fjcs;
    }

    public Integer getZjys() {
        return zjys;
    }

    public void setZjys(Integer zjys) {
        this.zjys = zjys;
    }

    public Integer getFjys() {
        return fjys;
    }

    public void setFjys(Integer fjys) {
        this.fjys = fjys;
    }

    public Short getYsjcs() {
        return ysjcs;
    }

    public void setYsjcs(Short ysjcs) {
        this.ysjcs = ysjcs;
    }

    public Integer getJcjcs() {
        return jcjcs;
    }

    public void setJcjcs(Integer jcjcs) {
        this.jcjcs = jcjcs;
    }

    public Integer getGajcs() {
        return gajcs;
    }

    public void setGajcs(Integer gajcs) {
        this.gajcs = gajcs;
    }

    public Integer getZjjcs() {
        return zjjcs;
    }

    public void setZjjcs(Integer zjjcs) {
        this.zjjcs = zjjcs;
    }

    public Integer getZwdsl() {
        return zwdsl;
    }

    public void setZwdsl(Integer zwdsl) {
        this.zwdsl = zwdsl;
    }

    public Integer getGpsl() {
        return gpsl;
    }

    public void setGpsl(Integer gpsl) {
        this.gpsl = gpsl;
    }

    public Short getQtjcs() {
        return qtjcs;
    }

    public void setQtjcs(Short qtjcs) {
        this.qtjcs = qtjcs;
    }

    public Integer getYsjs() {
        return ysjs;
    }

    public void setYsjs(Integer ysjs) {
        this.ysjs = ysjs;
    }

    public String getBjqk() {
        return bjqk;
    }

    public void setBjqk(String bjqk) {
        this.bjqk = bjqk;
    }

    public String getJdqk() {
        return jdqk;
    }

    public void setJdqk(String jdqk) {
        this.jdqk = jdqk;
    }

    public String getZwqk() {
        return zwqk;
    }

    public void setZwqk(String zwqk) {
        this.zwqk = zwqk;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public Integer getYsys() {
        return ysys;
    }

    public void setYsys(Integer ysys) {
        this.ysys = ysys;
    }

    public Integer getYsjys() {
        return ysjys;
    }

    public void setYsjys(Integer ysjys) {
        this.ysjys = ysjys;
    }

    public Integer getGajys() {
        return gajys;
    }

    public void setGajys(Integer gajys) {
        this.gajys = gajys;
    }

    public Integer getJcjys() {
        return jcjys;
    }

    public void setJcjys(Integer jcjys) {
        this.jcjys = jcjys;
    }

    public Integer getZjjys() {
        return zjjys;
    }

    public void setZjjys(Integer zjjys) {
        this.zjjys = zjjys;
    }

    public String getSftj() {
        return sftj;
    }

    public void setSftj(String sftj) {
        this.sftj = sftj;
    }

    public String getJdr() {
        return jdr;
    }

    public void setJdr(String jdr) {
        this.jdr = jdr;
    }

    public String getQyr() {
        return qyr;
    }

    public void setQyr(String qyr) {
        this.qyr = qyr;
    }

    public String getQyrq() {
        return qyrq;
    }

    public void setQyrq(String qyrq) {
        this.qyrq = qyrq;
    }

    public String getXhrq() {
        return xhrq;
    }

    public void setXhrq(String xhrq) {
        this.xhrq = xhrq;
    }
}
