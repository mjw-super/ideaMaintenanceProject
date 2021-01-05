package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.ajgl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/26 11        gp     1.0        1.0 Version
 **/
@TableName("EAJ_SLAJJDGL")
public class EajSlajjdgl {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("XH")
    private Double xh;
    @TableField("FYDM")
    private String fydm;
    @TableField("JGYY")
    private String jgyy;
    @TableField("CJ")
    private String cj;
    @TableField("BEIZ")
    private String beiz;
    @TableField("JZXH")
    private String jzxh;
    @TableField("DJR")
    private String djr;
    @TableField("DJRQ")
    private String djrq;
    @TableField("SFTJJG")
    private String sftjjg;
    @TableField("TJJGSJ")
    private String tjjgsj;
    @TableField("QXJGYY")
    private String qxjgyy;
    @TableField("QXJGR")
    private String qxjgr;
    @TableField("QXJGSJ")
    private String qxjgsj;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("QDRQ")
    private String qdrq;
    @TableField("JDGLQDFS")
    private String jdglqdfs;
    @TableField("FXZTR")
    private String fxztr;
    @TableField("FXZTBM")
    private String fxztbm;
    @TableField("JGZT")
    private String jgzt;
    @TableField("ZDJGR")
    private String zdjgr;
    @TableField("ZDJGBM")
    private String zdjgbm;
    @TableField("JGZTBM")
    private String jgztbm;
    @TableField("JGJLDJRQ")
    private String jgjldjrq;
    @TableField("JGJLDJR")
    private String jgjldjr;
    @TableField("FGZYHYJL")
    private String fgzyhyjl;
    @TableField("SWHJL")
    private String swhjl;
    @TableField("BGJZJL")
    private String bgjzjl;
    @TableField("SLAJLX")
    private String slajlx;
    @TableField("SLAJJTQX")
    private String slajjtqx;
    @TableField("SLAJLY")
    private String slajly;
    @TableField("LABSSLAJ")
    private String labsslaj;
    @TableField("LCH")
    private String lch;
    @TableField("SLH")
    private String slh;
    @TableField("SFTXSJFY")
    private String sftxsjfy;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Double getXh() {
        return xh;
    }

    public void setXh(Double xh) {
        this.xh = xh;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getJgyy() {
        return jgyy;
    }

    public void setJgyy(String jgyy) {
        this.jgyy = jgyy;
    }

    public String getCj() {
        return cj;
    }

    public void setCj(String cj) {
        this.cj = cj;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getJzxh() {
        return jzxh;
    }

    public void setJzxh(String jzxh) {
        this.jzxh = jzxh;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getSftjjg() {
        return sftjjg;
    }

    public void setSftjjg(String sftjjg) {
        this.sftjjg = sftjjg;
    }

    public String getTjjgsj() {
        return tjjgsj;
    }

    public void setTjjgsj(String tjjgsj) {
        this.tjjgsj = tjjgsj;
    }

    public String getQxjgyy() {
        return qxjgyy;
    }

    public void setQxjgyy(String qxjgyy) {
        this.qxjgyy = qxjgyy;
    }

    public String getQxjgr() {
        return qxjgr;
    }

    public void setQxjgr(String qxjgr) {
        this.qxjgr = qxjgr;
    }

    public String getQxjgsj() {
        return qxjgsj;
    }

    public void setQxjgsj(String qxjgsj) {
        this.qxjgsj = qxjgsj;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getQdrq() {
        return qdrq;
    }

    public void setQdrq(String qdrq) {
        this.qdrq = qdrq;
    }

    public String getJdglqdfs() {
        return jdglqdfs;
    }

    public void setJdglqdfs(String jdglqdfs) {
        this.jdglqdfs = jdglqdfs;
    }

    public String getFxztr() {
        return fxztr;
    }

    public void setFxztr(String fxztr) {
        this.fxztr = fxztr;
    }

    public String getFxztbm() {
        return fxztbm;
    }

    public void setFxztbm(String fxztbm) {
        this.fxztbm = fxztbm;
    }

    public String getJgzt() {
        return jgzt;
    }

    public void setJgzt(String jgzt) {
        this.jgzt = jgzt;
    }

    public String getZdjgr() {
        return zdjgr;
    }

    public void setZdjgr(String zdjgr) {
        this.zdjgr = zdjgr;
    }

    public String getZdjgbm() {
        return zdjgbm;
    }

    public void setZdjgbm(String zdjgbm) {
        this.zdjgbm = zdjgbm;
    }

    public String getJgztbm() {
        return jgztbm;
    }

    public void setJgztbm(String jgztbm) {
        this.jgztbm = jgztbm;
    }

    public String getJgjldjrq() {
        return jgjldjrq;
    }

    public void setJgjldjrq(String jgjldjrq) {
        this.jgjldjrq = jgjldjrq;
    }

    public String getJgjldjr() {
        return jgjldjr;
    }

    public void setJgjldjr(String jgjldjr) {
        this.jgjldjr = jgjldjr;
    }

    public String getFgzyhyjl() {
        return fgzyhyjl;
    }

    public void setFgzyhyjl(String fgzyhyjl) {
        this.fgzyhyjl = fgzyhyjl;
    }

    public String getSwhjl() {
        return swhjl;
    }

    public void setSwhjl(String swhjl) {
        this.swhjl = swhjl;
    }

    public String getBgjzjl() {
        return bgjzjl;
    }

    public void setBgjzjl(String bgjzjl) {
        this.bgjzjl = bgjzjl;
    }

    public String getSlajlx() {
        return slajlx;
    }

    public void setSlajlx(String slajlx) {
        this.slajlx = slajlx;
    }

    public String getSlajjtqx() {
        return slajjtqx;
    }

    public void setSlajjtqx(String slajjtqx) {
        this.slajjtqx = slajjtqx;
    }

    public String getSlajly() {
        return slajly;
    }

    public void setSlajly(String slajly) {
        this.slajly = slajly;
    }

    public String getLabsslaj() {
        return labsslaj;
    }

    public void setLabsslaj(String labsslaj) {
        this.labsslaj = labsslaj;
    }

    public String getLch() {
        return lch;
    }

    public void setLch(String lch) {
        this.lch = lch;
    }

    public String getSlh() {
        return slh;
    }

    public void setSlh(String slh) {
        this.slh = slh;
    }

    public String getSftxsjfy() {
        return sftxsjfy;
    }

    public void setSftxsjfy(String sftxsjfy) {
        this.sftxsjfy = sftxsjfy;
    }

    @Override
    public String toString() {
        return "EajSlajjdgl{" +
                "ahdm='" + ahdm + '\'' +
                ", xh=" + xh +
                ", fydm='" + fydm + '\'' +
                ", jgyy='" + jgyy + '\'' +
                ", cj='" + cj + '\'' +
                ", beiz='" + beiz + '\'' +
                ", jzxh='" + jzxh + '\'' +
                ", djr='" + djr + '\'' +
                ", djrq='" + djrq + '\'' +
                ", sftjjg='" + sftjjg + '\'' +
                ", tjjgsj='" + tjjgsj + '\'' +
                ", qxjgyy='" + qxjgyy + '\'' +
                ", qxjgr='" + qxjgr + '\'' +
                ", qxjgsj='" + qxjgsj + '\'' +
                ", lastupdate=" + lastupdate +
                ", qdrq='" + qdrq + '\'' +
                ", jdglqdfs='" + jdglqdfs + '\'' +
                ", fxztr='" + fxztr + '\'' +
                ", fxztbm='" + fxztbm + '\'' +
                ", jgzt='" + jgzt + '\'' +
                ", zdjgr='" + zdjgr + '\'' +
                ", zdjgbm='" + zdjgbm + '\'' +
                ", jgztbm='" + jgztbm + '\'' +
                ", jgjldjrq='" + jgjldjrq + '\'' +
                ", jgjldjr='" + jgjldjr + '\'' +
                ", fgzyhyjl='" + fgzyhyjl + '\'' +
                ", swhjl='" + swhjl + '\'' +
                ", bgjzjl='" + bgjzjl + '\'' +
                ", slajlx='" + slajlx + '\'' +
                ", slajjtqx='" + slajjtqx + '\'' +
                ", slajly='" + slajly + '\'' +
                ", labsslaj='" + labsslaj + '\'' +
                ", lch='" + lch + '\'' +
                ", slh='" + slh + '\'' +
                ", sftxsjfy='" + sftxsjfy + '\'' +
                '}';
    }
}
