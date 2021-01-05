package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EajPcPcqk
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/28 11:17   xuhb         1.0       1.0 Version
 **/
@TableName("EAJ_PC_PCQK")
public class EajPcPcqk {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("QQPCLX")
    private String qqpclx;
    @TableField("QQPCDX")
    private String qqpcdx;
    @TableField("SQPCFS")
    private String sqpcfs;
    @TableField("SPAJAH")
    private String spajah;
    @TableField("PCJWJG")
    private String pcjwjg;
    @TableField("QTPCYWJG")
    private String qtpcywjg;
    @TableField("SQPCSY")
    private String sqpcsy;
    @TableField("FYJG")
    private String fyjg;
    @TableField("YPCSQRQ")
    private String ypcsqrq;
    @TableField("YPCYWJG")
    private String ypcywjg;
    @TableField("PCYWJGYJD")
    private String pcywjgyjd;
    @TableField("PCYWJGYJDRQ")
    private String pcywjgyjdrq;
    @TableField("YFYJD")
    private String yfyjd;
    @TableField("YFYJDRQ")
    private String yfyjdrq;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("YPCFS")
    private String ypcfs;
    @TableField("YPCJE")
    private String ypcje;

    /**
     * 删除字段
     */
    @TableField("IS_DELETED")
    private Integer isDeleted;
    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String createBy;
    /**
     * 最新修改人
     */
    @TableField("UPDATE_BY")
    private String updateBy;
    /**
     * 创建日期
     */
    @TableField("GMT_CREAT")
    private Date gmtCreat;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getQqpclx() {
        return qqpclx;
    }

    public void setQqpclx(String qqpclx) {
        this.qqpclx = qqpclx;
    }

    public String getQqpcdx() {
        return qqpcdx;
    }

    public void setQqpcdx(String qqpcdx) {
        this.qqpcdx = qqpcdx;
    }

    public String getSqpcfs() {
        return sqpcfs;
    }

    public void setSqpcfs(String sqpcfs) {
        this.sqpcfs = sqpcfs;
    }

    public String getSpajah() {
        return spajah;
    }

    public void setSpajah(String spajah) {
        this.spajah = spajah;
    }

    public String getPcjwjg() {
        return pcjwjg;
    }

    public void setPcjwjg(String pcjwjg) {
        this.pcjwjg = pcjwjg;
    }

    public String getQtpcywjg() {
        return qtpcywjg;
    }

    public void setQtpcywjg(String qtpcywjg) {
        this.qtpcywjg = qtpcywjg;
    }

    public String getSqpcsy() {
        return sqpcsy;
    }

    public void setSqpcsy(String sqpcsy) {
        this.sqpcsy = sqpcsy;
    }

    public String getFyjg() {
        return fyjg;
    }

    public void setFyjg(String fyjg) {
        this.fyjg = fyjg;
    }

    public String getYpcsqrq() {
        return ypcsqrq;
    }

    public void setYpcsqrq(String ypcsqrq) {
        this.ypcsqrq = ypcsqrq;
    }

    public String getYpcywjg() {
        return ypcywjg;
    }

    public void setYpcywjg(String ypcywjg) {
        this.ypcywjg = ypcywjg;
    }

    public String getPcywjgyjd() {
        return pcywjgyjd;
    }

    public void setPcywjgyjd(String pcywjgyjd) {
        this.pcywjgyjd = pcywjgyjd;
    }

    public String getPcywjgyjdrq() {
        return pcywjgyjdrq;
    }

    public void setPcywjgyjdrq(String pcywjgyjdrq) {
        this.pcywjgyjdrq = pcywjgyjdrq;
    }

    public String getYfyjd() {
        return yfyjd;
    }

    public void setYfyjd(String yfyjd) {
        this.yfyjd = yfyjd;
    }

    public String getYfyjdrq() {
        return yfyjdrq;
    }

    public void setYfyjdrq(String yfyjdrq) {
        this.yfyjdrq = yfyjdrq;
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

    public String getYpcfs() {
        return ypcfs;
    }

    public void setYpcfs(String ypcfs) {
        this.ypcfs = ypcfs;
    }

    public String getYpcje() {
        return ypcje;
    }

    public void setYpcje(String ypcje) {
        this.ypcje = ypcje;
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
