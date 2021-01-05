package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EajTzzwr
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/19 16:13   zhongcg         1.0       1.0 Version
 **/
@TableName("EAJ_TZZWR")
public class EajTzzwr {
    private static final long serialVersionUID = 1L;

    /**
     * 案件标识
     */
    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField(value = "FYDM")
    private String fydm;
    @TableId(value = "XH", type = IdType.INPUT)
    private String xh;
    @TableField("ZWR")
    private String zwr;
    @TableField("TZZWRRQ")
    private String tzzwrrq;
    @TableField("ZWRYYRQ")
    private String zwryyrq;
    @TableField("DJR")
    private String djr;
    @TableField("DJRQ")
    private String djrq;
    @TableField("ROWUUID")
    private String rowuuid;
    @TableField("LASTUPDATE")
    private Date lastupdate;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getZwr() {
        return zwr;
    }

    public void setZwr(String zwr) {
        this.zwr = zwr;
    }

    public String getTzzwrrq() {
        return tzzwrrq;
    }

    public void setTzzwrrq(String tzzwrrq) {
        this.tzzwrrq = tzzwrrq;
    }

    public String getZwryyrq() {
        return zwryyrq;
    }

    public void setZwryyrq(String zwryyrq) {
        this.zwryyrq = zwryyrq;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
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
