package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EdsrRzrf
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/22 17:05   xiongsc         1.0       1.0 Version
 **/
@TableName("EDSR_RZRF")
public class EdsrRzrf {

    @TableField("AHDM")
    private String ahdm;
    @TableField("DSRXH")
    private String dsrxh;
    @TableField("FYDM")
    private String fydm;
    @TableField("SFRZRF")
    private String sfrzrf;
    @TableField("LXJYCNQK")
    private String lxjycnqk;
    @TableField("JCYSFTZLXJY")
    private String jcysftzlxjy;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("ROWUUID")
    private String rowuuid;
    @TableField("IS_DELETED")
    private String isDeleted;
    @TableField("CREATE_BY")
    private String createBy;
    @TableField("UPDATE_BY")
    private String updateBy;
    @TableField("GMT_CREAT")
    private Date gmtCreat;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getSfrzrf() {
        return sfrzrf;
    }

    public void setSfrzrf(String sfrzrf) {
        this.sfrzrf = sfrzrf;
    }

    public String getLxjycnqk() {
        return lxjycnqk;
    }

    public void setLxjycnqk(String lxjycnqk) {
        this.lxjycnqk = lxjycnqk;
    }

    public String getJcysftzlxjy() {
        return jcysftzlxjy;
    }

    public void setJcysftzlxjy(String jcysftzlxjy) {
        this.jcysftzlxjy = jcysftzlxjy;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
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

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }
}
