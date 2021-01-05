package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * Description:破产和解信息表(EAJ_PCQS_PCHJ)
 * Project Name:spxt
 * File Name:EajPcqsPchj
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/25 11:12   zhongcg         1.0       1.0 Version
 **/
public class EajPcqsPchj {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("HJXYBJRQ")
    private String hjxybjrq;
    @TableField("HJXYBJJG")
    private String hjxybjjg;
    @TableField("TQFYSCRQ")
    private String tqfyscrq;
    @TableField("SCYJ")
    private String scyj;
    @TableField("SDRQ")
    private String sdrq;
    @TableField("HJXY")
    private String hjxy;
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

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getHjxybjrq() {
        return hjxybjrq;
    }

    public void setHjxybjrq(String hjxybjrq) {
        this.hjxybjrq = hjxybjrq;
    }

    public String getHjxybjjg() {
        return hjxybjjg;
    }

    public void setHjxybjjg(String hjxybjjg) {
        this.hjxybjjg = hjxybjjg;
    }

    public String getTqfyscrq() {
        return tqfyscrq;
    }

    public void setTqfyscrq(String tqfyscrq) {
        this.tqfyscrq = tqfyscrq;
    }

    public String getScyj() {
        return scyj;
    }

    public void setScyj(String scyj) {
        this.scyj = scyj;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getHjxy() {
        return hjxy;
    }

    public void setHjxy(String hjxy) {
        this.hjxy = hjxy;
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
