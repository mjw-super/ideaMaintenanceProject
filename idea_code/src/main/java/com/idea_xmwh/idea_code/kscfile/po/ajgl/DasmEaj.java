package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:DASM_EAJ表映射
 * Project Name:spxt
 * File Name:DasmEaj
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/5 17:18   hebq         1.0       1.0 Version
 **/
@TableName("DASM_EAJ")
public class DasmEaj {

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableField("FYDM")
    private String fydm;

    @TableField("SFSM")
    private String sfsm;

    @TableField("SFTH")
    private String sfth;

    @TableField("THRQ")
    private String thrq;

    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    @TableField("ZT")
    private String zt;

    @TableField("JSZZJZ")
    private String jszzjz;

    @TableField("JSZZJZLX")
    private String jszzjzlx;

    @TableField("QSJZCL")
    private String qsjzcl;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtcreat;

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

    public String getSfsm() {
        return sfsm;
    }

    public void setSfsm(String sfsm) {
        this.sfsm = sfsm;
    }

    public String getSfth() {
        return sfth;
    }

    public void setSfth(String sfth) {
        this.sfth = sfth;
    }

    public String getThrq() {
        return thrq;
    }

    public void setThrq(String thrq) {
        this.thrq = thrq;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getJszzjz() {
        return jszzjz;
    }

    public void setJszzjz(String jszzjz) {
        this.jszzjz = jszzjz;
    }

    public String getJszzjzlx() {
        return jszzjzlx;
    }

    public void setJszzjzlx(String jszzjzlx) {
        this.jszzjzlx = jszzjzlx;
    }

    public String getQsjzcl() {
        return qsjzcl;
    }

    public void setQsjzcl(String qsjzcl) {
        this.qsjzcl = qsjzcl;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getGmtcreat() {
        return gmtcreat;
    }

    public void setGmtcreat(Date gmtcreat) {
        this.gmtcreat = gmtcreat;
    }
}
