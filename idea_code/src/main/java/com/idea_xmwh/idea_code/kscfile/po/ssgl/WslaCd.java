package com.tdh.light.spxt.bp.po.ssgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:上诉管理库WSLA_CD表映射
 * Project Name:spxt
 * File Name:WslaCd
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/6 16:25   hebq         1.0       1.0 Version
 **/
@TableName("WSLA_CD")
public class WslaCd {

    @TableId(value = "LSH", type = IdType.INPUT)
    private String lsh;

    @TableField("FYDM")
    private String fydm;

    @TableField("BQID")
    private String bqid;

    @TableField("BQAHDM")
    private String bqahdm;

    @TableField("BQAH")
    private String bqah;

    @TableField("BQAY")
    private String bqay;

    @TableField("LARQ")
    private String larq;

    @TableField("SQRQ")
    private String sqrq;

    @TableField("DJR")
    private String djr;

    @TableField("CDJG")
    private String cdjg;

    @TableField("CDSJ")
    private String cdsj;

    @TableField("SQLX")
    private String sqlx;

    @TableField("BEIZ")
    private String beiz;

    @TableField("WSID")
    private String wsid;

    @TableField("WTGYY")
    private String wtgyy;

    @TableField("FKLB")
    private String fklb;

    @TableField("FKJG")
    private String fkjg;

    @TableField("FKCS")
    private Integer fkcs;

    @TableField("WSLX")
    private String wslx;

    @TableField("WSMC")
    private String wsmc;

    @TableField("WSNR")
    private byte[] wsnr;

    @TableField("WSZZSJ")
    private Date wszzsj;

    @TableField("FYID")
    private String fyid;

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

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getBqid() {
        return bqid;
    }

    public void setBqid(String bqid) {
        this.bqid = bqid;
    }

    public String getBqahdm() {
        return bqahdm;
    }

    public void setBqahdm(String bqahdm) {
        this.bqahdm = bqahdm;
    }

    public String getBqah() {
        return bqah;
    }

    public void setBqah(String bqah) {
        this.bqah = bqah;
    }

    public String getBqay() {
        return bqay;
    }

    public void setBqay(String bqay) {
        this.bqay = bqay;
    }

    public String getLarq() {
        return larq;
    }

    public void setLarq(String larq) {
        this.larq = larq;
    }

    public String getSqrq() {
        return sqrq;
    }

    public void setSqrq(String sqrq) {
        this.sqrq = sqrq;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public String getCdjg() {
        return cdjg;
    }

    public void setCdjg(String cdjg) {
        this.cdjg = cdjg;
    }

    public String getCdsj() {
        return cdsj;
    }

    public void setCdsj(String cdsj) {
        this.cdsj = cdsj;
    }

    public String getSqlx() {
        return sqlx;
    }

    public void setSqlx(String sqlx) {
        this.sqlx = sqlx;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getWsid() {
        return wsid;
    }

    public void setWsid(String wsid) {
        this.wsid = wsid;
    }

    public String getWtgyy() {
        return wtgyy;
    }

    public void setWtgyy(String wtgyy) {
        this.wtgyy = wtgyy;
    }

    public String getFklb() {
        return fklb;
    }

    public void setFklb(String fklb) {
        this.fklb = fklb;
    }

    public String getFkjg() {
        return fkjg;
    }

    public void setFkjg(String fkjg) {
        this.fkjg = fkjg;
    }

    public Integer getFkcs() {
        return fkcs;
    }

    public void setFkcs(Integer fkcs) {
        this.fkcs = fkcs;
    }

    public String getWslx() {
        return wslx;
    }

    public void setWslx(String wslx) {
        this.wslx = wslx;
    }

    public String getWsmc() {
        return wsmc;
    }

    public void setWsmc(String wsmc) {
        this.wsmc = wsmc;
    }

    public byte[] getWsnr() {
        return wsnr;
    }

    public void setWsnr(byte[] wsnr) {
        this.wsnr = wsnr;
    }

    public Date getWszzsj() {
        return wszzsj;
    }

    public void setWszzsj(Date wszzsj) {
        this.wszzsj = wszzsj;
    }

    public String getFyid() {
        return fyid;
    }

    public void setFyid(String fyid) {
        this.fyid = fyid;
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
