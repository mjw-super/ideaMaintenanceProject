package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author liangbx [bangxi.liang]
 * @Description FxPg
 * @date 2020/07/02/下午 4:06
 */
@TableName("FX_PG")
public class FxPg {
    private static final long serialVersionUID = 1L;

    @TableField("AHDM")
    private String ahdm;
    @TableField("XH")
    private Integer xh;
    @TableField("AH")
    private String ah;
    @TableField("PGBM")
    private String pgbm;
    @TableField("PGJD")
    private String pgjd;
    @TableField("AJZT")
    private String ajzt;
    @TableField("FXDJ")
    private Integer fxdj;
    @TableField("FXQK")
    private String fxqk;
    @TableField("PGMS")
    private String pgms;
    @TableField("YXCS")
    private String yxcs;
    @TableField("HXGZJY")
    private String hxgzjy;
    @TableField("DJR")
    private String djr;
    @TableField("DJRQ")
    private String djrq;
    @TableField("DJRDM")
    private String djrdm;
    @TableField("SPZYJ")
    private String spzyj;
    @TableField("SPZXM")
    private String spzxm;
    @TableField("SPZRQ")
    private String spzrq;
    @TableField("BMLDYJ")
    private String bmldyj;
    @TableField("BMLDXM")
    private String bmldxm;
    @TableField("BMLDRQ")
    private String bmldrq;
    @TableField("YLDYJ")
    private String yldyj;
    @TableField("YLDXM")
    private String yldxm;
    @TableField("YLDRQ")
    private String yldrq;
    @TableField("JZXH")
    private String jzxh;
    @TableField("JYAQ")
    private String jyaq;
    @TableField("PGJDDM")
    private String pgjddm;
    @TableField("SFHJ")
    private String sfhj;
    @TableField("CSBM")
    private String csbm;
    @TableField("WHJYY")
    private String whjyy;
    @TableField("WHJBMLDYJ")
    private String whjbmldyj;
    @TableField("WHJBMLDXM")
    private String whjbmldxm;
    @TableField("WHJBMLDRQ")
    private String whjbmldrq;
    @TableField("WHJYLDYJ")
    private String whjyldyj;
    @TableField("WHJYLDXM")
    private String whjyldxm;
    @TableField("WHJYLDRQ")
    private String whjyldrq;
    @TableField("SSBQQK")
    private String ssbqqk;
    @TableField("HJMQK")
    private String hjmqk;
    @TableField("SFJDQK")
    private String sfjdqk;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("BEIZ")
    private String beiz;
    @TableField("LCH")
    private String lch;
    @TableField("SLH")
    private String slh;
    @TableField("FYDM")
    private String fydm;
    @TableField("LCJDRID")
    private String lcjdrid;
    @TableField("YSCS")
    private String yscs;
    @TableField("ZT")
    private String zt;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getPgbm() {
        return pgbm;
    }

    public void setPgbm(String pgbm) {
        this.pgbm = pgbm;
    }

    public String getPgjd() {
        return pgjd;
    }

    public void setPgjd(String pgjd) {
        this.pgjd = pgjd;
    }

    public String getAjzt() {
        return ajzt;
    }

    public void setAjzt(String ajzt) {
        this.ajzt = ajzt;
    }

    public Integer getFxdj() {
        return fxdj;
    }

    public void setFxdj(Integer fxdj) {
        this.fxdj = fxdj;
    }

    public String getFxqk() {
        return fxqk;
    }

    public void setFxqk(String fxqk) {
        this.fxqk = fxqk;
    }

    public String getPgms() {
        return pgms;
    }

    public void setPgms(String pgms) {
        this.pgms = pgms;
    }

    public String getYxcs() {
        return yxcs;
    }

    public void setYxcs(String yxcs) {
        this.yxcs = yxcs;
    }

    public String getHxgzjy() {
        return hxgzjy;
    }

    public void setHxgzjy(String hxgzjy) {
        this.hxgzjy = hxgzjy;
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

    public String getDjrdm() {
        return djrdm;
    }

    public void setDjrdm(String djrdm) {
        this.djrdm = djrdm;
    }

    public String getSpzyj() {
        return spzyj;
    }

    public void setSpzyj(String spzyj) {
        this.spzyj = spzyj;
    }

    public String getSpzxm() {
        return spzxm;
    }

    public void setSpzxm(String spzxm) {
        this.spzxm = spzxm;
    }

    public String getSpzrq() {
        return spzrq;
    }

    public void setSpzrq(String spzrq) {
        this.spzrq = spzrq;
    }

    public String getBmldyj() {
        return bmldyj;
    }

    public void setBmldyj(String bmldyj) {
        this.bmldyj = bmldyj;
    }

    public String getBmldxm() {
        return bmldxm;
    }

    public void setBmldxm(String bmldxm) {
        this.bmldxm = bmldxm;
    }

    public String getBmldrq() {
        return bmldrq;
    }

    public void setBmldrq(String bmldrq) {
        this.bmldrq = bmldrq;
    }

    public String getYldyj() {
        return yldyj;
    }

    public void setYldyj(String yldyj) {
        this.yldyj = yldyj;
    }

    public String getYldxm() {
        return yldxm;
    }

    public void setYldxm(String yldxm) {
        this.yldxm = yldxm;
    }

    public String getYldrq() {
        return yldrq;
    }

    public void setYldrq(String yldrq) {
        this.yldrq = yldrq;
    }

    public String getJzxh() {
        return jzxh;
    }

    public void setJzxh(String jzxh) {
        this.jzxh = jzxh;
    }

    public String getJyaq() {
        return jyaq;
    }

    public void setJyaq(String jyaq) {
        this.jyaq = jyaq;
    }

    public String getPgjddm() {
        return pgjddm;
    }

    public void setPgjddm(String pgjddm) {
        this.pgjddm = pgjddm;
    }

    public String getSfhj() {
        return sfhj;
    }

    public void setSfhj(String sfhj) {
        this.sfhj = sfhj;
    }

    public String getCsbm() {
        return csbm;
    }

    public void setCsbm(String csbm) {
        this.csbm = csbm;
    }

    public String getWhjyy() {
        return whjyy;
    }

    public void setWhjyy(String whjyy) {
        this.whjyy = whjyy;
    }

    public String getWhjbmldyj() {
        return whjbmldyj;
    }

    public void setWhjbmldyj(String whjbmldyj) {
        this.whjbmldyj = whjbmldyj;
    }

    public String getWhjbmldxm() {
        return whjbmldxm;
    }

    public void setWhjbmldxm(String whjbmldxm) {
        this.whjbmldxm = whjbmldxm;
    }

    public String getWhjbmldrq() {
        return whjbmldrq;
    }

    public void setWhjbmldrq(String whjbmldrq) {
        this.whjbmldrq = whjbmldrq;
    }

    public String getWhjyldyj() {
        return whjyldyj;
    }

    public void setWhjyldyj(String whjyldyj) {
        this.whjyldyj = whjyldyj;
    }

    public String getWhjyldxm() {
        return whjyldxm;
    }

    public void setWhjyldxm(String whjyldxm) {
        this.whjyldxm = whjyldxm;
    }

    public String getWhjyldrq() {
        return whjyldrq;
    }

    public void setWhjyldrq(String whjyldrq) {
        this.whjyldrq = whjyldrq;
    }

    public String getSsbqqk() {
        return ssbqqk;
    }

    public void setSsbqqk(String ssbqqk) {
        this.ssbqqk = ssbqqk;
    }

    public String getHjmqk() {
        return hjmqk;
    }

    public void setHjmqk(String hjmqk) {
        this.hjmqk = hjmqk;
    }

    public String getSfjdqk() {
        return sfjdqk;
    }

    public void setSfjdqk(String sfjdqk) {
        this.sfjdqk = sfjdqk;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
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

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getLcjdrid() {
        return lcjdrid;
    }

    public void setLcjdrid(String lcjdrid) {
        this.lcjdrid = lcjdrid;
    }

    public String getYscs() {
        return yscs;
    }

    public void setYscs(String yscs) {
        this.yscs = yscs;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }
}
