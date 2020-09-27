package com.idea_xmwh.idea_code.kscfile.po.dajg;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:DAJG_BASE表映射
 * Project Name:spxt
 * File Name:DajgBase
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/10 15:27   hebq         1.0       1.0 Version
 **/
@TableName("DAJG_BASE")
public class DajgBase {

    @TableId(value = "LSH", type = IdType.INPUT)
    private String lsh;

    @TableField("DHDM")
    private String dhdm;

    @TableField("NNDD")
    private String nndd;

    @TableField("FYDM")
    private String fydm;

    @TableField("DALB")
    private String dalb;

    @TableField("DABM")
    private String dabm;

    @TableField("DAXH")
    private String daxh;

    @TableField("DH")
    private String dh;

    @TableField("GDM")
    private String gdm;

    @TableField("QZH")
    private String qzh;

    @TableField("MLH")
    private String mlh;

    @TableField("JZH")
    private String jzh;

    @TableField("MJ")
    private String mj;

    @TableField("BGQX")
    private String bgqx;

    @TableField("BGNX")
    private Short bgnx;

    @TableField("LJBM")
    private String ljbm;

    @TableField("LJR")
    private String ljr;

    @TableField("LJRQ")
    private String ljrq;

    @TableField("YJBM")
    private String yjbm;

    @TableField("YJR")
    private String yjr;

    @TableField("YJRQ")
    private String yjrq;

    @TableField("JCR")
    private String jcr;

    @TableField("GDR")
    private String gdr;

    @TableField("GDRQ")
    private String gdrq;

    @TableField("DAHH")
    private String dahh;

    @TableField("CCDD")
    private String ccdd;

    @TableField("AJZT")
    private String ajzt;

    @TableField("SFZK")
    private String sfzk;

    @TableField("SFLZ")
    private String sflz;

    @TableField("SFSM")
    private String sfsm;

    @TableField("DALY")
    private String daly;

    @TableField("HOST")
    private String host;

    @TableField("SFLSJS")
    private String sflsjs;

    @TableField("GDBM")
    private String gdbm;

    @TableField("JSR")
    private String jsr;

    @TableField("JSRQ")
    private String jsrq;

    @TableField("SWGD")
    private String swgd;

    @TableField("YYSM")
    private String yysm;

    @TableField("YWID")
    private String ywid;

    @TableField("KZBS")
    private String kzbs;

    @TableField("SQCL")
    private String sqcl;

    @TableField("JZBYLY")
    private String jzbyly;

    @TableField("JZDWLY")
    private String jzdwly;

    @TableField("SFQS")
    private String sfqs;

    @TableField("QSR")
    private String qsr;

    @TableField("QSRQ")
    private String qsrq;

    @TableField("JGPC")
    private String jgpc;

    @TableField("QSTHYY")
    private String qsthyy;

    @TableField("SFJC")
    private String sfjc;

    @TableField("JCTHYY")
    private String jcthyy;

    @TableField("JCRR")
    private String jcrr;

    @TableField("JCRQ")
    private String jcrq;

    @TableField("THYY")
    private String thyy;

    @TableField("SFFCDA")
    private String sffcda;

    @TableField("AJLX")
    private String ajlx;

    @TableField("SPCX")
    private String spcx;

    @TableField("GDKM")
    private String gdkm;

    @TableField("LSGD")
    private String lsgd;

    public DajgBase() {
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getDhdm() {
        return dhdm;
    }

    public void setDhdm(String dhdm) {
        this.dhdm = dhdm;
    }

    public String getNndd() {
        return nndd;
    }

    public void setNndd(String nndd) {
        this.nndd = nndd;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getDalb() {
        return dalb;
    }

    public void setDalb(String dalb) {
        this.dalb = dalb;
    }

    public String getDabm() {
        return dabm;
    }

    public void setDabm(String dabm) {
        this.dabm = dabm;
    }

    public String getDaxh() {
        return daxh;
    }

    public void setDaxh(String daxh) {
        this.daxh = daxh;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getGdm() {
        return gdm;
    }

    public void setGdm(String gdm) {
        this.gdm = gdm;
    }

    public String getQzh() {
        return qzh;
    }

    public void setQzh(String qzh) {
        this.qzh = qzh;
    }

    public String getMlh() {
        return mlh;
    }

    public void setMlh(String mlh) {
        this.mlh = mlh;
    }

    public String getJzh() {
        return jzh;
    }

    public void setJzh(String jzh) {
        this.jzh = jzh;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
    }

    public String getBgqx() {
        return bgqx;
    }

    public void setBgqx(String bgqx) {
        this.bgqx = bgqx;
    }

    public Short getBgnx() {
        return bgnx;
    }

    public void setBgnx(Short bgnx) {
        this.bgnx = bgnx;
    }

    public String getLjbm() {
        return ljbm;
    }

    public void setLjbm(String ljbm) {
        this.ljbm = ljbm;
    }

    public String getLjr() {
        return ljr;
    }

    public void setLjr(String ljr) {
        this.ljr = ljr;
    }

    public String getLjrq() {
        return ljrq;
    }

    public void setLjrq(String ljrq) {
        this.ljrq = ljrq;
    }

    public String getYjbm() {
        return yjbm;
    }

    public void setYjbm(String yjbm) {
        this.yjbm = yjbm;
    }

    public String getYjr() {
        return yjr;
    }

    public void setYjr(String yjr) {
        this.yjr = yjr;
    }

    public String getYjrq() {
        return yjrq;
    }

    public void setYjrq(String yjrq) {
        this.yjrq = yjrq;
    }

    public String getJcr() {
        return jcr;
    }

    public void setJcr(String jcr) {
        this.jcr = jcr;
    }

    public String getGdr() {
        return gdr;
    }

    public void setGdr(String gdr) {
        this.gdr = gdr;
    }

    public String getGdrq() {
        return gdrq;
    }

    public void setGdrq(String gdrq) {
        this.gdrq = gdrq;
    }

    public String getDahh() {
        return dahh;
    }

    public void setDahh(String dahh) {
        this.dahh = dahh;
    }

    public String getCcdd() {
        return ccdd;
    }

    public void setCcdd(String ccdd) {
        this.ccdd = ccdd;
    }

    public String getAjzt() {
        return ajzt;
    }

    public void setAjzt(String ajzt) {
        this.ajzt = ajzt;
    }

    public String getSfzk() {
        return sfzk;
    }

    public void setSfzk(String sfzk) {
        this.sfzk = sfzk;
    }

    public String getSflz() {
        return sflz;
    }

    public void setSflz(String sflz) {
        this.sflz = sflz;
    }

    public String getSfsm() {
        return sfsm;
    }

    public void setSfsm(String sfsm) {
        this.sfsm = sfsm;
    }

    public String getDaly() {
        return daly;
    }

    public void setDaly(String daly) {
        this.daly = daly;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSflsjs() {
        return sflsjs;
    }

    public void setSflsjs(String sflsjs) {
        this.sflsjs = sflsjs;
    }

    public String getGdbm() {
        return gdbm;
    }

    public void setGdbm(String gdbm) {
        this.gdbm = gdbm;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    public String getSwgd() {
        return swgd;
    }

    public void setSwgd(String swgd) {
        this.swgd = swgd;
    }

    public String getYysm() {
        return yysm;
    }

    public void setYysm(String yysm) {
        this.yysm = yysm;
    }

    public String getYwid() {
        return ywid;
    }

    public void setYwid(String ywid) {
        this.ywid = ywid;
    }

    public String getKzbs() {
        return kzbs;
    }

    public void setKzbs(String kzbs) {
        this.kzbs = kzbs;
    }

    public String getSqcl() {
        return sqcl;
    }

    public void setSqcl(String sqcl) {
        this.sqcl = sqcl;
    }

    public String getJzbyly() {
        return jzbyly;
    }

    public void setJzbyly(String jzbyly) {
        this.jzbyly = jzbyly;
    }

    public String getJzdwly() {
        return jzdwly;
    }

    public void setJzdwly(String jzdwly) {
        this.jzdwly = jzdwly;
    }

    public String getSfqs() {
        return sfqs;
    }

    public void setSfqs(String sfqs) {
        this.sfqs = sfqs;
    }

    public String getQsr() {
        return qsr;
    }

    public void setQsr(String qsr) {
        this.qsr = qsr;
    }

    public String getQsrq() {
        return qsrq;
    }

    public void setQsrq(String qsrq) {
        this.qsrq = qsrq;
    }

    public String getJgpc() {
        return jgpc;
    }

    public void setJgpc(String jgpc) {
        this.jgpc = jgpc;
    }

    public String getQsthyy() {
        return qsthyy;
    }

    public void setQsthyy(String qsthyy) {
        this.qsthyy = qsthyy;
    }

    public String getSfjc() {
        return sfjc;
    }

    public void setSfjc(String sfjc) {
        this.sfjc = sfjc;
    }

    public String getJcthyy() {
        return jcthyy;
    }

    public void setJcthyy(String jcthyy) {
        this.jcthyy = jcthyy;
    }

    public String getJcrr() {
        return jcrr;
    }

    public void setJcrr(String jcrr) {
        this.jcrr = jcrr;
    }

    public String getJcrq() {
        return jcrq;
    }

    public void setJcrq(String jcrq) {
        this.jcrq = jcrq;
    }

    public String getThyy() {
        return thyy;
    }

    public void setThyy(String thyy) {
        this.thyy = thyy;
    }

    public String getSffcda() {
        return sffcda;
    }

    public void setSffcda(String sffcda) {
        this.sffcda = sffcda;
    }

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
    }

    public String getSpcx() {
        return spcx;
    }

    public void setSpcx(String spcx) {
        this.spcx = spcx;
    }

    public String getGdkm() {
        return gdkm;
    }

    public void setGdkm(String gdkm) {
        this.gdkm = gdkm;
    }

    public String getLsgd() {
        return lsgd;
    }

    public void setLsgd(String lsgd) {
        this.lsgd = lsgd;
    }
}
