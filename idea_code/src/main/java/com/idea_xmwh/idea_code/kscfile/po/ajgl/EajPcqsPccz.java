package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * Description:破产重整信息表(EAJ_PCQS_PCCZ)
 * Project Name:spxt
 * File Name:EajPcqsPccz
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/25 15:40   zhongcg         1.0       1.0 Version
 **/
public class EajPcqsPccz {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("CZJHCATCRQ")
    private String czjhcatcrq;
    @TableField("SQPZCZJHRQ")
    private String sqpzczjhrq;
    @TableField("CZJHCATJR")
    private String czjhcatjr;
    @TableField("CZJHCA")
    private String czjhca;
    @TableField("ZTBJYJ")
    private String ztbjyj;
    @TableField("SCYJ")
    private String scyj;
    @TableField("SCRQ")
    private String scrq;
    @TableField(value = "ROWUUID")
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

    public String getCzjhcatcrq() {
        return czjhcatcrq;
    }

    public void setCzjhcatcrq(String czjhcatcrq) {
        this.czjhcatcrq = czjhcatcrq;
    }

    public String getSqpzczjhrq() {
        return sqpzczjhrq;
    }

    public void setSqpzczjhrq(String sqpzczjhrq) {
        this.sqpzczjhrq = sqpzczjhrq;
    }

    public String getCzjhcatjr() {
        return czjhcatjr;
    }

    public void setCzjhcatjr(String czjhcatjr) {
        this.czjhcatjr = czjhcatjr;
    }

    public String getCzjhca() {
        return czjhca;
    }

    public void setCzjhca(String czjhca) {
        this.czjhca = czjhca;
    }

    public String getZtbjyj() {
        return ztbjyj;
    }

    public void setZtbjyj(String ztbjyj) {
        this.ztbjyj = ztbjyj;
    }

    public String getScyj() {
        return scyj;
    }

    public void setScyj(String scyj) {
        this.scyj = scyj;
    }

    public String getScrq() {
        return scrq;
    }

    public void setScrq(String scrq) {
        this.scrq = scrq;
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
