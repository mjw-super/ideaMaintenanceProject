package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * Description:DJGL_FS(调卷管理-发送)
 * Project Name:spxt
 * File Name:DjglFs
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/14 9:30   zhongcg         1.0       1.0 Version
 **/
@TableName("DJGL_FS")
public class DjglFs implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    @TableId(value = "LSH",type = IdType.INPUT)
    private String lsh;
    //类别
    @TableField("LB")
    private String lb;
    //调卷单位
    @TableField("DJDW")
    private String djdw;
    //调卷函号
    @TableField("DJHH")
    private String djhh;
    //年度
    @TableField("ND")
    private Integer nd;
    //代字
    @TableField("DZ")
    private String dz;
    //序号
    @TableField("XH")
    private Integer xh;
    //状态
    @TableField("ZT")
    private String zt;
    //调卷期限
    @TableField("DJQX")
    private Integer djqx;
    @TableField("DJQXJMRQ")
    private String djqxjmrq;
    //调卷案号
    @TableField("DJAH")
    private String djah;
    //当事人
    @TableField("DSR")
    private String dsr;
    //发送日期
    @TableField("FSRQ")
    private String fsrq;
    //调卷说明
    @TableField("DJSM")
    private String djsm;
    @TableField("DJWS")
    private String djws;
    @TableField("SDJZRQ")
    private String sdjzrq;
    //调卷人
    @TableField("DJR")
    private String djr;
    //调卷日期
    @TableField("DJRQ")
    private String djrq;
    //调卷部门
    @TableField("DJBM")
    private String djbm;
    //负责送卷单位
    @TableField("FZSJDW")
    private String fzsjdw;
    @TableField("JSRQ")
    private String jsrq;
    @TableField("JSR")
    private String jsr;
    //案号代码
    @TableField("AHDM")
    private String ahdm;
    //信访编号
    @TableField("XFBH")
    private String xfbh;
    @TableField("DJLSH")
    private String djlsh;
    //发送时间
    @TableField("FSSJ")
    private String fssj;
    @TableField("LXDH")
    private String lxdh;
    @TableField("SLH")
    private String slh;
    @TableField("DJSQRQ")
    private String djsqrq;
    @TableField("AYMS")
    private String ayms;
    //调卷接收人名称
    @TableField("DJJSR")
    private String djjsr;
    //调卷接收人代码
    @TableField("DJJSRDM")
    private String djjsrdm;
    @TableField("DJBMMC")
    private String djbmmc;
    @TableField("XFAHDM")
    private String xfahdm;
    @TableField("DJWSURL")
    private String djwsurl;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getDjdw() {
        return djdw;
    }

    public void setDjdw(String djdw) {
        this.djdw = djdw;
    }

    public String getDjhh() {
        return djhh;
    }

    public void setDjhh(String djhh) {
        this.djhh = djhh;
    }

    public Integer getNd() {
        return nd;
    }

    public void setNd(Integer nd) {
        this.nd = nd;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public Integer getDjqx() {
        return djqx;
    }

    public void setDjqx(Integer djqx) {
        this.djqx = djqx;
    }

    public String getDjqxjmrq() {
        return djqxjmrq;
    }

    public void setDjqxjmrq(String djqxjmrq) {
        this.djqxjmrq = djqxjmrq;
    }

    public String getDjah() {
        return djah;
    }

    public void setDjah(String djah) {
        this.djah = djah;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public String getFsrq() {
        return fsrq;
    }

    public void setFsrq(String fsrq) {
        this.fsrq = fsrq;
    }

    public String getDjsm() {
        return djsm;
    }

    public void setDjsm(String djsm) {
        this.djsm = djsm;
    }

    public String getDjws() {
        return djws;
    }

    public void setDjws(String djws) {
        this.djws = djws;
    }

    public String getSdjzrq() {
        return sdjzrq;
    }

    public void setSdjzrq(String sdjzrq) {
        this.sdjzrq = sdjzrq;
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

    public String getDjbm() {
        return djbm;
    }

    public void setDjbm(String djbm) {
        this.djbm = djbm;
    }

    public String getFzsjdw() {
        return fzsjdw;
    }

    public void setFzsjdw(String fzsjdw) {
        this.fzsjdw = fzsjdw;
    }

    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getXfbh() {
        return xfbh;
    }

    public void setXfbh(String xfbh) {
        this.xfbh = xfbh;
    }

    public String getDjlsh() {
        return djlsh;
    }

    public void setDjlsh(String djlsh) {
        this.djlsh = djlsh;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getSlh() {
        return slh;
    }

    public void setSlh(String slh) {
        this.slh = slh;
    }

    public String getDjsqrq() {
        return djsqrq;
    }

    public void setDjsqrq(String djsqrq) {
        this.djsqrq = djsqrq;
    }

    public String getAyms() {
        return ayms;
    }

    public void setAyms(String ayms) {
        this.ayms = ayms;
    }

    public String getDjjsr() {
        return djjsr;
    }

    public void setDjjsr(String djjsr) {
        this.djjsr = djjsr;
    }

    public String getDjjsrdm() {
        return djjsrdm;
    }

    public void setDjjsrdm(String djjsrdm) {
        this.djjsrdm = djjsrdm;
    }

    public String getDjbmmc() {
        return djbmmc;
    }

    public void setDjbmmc(String djbmmc) {
        this.djbmmc = djbmmc;
    }

    public String getXfahdm() {
        return xfahdm;
    }

    public void setXfahdm(String xfahdm) {
        this.xfahdm = xfahdm;
    }

    public String getDjwsurl() {
        return djwsurl;
    }

    public void setDjwsurl(String djwsurl) {
        this.djwsurl = djwsurl;
    }
}
