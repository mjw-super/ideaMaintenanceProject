package com.idea_xmwh.idea_code.kscfile.po.wsla;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description: 网上立案实体
 * Project Name:spxt
 * File Name:WslaAj
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/18 10:57   xiongsc         1.0       1.0 Version
 **/
@TableName("WSLA_AJ")
public class WslaAj {

    @TableId(value = "LSH",type = IdType.INPUT)
    private String	lsh;
    @TableField("WSLAID")
    private String	wslaid;
    @TableField("FYDM")
    private String	fydm;
    @TableField("SAAY")
    private Integer	saay;
    @TableField("AYMC")
    private String	aymc;
    @TableField("AJLXDM")
    private Integer	ajlxdm;
    @TableField("BDJE")
    private Double	bdje;
    @TableField("AJSLF")
    private Double	ajslf;
    @TableField("DSR")
    private String	dsr;
    @TableField("SFLA")
    private String	sfla;
    @TableField("SSQQ")
    private String	ssqq;
    @TableField("GXYJ")
    private String	gxyj;
    @TableField("SYCX")
    private String	sycx;
    @TableField("DYSJ")
    private String	dysj;
    @TableField("SATJ")
    private String	satj;
    @TableField("AJLY")
    private String	ajly;
    @TableField("SDCLRQ")
    private String	sdclrq;
    @TableField("BEIZ")
    private String	beiz;
    @TableField("LASTUPDATE")
    private Date	lastupdate;
    @TableField("RMFT")
    private String	rmft;
    @TableField("SFXYXZFJ")
    private String	sfxyxzfj;
    @TableField("XLA")
    private Integer	xla;
    @TableField("AH")
    private String	ah;
    @TableField("ND")
    private String	nd;
    @TableField("AJZLB")
    private String	ajzlb;
    @TableField("JCJG")
    private String	jcjg;
    @TableField("GSSR")
    private String	gssr;
    @TableField("GSRDH")
    private String	gsrdh;
    @TableField("GSSBH")
    private String	gssbh;
    @TableField("ZXYJZW")
    private String	zxyjzw;
    @TableField("JYSYJYCX")
    private String	jysyjycx;
    @TableField("SFXZCG")
    private String	sfxzcg;
    @TableField("TASKID")
    private String	taskid;
    @TableField("WSLAGLID")
    private String	wslaglid;
    @TableField("JCJGDM")
    private String	jcjgdm;
    @TableField("XTBH")
    private String	xtbh;
    @TableField("SFYCL")
    private String	sfycl;
    @TableField("GSR")
    private String	gsr;
    @TableField("SFKS")
    private String	sfks;
    @TableField("SQFY")
    private String	sqfy;
    @TableField("SQFGMC")
    private String	sqfgmc;
    @TableField("SQRMC")
    private String	sqrmc;
    @TableField("AHDM")
    private String	ahdm;
    @TableField("SCRQ")
    private String	scrq;
    @TableField("SCR")
    private String	scr;
    @TableField("THYJSM")
    private String	thyjsm;
    @TableField("SDAJTJ")
    private String	sdajtj;
    @TableField("HZR")
    private String	hzr;
    @TableField("HZRQ")
    private String	hzrq;
    @TableField("HZZT")
    private String	hzzt;
    @TableField("TQSSLY")
    private String	tqssly;
    @TableField("XZXWZL")
    private String	xzxwzl;
    @TableField("XZFYAH")
    private String	xzfyah;
    @TableField("SSXZ")
    private String	ssxz;
    @TableField("QQPCLX")
    private String	qqpclx;
    @TableField("QQPCDX")
    private String	qqpcdx;
    @TableField("SQPCSY")
    private String	sqpcsy;
    @TableField("FSQJ")
    private String	fsqj;
    @TableField("BDWLX")
    private String	bdwlx;
    @TableField("HSQQBQSQSX")
    private String	hsqqbqsqsx;
    @TableField("SQKYHSQQLX")
    private String	sqkyhsqqlx;
    @TableField("SQPCFS")
    private String	sqpcfs;
    @TableField("SPAJAH")
    private String	spajah;
    @TableField("PCJWJG")
    private String	pcjwjg;
    @TableField("QTPCYWJG")
    private String	qtpcywjg;
    @TableField("FYJG")
    private String	fyjg;
    @TableField("YPCSQRQ")
    private String	ypcsqrq;
    @TableField("YPCYWJG")
    private String	ypcywjg;
    @TableField("PCYWJGYJD")
    private String	pcywjgyjd;
    @TableField("PCYWJGYJDRQ")
    private String	pcywjgyjdrq;
    @TableField("SQLX")
    private String	sqlx;
    @TableField("CPDW")
    private String	cpdw;
    @TableField("SAAH")
    private String	saah;
    @TableField("CFSS")
    private String	cfss;
    @TableField("SQCS")
    private Integer	sqcs;
    @TableField("ZCSQZSQX")
    private String	zcsqzsqx;
    @TableField("SQZSQX")
    private String	sqzsqx;
    @TableField("XZZTLX")
    private String	xzztlx;
    @TableField("AJSJ")
    private String	ajsj;
    @TableField("FSSCLX")
    private String	fssclx;
    @TableField("FLWSWH")
    private String	flwswh;
    @TableField("DBZQSE")
    private Double	dbzqse;
    @TableField("SFZZP")
    private String	sfzzp;
    @TableField("SFWSAJ")
    private String	sfwsaj;
    @TableField("TCFY")
    private String	tcfy;
    @TableField("TYPCSQZT")
    private String	typcsqzt;
    @TableField("LAFS")
    private String	lafs;
    @TableField("SFTYSQTJ")
    private String	sftysqtj;
    @TableField("SQTJAH")
    private String	sqtjah;
    @TableField("LSMC")
    private String	lsmc;
    @TableField("LSDH")
    private String	lsdh;
    @TableField("LSZYZGZH")
    private String	lszyzgzh;
    @TableField("PCFT")
    private String	pcft;
    @TableField("AJMC")
    private String	ajmc;
    @TableField("YSFY")
    private String	ysfy;
    @TableField("YSSJ")
    private String	yssj;
    @TableField("YSAH")
    private String	ysah;
    @TableField("ZSSQR")
    private String	zssqr;
    @TableField("WSLALSH")
    private String	wslalsh;
    @TableField("FWLSH")
    private String	fwlsh;
    @TableField("SARQ")
    private String	sarq;
    @TableField("SAR")
    private String	sar;
    @TableField("ZSLX")
    private String	zslx;
    @TableField("AYMS")
    private String	ayms;
    @TableField("GSJG")
    private String	gsjg;
    @TableField("SDAJCS")
    private Integer	sdajcs;
    @TableField("SJUN")
    private String	sjun;
    @TableField("KXZQH")
    private String	kxzqh;
    @TableField("LXJY")
    private String	lxjy;
    @TableField("BGRTYRZCX")
    private String	bgrtyrzcx;
    @TableField("SQRQ")
    private String	sqrq;
    @TableField("SWCN")
    private String	swcn;
    @TableField("QSSBH")
    private String	qssbh;
    @TableField("JSSP")
    private String	jssp;
    @TableField("KNPCSNYQTX")
    private String	knpcsnyqtx;

    /**
     * 群体纠纷
     */
    @TableField("QTJF")
    private String	qtjf;

    /**
     * 立案调解
     */
    @TableField("LATJ")
    private String	latj;

    /**
     * 主动执行
     */
    @TableField("ZDZX")
    private String	zdzx;

    /**
     * 涉军队停止有偿服务
     */
    @TableField("SJDTZYCFW")
    private String	sjdtzycfw;

    /**
     * 调解协议签订日期
     */
    @TableField("TJXYQDRQ")
    private String	tjxyqdrq;

    /**
     * 申请支付事项
     */
    @TableField("SQZFSX")
    private String	sqzfsx;

    /**
     * 纠纷类型
     */
    @TableField("JFLX")
    private String	jflx;

    /**
     * 调解单位
     */
    @TableField("TJZZ")
    private String	tjzz;

    /**
     * 是否有人民调解员参与调解标志,1：是，2：否
     */
    @TableField("RMTJY")
    private String	rmtjy;

    /**
     * 案件管辖地
     */
    @TableField("AJGXD")
    private String	ajgxd;

    /**
     * 行政不作为种类
     */
    @TableField("XZBZWZL")
    private String xzbzwzl;

    /**
     * 标的行为
     */
    @TableField("BDXW")
    private String bdxw;




    public String getWslalsh() {
        return wslalsh;
    }

    public void setWslalsh(String wslalsh) {
        this.wslalsh = wslalsh;
    }

    public String getFwlsh() {
        return fwlsh;
    }

    public void setFwlsh(String fwlsh) {
        this.fwlsh = fwlsh;
    }

    public String getLafs() {
        return lafs;
    }

    public void setLafs(String lafs) {
        this.lafs = lafs;
    }

    public String getSftysqtj() {
        return sftysqtj;
    }

    public void setSftysqtj(String sftysqtj) {
        this.sftysqtj = sftysqtj;
    }

    public String getSqtjah() {
        return sqtjah;
    }

    public void setSqtjah(String sqtjah) {
        this.sqtjah = sqtjah;
    }

    public String getLsmc() {
        return lsmc;
    }

    public void setLsmc(String lsmc) {
        this.lsmc = lsmc;
    }

    public String getLsdh() {
        return lsdh;
    }

    public void setLsdh(String lsdh) {
        this.lsdh = lsdh;
    }

    public String getLszyzgzh() {
        return lszyzgzh;
    }

    public void setLszyzgzh(String lszyzgzh) {
        this.lszyzgzh = lszyzgzh;
    }

    public String getPcft() {
        return pcft;
    }

    public void setPcft(String pcft) {
        this.pcft = pcft;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    public String getYsfy() {
        return ysfy;
    }

    public void setYsfy(String ysfy) {
        this.ysfy = ysfy;
    }

    public String getYssj() {
        return yssj;
    }

    public void setYssj(String yssj) {
        this.yssj = yssj;
    }

    public String getYsah() {
        return ysah;
    }

    public void setYsah(String ysah) {
        this.ysah = ysah;
    }

    public String getZssqr() {
        return zssqr;
    }

    public void setZssqr(String zssqr) {
        this.zssqr = zssqr;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getWslaid() {
        return wslaid;
    }

    public void setWslaid(String wslaid) {
        this.wslaid = wslaid;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Integer getSaay() {
        return saay;
    }

    public void setSaay(Integer saay) {
        this.saay = saay;
    }

    public String getAymc() {
        return aymc;
    }

    public void setAymc(String aymc) {
        this.aymc = aymc;
    }

    public Integer getAjlxdm() {
        return ajlxdm;
    }

    public void setAjlxdm(Integer ajlxdm) {
        this.ajlxdm = ajlxdm;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public String getSfla() {
        return sfla;
    }

    public void setSfla(String sfla) {
        this.sfla = sfla;
    }

    public String getSsqq() {
        return ssqq;
    }

    public void setSsqq(String ssqq) {
        this.ssqq = ssqq;
    }

    public String getGxyj() {
        return gxyj;
    }

    public void setGxyj(String gxyj) {
        this.gxyj = gxyj;
    }

    public String getSycx() {
        return sycx;
    }

    public void setSycx(String sycx) {
        this.sycx = sycx;
    }

    public String getDysj() {
        return dysj;
    }

    public void setDysj(String dysj) {
        this.dysj = dysj;
    }

    public String getSatj() {
        return satj;
    }

    public void setSatj(String satj) {
        this.satj = satj;
    }

    public String getAjly() {
        return ajly;
    }

    public void setAjly(String ajly) {
        this.ajly = ajly;
    }

    public String getSdclrq() {
        return sdclrq;
    }

    public void setSdclrq(String sdclrq) {
        this.sdclrq = sdclrq;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getRmft() {
        return rmft;
    }

    public void setRmft(String rmft) {
        this.rmft = rmft;
    }

    public String getSfxyxzfj() {
        return sfxyxzfj;
    }

    public void setSfxyxzfj(String sfxyxzfj) {
        this.sfxyxzfj = sfxyxzfj;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getAjzlb() {
        return ajzlb;
    }

    public void setAjzlb(String ajzlb) {
        this.ajzlb = ajzlb;
    }

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg;
    }

    public String getGssr() {
        return gssr;
    }

    public void setGssr(String gssr) {
        this.gssr = gssr;
    }

    public String getGsrdh() {
        return gsrdh;
    }

    public void setGsrdh(String gsrdh) {
        this.gsrdh = gsrdh;
    }

    public String getGssbh() {
        return gssbh;
    }

    public void setGssbh(String gssbh) {
        this.gssbh = gssbh;
    }

    public String getZxyjzw() {
        return zxyjzw;
    }

    public void setZxyjzw(String zxyjzw) {
        this.zxyjzw = zxyjzw;
    }

    public String getJysyjycx() {
        return jysyjycx;
    }

    public void setJysyjycx(String jysyjycx) {
        this.jysyjycx = jysyjycx;
    }

    public String getSfxzcg() {
        return sfxzcg;
    }

    public void setSfxzcg(String sfxzcg) {
        this.sfxzcg = sfxzcg;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getWslaglid() {
        return wslaglid;
    }

    public void setWslaglid(String wslaglid) {
        this.wslaglid = wslaglid;
    }

    public String getJcjgdm() {
        return jcjgdm;
    }

    public void setJcjgdm(String jcjgdm) {
        this.jcjgdm = jcjgdm;
    }

    public String getXtbh() {
        return xtbh;
    }

    public void setXtbh(String xtbh) {
        this.xtbh = xtbh;
    }

    public String getSfycl() {
        return sfycl;
    }

    public void setSfycl(String sfycl) {
        this.sfycl = sfycl;
    }

    public String getGsr() {
        return gsr;
    }

    public void setGsr(String gsr) {
        this.gsr = gsr;
    }

    public String getSfks() {
        return sfks;
    }

    public void setSfks(String sfks) {
        this.sfks = sfks;
    }

    public String getSqfy() {
        return sqfy;
    }

    public void setSqfy(String sqfy) {
        this.sqfy = sqfy;
    }

    public String getSqfgmc() {
        return sqfgmc;
    }

    public void setSqfgmc(String sqfgmc) {
        this.sqfgmc = sqfgmc;
    }

    public String getSqrmc() {
        return sqrmc;
    }

    public void setSqrmc(String sqrmc) {
        this.sqrmc = sqrmc;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getScrq() {
        return scrq;
    }

    public void setScrq(String scrq) {
        this.scrq = scrq;
    }

    public String getScr() {
        return scr;
    }

    public void setScr(String scr) {
        this.scr = scr;
    }

    public String getThyjsm() {
        return thyjsm;
    }

    public void setThyjsm(String thyjsm) {
        this.thyjsm = thyjsm;
    }

    public String getSdajtj() {
        return sdajtj;
    }

    public void setSdajtj(String sdajtj) {
        this.sdajtj = sdajtj;
    }

    public String getHzr() {
        return hzr;
    }

    public void setHzr(String hzr) {
        this.hzr = hzr;
    }

    public String getHzrq() {
        return hzrq;
    }

    public void setHzrq(String hzrq) {
        this.hzrq = hzrq;
    }

    public String getHzzt() {
        return hzzt;
    }

    public void setHzzt(String hzzt) {
        this.hzzt = hzzt;
    }

    public String getTqssly() {
        return tqssly;
    }

    public void setTqssly(String tqssly) {
        this.tqssly = tqssly;
    }

    public String getXzxwzl() {
        return xzxwzl;
    }

    public void setXzxwzl(String xzxwzl) {
        this.xzxwzl = xzxwzl;
    }

    public String getXzfyah() {
        return xzfyah;
    }

    public void setXzfyah(String xzfyah) {
        this.xzfyah = xzfyah;
    }

    public String getSsxz() {
        return ssxz;
    }

    public void setSsxz(String ssxz) {
        this.ssxz = ssxz;
    }

    public String getQqpclx() {
        return qqpclx;
    }

    public void setQqpclx(String qqpclx) {
        this.qqpclx = qqpclx;
    }

    public String getQqpcdx() {
        return qqpcdx;
    }

    public void setQqpcdx(String qqpcdx) {
        this.qqpcdx = qqpcdx;
    }

    public String getSqpcsy() {
        return sqpcsy;
    }

    public void setSqpcsy(String sqpcsy) {
        this.sqpcsy = sqpcsy;
    }

    public String getFsqj() {
        return fsqj;
    }

    public void setFsqj(String fsqj) {
        this.fsqj = fsqj;
    }

    public String getBdwlx() {
        return bdwlx;
    }

    public void setBdwlx(String bdwlx) {
        this.bdwlx = bdwlx;
    }

    public String getHsqqbqsqsx() {
        return hsqqbqsqsx;
    }

    public void setHsqqbqsqsx(String hsqqbqsqsx) {
        this.hsqqbqsqsx = hsqqbqsqsx;
    }

    public String getSqkyhsqqlx() {
        return sqkyhsqqlx;
    }

    public void setSqkyhsqqlx(String sqkyhsqqlx) {
        this.sqkyhsqqlx = sqkyhsqqlx;
    }

    public String getSqpcfs() {
        return sqpcfs;
    }

    public void setSqpcfs(String sqpcfs) {
        this.sqpcfs = sqpcfs;
    }

    public String getSpajah() {
        return spajah;
    }

    public void setSpajah(String spajah) {
        this.spajah = spajah;
    }

    public String getPcjwjg() {
        return pcjwjg;
    }

    public void setPcjwjg(String pcjwjg) {
        this.pcjwjg = pcjwjg;
    }

    public String getQtpcywjg() {
        return qtpcywjg;
    }

    public void setQtpcywjg(String qtpcywjg) {
        this.qtpcywjg = qtpcywjg;
    }

    public String getFyjg() {
        return fyjg;
    }

    public void setFyjg(String fyjg) {
        this.fyjg = fyjg;
    }

    public String getYpcsqrq() {
        return ypcsqrq;
    }

    public void setYpcsqrq(String ypcsqrq) {
        this.ypcsqrq = ypcsqrq;
    }

    public String getYpcywjg() {
        return ypcywjg;
    }

    public void setYpcywjg(String ypcywjg) {
        this.ypcywjg = ypcywjg;
    }

    public String getPcywjgyjd() {
        return pcywjgyjd;
    }

    public void setPcywjgyjd(String pcywjgyjd) {
        this.pcywjgyjd = pcywjgyjd;
    }

    public String getPcywjgyjdrq() {
        return pcywjgyjdrq;
    }

    public void setPcywjgyjdrq(String pcywjgyjdrq) {
        this.pcywjgyjdrq = pcywjgyjdrq;
    }

    public String getSqlx() {
        return sqlx;
    }

    public void setSqlx(String sqlx) {
        this.sqlx = sqlx;
    }

    public String getCpdw() {
        return cpdw;
    }

    public void setCpdw(String cpdw) {
        this.cpdw = cpdw;
    }

    public String getSaah() {
        return saah;
    }

    public void setSaah(String saah) {
        this.saah = saah;
    }

    public String getCfss() {
        return cfss;
    }

    public void setCfss(String cfss) {
        this.cfss = cfss;
    }

    public Integer getSqcs() {
        return sqcs;
    }

    public void setSqcs(Integer sqcs) {
        this.sqcs = sqcs;
    }

    public String getZcsqzsqx() {
        return zcsqzsqx;
    }

    public void setZcsqzsqx(String zcsqzsqx) {
        this.zcsqzsqx = zcsqzsqx;
    }

    public String getSqzsqx() {
        return sqzsqx;
    }

    public void setSqzsqx(String sqzsqx) {
        this.sqzsqx = sqzsqx;
    }

    public String getXzztlx() {
        return xzztlx;
    }

    public void setXzztlx(String xzztlx) {
        this.xzztlx = xzztlx;
    }

    public String getAjsj() {
        return ajsj;
    }

    public void setAjsj(String ajsj) {
        this.ajsj = ajsj;
    }

    public String getFssclx() {
        return fssclx;
    }

    public void setFssclx(String fssclx) {
        this.fssclx = fssclx;
    }

    public String getFlwswh() {
        return flwswh;
    }

    public void setFlwswh(String flwswh) {
        this.flwswh = flwswh;
    }

    public String getSfzzp() {
        return sfzzp;
    }

    public void setSfzzp(String sfzzp) {
        this.sfzzp = sfzzp;
    }

    public String getSfwsaj() {
        return sfwsaj;
    }

    public void setSfwsaj(String sfwsaj) {
        this.sfwsaj = sfwsaj;
    }

    public String getTcfy() {
        return tcfy;
    }

    public void setTcfy(String tcfy) {
        this.tcfy = tcfy;
    }

    public String getTypcsqzt() {
        return typcsqzt;
    }

    public void setTypcsqzt(String typcsqzt) {
        this.typcsqzt = typcsqzt;
    }

    public String getSarq() {
        return sarq;
    }

    public void setSarq(String sarq) {
        this.sarq = sarq;
    }

    public String getSar() {
        return sar;
    }

    public void setSar(String sar) {
        this.sar = sar;
    }

    public String getZslx() {
        return zslx;
    }

    public void setZslx(String zslx) {
        this.zslx = zslx;
    }

    public String getAyms() {
        return ayms;
    }

    public void setAyms(String ayms) {
        this.ayms = ayms;
    }

    public Integer getSdajcs() {
        return sdajcs;
    }

    public void setSdajcs(Integer sdajcs) {
        this.sdajcs = sdajcs;
    }

    public String getSjun() {
        return sjun;
    }

    public void setSjun(String sjun) {
        this.sjun = sjun;
    }

    public String getSwcn() {
        return swcn;
    }

    public void setSwcn(String swcn) {
        this.swcn = swcn;
    }

    public String getKxzqh() {
        return kxzqh;
    }

    public void setKxzqh(String kxzqh) {
        this.kxzqh = kxzqh;
    }

    public String getLxjy() {
        return lxjy;
    }

    public void setLxjy(String lxjy) {
        this.lxjy = lxjy;
    }

    public String getBgrtyrzcx() {
        return bgrtyrzcx;
    }

    public void setBgrtyrzcx(String bgrtyrzcx) {
        this.bgrtyrzcx = bgrtyrzcx;
    }

    public String getSqrq() {
        return sqrq;
    }

    public void setSqrq(String sqrq) {
        this.sqrq = sqrq;
    }

    public String getQssbh() {
        return qssbh;
    }

    public void setQssbh(String qssbh) {
        this.qssbh = qssbh;
    }

    public String getKnpcsnyqtx() {
        return knpcsnyqtx;
    }

    public void setKnpcsnyqtx(String knpcsnyqtx) {
        this.knpcsnyqtx = knpcsnyqtx;
    }

    public Double getBdje() {
        return bdje;
    }

    public void setBdje(Double bdje) {
        this.bdje = bdje;
    }

    public Integer getXla() {
        return xla;
    }

    public void setXla(Integer xla) {
        this.xla = xla;
    }

    public String getGsjg() {
        return gsjg;
    }

    public void setGsjg(String gsjg) {
        this.gsjg = gsjg;
    }

    public String getJssp() {
        return jssp;
    }

    public void setJssp(String jssp) {
        this.jssp = jssp;
    }

    public Double getDbzqse() {
        return dbzqse;
    }

    public void setDbzqse(Double dbzqse) {
        this.dbzqse = dbzqse;
    }

    public Double getAjslf() {
        return ajslf;
    }

    public void setAjslf(Double ajslf) {
        this.ajslf = ajslf;
    }

    public String getQtjf() {
        return qtjf;
    }

    public void setQtjf(String qtjf) {
        this.qtjf = qtjf;
    }

    public String getLatj() {
        return latj;
    }

    public void setLatj(String latj) {
        this.latj = latj;
    }

    public String getZdzx() {
        return zdzx;
    }

    public void setZdzx(String zdzx) {
        this.zdzx = zdzx;
    }

    public String getSjdtzycfw() {
        return sjdtzycfw;
    }

    public void setSjdtzycfw(String sjdtzycfw) {
        this.sjdtzycfw = sjdtzycfw;
    }

    public String getTjxyqdrq() {
        return tjxyqdrq;
    }

    public void setTjxyqdrq(String tjxyqdrq) {
        this.tjxyqdrq = tjxyqdrq;
    }

    public String getSqzfsx() {
        return sqzfsx;
    }

    public void setSqzfsx(String sqzfsx) {
        this.sqzfsx = sqzfsx;
    }

    public String getJflx() {
        return jflx;
    }

    public void setJflx(String jflx) {
        this.jflx = jflx;
    }

    public String getTjzz() {
        return tjzz;
    }

    public void setTjzz(String tjzz) {
        this.tjzz = tjzz;
    }

    public String getRmtjy() {
        return rmtjy;
    }

    public void setRmtjy(String rmtjy) {
        this.rmtjy = rmtjy;
    }

    public String getAjgxd() {
        return ajgxd;
    }

    public void setAjgxd(String ajgxd) {
        this.ajgxd = ajgxd;
    }

    public String getXzbzwzl() {
        return xzbzwzl;
    }

    public void setXzbzwzl(String xzbzwzl) {
        this.xzbzwzl = xzbzwzl;
    }

    public String getBdxw() {
        return bdxw;
    }

    public void setBdxw(String bdxw) {
        this.bdxw = bdxw;
    }
}
