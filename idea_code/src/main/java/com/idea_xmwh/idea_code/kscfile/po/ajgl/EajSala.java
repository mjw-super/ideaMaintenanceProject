package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 备注：网上案件保存时，必须将WSLA_AJ.LSH保存进WSLALSH字段
 * 后面操作WSLA_AJ必须根据WSLALSH进行操作
 * @author cq
 * @since 2019-10-12
 */

@TableName("EAJ_SALA")
public class EajSala {

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("SDCLRQ")
    private String sdclrq;
    @TableField("SSXZ")
    private String ssxz;
    @TableField("ZSFS")
    private String zsfs;
    @TableField("BHFY")
    private String bhfy;
    @TableField("YZXFY")
    private String yzxfy;
    @TableField("BDXW")
    private String bdxw;
    @TableField("SSRLX")
    private String ssrlx;
    @TableField("AJSLF")
    private Double ajslf;
    @TableField("JYSYJYCX")
    private String jysyjycx;
    @TableField("SDZL")
    private String sdzl;
    @TableField("SQPCSX")
    private String sqpcsx;
    @TableField("XZGLFW")
    private String xzglfw;
    @TableField("TQXZPC")
    private String tqxzpc;
    @TableField("SSFW")
    private String ssfw;
    @TableField("FSSCLX")
    private String fssclx;
    @TableField("QQPCLX")
    private String qqpclx;
    @TableField("SQSY")
    private String sqsy;
    @TableField("FLWSWH")
    private String flwswh;
    @TableField("ZXYJZW")
    private String zxyjzw;
    @TableField("SCRQ")
    private String scrq;
    @TableField("SCYJ")
    private String scyj;
    @TableField("LASPRQ")
    private String lasprq;
    @TableField("SPYJ")
    private String spyj;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("GSR")
    private String gsr;
    @TableField("JCJG")
    private String jcjg;
    @TableField("BEIZ")
    private String beiz;
    @TableField("SPYJLY")
    private String spyjly;
    @TableField("SCYJLY")
    private String scyjly;
    @TableField("ZDAJ")
    private String zdaj;
    @TableField("SFBQ")
    private String sfbq;
    @TableField("SXAJF")
    private String sxajf;
    @TableField("SQZSQX")
    private String sqzsqx;
    @TableField("ZCSQZSQX")
    private String zcsqzsqx;
    @TableField("AJGXD")
    private String ajgxd;
    @TableField("CFSS")
    private String cfss;
    @TableField("FAR")
    private String far;
    @TableField("FASJ")
    private String fasj;
    @TableField("SQCS")
    private Integer sqcs;
    @TableField("YSCL")
    private String yscl;
    @TableField("AJMM")
    private String ajmm;
    @TableField("YDSP")
    private String ydsp;
    @TableField("TJLB")
    private String tjlb;
    @TableField("BQAH")
    private String bqah;
    @TableField("CZFS")
    private String czfs;
    @TableField("FDMSPC")
    private String fdmspc;
    @TableField("FDMSSSQQ")
    private String fdmsssqq;
    @TableField("KSAJ")
    private String ksaj;
    @TableField("SJUN")
    private String sjun;
    @TableField("SJING")
    private String sjing;
    @TableField("LWJG")
    private String lwjg;
    @TableField("SFQR")
    private String sfqr;
    @TableField("SCSY")
    private String scsy;
    @TableField("SPSY")
    private String spsy;
    @TableField("WBJY")
    private String wbjy;
    @TableField("ZXYJDW")
    private String zxyjdw;
    @TableField("SQR")
    private String sqr;
    @TableField("SSLX")
    private String sslx;
    @TableField("SSQK")
    private String ssqk;
    @TableField("DARQ")
    private String darq;
    @TableField("SNONG")
    private String snong;
    @TableField("GSRLXDH")
    private String gsrlxdh;
    @TableField("SQTJ")
    private String sqtj;
    @TableField("LATJ")
    private String latj;
    @TableField("ZSSHFYF")
    private String zsshfyf;
    @TableField("FK")
    private String fk;
    @TableField("XW")
    private String xw;
    @TableField("YSPCSX")
    private String yspcsx;
    @TableField("XFAJBS")
    private String xfajbs;
    @TableField("YSPCSH")
    private String yspcsh;
    @TableField("SDAJS")
    private Integer sdajs;
    @TableField("HYTBH")
    private Long hytbh;
    @TableField("CLSFQQ")
    private String clsfqq;
    @TableField("BZRQ")
    private String bzrq;
    @TableField("BZCLQD")
    private String bzclqd;
    @TableField("QQPCDX")
    private String qqpcdx;
    @TableField("SQBQLX")
    private String sqbqlx;
    @TableField("AJDF")
    private Double ajdf;
    @TableField("AJDFYY")
    private String ajdfyy;
    @TableField("ZDZX")
    private String zdzx;
    @TableField("TJZX")
    private String tjzx;
    @TableField("LSSQLA")
    private String lssqla;
    @TableField("SFSYCXYY")
    private String sfsycxyy;
    @TableField("SZMQ")
    private String szmq;
    @TableField("LAYJRQ")
    private String layjrq;
    @TableField("SFBYSL")
    private String sfbysl;
    @TableField("YDXE")
    private String ydxe;
    @TableField("SSYH")
    private String ssyh;
    @TableField("FZCD")
    private String fzcd;
    @TableField("GYSS")
    private String gyss;
    @TableField("SHJZY")
    private String shjzy;
    @TableField("SGS")
    private String sgs;
    @TableField("BHLBGSX")
    private String bhlbgsx;
    @TableField("SFFSYDPT")
    private String sffsydpt;
    @TableField("SHMS")
    private String shms;
    @TableField("DA")
    private String da;
    @TableField("YA")
    private String ya;
    @TableField("XLXAJ")
    private String xlxaj;
    @TableField("YNAJ")
    private String ynaj;
    @TableField("JTSSAJ")
    private String jtssaj;
    @TableField("MDJHAJ")
    private String mdjhaj;
    @TableField("BYZDAJ")
    private String byzdaj;
    @TableField("SQJGLX")
    private String sqjglx;
    @TableField("SFZCSQ")
    private String sfzcsq;
    @TableField("AZJYJG")
    private String azjyjg;
    @TableField("AZJYQSRQ")
    private String azjyqsrq;
    @TableField("FSQJ")
    private String fsqj;
    @TableField("YZQSCDY")
    private String yzqscdy;
    @TableField("XZXWZL")
    private String xzxwzl;
    @TableField("ZXYYZS")
    private String zxyyzs;
    @TableField("BHLX")
    private String bhlx;
    @TableField("XFJDR")
    private String xfjdr;
    @TableField("FMQD")
    private String fmqd;
    @TableField("FMQDSJZF")
    private String fmqdsjzf;
    @TableField("SQKYHSQQLX")
    private String sqkyhsqqlx;
    @TableField("GSRDM")
    private String gsrdm;
    @TableField("GXYYLX")
    private String gxyylx;
    @TableField("BQXH")
    private Integer bqxh;
    @TableField("BQCDLX")
    private String bqcdlx;
    @TableField("CPXS")
    private String cpxs;
    @TableField("SCAH")
    private String scah;
    @TableField("ZDMGAJ")
    private String zdmgaj;
    @TableField("BQAJLX")
    private String bqajlx;
    @TableField("SJDTZYCFW")
    private String sjdtzycfw;
    @TableField("SFTA")
    private String sfta;
    @TableField("SFKS")
    private String sfks;
    @TableField("KSQDFS")
    private String ksqdfs;
    @TableField("FAMS")
    private String fams;
    @TableField("SFYSHX")
    private String sfyshx;
    @TableField("SFYSFS")
    private String sfysfs;
    @TableField("SFZDYDGX")
    private String sfzdydgx;
    @TableField("ZJFALSH")
    private String zjfalsh;
    @TableField("FWLSH")
    private String fwlsh;
    @TableField("ZCJG")
    private String zcjg;
    @TableField("THRQ")
    private String thrq;
    @TableField("THSY")
    private String thsy;
    @TableField("LKRQ")
    private String lkrq;
    @TableField("YJRQ")
    private String yjrq;
    @TableField("SXCPSFYZX")
    private String sxcpsfyzx;
    @TableField("AJLYOLD")
    private String ajlyold;
    @TableField("LDZCBS")
    private String ldzcbs;
    @TableField("SSFTXM")
    private String ssftxm;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField("GYSSLX")
    private String gysslx;
    @TableField("GYSSZT")
    private String gysszt;
    @TableField("SFKXZQH")
    private String sfkxzqh;
    @TableField("CDYSBYSY")
    private String cdysbysy;
    @TableField("YAROWUUID")
    private String yarowuuid;
    @TableField("XZBZWZL")
    private String xzbzwzl;
    @TableField("SFSZCD")
    private String sfszcd;
    @TableField("KYLABS")
    private String kylabs;
    @TableField("WSLABS")
    private String wslabs;
    @TableField("HSQQBQSQSX")
    private String hsqqbqsqsx;
    @TableField("XZJGPCJD")
    private String xzjgpcjd;
    @TableField("XZJGPCFS")
    private String xzjgpcfs;
    @TableField("XZJGJDPCSE")
    private Double xzjgjdpcse;
    @TableField("LAYJR")
    private String layjr;
    @TableField("SAAJLX")
    private String saajlx;
    @TableField("CBFY")
    private String cbfy;
    @TableField("MSWFSDCXLX")
    private String mswfsdcxlx;
    @TableField("SWCN")
    private String swcn;
    @TableField("SCJDLX")
    private String scjdlx;
    @TableField("FQBDJE")
    private String fqbdje;
    @TableField("LZQZQS")
    private String lzqzqs;
    @TableField("ZFPTLABS")
    private String zfptlabs;
    @TableField("WSLALY")
    private String wslaly;
    @TableField("XLLABS")
    private String xllabs;
    @TableField("DJLABS")
    private String djlabs;
    @TableField("WSLAXLA")
    private Integer wslaxla;
    @TableField("CBRDF")
    private Double cbrdf;
    @TableField("FDAJDF")
    private Double fdajdf;
    @TableField("SFSQZFBS")
    private String sfsqzfbs;
    @TableField("TZTAJMRQ")
    private String tztajmrq;
    @TableField("BGRSL")
    private Integer bgrsl;
    @TableField("SZZCQSS")
    private String szzcqss;
    @TableField("XLABS")
    private String xlabs;
    @TableField("XSYSSSXZ")
    private String xsysssxz;
    @TableField("KSFW")
    private String ksfw;
    @TableField("SSDXLX")
    private String ssdxlx;
    @TableField("BDW")
    private String bdw;
    @TableField("BDWLX")
    private String bdwlx;
    @TableField("YJSD")
    private String yjsd;
    @TableField("XZGLLY")
    private String xzglly;
    @TableField("SZBQ")
    private String szbq;
    @TableField("FSKYWS")
    private String fskyws;
    @TableField("FYJDM")
    private String fyjdm;
    @TableField("SFJBAJ")
    private String sfjbaj;
    @TableField("SFZZP")
    private String sfzzp;
    @TableField("WSLALSH")
    private String wslalsh;


    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getSdclrq() {
        return sdclrq;
    }

    public void setSdclrq(String sdclrq) {
        this.sdclrq = sdclrq;
    }

    public String getSsxz() {
        return ssxz;
    }

    public void setSsxz(String ssxz) {
        this.ssxz = ssxz;
    }

    public String getZsfs() {
        return zsfs;
    }

    public void setZsfs(String zsfs) {
        this.zsfs = zsfs;
    }

    public String getBhfy() {
        return bhfy;
    }

    public void setBhfy(String bhfy) {
        this.bhfy = bhfy;
    }

    public String getYzxfy() {
        return yzxfy;
    }

    public void setYzxfy(String yzxfy) {
        this.yzxfy = yzxfy;
    }

    public String getBdxw() {
        return bdxw;
    }

    public void setBdxw(String bdxw) {
        this.bdxw = bdxw;
    }

    public String getSsrlx() {
        return ssrlx;
    }

    public void setSsrlx(String ssrlx) {
        this.ssrlx = ssrlx;
    }

    public Double getAjslf() {
        return ajslf;
    }

    public void setAjslf(Double ajslf) {
        this.ajslf = ajslf;
    }

    public String getJysyjycx() {
        return jysyjycx;
    }

    public void setJysyjycx(String jysyjycx) {
        this.jysyjycx = jysyjycx;
    }

    public String getSdzl() {
        return sdzl;
    }

    public void setSdzl(String sdzl) {
        this.sdzl = sdzl;
    }

    public String getSqpcsx() {
        return sqpcsx;
    }

    public void setSqpcsx(String sqpcsx) {
        this.sqpcsx = sqpcsx;
    }

    public String getXzglfw() {
        return xzglfw;
    }

    public void setXzglfw(String xzglfw) {
        this.xzglfw = xzglfw;
    }

    public String getTqxzpc() {
        return tqxzpc;
    }

    public void setTqxzpc(String tqxzpc) {
        this.tqxzpc = tqxzpc;
    }

    public String getSsfw() {
        return ssfw;
    }

    public void setSsfw(String ssfw) {
        this.ssfw = ssfw;
    }

    public String getFssclx() {
        return fssclx;
    }

    public void setFssclx(String fssclx) {
        this.fssclx = fssclx;
    }

    public String getQqpclx() {
        return qqpclx;
    }

    public void setQqpclx(String qqpclx) {
        this.qqpclx = qqpclx;
    }

    public String getSqsy() {
        return sqsy;
    }

    public void setSqsy(String sqsy) {
        this.sqsy = sqsy;
    }

    public String getFlwswh() {
        return flwswh;
    }

    public void setFlwswh(String flwswh) {
        this.flwswh = flwswh;
    }

    public String getZxyjzw() {
        return zxyjzw;
    }

    public void setZxyjzw(String zxyjzw) {
        this.zxyjzw = zxyjzw;
    }

    public String getScrq() {
        return scrq;
    }

    public void setScrq(String scrq) {
        this.scrq = scrq;
    }

    public String getScyj() {
        return scyj;
    }

    public void setScyj(String scyj) {
        this.scyj = scyj;
    }

    public String getLasprq() {
        return lasprq;
    }

    public void setLasprq(String lasprq) {
        this.lasprq = lasprq;
    }

    public String getSpyj() {
        return spyj;
    }

    public void setSpyj(String spyj) {
        this.spyj = spyj;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getGsr() {
        return gsr;
    }

    public void setGsr(String gsr) {
        this.gsr = gsr;
    }

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getSpyjly() {
        return spyjly;
    }

    public void setSpyjly(String spyjly) {
        this.spyjly = spyjly;
    }

    public String getScyjly() {
        return scyjly;
    }

    public void setScyjly(String scyjly) {
        this.scyjly = scyjly;
    }

    public String getZdaj() {
        return zdaj;
    }

    public void setZdaj(String zdaj) {
        this.zdaj = zdaj;
    }

    public String getSfbq() {
        return sfbq;
    }

    public void setSfbq(String sfbq) {
        this.sfbq = sfbq;
    }

    public String getSxajf() {
        return sxajf;
    }

    public void setSxajf(String sxajf) {
        this.sxajf = sxajf;
    }

    public String getSqzsqx() {
        return sqzsqx;
    }

    public void setSqzsqx(String sqzsqx) {
        this.sqzsqx = sqzsqx;
    }

    public String getZcsqzsqx() {
        return zcsqzsqx;
    }

    public void setZcsqzsqx(String zcsqzsqx) {
        this.zcsqzsqx = zcsqzsqx;
    }

    public String getAjgxd() {
        return ajgxd;
    }

    public void setAjgxd(String ajgxd) {
        this.ajgxd = ajgxd;
    }

    public String getCfss() {
        return cfss;
    }

    public void setCfss(String cfss) {
        this.cfss = cfss;
    }

    public String getFar() {
        return far;
    }

    public void setFar(String far) {
        this.far = far;
    }

    public String getFasj() {
        return fasj;
    }

    public void setFasj(String fasj) {
        this.fasj = fasj;
    }

    public String getYscl() {
        return yscl;
    }

    public void setYscl(String yscl) {
        this.yscl = yscl;
    }

    public String getAjmm() {
        return ajmm;
    }

    public void setAjmm(String ajmm) {
        this.ajmm = ajmm;
    }

    public String getYdsp() {
        return ydsp;
    }

    public void setYdsp(String ydsp) {
        this.ydsp = ydsp;
    }

    public String getTjlb() {
        return tjlb;
    }

    public void setTjlb(String tjlb) {
        this.tjlb = tjlb;
    }

    public String getBqah() {
        return bqah;
    }

    public void setBqah(String bqah) {
        this.bqah = bqah;
    }

    public String getCzfs() {
        return czfs;
    }

    public void setCzfs(String czfs) {
        this.czfs = czfs;
    }

    public String getFdmspc() {
        return fdmspc;
    }

    public void setFdmspc(String fdmspc) {
        this.fdmspc = fdmspc;
    }

    public String getFdmsssqq() {
        return fdmsssqq;
    }

    public void setFdmsssqq(String fdmsssqq) {
        this.fdmsssqq = fdmsssqq;
    }

    public String getKsaj() {
        return ksaj;
    }

    public void setKsaj(String ksaj) {
        this.ksaj = ksaj;
    }

    public String getSjun() {
        return sjun;
    }

    public void setSjun(String sjun) {
        this.sjun = sjun;
    }

    public String getSjing() {
        return sjing;
    }

    public void setSjing(String sjing) {
        this.sjing = sjing;
    }

    public String getLwjg() {
        return lwjg;
    }

    public void setLwjg(String lwjg) {
        this.lwjg = lwjg;
    }

    public String getSfqr() {
        return sfqr;
    }

    public void setSfqr(String sfqr) {
        this.sfqr = sfqr;
    }

    public String getScsy() {
        return scsy;
    }

    public void setScsy(String scsy) {
        this.scsy = scsy;
    }

    public String getSpsy() {
        return spsy;
    }

    public void setSpsy(String spsy) {
        this.spsy = spsy;
    }

    public String getWbjy() {
        return wbjy;
    }

    public void setWbjy(String wbjy) {
        this.wbjy = wbjy;
    }

    public String getZxyjdw() {
        return zxyjdw;
    }

    public void setZxyjdw(String zxyjdw) {
        this.zxyjdw = zxyjdw;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getSslx() {
        return sslx;
    }

    public void setSslx(String sslx) {
        this.sslx = sslx;
    }

    public String getSsqk() {
        return ssqk;
    }

    public void setSsqk(String ssqk) {
        this.ssqk = ssqk;
    }

    public String getDarq() {
        return darq;
    }

    public void setDarq(String darq) {
        this.darq = darq;
    }

    public String getSnong() {
        return snong;
    }

    public void setSnong(String snong) {
        this.snong = snong;
    }

    public String getGsrlxdh() {
        return gsrlxdh;
    }

    public void setGsrlxdh(String gsrlxdh) {
        this.gsrlxdh = gsrlxdh;
    }

    public String getSqtj() {
        return sqtj;
    }

    public void setSqtj(String sqtj) {
        this.sqtj = sqtj;
    }

    public String getLatj() {
        return latj;
    }

    public void setLatj(String latj) {
        this.latj = latj;
    }

    public String getZsshfyf() {
        return zsshfyf;
    }

    public void setZsshfyf(String zsshfyf) {
        this.zsshfyf = zsshfyf;
    }

    public String getFk() {
        return fk;
    }

    public void setFk(String fk) {
        this.fk = fk;
    }

    public String getXw() {
        return xw;
    }

    public void setXw(String xw) {
        this.xw = xw;
    }

    public String getYspcsx() {
        return yspcsx;
    }

    public void setYspcsx(String yspcsx) {
        this.yspcsx = yspcsx;
    }

    public String getXfajbs() {
        return xfajbs;
    }

    public void setXfajbs(String xfajbs) {
        this.xfajbs = xfajbs;
    }

    public String getYspcsh() {
        return yspcsh;
    }

    public void setYspcsh(String yspcsh) {
        this.yspcsh = yspcsh;
    }

    public Integer getSqcs() {
        return sqcs;
    }

    public void setSqcs(Integer sqcs) {
        this.sqcs = sqcs;
    }

    public Integer getSdajs() {
        return sdajs;
    }

    public void setSdajs(Integer sdajs) {
        this.sdajs = sdajs;
    }

    public Long getHytbh() {
        return hytbh;
    }

    public void setHytbh(Long hytbh) {
        this.hytbh = hytbh;
    }

    public String getClsfqq() {
        return clsfqq;
    }

    public void setClsfqq(String clsfqq) {
        this.clsfqq = clsfqq;
    }

    public String getBzrq() {
        return bzrq;
    }

    public void setBzrq(String bzrq) {
        this.bzrq = bzrq;
    }

    public String getBzclqd() {
        return bzclqd;
    }

    public void setBzclqd(String bzclqd) {
        this.bzclqd = bzclqd;
    }

    public String getQqpcdx() {
        return qqpcdx;
    }

    public void setQqpcdx(String qqpcdx) {
        this.qqpcdx = qqpcdx;
    }

    public String getSqbqlx() {
        return sqbqlx;
    }

    public void setSqbqlx(String sqbqlx) {
        this.sqbqlx = sqbqlx;
    }

    public Double getAjdf() {
        return ajdf;
    }

    public void setAjdf(Double ajdf) {
        this.ajdf = ajdf;
    }

    public String getAjdfyy() {
        return ajdfyy;
    }

    public void setAjdfyy(String ajdfyy) {
        this.ajdfyy = ajdfyy;
    }

    public String getZdzx() {
        return zdzx;
    }

    public void setZdzx(String zdzx) {
        this.zdzx = zdzx;
    }

    public String getTjzx() {
        return tjzx;
    }

    public void setTjzx(String tjzx) {
        this.tjzx = tjzx;
    }

    public String getLssqla() {
        return lssqla;
    }

    public void setLssqla(String lssqla) {
        this.lssqla = lssqla;
    }

    public String getSfsycxyy() {
        return sfsycxyy;
    }

    public void setSfsycxyy(String sfsycxyy) {
        this.sfsycxyy = sfsycxyy;
    }

    public String getSzmq() {
        return szmq;
    }

    public void setSzmq(String szmq) {
        this.szmq = szmq;
    }

    public String getLayjrq() {
        return layjrq;
    }

    public void setLayjrq(String layjrq) {
        this.layjrq = layjrq;
    }

    public String getSfbysl() {
        return sfbysl;
    }

    public void setSfbysl(String sfbysl) {
        this.sfbysl = sfbysl;
    }

    public String getYdxe() {
        return ydxe;
    }

    public void setYdxe(String ydxe) {
        this.ydxe = ydxe;
    }

    public String getSsyh() {
        return ssyh;
    }

    public void setSsyh(String ssyh) {
        this.ssyh = ssyh;
    }

    public String getFzcd() {
        return fzcd;
    }

    public void setFzcd(String fzcd) {
        this.fzcd = fzcd;
    }

    public String getGyss() {
        return gyss;
    }

    public void setGyss(String gyss) {
        this.gyss = gyss;
    }

    public String getShjzy() {
        return shjzy;
    }

    public void setShjzy(String shjzy) {
        this.shjzy = shjzy;
    }

    public String getSgs() {
        return sgs;
    }

    public void setSgs(String sgs) {
        this.sgs = sgs;
    }

    public String getBhlbgsx() {
        return bhlbgsx;
    }

    public void setBhlbgsx(String bhlbgsx) {
        this.bhlbgsx = bhlbgsx;
    }

    public String getSffsydpt() {
        return sffsydpt;
    }

    public void setSffsydpt(String sffsydpt) {
        this.sffsydpt = sffsydpt;
    }

    public String getShms() {
        return shms;
    }

    public void setShms(String shms) {
        this.shms = shms;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getYa() {
        return ya;
    }

    public void setYa(String ya) {
        this.ya = ya;
    }

    public String getXlxaj() {
        return xlxaj;
    }

    public void setXlxaj(String xlxaj) {
        this.xlxaj = xlxaj;
    }

    public String getYnaj() {
        return ynaj;
    }

    public void setYnaj(String ynaj) {
        this.ynaj = ynaj;
    }

    public String getJtssaj() {
        return jtssaj;
    }

    public void setJtssaj(String jtssaj) {
        this.jtssaj = jtssaj;
    }

    public String getMdjhaj() {
        return mdjhaj;
    }

    public void setMdjhaj(String mdjhaj) {
        this.mdjhaj = mdjhaj;
    }

    public String getByzdaj() {
        return byzdaj;
    }

    public void setByzdaj(String byzdaj) {
        this.byzdaj = byzdaj;
    }

    public String getSqjglx() {
        return sqjglx;
    }

    public void setSqjglx(String sqjglx) {
        this.sqjglx = sqjglx;
    }

    public String getSfzcsq() {
        return sfzcsq;
    }

    public void setSfzcsq(String sfzcsq) {
        this.sfzcsq = sfzcsq;
    }

    public String getAzjyjg() {
        return azjyjg;
    }

    public void setAzjyjg(String azjyjg) {
        this.azjyjg = azjyjg;
    }

    public String getAzjyqsrq() {
        return azjyqsrq;
    }

    public void setAzjyqsrq(String azjyqsrq) {
        this.azjyqsrq = azjyqsrq;
    }

    public String getFsqj() {
        return fsqj;
    }

    public void setFsqj(String fsqj) {
        this.fsqj = fsqj;
    }

    public String getYzqscdy() {
        return yzqscdy;
    }

    public void setYzqscdy(String yzqscdy) {
        this.yzqscdy = yzqscdy;
    }

    public String getXzxwzl() {
        return xzxwzl;
    }

    public void setXzxwzl(String xzxwzl) {
        this.xzxwzl = xzxwzl;
    }

    public String getZxyyzs() {
        return zxyyzs;
    }

    public void setZxyyzs(String zxyyzs) {
        this.zxyyzs = zxyyzs;
    }

    public String getBhlx() {
        return bhlx;
    }

    public void setBhlx(String bhlx) {
        this.bhlx = bhlx;
    }

    public String getXfjdr() {
        return xfjdr;
    }

    public void setXfjdr(String xfjdr) {
        this.xfjdr = xfjdr;
    }

    public String getFmqd() {
        return fmqd;
    }

    public void setFmqd(String fmqd) {
        this.fmqd = fmqd;
    }

    public String getFmqdsjzf() {
        return fmqdsjzf;
    }

    public void setFmqdsjzf(String fmqdsjzf) {
        this.fmqdsjzf = fmqdsjzf;
    }

    public String getSqkyhsqqlx() {
        return sqkyhsqqlx;
    }

    public void setSqkyhsqqlx(String sqkyhsqqlx) {
        this.sqkyhsqqlx = sqkyhsqqlx;
    }

    public String getGsrdm() {
        return gsrdm;
    }

    public void setGsrdm(String gsrdm) {
        this.gsrdm = gsrdm;
    }

    public String getGxyylx() {
        return gxyylx;
    }

    public void setGxyylx(String gxyylx) {
        this.gxyylx = gxyylx;
    }

    public Integer getBqxh() {
        return bqxh;
    }

    public void setBqxh(Integer bqxh) {
        this.bqxh = bqxh;
    }

    public String getBqcdlx() {
        return bqcdlx;
    }

    public void setBqcdlx(String bqcdlx) {
        this.bqcdlx = bqcdlx;
    }

    public String getCpxs() {
        return cpxs;
    }

    public void setCpxs(String cpxs) {
        this.cpxs = cpxs;
    }

    public String getScah() {
        return scah;
    }

    public void setScah(String scah) {
        this.scah = scah;
    }

    public String getZdmgaj() {
        return zdmgaj;
    }

    public void setZdmgaj(String zdmgaj) {
        this.zdmgaj = zdmgaj;
    }

    public String getBqajlx() {
        return bqajlx;
    }

    public void setBqajlx(String bqajlx) {
        this.bqajlx = bqajlx;
    }

    public String getSjdtzycfw() {
        return sjdtzycfw;
    }

    public void setSjdtzycfw(String sjdtzycfw) {
        this.sjdtzycfw = sjdtzycfw;
    }

    public String getSfta() {
        return sfta;
    }

    public void setSfta(String sfta) {
        this.sfta = sfta;
    }

    public String getSfks() {
        return sfks;
    }

    public void setSfks(String sfks) {
        this.sfks = sfks;
    }

    public String getKsqdfs() {
        return ksqdfs;
    }

    public void setKsqdfs(String ksqdfs) {
        this.ksqdfs = ksqdfs;
    }

    public String getFams() {
        return fams;
    }

    public void setFams(String fams) {
        this.fams = fams;
    }

    public String getSfyshx() {
        return sfyshx;
    }

    public void setSfyshx(String sfyshx) {
        this.sfyshx = sfyshx;
    }

    public String getSfysfs() {
        return sfysfs;
    }

    public void setSfysfs(String sfysfs) {
        this.sfysfs = sfysfs;
    }

    public String getSfzdydgx() {
        return sfzdydgx;
    }

    public void setSfzdydgx(String sfzdydgx) {
        this.sfzdydgx = sfzdydgx;
    }

    public String getZjfalsh() {
        return zjfalsh;
    }

    public void setZjfalsh(String zjfalsh) {
        this.zjfalsh = zjfalsh;
    }

    public String getFwlsh() {
        return fwlsh;
    }

    public void setFwlsh(String fwlsh) {
        this.fwlsh = fwlsh;
    }

    public String getZcjg() {
        return zcjg;
    }

    public void setZcjg(String zcjg) {
        this.zcjg = zcjg;
    }

    public String getThrq() {
        return thrq;
    }

    public void setThrq(String thrq) {
        this.thrq = thrq;
    }

    public String getThsy() {
        return thsy;
    }

    public void setThsy(String thsy) {
        this.thsy = thsy;
    }

    public String getLkrq() {
        return lkrq;
    }

    public void setLkrq(String lkrq) {
        this.lkrq = lkrq;
    }

    public String getYjrq() {
        return yjrq;
    }

    public void setYjrq(String yjrq) {
        this.yjrq = yjrq;
    }

    public String getSxcpsfyzx() {
        return sxcpsfyzx;
    }

    public void setSxcpsfyzx(String sxcpsfyzx) {
        this.sxcpsfyzx = sxcpsfyzx;
    }

    public String getAjlyold() {
        return ajlyold;
    }

    public void setAjlyold(String ajlyold) {
        this.ajlyold = ajlyold;
    }

    public String getLdzcbs() {
        return ldzcbs;
    }

    public void setLdzcbs(String ldzcbs) {
        this.ldzcbs = ldzcbs;
    }

    public String getSsftxm() {
        return ssftxm;
    }

    public void setSsftxm(String ssftxm) {
        this.ssftxm = ssftxm;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getGysslx() {
        return gysslx;
    }

    public void setGysslx(String gysslx) {
        this.gysslx = gysslx;
    }

    public String getGysszt() {
        return gysszt;
    }

    public void setGysszt(String gysszt) {
        this.gysszt = gysszt;
    }

    public String getSfkxzqh() {
        return sfkxzqh;
    }

    public void setSfkxzqh(String sfkxzqh) {
        this.sfkxzqh = sfkxzqh;
    }

    public String getCdysbysy() {
        return cdysbysy;
    }

    public void setCdysbysy(String cdysbysy) {
        this.cdysbysy = cdysbysy;
    }

    public String getYarowuuid() {
        return yarowuuid;
    }

    public void setYarowuuid(String yarowuuid) {
        this.yarowuuid = yarowuuid;
    }

    public String getXzbzwzl() {
        return xzbzwzl;
    }

    public void setXzbzwzl(String xzbzwzl) {
        this.xzbzwzl = xzbzwzl;
    }

    public String getSfszcd() {
        return sfszcd;
    }

    public void setSfszcd(String sfszcd) {
        this.sfszcd = sfszcd;
    }

    public String getKylabs() {
        return kylabs;
    }

    public void setKylabs(String kylabs) {
        this.kylabs = kylabs;
    }

    public String getWslabs() {
        return wslabs;
    }

    public void setWslabs(String wslabs) {
        this.wslabs = wslabs;
    }

    public String getHsqqbqsqsx() {
        return hsqqbqsqsx;
    }

    public void setHsqqbqsqsx(String hsqqbqsqsx) {
        this.hsqqbqsqsx = hsqqbqsqsx;
    }

    public String getXzjgpcjd() {
        return xzjgpcjd;
    }

    public void setXzjgpcjd(String xzjgpcjd) {
        this.xzjgpcjd = xzjgpcjd;
    }

    public String getXzjgpcfs() {
        return xzjgpcfs;
    }

    public void setXzjgpcfs(String xzjgpcfs) {
        this.xzjgpcfs = xzjgpcfs;
    }

    public Double getXzjgjdpcse() {
        return xzjgjdpcse;
    }

    public void setXzjgjdpcse(Double xzjgjdpcse) {
        this.xzjgjdpcse = xzjgjdpcse;
    }

    public String getLayjr() {
        return layjr;
    }

    public void setLayjr(String layjr) {
        this.layjr = layjr;
    }

    public String getSaajlx() {
        return saajlx;
    }

    public void setSaajlx(String saajlx) {
        this.saajlx = saajlx;
    }

    public String getCbfy() {
        return cbfy;
    }

    public void setCbfy(String cbfy) {
        this.cbfy = cbfy;
    }

    public String getMswfsdcxlx() {
        return mswfsdcxlx;
    }

    public void setMswfsdcxlx(String mswfsdcxlx) {
        this.mswfsdcxlx = mswfsdcxlx;
    }

    public String getSwcn() {
        return swcn;
    }

    public void setSwcn(String swcn) {
        this.swcn = swcn;
    }

    public String getScjdlx() {
        return scjdlx;
    }

    public void setScjdlx(String scjdlx) {
        this.scjdlx = scjdlx;
    }

    public String getFqbdje() {
        return fqbdje;
    }

    public void setFqbdje(String fqbdje) {
        this.fqbdje = fqbdje;
    }

    public String getLzqzqs() {
        return lzqzqs;
    }

    public void setLzqzqs(String lzqzqs) {
        this.lzqzqs = lzqzqs;
    }

    public String getZfptlabs() {
        return zfptlabs;
    }

    public void setZfptlabs(String zfptlabs) {
        this.zfptlabs = zfptlabs;
    }

    public String getWslaly() {
        return wslaly;
    }

    public void setWslaly(String wslaly) {
        this.wslaly = wslaly;
    }

    public String getXllabs() {
        return xllabs;
    }

    public void setXllabs(String xllabs) {
        this.xllabs = xllabs;
    }

    public String getDjlabs() {
        return djlabs;
    }

    public void setDjlabs(String djlabs) {
        this.djlabs = djlabs;
    }

    public Integer getWslaxla() {
        return wslaxla;
    }

    public void setWslaxla(Integer wslaxla) {
        this.wslaxla = wslaxla;
    }

    public Double getCbrdf() {
        return cbrdf;
    }

    public void setCbrdf(Double cbrdf) {
        this.cbrdf = cbrdf;
    }

    public Double getFdajdf() {
        return fdajdf;
    }

    public void setFdajdf(Double fdajdf) {
        this.fdajdf = fdajdf;
    }

    public String getSfsqzfbs() {
        return sfsqzfbs;
    }

    public void setSfsqzfbs(String sfsqzfbs) {
        this.sfsqzfbs = sfsqzfbs;
    }

    public String getTztajmrq() {
        return tztajmrq;
    }

    public void setTztajmrq(String tztajmrq) {
        this.tztajmrq = tztajmrq;
    }

    public Integer getBgrsl() {
        return bgrsl;
    }

    public void setBgrsl(Integer bgrsl) {
        this.bgrsl = bgrsl;
    }

    public String getSzzcqss() {
        return szzcqss;
    }

    public void setSzzcqss(String szzcqss) {
        this.szzcqss = szzcqss;
    }

    public String getXlabs() {
        return xlabs;
    }

    public void setXlabs(String xlabs) {
        this.xlabs = xlabs;
    }

    public String getXsysssxz() {
        return xsysssxz;
    }

    public void setXsysssxz(String xsysssxz) {
        this.xsysssxz = xsysssxz;
    }

    public String getKsfw() {
        return ksfw;
    }

    public void setKsfw(String ksfw) {
        this.ksfw = ksfw;
    }

    public String getSsdxlx() {
        return ssdxlx;
    }

    public void setSsdxlx(String ssdxlx) {
        this.ssdxlx = ssdxlx;
    }

    public String getBdw() {
        return bdw;
    }

    public void setBdw(String bdw) {
        this.bdw = bdw;
    }

    public String getBdwlx() {
        return bdwlx;
    }

    public void setBdwlx(String bdwlx) {
        this.bdwlx = bdwlx;
    }

    public String getYjsd() {
        return yjsd;
    }

    public void setYjsd(String yjsd) {
        this.yjsd = yjsd;
    }

    public String getXzglly() {
        return xzglly;
    }

    public void setXzglly(String xzglly) {
        this.xzglly = xzglly;
    }

    public String getSzbq() {
        return szbq;
    }

    public void setSzbq(String szbq) {
        this.szbq = szbq;
    }

    public String getFskyws() {
        return fskyws;
    }

    public void setFskyws(String fskyws) {
        this.fskyws = fskyws;
    }

    public String getFyjdm() {
        return fyjdm;
    }

    public void setFyjdm(String fyjdm) {
        this.fyjdm = fyjdm;
    }

    public String getSfjbaj() {
        return sfjbaj;
    }

    public void setSfjbaj(String sfjbaj) {
        this.sfjbaj = sfjbaj;
    }

    public String getSfzzp() {
        return sfzzp;
    }

    public void setSfzzp(String sfzzp) {
        this.sfzzp = sfzzp;
    }

    protected Serializable pkVal() {
        return this.ahdm;
    }

    public String getWslalsh() {
        return wslalsh;
    }

    public void setWslalsh(String wslalsh) {
        this.wslalsh = wslalsh;
    }

    @Override
    public String toString() {
        return "EajSala{" +
                "ahdm=" + ahdm +
                ", sdclrq=" + sdclrq +
                ", ssxz=" + ssxz +
                ", zsfs=" + zsfs +
                ", bhfy=" + bhfy +
                ", yzxfy=" + yzxfy +
                ", bdxw=" + bdxw +
                ", ssrlx=" + ssrlx +
                ", ajslf=" + ajslf +
                ", jysyjycx=" + jysyjycx +
                ", sdzl=" + sdzl +
                ", sqpcsx=" + sqpcsx +
                ", xzglfw=" + xzglfw +
                ", tqxzpc=" + tqxzpc +
                ", ssfw=" + ssfw +
                ", fssclx=" + fssclx +
                ", qqpclx=" + qqpclx +
                ", sqsy=" + sqsy +
                ", flwswh=" + flwswh +
                ", zxyjzw=" + zxyjzw +
                ", scrq=" + scrq +
                ", scyj=" + scyj +
                ", lasprq=" + lasprq +
                ", spyj=" + spyj +
                ", lastupdate=" + lastupdate +
                ", gsr=" + gsr +
                ", jcjg=" + jcjg +
                ", beiz=" + beiz +
                ", spyjly=" + spyjly +
                ", scyjly=" + scyjly +
                ", zdaj=" + zdaj +
                ", sfbq=" + sfbq +
                ", sxajf=" + sxajf +
                ", sqzsqx=" + sqzsqx +
                ", zcsqzsqx=" + zcsqzsqx +
                ", ajgxd=" + ajgxd +
                ", cfss=" + cfss +
                ", far=" + far +
                ", fasj=" + fasj +
                ", sqcs=" + sqcs +
                ", yscl=" + yscl +
                ", ajmm=" + ajmm +
                ", ydsp=" + ydsp +
                ", tjlb=" + tjlb +
                ", bqah=" + bqah +
                ", czfs=" + czfs +
                ", fdmspc=" + fdmspc +
                ", fdmsssqq=" + fdmsssqq +
                ", ksaj=" + ksaj +
                ", sjun=" + sjun +
                ", sjing=" + sjing +
                ", lwjg=" + lwjg +
                ", sfqr=" + sfqr +
                ", scsy=" + scsy +
                ", spsy=" + spsy +
                ", wbjy=" + wbjy +
                ", zxyjdw=" + zxyjdw +
                ", sqr=" + sqr +
                ", sslx=" + sslx +
                ", ssqk=" + ssqk +
                ", darq=" + darq +
                ", snong=" + snong +
                ", gsrlxdh=" + gsrlxdh +
                ", sqtj=" + sqtj +
                ", latj=" + latj +
                ", zsshfyf=" + zsshfyf +
                ", fk=" + fk +
                ", xw=" + xw +
                ", yspcsx=" + yspcsx +
                ", xfajbs=" + xfajbs +
                ", yspcsh=" + yspcsh +
                ", sdajs=" + sdajs +
                ", hytbh=" + hytbh +
                ", clsfqq=" + clsfqq +
                ", bzrq=" + bzrq +
                ", bzclqd=" + bzclqd +
                ", qqpcdx=" + qqpcdx +
                ", sqbqlx=" + sqbqlx +
                ", ajdf=" + ajdf +
                ", ajdfyy=" + ajdfyy +
                ", zdzx=" + zdzx +
                ", tjzx=" + tjzx +
                ", lssqla=" + lssqla +
                ", sfsycxyy=" + sfsycxyy +
                ", szmq=" + szmq +
                ", layjrq=" + layjrq +
                ", sfbysl=" + sfbysl +
                ", ydxe=" + ydxe +
                ", ssyh=" + ssyh +
                ", fzcd=" + fzcd +
                ", gyss=" + gyss +
                ", shjzy=" + shjzy +
                ", sgs=" + sgs +
                ", bhlbgsx=" + bhlbgsx +
                ", sffsydpt=" + sffsydpt +
                ", shms=" + shms +
                ", da=" + da +
                ", ya=" + ya +
                ", xlxaj=" + xlxaj +
                ", ynaj=" + ynaj +
                ", jtssaj=" + jtssaj +
                ", mdjhaj=" + mdjhaj +
                ", byzdaj=" + byzdaj +
                ", sqjglx=" + sqjglx +
                ", sfzcsq=" + sfzcsq +
                ", azjyjg=" + azjyjg +
                ", azjyqsrq=" + azjyqsrq +
                ", fsqj=" + fsqj +
                ", yzqscdy=" + yzqscdy +
                ", xzxwzl=" + xzxwzl +
                ", zxyyzs=" + zxyyzs +
                ", bhlx=" + bhlx +
                ", xfjdr=" + xfjdr +
                ", fmqd=" + fmqd +
                ", fmqdsjzf=" + fmqdsjzf +
                ", sqkyhsqqlx=" + sqkyhsqqlx +
                ", gsrdm=" + gsrdm +
                ", gxyylx=" + gxyylx +
                ", bqxh=" + bqxh +
                ", bqcdlx=" + bqcdlx +
                ", cpxs=" + cpxs +
                ", scah=" + scah +
                ", zdmgaj=" + zdmgaj +
                ", bqajlx=" + bqajlx +
                ", sjdtzycfw=" + sjdtzycfw +
                ", sfta=" + sfta +
                ", sfks=" + sfks +
                ", ksqdfs=" + ksqdfs +
                ", fams=" + fams +
                ", sfyshx=" + sfyshx +
                ", sfysfs=" + sfysfs +
                ", sfzdydgx=" + sfzdydgx +
                ", zjfalsh=" + zjfalsh +
                ", fwlsh=" + fwlsh +
                ", zcjg=" + zcjg +
                ", thrq=" + thrq +
                ", thsy=" + thsy +
                ", lkrq=" + lkrq +
                ", yjrq=" + yjrq +
                ", sxcpsfyzx=" + sxcpsfyzx +
                ", ajlyold=" + ajlyold +
                ", ldzcbs=" + ldzcbs +
                ", ssftxm=" + ssftxm +
                ", rowuuid=" + rowuuid +
                ", gysslx=" + gysslx +
                ", gysszt=" + gysszt +
                ", sfkxzqh=" + sfkxzqh +
                ", cdysbysy=" + cdysbysy +
                ", yarowuuid=" + yarowuuid +
                ", xzbzwzl=" + xzbzwzl +
                ", sfszcd=" + sfszcd +
                ", kylabs=" + kylabs +
                ", wslabs=" + wslabs +
                ", hsqqbqsqsx=" + hsqqbqsqsx +
                ", xzjgpcjd=" + xzjgpcjd +
                ", xzjgpcfs=" + xzjgpcfs +
                ", xzjgjdpcse=" + xzjgjdpcse +
                ", layjr=" + layjr +
                ", saajlx=" + saajlx +
                ", cbfy=" + cbfy +
                ", mswfsdcxlx=" + mswfsdcxlx +
                ", swcn=" + swcn +
                ", scjdlx=" + scjdlx +
                ", fqbdje=" + fqbdje +
                ", lzqzqs=" + lzqzqs +
                ", zfptlabs=" + zfptlabs +
                ", wslaly=" + wslaly +
                ", xllabs=" + xllabs +
                ", djlabs=" + djlabs +
                ", wslaxla=" + wslaxla +
                ", cbrdf=" + cbrdf +
                ", fdajdf=" + fdajdf +
                ", sfsqzfbs=" + sfsqzfbs +
                ", tztajmrq=" + tztajmrq +
                ", bgrsl=" + bgrsl +
                ", szzcqss=" + szzcqss +
                ", xlabs=" + xlabs +
                ", xsysssxz=" + xsysssxz +
                ", ksfw=" + ksfw +
                ", ssdxlx=" + ssdxlx +
                ", bdw=" + bdw +
                ", yjsd=" + yjsd +
                ", xzglly=" + xzglly +
                ", szbq=" + szbq +
                ", fskyws=" + fskyws +
                ", fyjdm=" + fyjdm +
                ", sfjbaj=" + sfjbaj +
                ", sfzzp=" + sfzzp +
                "}";
    }
}
