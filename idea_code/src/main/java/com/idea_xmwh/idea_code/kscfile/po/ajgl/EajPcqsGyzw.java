package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * Description:破产共益债务表(EAJ_PCQS_GYZW)
 * Project Name:spxt
 * File Name:EajPcqsGyzw
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/24 11:07   zhongcg         1.0       1.0 Version
 **/
public class EajPcqsGyzw {
    private static final long serialVersionUID = 1L;

    @TableField(value = "AHDM")
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("XH")
    private Integer xh;
    @TableField("GYZWLX")
    private String gyzwlx;
    @TableField("ZWCSRQ")
    private String zwcsrq;
    @TableField("GYZWSE")
    private Double gyzwse;
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

    public String getGyzwlx() {
        return gyzwlx;
    }

    public void setGyzwlx(String gyzwlx) {
        this.gyzwlx = gyzwlx;
    }

    public String getZwcsrq() {
        return zwcsrq;
    }

    public void setZwcsrq(String zwcsrq) {
        this.zwcsrq = zwcsrq;
    }

    public Double getGyzwse() {
        return gyzwse;
    }

    public void setGyzwse(Double gyzwse) {
        this.gyzwse = gyzwse;
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
