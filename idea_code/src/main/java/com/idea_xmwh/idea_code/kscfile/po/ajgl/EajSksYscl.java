package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description: 上诉材料
 * Project Name:spxt
 * File Name:EajSksYsclMapper
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/16 11:44   zhangz         1.0       1.0 Version
 **/
@TableName("EAJ_SKS_YSCL")
public class EajSksYscl {

    private String ahdm;
    private Integer ysxh;
    private Integer xh;
    private String fydm;
    private String mc;
    private String yjfyj;
    private Short sl;
    private String dw;
    private String beiz;
    private String rowuuid;
    private Date lastupdate;
    private String sfkz;
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

    public Integer getYsxh() {
        return ysxh;
    }

    public void setYsxh(Integer ysxh) {
        this.ysxh = ysxh;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getYjfyj() {
        return yjfyj;
    }

    public void setYjfyj(String yjfyj) {
        this.yjfyj = yjfyj;
    }

    public Short getSl() {
        return sl;
    }

    public void setSl(Short sl) {
        this.sl = sl;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
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

    public String getSfkz() {
        return sfkz;
    }

    public void setSfkz(String sfkz) {
        this.sfkz = sfkz;
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
