package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * Description:破产费用信息表(EAJ_PCQS_PCFY)
 * Project Name:spxt
 * File Name:EajPcqsPcfy
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/24 14:57   zhongcg         1.0       1.0 Version
 **/
public class EajPcqsPcfy {
    private static final long serialVersionUID = 1L;

    @TableField(value = "AHDM")
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableId(value = "ROWUUID", type = IdType.INPUT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("PCFYLX")
    private String pcfylx;
    @TableField("PCFYSE")
    private Double pcfyse;
    @TableField("PCFYCSRQ")
    private String pcfycsrq;
    @TableField("XH")
    private Integer xh;

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

    public String getPcfylx() {
        return pcfylx;
    }

    public void setPcfylx(String pcfylx) {
        this.pcfylx = pcfylx;
    }

    public Double getPcfyse() {
        return pcfyse;
    }

    public void setPcfyse(Double pcfyse) {
        this.pcfyse = pcfyse;
    }

    public String getPcfycsrq() {
        return pcfycsrq;
    }

    public void setPcfycsrq(String pcfycsrq) {
        this.pcfycsrq = pcfycsrq;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }
}
