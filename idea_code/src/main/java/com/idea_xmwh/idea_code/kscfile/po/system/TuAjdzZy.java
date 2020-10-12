package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangz
 * @desc
 * @date 2020/6/22
 */
@TableName("TU_AJDZ_ZY")
public class TuAjdzZy implements Serializable {

    private static final long serialVersionUID = 679327146701307426L;

    @TableField("LSH")
    private String lsh;

    @TableField("FYDM")
    private String fydm;

    @TableField("QSXH")
    private Integer qsxh;

    @TableField("JZXH")
    private Integer jzxh;

    @TableField("NEXTXH")
    private Integer nextxh;

    @TableField("QSAH")
    private String qsah;

    @TableField("JZAH")
    private String jzah;

    @TableField("AHSL")
    private Integer ahsl;

    @TableField("ND")
    private String nd;

    @TableField("AJLX")
    private String ajlx;

    @TableField("SQR")
    private String sqr;

    @TableField("SFCX")
    private String sfcx;

    @TableField("CXR")
    private String cxr;

    @TableField("CXRQ")
    private String cxrq;

    @TableField("BEIZ")
    private String beiz;

    @TableField("DJR")
    private String djr;

    @TableField("DJSJ")
    private String djsj;

    @TableField("LASTUPDATE")
    private Date lastupdate;

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

    public Integer getQsxh() {
        return qsxh;
    }

    public void setQsxh(Integer qsxh) {
        this.qsxh = qsxh;
    }

    public Integer getJzxh() {
        return jzxh;
    }

    public void setJzxh(Integer jzxh) {
        this.jzxh = jzxh;
    }

    public Integer getNextxh() {
        return nextxh;
    }

    public void setNextxh(Integer nextxh) {
        this.nextxh = nextxh;
    }

    public String getQsah() {
        return qsah;
    }

    public void setQsah(String qsah) {
        this.qsah = qsah;
    }

    public String getJzah() {
        return jzah;
    }

    public void setJzah(String jzah) {
        this.jzah = jzah;
    }

    public Integer getAhsl() {
        return ahsl;
    }

    public void setAhsl(Integer ahsl) {
        this.ahsl = ahsl;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getSfcx() {
        return sfcx;
    }

    public void setSfcx(String sfcx) {
        this.sfcx = sfcx;
    }

    public String getCxr() {
        return cxr;
    }

    public void setCxr(String cxr) {
        this.cxr = cxr;
    }

    public String getCxrq() {
        return cxrq;
    }

    public void setCxrq(String cxrq) {
        this.cxrq = cxrq;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public String getDjsj() {
        return djsj;
    }

    public void setDjsj(String djsj) {
        this.djsj = djsj;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
