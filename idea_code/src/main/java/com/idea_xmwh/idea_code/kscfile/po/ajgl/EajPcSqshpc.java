package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:申请赔偿所害
 * Project Name:spxt
 * File Name:EajPcSqshpc
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/24 16:33   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("EAJ_PC_SQSHPC")
public class EajPcSqshpc implements Serializable {

    private static final long serialVersionUID = 6778051966295606441L;
    @TableId(value = "AHDM",type = IdType.INPUT)
    private String	ahdm;
    @TableId(value = "XH",type = IdType.INPUT)
    private Integer	xh;
    @TableField("SQSHPCXM")
    private String	sqshpcxm;
    @TableField("SQPCJE")
    private Double sqpcje;
    @TableField("FYDM")
    private String	fydm;
    @TableField("ROWUUID")
    private String	rowuuid;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("IS_DELETED")
    private Integer	is_deleted;
    @TableField("CREATE_BY")
    private String	create_by;
    @TableField("UPDATE_BY")
    private String	update_by;
    @TableField("GMT_CREAT")
    private Date	gmt_creat;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getSqshpcxm() {
        return sqshpcxm;
    }

    public void setSqshpcxm(String sqshpcxm) {
        this.sqshpcxm = sqshpcxm;
    }

    public Double getSqpcje() {
        return sqpcje;
    }

    public void setSqpcje(Double sqpcje) {
        this.sqpcje = sqpcje;
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

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(Date gmt_creat) {
        this.gmt_creat = gmt_creat;
    }
}
