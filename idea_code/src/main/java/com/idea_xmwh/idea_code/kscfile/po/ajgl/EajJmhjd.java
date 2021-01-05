package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:EAJ_JMHJD表映射
 * Project Name:spxt
 * File Name:EajJmhjd
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/18 17:18   hebq         1.0       1.0 Version
 **/
@TableName("EAJ_JMHJD")
public class EajJmhjd {
    @TableId(value = "LSH", type = IdType.INPUT)
    private String lsh;

    @TableField("AHDM")
    private String ahdm;

    @TableField("FYDM")
    private String fydm;

    @TableField("GNDM")
    private String gndm;

    @TableField("CBBM1")
    private String cbbm1;

    @TableField("XLA")
    private Integer xla;

    @TableField("JSR")
    private String jsr;

    @TableField("FSRQ")
    private String fsrq;

    @TableField("FSSJ")
    private String fssj;

    @TableField("FSR")
    private String fsr;

    @TableField("FSNR")
    private String fsnr;

    @TableField("SFYD")
    private String sfyd;

    @TableField("SFSC")
    private String sfsc;

    @TableField("LASTUPDATE")
    private Date lastupdate;

    @TableField("ISFSDX")
    private String isfsdx;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtcreat;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
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

    public String getGndm() {
        return gndm;
    }

    public void setGndm(String gndm) {
        this.gndm = gndm;
    }

    public String getCbbm1() {
        return cbbm1;
    }

    public void setCbbm1(String cbbm1) {
        this.cbbm1 = cbbm1;
    }

    public Integer getXla() {
        return xla;
    }

    public void setXla(Integer xla) {
        this.xla = xla;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getFsrq() {
        return fsrq;
    }

    public void setFsrq(String fsrq) {
        this.fsrq = fsrq;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getFsr() {
        return fsr;
    }

    public void setFsr(String fsr) {
        this.fsr = fsr;
    }

    public String getFsnr() {
        return fsnr;
    }

    public void setFsnr(String fsnr) {
        this.fsnr = fsnr;
    }

    public String getSfyd() {
        return sfyd;
    }

    public void setSfyd(String sfyd) {
        this.sfyd = sfyd;
    }

    public String getSfsc() {
        return sfsc;
    }

    public void setSfsc(String sfsc) {
        this.sfsc = sfsc;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getIsfsdx() {
        return isfsdx;
    }

    public void setIsfsdx(String isfsdx) {
        this.isfsdx = isfsdx;
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
