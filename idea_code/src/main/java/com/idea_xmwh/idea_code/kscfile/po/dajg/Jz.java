package com.idea_xmwh.idea_code.kscfile.po.dajg;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:档案加工库JZ表映射
 * Project Name:spxt
 * File Name:Jz
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/14 15:35   hebq         1.0       1.0 Version
 **/
@TableName("JZ")
public class Jz {
    @TableField("AHDM")
    private String ahdm;

    @TableField("XXHH")
    private Integer xxhh;

    @TableField("ZFJBS")
    private String zfjbs;

    @TableField("JNPXH")
    private Integer jnpxh;

    @TableField("CLLB")
    private String cllb;

    @TableField("CLBT")
    private String clbt;

    @TableField("DJRR")
    private String djrr;

    @TableField("JDZT")
    private String jdzt;

    @TableField("WSNR")
    private byte[] wsnr;

    @TableField("DJRQ")
    private Date djrq;

    @TableField("GESH")
    private String gesh;

    @TableField("YSID")
    private Integer ysid;

    @TableField("STLB")
    private String stlb;

    @TableField("STBH")
    private String stbh;

    @TableField("WJMC")
    private String wjmc;

    @TableField("WJGS")
    private String wjgs;

    @TableField("WJDX")
    private Integer wjdx;

    @TableField("ZJXGR")
    private String zjxgr;

    @TableField("ZJXGSJ")
    private Date zjxgsj;

    @TableField("BZ")
    private String bz;

    @TableField("YSBZ")
    private String ysbz;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getXxhh() {
        return xxhh;
    }

    public void setXxhh(Integer xxhh) {
        this.xxhh = xxhh;
    }

    public String getZfjbs() {
        return zfjbs;
    }

    public void setZfjbs(String zfjbs) {
        this.zfjbs = zfjbs;
    }

    public Integer getJnpxh() {
        return jnpxh;
    }

    public void setJnpxh(Integer jnpxh) {
        this.jnpxh = jnpxh;
    }

    public String getCllb() {
        return cllb;
    }

    public void setCllb(String cllb) {
        this.cllb = cllb;
    }

    public String getClbt() {
        return clbt;
    }

    public void setClbt(String clbt) {
        this.clbt = clbt;
    }

    public String getDjrr() {
        return djrr;
    }

    public void setDjrr(String djrr) {
        this.djrr = djrr;
    }

    public String getJdzt() {
        return jdzt;
    }

    public void setJdzt(String jdzt) {
        this.jdzt = jdzt;
    }

    public Date getDjrq() {
        return djrq;
    }

    public void setDjrq(Date djrq) {
        this.djrq = djrq;
    }

    public String getGesh() {
        return gesh;
    }

    public void setGesh(String gesh) {
        this.gesh = gesh;
    }

    public Integer getYsid() {
        return ysid;
    }

    public void setYsid(Integer ysid) {
        this.ysid = ysid;
    }

    public String getStlb() {
        return stlb;
    }

    public void setStlb(String stlb) {
        this.stlb = stlb;
    }

    public String getStbh() {
        return stbh;
    }

    public void setStbh(String stbh) {
        this.stbh = stbh;
    }

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc;
    }

    public String getWjgs() {
        return wjgs;
    }

    public void setWjgs(String wjgs) {
        this.wjgs = wjgs;
    }

    public Integer getWjdx() {
        return wjdx;
    }

    public void setWjdx(Integer wjdx) {
        this.wjdx = wjdx;
    }

    public String getZjxgr() {
        return zjxgr;
    }

    public void setZjxgr(String zjxgr) {
        this.zjxgr = zjxgr;
    }

    public Date getZjxgsj() {
        return zjxgsj;
    }

    public void setZjxgsj(Date zjxgsj) {
        this.zjxgsj = zjxgsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getYsbz() {
        return ysbz;
    }

    public void setYsbz(String ysbz) {
        this.ysbz = ysbz;
    }

    public byte[] getWsnr() {
        return wsnr;
    }

    public void setWsnr(byte[] wsnr) {
        this.wsnr = wsnr;
    }
}
