package com.tdh.light.spxt.bp.po.system;

/**
 * Description:
 * Project Name:spxt
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.system
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p/>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/17 15       cq     1.0        1.0 Version
 **/

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author cq
 * @since 2019-10-17
 */
@TableName("TU_YHSZ")
public class TuYhsz  implements  Serializable{

    private static final long serialVersionUID = 1L;

    @TableId("YHDM")
    private String yhdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("QSAJFW")
    private String qsajfw;
    @TableField("BQSFXS")
    private String bqsfxs;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("JATHTS")
    private String jathts;
    @TableField("QYTX")
    private String qytx;
    @TableField("SDCLWS")
    private String sdclws;
    @TableField("WSSQYDSJ")
    private Date wssqydsj;
    @TableField("CYWS1")
    private String cyws1;
    @TableField("CYWS2")
    private String cyws2;
    @TableField("CYWS3")
    private String cyws3;
    @TableField("ZDDWGLAJ")
    private String zddwglaj;
    @TableField("CKH")
    private String ckh;
    @TableField("SPXZ")
    private String spxz;
    @TableField("CYDZ")
    private String cydz;
    @TableField("SFYCJZ")
    private String sfycjz;
    @TableField("BLYCBQ")
    private String blycbq;
    @TableField("MYCYLC")
    private String mycylc;
    @TableField("CYSJ")
    private String cysj;
    @TableField("CYFT")
    private String cyft;
    @TableField("KTRQSZ")
    private String ktrqsz;
    @TableField("MRBQ")
    private String mrbq;
    @TableField("QSJS")
    private String qsjs;
    @TableField("MRPX")
    private String mrpx;
    @TableField("QSAJSL")
    private Integer qsajsl;
    @TableField("AJLBXZ")
    private String ajlbxz;
    @TableField("XZTS")
    private String xzts;
    @TableField("TXFBL")
    private String txfbl;
    @TableField("DSMSZ")
    private String dsmsz;
    @TableField("SCMS")
    private String scms;
    @TableField("SFQCKBY")
    private String sfqckby;
    @TableField("MRSMY")
    private String mrsmy;
    @TableField("SAYMSZ")
    private String saymsz;


    public String getYhdm() {
        return yhdm;
    }

    public void setYhdm(String yhdm) {
        this.yhdm = yhdm;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getQsajfw() {
        return qsajfw;
    }

    public void setQsajfw(String qsajfw) {
        this.qsajfw = qsajfw;
    }

    public String getBqsfxs() {
        return bqsfxs;
    }

    public void setBqsfxs(String bqsfxs) {
        this.bqsfxs = bqsfxs;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getJathts() {
        return jathts;
    }

    public void setJathts(String jathts) {
        this.jathts = jathts;
    }

    public String getQytx() {
        return qytx;
    }

    public void setQytx(String qytx) {
        this.qytx = qytx;
    }

    public String getSdclws() {
        return sdclws;
    }

    public void setSdclws(String sdclws) {
        this.sdclws = sdclws;
    }

    public Date getWssqydsj() {
        return wssqydsj;
    }

    public void setWssqydsj(Date wssqydsj) {
        this.wssqydsj = wssqydsj;
    }

    public String getCyws1() {
        return cyws1;
    }

    public void setCyws1(String cyws1) {
        this.cyws1 = cyws1;
    }

    public String getCyws2() {
        return cyws2;
    }

    public void setCyws2(String cyws2) {
        this.cyws2 = cyws2;
    }

    public String getCyws3() {
        return cyws3;
    }

    public void setCyws3(String cyws3) {
        this.cyws3 = cyws3;
    }

    public String getZddwglaj() {
        return zddwglaj;
    }

    public void setZddwglaj(String zddwglaj) {
        this.zddwglaj = zddwglaj;
    }

    public String getCkh() {
        return ckh;
    }

    public void setCkh(String ckh) {
        this.ckh = ckh;
    }

    public String getSpxz() {
        return spxz;
    }

    public void setSpxz(String spxz) {
        this.spxz = spxz;
    }

    public String getCydz() {
        return cydz;
    }

    public void setCydz(String cydz) {
        this.cydz = cydz;
    }

    public String getSfycjz() {
        return sfycjz;
    }

    public void setSfycjz(String sfycjz) {
        this.sfycjz = sfycjz;
    }

    public String getBlycbq() {
        return blycbq;
    }

    public void setBlycbq(String blycbq) {
        this.blycbq = blycbq;
    }

    public String getMycylc() {
        return mycylc;
    }

    public void setMycylc(String mycylc) {
        this.mycylc = mycylc;
    }

    public String getCysj() {
        return cysj;
    }

    public void setCysj(String cysj) {
        this.cysj = cysj;
    }

    public String getCyft() {
        return cyft;
    }

    public void setCyft(String cyft) {
        this.cyft = cyft;
    }

    public String getKtrqsz() {
        return ktrqsz;
    }

    public void setKtrqsz(String ktrqsz) {
        this.ktrqsz = ktrqsz;
    }

    public String getMrbq() {
        return mrbq;
    }

    public void setMrbq(String mrbq) {
        this.mrbq = mrbq;
    }

    public String getQsjs() {
        return qsjs;
    }

    public void setQsjs(String qsjs) {
        this.qsjs = qsjs;
    }

    public String getMrpx() {
        return mrpx;
    }

    public void setMrpx(String mrpx) {
        this.mrpx = mrpx;
    }

    public Integer getQsajsl() {
        return qsajsl;
    }

    public void setQsajsl(Integer qsajsl) {
        this.qsajsl = qsajsl;
    }

    public String getAjlbxz() {
        return ajlbxz;
    }

    public void setAjlbxz(String ajlbxz) {
        this.ajlbxz = ajlbxz;
    }

    public String getXzts() {
        return xzts;
    }

    public void setXzts(String xzts) {
        this.xzts = xzts;
    }

    public String getTxfbl() {
        return txfbl;
    }

    public void setTxfbl(String txfbl) {
        this.txfbl = txfbl;
    }

    public String getDsmsz() {
        return dsmsz;
    }

    public void setDsmsz(String dsmsz) {
        this.dsmsz = dsmsz;
    }

    public String getScms() {
        return scms;
    }

    public void setScms(String scms) {
        this.scms = scms;
    }

    public String getSfqckby() {
        return sfqckby;
    }

    public void setSfqckby(String sfqckby) {
        this.sfqckby = sfqckby;
    }

    public String getMrsmy() {
        return mrsmy;
    }

    public void setMrsmy(String mrsmy) {
        this.mrsmy = mrsmy;
    }

    public String getSaymsz() {
        return saymsz;
    }

    public void setSaymsz(String saymsz) {
        this.saymsz = saymsz;
    }


    @Override
    public String toString() {
        return "TuYhsz{" +
                "yhdm=" + yhdm +
                ", fydm=" + fydm +
                ", qsajfw=" + qsajfw +
                ", bqsfxs=" + bqsfxs +
                ", lastupdate=" + lastupdate +
                ", jathts=" + jathts +
                ", qytx=" + qytx +
                ", sdclws=" + sdclws +
                ", wssqydsj=" + wssqydsj +
                ", cyws1=" + cyws1 +
                ", cyws2=" + cyws2 +
                ", cyws3=" + cyws3 +
                ", zddwglaj=" + zddwglaj +
                ", ckh=" + ckh +
                ", spxz=" + spxz +
                ", cydz=" + cydz +
                ", sfycjz=" + sfycjz +
                ", blycbq=" + blycbq +
                ", mycylc=" + mycylc +
                ", cysj=" + cysj +
                ", cyft=" + cyft +
                ", ktrqsz=" + ktrqsz +
                ", mrbq=" + mrbq +
                ", qsjs=" + qsjs +
                ", mrpx=" + mrpx +
                ", qsajsl=" + qsajsl +
                ", ajlbxz=" + ajlbxz +
                ", xzts=" + xzts +
                ", txfbl=" + txfbl +
                ", dsmsz=" + dsmsz +
                ", scms=" + scms +
                ", sfqckby=" + sfqckby +
                ", mrsmy=" + mrsmy +
                ", saymsz=" + saymsz +
                "}";
    }
}