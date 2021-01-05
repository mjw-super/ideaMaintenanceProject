package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:非标准案件(EAJ_FBZ)
 * Project Name:spxt
 * File Name:EajFbz
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/08 15:40   zhongcg         1.0       1.0 Version
 **/
@TableName("EAJ_FBZ")
public class EajFbz {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("BSDR")
    private String bsdr;
    @TableField("BSFY")
    private String bsfy;
    @TableField("WTFY")
    private String wtfy;
    @TableField("STFY")
    private String stfy;
    @TableField("WTSX")
    private String wtsx;
    @TableField("LHZH")
    private String lhzh;
    @TableField("TZRR")
    private String tzrr;
    @TableField("DJZH")
    private String djzh;
    @TableField("DJBM")
    private String djbm;
    @TableField("BJZS")
    private String bjzs;
    @TableField("WSMC")
    private String wsmc;
    @TableField("BSDRGJ")
    private String bsdrgj;
    @TableField("SFYJ")
    private String sfyj;
    @TableField("SFBJ")
    private String sfbj;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    /**
     * 删除字段
     */
    @TableField("IS_DELETED")
    private Integer  isDeleted;
    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String  createBy;
    /**
     * 最新修改人
     */
    @TableField("UPDATE_BY")
    private String  updateBy;
    /**
     * 创建日期
     */
    @TableField("GMT_CREAT")
    private Date  gmtCreat;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getBsdr() {
        return bsdr;
    }

    public void setBsdr(String bsdr) {
        this.bsdr = bsdr;
    }

    public String getBsfy() {
        return bsfy;
    }

    public void setBsfy(String bsfy) {
        this.bsfy = bsfy;
    }

    public String getWtfy() {
        return wtfy;
    }

    public void setWtfy(String wtfy) {
        this.wtfy = wtfy;
    }

    public String getStfy() {
        return stfy;
    }

    public void setStfy(String stfy) {
        this.stfy = stfy;
    }

    public String getWtsx() {
        return wtsx;
    }

    public void setWtsx(String wtsx) {
        this.wtsx = wtsx;
    }

    public String getLhzh() {
        return lhzh;
    }

    public void setLhzh(String lhzh) {
        this.lhzh = lhzh;
    }

    public String getTzrr() {
        return tzrr;
    }

    public void setTzrr(String tzrr) {
        this.tzrr = tzrr;
    }

    public String getDjzh() {
        return djzh;
    }

    public void setDjzh(String djzh) {
        this.djzh = djzh;
    }

    public String getDjbm() {
        return djbm;
    }

    public void setDjbm(String djbm) {
        this.djbm = djbm;
    }

    public String getBjzs() {
        return bjzs;
    }

    public void setBjzs(String bjzs) {
        this.bjzs = bjzs;
    }

    public String getWsmc() {
        return wsmc;
    }

    public void setWsmc(String wsmc) {
        this.wsmc = wsmc;
    }

    public String getBsdrgj() {
        return bsdrgj;
    }

    public void setBsdrgj(String bsdrgj) {
        this.bsdrgj = bsdrgj;
    }

    public String getSfyj() {
        return sfyj;
    }

    public void setSfyj(String sfyj) {
        this.sfyj = sfyj;
    }

    public String getSfbj() {
        return sfbj;
    }

    public void setSfbj(String sfbj) {
        this.sfbj = sfbj;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
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
