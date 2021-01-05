package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EfTzed
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/29 8:39   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("EF_TZCD")
public class EfTzcd {

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String	ahdm;

    @TableId(value = "XH")
    private Integer	xh;

    @TableId(value = "JNR")
    private String	jnr;

    @TableId(value = "LX")
    private String	lx;

    @TableId(value = "LB")
    private String	lb;

    @TableId(value = "CDZT")
    private String	cdzt;

    @TableId(value = "PJLSH")
    private String	pjlsh;

    @TableId(value = "SFCP")
    private String	sfcp;

    @TableId(value = "YJJE")
    private Integer	yjje;

    @TableId(value = "CDJE")
    private Integer	cdje;

    @TableId(value = "DJR")
    private String	djr;

    @TableId(value = "DJRQ")
    private Date djrq;

    @TableId(value = "TZDXH")
    private Integer	tzdxh;

    @TableId(value = "JFID")
    private String	jfid;

    @TableId(value = "BZ")
    private String	bz;

    @TableId(value = "FJM")
    private String	fjm;

    @TableId(value = "LASTUPDATE")
    private Date	lastupdate;

    @TableId(value = "JNRXH")
    private String	jnrxh;

    @TableId(value = "SFGTCD")
    private String	sfgtcd;

    @TableId(value = "GTCDDSR")
    private String	gtcddsr;

    @TableId(value = "AH")
    private String	ah;

    @TableId(value = "SLFJE")
    private Integer	slfje;

    @TableId(value = "SQFJE")
    private Integer	sqfje;

    @TableId(value = "QTJE")
    private Integer	qtje;

    @TableId(value = "JSJE")
    private Integer	jsje;

    @TableId(value = "JSRQ")
    private String	jsrq;

    @TableId(value = "CWJS")
    private String	cwjs;

    @TableId(value = "SFZXF")
    private String	sfzxf;

    @TableId(value = "FYDM")
    private String	fydm;

    @TableId(value = "DZFS")
    private String	dzfs;

    @TableId(value = "SFDJ")
    private String	sfdj;

    @TableId(value = "DJFS")
    private String	djfs;

    @TableId(value = "ZXZRFY")
    private Integer	zxzrfy;

    @TableId(value = "FMZRFY")
    private Integer	fmzrfy;

    @TableId(value = "JBR")
    private String	jbr;

    @TableId(value = "BDJE")
    private Integer	bdje;

    @TableId(value = "JFRS")
    private Integer	jfrs;

    @TableId(value = "SLBZ")
    private String	slbz;

    @TableId(value = "YJJS")
    private String	yjjs;

    @TableId(value = "RCBK")
    private String	rcbk;

    @TableId(value = "RCMC")
    private String	rcmc;

    @TableId(value = "RCKHH")
    private String	rckhh;

    @TableId(value = "RCZH")
    private String	rczh;

    @TableId(value = "SKSFYDM")
    private String	sksfydm;

    @TableId(value = "SFBJ")
    private String	sfbj;

    @TableId(value = "URID")
    private String	urid;

    @TableId(value = "SFZF")
    private String	sfzf;

    @TableId(value = "TKPK")
    private String	tkpk;

    @TableId(value = "JBBM")
    private String	jbbm;

    @TableId(value = "EFCWSZPK")
    private String	efcwszpk;

    @TableId(value = "BZJJE")
    private Integer	bzjje;

    @TableId(value = "ZKJE")
    private Integer	zkje;

    @TableId(value = "ZXKJE")
    private Integer	zxkje;

    @TableId(value = "YPJLSH")
    private String	ypjlsh;

    @TableId(value = "QRSXH")
    private String	qrsxh;

    @TableId(value = "JFJZRQ")
    private String	jfjzrq;

    @TableId(value = "SFYJN")
    private String	sfyjn;

    @TableId(value = "ACCOUNTSPK")
    private String	accountspk;

    @TableId(value = "JNQX")
    private Integer	jnqx;

    @TableId(value = "SSFLX")
    private String	ssflx;

    @TableId(value = "SSFZFDX")
    private String	ssfzfdx;

    @TableId(value = "ROWUUID")
    private String	rowuuid;

    @TableId(value = "IS_DELETED")
    private Integer	is_deleted;


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

    public String getJnr() {
        return jnr;
    }

    public void setJnr(String jnr) {
        this.jnr = jnr;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getCdzt() {
        return cdzt;
    }

    public void setCdzt(String cdzt) {
        this.cdzt = cdzt;
    }

    public String getPjlsh() {
        return pjlsh;
    }

    public void setPjlsh(String pjlsh) {
        this.pjlsh = pjlsh;
    }

    public String getSfcp() {
        return sfcp;
    }

    public void setSfcp(String sfcp) {
        this.sfcp = sfcp;
    }

    public Integer getYjje() {
        return yjje;
    }

    public void setYjje(Integer yjje) {
        this.yjje = yjje;
    }

    public Integer getCdje() {
        return cdje;
    }

    public void setCdje(Integer cdje) {
        this.cdje = cdje;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public Date getDjrq() {
        return djrq;
    }

    public void setDjrq(Date djrq) {
        this.djrq = djrq;
    }

    public Integer getTzdxh() {
        return tzdxh;
    }

    public void setTzdxh(Integer tzdxh) {
        this.tzdxh = tzdxh;
    }

    public String getJfid() {
        return jfid;
    }

    public void setJfid(String jfid) {
        this.jfid = jfid;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getFjm() {
        return fjm;
    }

    public void setFjm(String fjm) {
        this.fjm = fjm;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getJnrxh() {
        return jnrxh;
    }

    public void setJnrxh(String jnrxh) {
        this.jnrxh = jnrxh;
    }

    public String getSfgtcd() {
        return sfgtcd;
    }

    public void setSfgtcd(String sfgtcd) {
        this.sfgtcd = sfgtcd;
    }

    public String getGtcddsr() {
        return gtcddsr;
    }

    public void setGtcddsr(String gtcddsr) {
        this.gtcddsr = gtcddsr;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public Integer getSlfje() {
        return slfje;
    }

    public void setSlfje(Integer slfje) {
        this.slfje = slfje;
    }

    public Integer getSqfje() {
        return sqfje;
    }

    public void setSqfje(Integer sqfje) {
        this.sqfje = sqfje;
    }

    public Integer getQtje() {
        return qtje;
    }

    public void setQtje(Integer qtje) {
        this.qtje = qtje;
    }

    public Integer getJsje() {
        return jsje;
    }

    public void setJsje(Integer jsje) {
        this.jsje = jsje;
    }

    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    public String getCwjs() {
        return cwjs;
    }

    public void setCwjs(String cwjs) {
        this.cwjs = cwjs;
    }

    public String getSfzxf() {
        return sfzxf;
    }

    public void setSfzxf(String sfzxf) {
        this.sfzxf = sfzxf;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getDzfs() {
        return dzfs;
    }

    public void setDzfs(String dzfs) {
        this.dzfs = dzfs;
    }

    public String getSfdj() {
        return sfdj;
    }

    public void setSfdj(String sfdj) {
        this.sfdj = sfdj;
    }

    public String getDjfs() {
        return djfs;
    }

    public void setDjfs(String djfs) {
        this.djfs = djfs;
    }

    public Integer getZxzrfy() {
        return zxzrfy;
    }

    public void setZxzrfy(Integer zxzrfy) {
        this.zxzrfy = zxzrfy;
    }

    public Integer getFmzrfy() {
        return fmzrfy;
    }

    public void setFmzrfy(Integer fmzrfy) {
        this.fmzrfy = fmzrfy;
    }

    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    public Integer getBdje() {
        return bdje;
    }

    public void setBdje(Integer bdje) {
        this.bdje = bdje;
    }

    public Integer getJfrs() {
        return jfrs;
    }

    public void setJfrs(Integer jfrs) {
        this.jfrs = jfrs;
    }

    public String getSlbz() {
        return slbz;
    }

    public void setSlbz(String slbz) {
        this.slbz = slbz;
    }

    public String getYjjs() {
        return yjjs;
    }

    public void setYjjs(String yjjs) {
        this.yjjs = yjjs;
    }

    public String getRcbk() {
        return rcbk;
    }

    public void setRcbk(String rcbk) {
        this.rcbk = rcbk;
    }

    public String getRcmc() {
        return rcmc;
    }

    public void setRcmc(String rcmc) {
        this.rcmc = rcmc;
    }

    public String getRckhh() {
        return rckhh;
    }

    public void setRckhh(String rckhh) {
        this.rckhh = rckhh;
    }

    public String getRczh() {
        return rczh;
    }

    public void setRczh(String rczh) {
        this.rczh = rczh;
    }

    public String getSksfydm() {
        return sksfydm;
    }

    public void setSksfydm(String sksfydm) {
        this.sksfydm = sksfydm;
    }

    public String getSfbj() {
        return sfbj;
    }

    public void setSfbj(String sfbj) {
        this.sfbj = sfbj;
    }

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getSfzf() {
        return sfzf;
    }

    public void setSfzf(String sfzf) {
        this.sfzf = sfzf;
    }

    public String getTkpk() {
        return tkpk;
    }

    public void setTkpk(String tkpk) {
        this.tkpk = tkpk;
    }

    public String getJbbm() {
        return jbbm;
    }

    public void setJbbm(String jbbm) {
        this.jbbm = jbbm;
    }

    public String getEfcwszpk() {
        return efcwszpk;
    }

    public void setEfcwszpk(String efcwszpk) {
        this.efcwszpk = efcwszpk;
    }

    public Integer getBzjje() {
        return bzjje;
    }

    public void setBzjje(Integer bzjje) {
        this.bzjje = bzjje;
    }

    public Integer getZkje() {
        return zkje;
    }

    public void setZkje(Integer zkje) {
        this.zkje = zkje;
    }

    public Integer getZxkje() {
        return zxkje;
    }

    public void setZxkje(Integer zxkje) {
        this.zxkje = zxkje;
    }

    public String getYpjlsh() {
        return ypjlsh;
    }

    public void setYpjlsh(String ypjlsh) {
        this.ypjlsh = ypjlsh;
    }

    public String getQrsxh() {
        return qrsxh;
    }

    public void setQrsxh(String qrsxh) {
        this.qrsxh = qrsxh;
    }

    public String getJfjzrq() {
        return jfjzrq;
    }

    public void setJfjzrq(String jfjzrq) {
        this.jfjzrq = jfjzrq;
    }

    public String getSfyjn() {
        return sfyjn;
    }

    public void setSfyjn(String sfyjn) {
        this.sfyjn = sfyjn;
    }

    public String getAccountspk() {
        return accountspk;
    }

    public void setAccountspk(String accountspk) {
        this.accountspk = accountspk;
    }

    public Integer getJnqx() {
        return jnqx;
    }

    public void setJnqx(Integer jnqx) {
        this.jnqx = jnqx;
    }

    public String getSsflx() {
        return ssflx;
    }

    public void setSsflx(String ssflx) {
        this.ssflx = ssflx;
    }

    public String getSsfzfdx() {
        return ssfzfdx;
    }

    public void setSsfzfdx(String ssfzfdx) {
        this.ssfzfdx = ssfzfdx;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }
}
