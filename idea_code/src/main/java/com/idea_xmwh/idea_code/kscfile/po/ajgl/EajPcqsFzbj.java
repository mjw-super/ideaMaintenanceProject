package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * Description:分组表决信息表(EAJ_PCQS_FZBJ)
 * Project Name:spxt
 * File Name:EajPcqsFzbj
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/25 16:52   zhongcg         1.0       1.0 Version
 **/
public class EajPcqsFzbj {
    private static final long serialVersionUID = 1L;

    @TableId(value = "ROWUUID", type = IdType.INPUT)
    private String rowuuid;
    @TableField("AHDM")
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("XH")
    private Integer xh;
    @TableField("FZBJZQLX")
    private String fzbjzqlx;
    @TableField("FZBJYJ")
    private String fzbjyj;
    @TableField("FZBJRQ")
    private String fzbjrq;
    @TableField("LASTUPDATE")
    private Date lastupdate;

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

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

    public String getFzbjzqlx() {
        return fzbjzqlx;
    }

    public void setFzbjzqlx(String fzbjzqlx) {
        this.fzbjzqlx = fzbjzqlx;
    }

    public String getFzbjyj() {
        return fzbjyj;
    }

    public void setFzbjyj(String fzbjyj) {
        this.fzbjyj = fzbjyj;
    }

    public String getFzbjrq() {
        return fzbjrq;
    }

    public void setFzbjrq(String fzbjrq) {
        this.fzbjrq = fzbjrq;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
