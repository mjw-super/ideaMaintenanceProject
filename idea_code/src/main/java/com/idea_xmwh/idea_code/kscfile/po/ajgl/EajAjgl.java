package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:个案标签-辅助功能-期限变更
 * Project Name:spxt
 * File Name:EajAjgl
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/21 17:03   zhouhua         1.0       1.0 Version
 **/
@TableName("EAJ_AJGL")
public class EajAjgl  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("AH")
    private String ah;
    @TableField("SAAY")
    private Integer saay;
    @TableField("DSR")
    private String dsr;
    @TableField("CBBM")
    private String cbbm;
    @TableField("CBR")
    private String cbr;
    @TableField("GLAHDM")
    private String glahdm;
    @TableField("GLAH")
    private String glah;
    @TableField("GLSAAY")
    private Integer glsaay;
    @TableField("GLDSR")
    private String gldsr;
    @TableField("GLLARQ")
    private String gllarq;
    @TableField("GLCBBM")
    private String glcbbm;
    @TableField("GLCBBMMC")
    private String glcbbmmc;
    @TableField("GLCBR")
    private String glcbr;
    @TableField("GLCBRMC")
    private String glcbrmc;
    @TableField("TSSJ")
    private String tssj;
    @TableField("GLZT")
    private String glzt;
    @TableField("FYDM")
    private String fydm;
    @TableField("GLSJ")
    private String glsj;
    @TableField("GLBDJE")
    private Double glbdje;
    @TableField("GLJARQ")
    private String gljarq;
    @TableField("GLJAFS")
    private String gljafs;
    @TableField("GLJASY")
    private String gljasy;
    @TableField("GLAJLY")
    private String glajly;
    @TableField("GLAJZT")
    private String glajzt;
    @TableField("GLFYDM")
    private String glfydm;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;

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

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public Integer getSaay() {
        return saay;
    }

    public void setSaay(Integer saay) {
        this.saay = saay;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public String getCbbm() {
        return cbbm;
    }

    public void setCbbm(String cbbm) {
        this.cbbm = cbbm;
    }

    public String getCbr() {
        return cbr;
    }

    public void setCbr(String cbr) {
        this.cbr = cbr;
    }

    public String getGlahdm() {
        return glahdm;
    }

    public void setGlahdm(String glahdm) {
        this.glahdm = glahdm;
    }

    public String getGlah() {
        return glah;
    }

    public void setGlah(String glah) {
        this.glah = glah;
    }

    public Integer getGlsaay() {
        return glsaay;
    }

    public void setGlsaay(Integer glsaay) {
        this.glsaay = glsaay;
    }

    public String getGldsr() {
        return gldsr;
    }

    public void setGldsr(String gldsr) {
        this.gldsr = gldsr;
    }

    public String getGllarq() {
        return gllarq;
    }

    public void setGllarq(String gllarq) {
        this.gllarq = gllarq;
    }

    public String getGlcbbm() {
        return glcbbm;
    }

    public void setGlcbbm(String glcbbm) {
        this.glcbbm = glcbbm;
    }

    public String getGlcbbmmc() {
        return glcbbmmc;
    }

    public void setGlcbbmmc(String glcbbmmc) {
        this.glcbbmmc = glcbbmmc;
    }

    public String getGlcbr() {
        return glcbr;
    }

    public void setGlcbr(String glcbr) {
        this.glcbr = glcbr;
    }

    public String getGlcbrmc() {
        return glcbrmc;
    }

    public void setGlcbrmc(String glcbrmc) {
        this.glcbrmc = glcbrmc;
    }

    public String getTssj() {
        return tssj;
    }

    public void setTssj(String tssj) {
        this.tssj = tssj;
    }

    public String getGlzt() {
        return glzt;
    }

    public void setGlzt(String glzt) {
        this.glzt = glzt;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getGlsj() {
        return glsj;
    }

    public void setGlsj(String glsj) {
        this.glsj = glsj;
    }

    public Double getGlbdje() {
        return glbdje;
    }

    public void setGlbdje(Double glbdje) {
        this.glbdje = glbdje;
    }

    public String getGljarq() {
        return gljarq;
    }

    public void setGljarq(String gljarq) {
        this.gljarq = gljarq;
    }

    public String getGljafs() {
        return gljafs;
    }

    public void setGljafs(String gljafs) {
        this.gljafs = gljafs;
    }

    public String getGljasy() {
        return gljasy;
    }

    public void setGljasy(String gljasy) {
        this.gljasy = gljasy;
    }

    public String getGlajly() {
        return glajly;
    }

    public void setGlajly(String glajly) {
        this.glajly = glajly;
    }

    public String getGlajzt() {
        return glajzt;
    }

    public void setGlajzt(String glajzt) {
        this.glajzt = glajzt;
    }

    public String getGlfydm() {
        return glfydm;
    }

    public void setGlfydm(String glfydm) {
        this.glfydm = glfydm;
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
