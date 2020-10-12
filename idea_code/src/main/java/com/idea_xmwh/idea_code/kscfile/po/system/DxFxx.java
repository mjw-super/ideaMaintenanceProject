package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangz
 * @desc
 * @date 2020/6/30
 */
@TableName("DX_FXX")
public class DxFxx implements Serializable {

    private static final long serialVersionUID = 3767417007976498422L;
    @TableId(value = "LSH", type = IdType.INPUT)
    private String lsh;

    @TableField("AH")
    private String ah;

    @TableField("SSDW")
    private String ssdw;

    @TableField("DSRXM")
    private String dsrxm;

    @TableField("FSNR")
    private String fsnr;

    @TableField("FSRR")
    private String fsrr;

    @TableField("FSBM")
    private String fsbm;

    @TableField("CBBM")
    private String cbbm;

    @TableField("SJHM")
    private String sjhm;

    @TableField("FSRQ")
    private Date fsrq;

    @TableField("DJRQ")
    private Date djrq;

    @TableField("SHRR")
    private String shrr;

    @TableField("SHRQ")
    private Date shrq;

    @TableField("ZT")
    private String zt;

    @TableField("FSFS")
    private String fsfs;

    @TableField("FYDM")
    private String fydm;

    @TableField("SBYY")
    private String sbyy;

    @TableField("YFSRQ")
    private Date yfsrq;

    @TableField("HFRQ")
    private Date hfrq;

    @TableField("HFNR")
    private String hfnr;

    @TableField("YDZT")
    private String ydzt;

    @TableField("AHDM")
    private String ahdm;

    @TableField("GNDM")
    private String gndm;

    @TableField("XH")
    private Short xh;

    @TableField("UID2")
    private String uid2;

    @TableField("HFTEL")
    private String hftel;

    @TableField("HZZT")
    private String hzzt;

    @TableField("HZSBYY")
    private String hzsbyy;

    @TableField("KZM")
    private Integer kzm;

    @TableField("YJLSH")
    private String yjlsh;

    @TableField("SECRET")
    private String secret;

    @TableField("FSCS")
    private Integer fscs;

    @TableField("ZTMS")
    private String ztms;

    @TableField("YWXH")
    private String ywxh;

    @TableField("PKVAL")
    private String pkval;

    @TableField("IS_DELETED")
    private Integer IsDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date GmtCreat;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getSsdw() {
        return ssdw;
    }

    public void setSsdw(String ssdw) {
        this.ssdw = ssdw;
    }

    public String getDsrxm() {
        return dsrxm;
    }

    public void setDsrxm(String dsrxm) {
        this.dsrxm = dsrxm;
    }

    public String getFsnr() {
        return fsnr;
    }

    public void setFsnr(String fsnr) {
        this.fsnr = fsnr;
    }

    public String getFsrr() {
        return fsrr;
    }

    public void setFsrr(String fsrr) {
        this.fsrr = fsrr;
    }

    public String getFsbm() {
        return fsbm;
    }

    public void setFsbm(String fsbm) {
        this.fsbm = fsbm;
    }

    public String getCbbm() {
        return cbbm;
    }

    public void setCbbm(String cbbm) {
        this.cbbm = cbbm;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public Date getFsrq() {
        return fsrq;
    }

    public void setFsrq(Date fsrq) {
        this.fsrq = fsrq;
    }

    public Date getDjrq() {
        return djrq;
    }

    public void setDjrq(Date djrq) {
        this.djrq = djrq;
    }

    public String getShrr() {
        return shrr;
    }

    public void setShrr(String shrr) {
        this.shrr = shrr;
    }

    public Date getShrq() {
        return shrq;
    }

    public void setShrq(Date shrq) {
        this.shrq = shrq;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getFsfs() {
        return fsfs;
    }

    public void setFsfs(String fsfs) {
        this.fsfs = fsfs;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getSbyy() {
        return sbyy;
    }

    public void setSbyy(String sbyy) {
        this.sbyy = sbyy;
    }

    public Date getYfsrq() {
        return yfsrq;
    }

    public void setYfsrq(Date yfsrq) {
        this.yfsrq = yfsrq;
    }

    public Date getHfrq() {
        return hfrq;
    }

    public void setHfrq(Date hfrq) {
        this.hfrq = hfrq;
    }

    public String getHfnr() {
        return hfnr;
    }

    public void setHfnr(String hfnr) {
        this.hfnr = hfnr;
    }

    public String getYdzt() {
        return ydzt;
    }

    public void setYdzt(String ydzt) {
        this.ydzt = ydzt;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getGndm() {
        return gndm;
    }

    public void setGndm(String gndm) {
        this.gndm = gndm;
    }

    public Short getXh() {
        return xh;
    }

    public void setXh(Short xh) {
        this.xh = xh;
    }

    public String getUid2() {
        return uid2;
    }

    public void setUid2(String uid2) {
        this.uid2 = uid2;
    }

    public String getHftel() {
        return hftel;
    }

    public void setHftel(String hftel) {
        this.hftel = hftel;
    }

    public String getHzzt() {
        return hzzt;
    }

    public void setHzzt(String hzzt) {
        this.hzzt = hzzt;
    }

    public String getHzsbyy() {
        return hzsbyy;
    }

    public void setHzsbyy(String hzsbyy) {
        this.hzsbyy = hzsbyy;
    }

    public Integer getKzm() {
        return kzm;
    }

    public void setKzm(Integer kzm) {
        this.kzm = kzm;
    }

    public String getYjlsh() {
        return yjlsh;
    }

    public void setYjlsh(String yjlsh) {
        this.yjlsh = yjlsh;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Integer getFscs() {
        return fscs;
    }

    public void setFscs(Integer fscs) {
        this.fscs = fscs;
    }

    public String getZtms() {
        return ztms;
    }

    public void setZtms(String ztms) {
        this.ztms = ztms;
    }

    public String getPkval() {
        return pkval;
    }

    public void setPkval(String pkval) {
        this.pkval = pkval;
    }

    public String getYwxh() {
        return ywxh;
    }

    public void setYwxh(String ywxh) {
        this.ywxh = ywxh;
    }

    public Integer getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        IsDeleted = isDeleted;
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
        return GmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        GmtCreat = gmtCreat;
    }
}
