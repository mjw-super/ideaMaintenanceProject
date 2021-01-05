package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EajZdyws
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/20 20:19   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("EAJ_ZDYWS")
public class EajZdyws {

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableId(value = "JAWSXH")
    private String jawsxh;
    @TableId(value = "FYDM")
    private String fydm;
    @TableId(value = "ROWUUID")
    private String rowuuid;
    @TableId(value = "LASTUPDATE")
    private Date lastupdate;
    @TableId(value = "FAWSXH")
    private String fawsxh;
    @TableId(value = "YSWSXH")
    private String yswsxh;
    @TableId(value = "SPZZBGWS")
    private String spzzbgws;
    @TableId(value = "SXWSXH")
    private String sxwsxh;
    @TableId(value = "IS_DELETED")
    private Integer isDeleted;//是否删除
    @TableId(value = "CREATE_BY")
    private String createBy;
    @TableId(value = "UPDATE_BY")
    private String updateBy;
    @TableId(value = "GMT_CREAT")
    private Date gmtCreat;


    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getJawsxh() {
        return jawsxh;
    }

    public void setJawsxh(String jawsxh) {
        this.jawsxh = jawsxh;
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

    public String getFawsxh() {
        return fawsxh;
    }

    public void setFawsxh(String fawsxh) {
        this.fawsxh = fawsxh;
    }

    public String getYswsxh() {
        return yswsxh;
    }

    public void setYswsxh(String yswsxh) {
        this.yswsxh = yswsxh;
    }

    public String getSpzzbgws() {
        return spzzbgws;
    }

    public void setSpzzbgws(String spzzbgws) {
        this.spzzbgws = spzzbgws;
    }

    public String getSxwsxh() {
        return sxwsxh;
    }

    public void setSxwsxh(String sxwsxh) {
        this.sxwsxh = sxwsxh;
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

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }
}
