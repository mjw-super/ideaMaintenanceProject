package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * Description:破产申报债权表
 * Project Name:spxt
 * File Name:EajPcqsSbzq
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/21 16:33   zhongcg         1.0       1.0 Version
 **/
public class EajPcqsSbzq {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("ZQRSBQSRQ")
    private String zqrsbqsrq;
    @TableField("ZQRSBJMRQ")
    private String zqrsbjmrq;
    @TableField("SCZQRHYRQ")
    private String sczqrhyrq;
    @TableField("SBZQZE")
    private Double sbzqze;
    @TableField("GYZW")
    private Double gyzw;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
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

    public String getZqrsbqsrq() {
        return zqrsbqsrq;
    }

    public void setZqrsbqsrq(String zqrsbqsrq) {
        this.zqrsbqsrq = zqrsbqsrq;
    }

    public String getZqrsbjmrq() {
        return zqrsbjmrq;
    }

    public void setZqrsbjmrq(String zqrsbjmrq) {
        this.zqrsbjmrq = zqrsbjmrq;
    }

    public String getSczqrhyrq() {
        return sczqrhyrq;
    }

    public void setSczqrhyrq(String sczqrhyrq) {
        this.sczqrhyrq = sczqrhyrq;
    }

    public Double getSbzqze() {
        return sbzqze;
    }

    public void setSbzqze(Double sbzqze) {
        this.sbzqze = sbzqze;
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

    public Double getGyzw() {
        return gyzw;
    }

    public void setGyzw(Double gyzw) {
        this.gyzw = gyzw;
    }
}
