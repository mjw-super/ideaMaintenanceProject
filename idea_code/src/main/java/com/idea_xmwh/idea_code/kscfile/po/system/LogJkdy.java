package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:LOG_JKDY表映射
 * Project Name:spxt
 * File Name:LogJkdyMapper
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/10 16:35   hebq         1.0       1.0 Version
 **/
@TableName("LOG_JKDY")
public class LogJkdy {
    private static final long serialVersionUID = -8972451502941014317L;

    @TableId(value = "ROWUUID", type = IdType.INPUT)
    private String rowuuid;

    @TableField("JKBS")
    private String jkbs;

    @TableField("JKBH")
    private String jkbh;

    @TableField("JKMC")
    private String jkmc;

    @TableField("FFMC")
    private String ffmc;

    @TableField("TOKEN")
    private String token;

    @TableField("FYDM")
    private String fydm;

    @TableField("AJBS")
    private String ajbs;

    @TableField("DYSJ")
    private Date dysj;

    @TableField("JKIP")
    private String jkip;

    @TableField("SFCG")
    private Integer sfcg;

    @TableField("JKSBYY")
    private String jksbyy;

    @TableField("YHDM")
    private String yhdm;

    @TableField("JKCS")
    private String jkcs;

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getJkbs() {
        return jkbs;
    }

    public void setJkbs(String jkbs) {
        this.jkbs = jkbs;
    }

    public String getJkbh() {
        return jkbh;
    }

    public void setJkbh(String jkbh) {
        this.jkbh = jkbh;
    }

    public String getJkmc() {
        return jkmc;
    }

    public void setJkmc(String jkmc) {
        this.jkmc = jkmc;
    }

    public String getFfmc() {
        return ffmc;
    }

    public void setFfmc(String ffmc) {
        this.ffmc = ffmc;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getAjbs() {
        return ajbs;
    }

    public void setAjbs(String ajbs) {
        this.ajbs = ajbs;
    }

    public Date getDysj() {
        return dysj;
    }

    public void setDysj(Date dysj) {
        this.dysj = dysj;
    }

    public String getJkip() {
        return jkip;
    }

    public void setJkip(String jkip) {
        this.jkip = jkip;
    }

    public Integer getSfcg() {
        return sfcg;
    }

    public void setSfcg(Integer sfcg) {
        this.sfcg = sfcg;
    }

    public String getJksbyy() {
        return jksbyy;
    }

    public void setJksbyy(String jksbyy) {
        this.jksbyy = jksbyy;
    }

    public String getYhdm() {
        return yhdm;
    }

    public void setYhdm(String yhdm) {
        this.yhdm = yhdm;
    }

    public String getJkcs() {
        return jkcs;
    }

    public void setJkcs(String jkcs) {
        this.jkcs = jkcs;
    }
}
