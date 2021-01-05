package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:EAJ_PCQS_CXZH
 * Project Name:spxt
 * File Name:EajPcqsCxzh
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/21 11:35   zhongcg         1.0       1.0 Version
 **/
@TableName("EAJ_PCQS_CXZH")
public class EajPcqsCxzh {
    private static final long serialVersionUID = 1L;

    @TableField(value = "AHDM")
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("XH")
    private Integer xh;
    @TableField("SQR")
    private String sqr;
    @TableField("SQRLX")
    private String sqrlx;
    @TableField("SQCXZHLX")
    private String sqcxzhlx;
    @TableField("SQRQ")
    private String sqrq;
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

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getSqrlx() {
        return sqrlx;
    }

    public void setSqrlx(String sqrlx) {
        this.sqrlx = sqrlx;
    }

    public String getSqcxzhlx() {
        return sqcxzhlx;
    }

    public void setSqcxzhlx(String sqcxzhlx) {
        this.sqcxzhlx = sqcxzhlx;
    }

    public String getSqrq() {
        return sqrq;
    }

    public void setSqrq(String sqrq) {
        this.sqrq = sqrq;
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
