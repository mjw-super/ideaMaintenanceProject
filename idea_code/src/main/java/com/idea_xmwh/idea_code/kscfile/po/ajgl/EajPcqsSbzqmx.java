package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:破产申请债权明细表
 * Project Name:spxt
 * File Name:EajPcqsCxzh
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/21 11:35   zhongcg         1.0       1.0 Version
 **/
@TableName("EAJ_PCQS_SBZQMX")
public class EajPcqsSbzqmx {
    private static final long serialVersionUID = 1L;

    @TableField(value = "AHDM")
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("XH")
    private Integer xh;
    @TableField("ZQBH")
    private String zqbh;
    @TableField("SBZQR")
    private String sbzqr;
    @TableField("SBZQSE")
    private Double sbzqse;
    @TableField("SBRQ")
    private String sbrq;
    @TableField("ZQRHYHCYJ")
    private String zqrhyhcyj;
    @TableId(value = "ROWUUID",type = IdType.INPUT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getSbzqr() {
        return sbzqr;
    }

    public void setSbzqr(String sbzqr) {
        this.sbzqr = sbzqr;
    }

    public Double getSbzqse() {
        return sbzqse;
    }

    public void setSbzqse(Double sbzqse) {
        this.sbzqse = sbzqse;
    }

    public String getSbrq() {
        return sbrq;
    }

    public void setSbrq(String sbrq) {
        this.sbrq = sbrq;
    }

    public String getZqrhyhcyj() {
        return zqrhyhcyj;
    }

    public void setZqrhyhcyj(String zqrhyhcyj) {
        this.zqrhyhcyj = zqrhyhcyj;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
