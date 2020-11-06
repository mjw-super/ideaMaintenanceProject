package com.tdh.light.spxt.bp.po.ssgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: xiongsc
 * @Date: 2020/7/2 10:07
 * @Description:
 */
@TableName("SKS_EXCHANGE")
public class SksExchange {
    @TableField("AHDM")
    private String ahdm;
    @TableField(value = "YSXH",fill = FieldFill.INSERT )
    private Integer ysxh;
    @TableField("ROWUUID")
    private String rowuuid;
    @TableField("LB")
    private String lb;
    @TableField("FYDM")
    private String fydm;
    @TableField("MBFYDM")
    private String mbfydm;
    @TableField("ANHO")
    private String anho;
    @TableField("ND")
    private String nd;
    @TableField("DZ")
    private String dz;
    @TableField("XH")
    private Integer xh;
    @TableField("XTAJLX")
    private String xtajlx;
    @TableField("AJLB")
    private String ajlb;
    @TableField("AJLXDM")
    private Integer ajlxdm;
    @TableField("DSR")
    private String dsr;
    @TableField("AYDM")
    private Integer aydm;
    @TableField("AYMS")
    private String ayms;
    @TableField("SAR")
    private String sar;
    @TableField("SARYHXM")
    private String saryhxm;
    @TableField("LABM")
    private String labm;
    @TableField("CBBM1")
    private String cbbm1;
    @TableField("CBBMMC")
    private String cbbmmc;
    @TableField("CBR")
    private String cbr;
    @TableField("CBRYHXM")
    private String cbryhxm;
    @TableField("FGZL")
    private String fgzl;
    @TableField("FGZLYHXM")
    private String fgzlyhxm;
    @TableField("SJY")
    private String sjy;
    @TableField("SJYYHXM")
    private String sjyyhxm;
    @TableField("YSLARQ")
    private String yslarq;
    @TableField("YSJARQ")
    private String ysjarq;
    @TableField("FJASS")
    private String fjass;
    @TableField("BSZT")
    private String bszt;
    @TableField("DQCLRDM")
    private String dqclrdm;
    @TableField("DQCLRXM")
    private String dqclrxm;
    @TableField("AJCS")
    private Integer ajcs;
    @TableField("YSCLQD")
    private String ysclqd;
    @TableField("YSSY")
    private String yssy;
    @TableField("YSSYMC")
    private String yssymc;
    @TableField("LXR")
    private String lxr;
    @TableField("LXDH")
    private String lxdh;
    @TableField("TCSSRQ")
    private String tcssrq;
    @TableField("ESAJLY")
    private String esajly;
    @TableField("SSBDJE")
    private Double ssbdje;
    @TableField("SSAJSLF")
    private Double ssajslf;
    @TableField("YSWS")
    private byte[] ysws;
    @TableField("YSWSGS")
    private String yswsgs;
    @TableField("HSAJBS")
    private String hsajbs;
    @TableField("HSAJLXDM")
    private Integer hsajlxdm;
    @TableField("HSAH")
    private String hsah;
    @TableField("HSLARQ")
    private String hslarq;
    @TableField("HSJARQ")
    private String hsjarq;
    @TableField("HSJAFS")
    private String hsjafs;
    @TableField("HSLABM")
    private String hslabm;
    @TableField("HSCBBM1")
    private String hscbbm1;
    @TableField("HSCBBMMC")
    private String hscbbmmc;
    @TableField("HSCBR")
    private String hscbr;
    @TableField("HSCBRYHXM")
    private String hscbryhxm;
    @TableField("YSAJRQ")
    private String ysajrq;
    @TableField("YSAJR")
    private String ysajr;
    @TableField("SJJSRQ")
    private String sjjsrq;
    @TableField("SJJSR")
    private String sjjsr;
    @TableField("SJTJRQ")
    private String sjtjrq;
    @TableField("SJTJR")
    private String sjtjr;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("TZSJRQ")
    private String tzsjrq;
    @TableField("TZSJR")
    private String tzsjr;
    @TableField("SSFW")
    private String ssfw;
    @TableField("KSFW")
    private String ksfw;
    @TableField("XLA")
    private Integer xla;
    @TableField("SFKS")
    private String sfks;
    @TableField("SSSCXH")
    private String ssscxh;
    @TableField("CLRLXDH")
    private String clrlxdh;
    @TableField("CLRLXDH")
    private String ssyswzh;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getYsxh() {
        return ysxh;
    }

    public void setYsxh(Integer ysxh) {
        this.ysxh = ysxh;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getMbfydm() {
        return mbfydm;
    }

    public void setMbfydm(String mbfydm) {
        this.mbfydm = mbfydm;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
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

    public String getXtajlx() {
        return xtajlx;
    }

    public void setXtajlx(String xtajlx) {
        this.xtajlx = xtajlx;
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
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

    public Integer getAydm() {
        return aydm;
    }

    public void setAydm(Integer aydm) {
        this.aydm = aydm;
    }

    public String getAyms() {
        return ayms;
    }

    public void setAyms(String ayms) {
        this.ayms = ayms;
    }

    public String getSar() {
        return sar;
    }

    public void setSar(String sar) {
        this.sar = sar;
    }

    public String getSaryhxm() {
        return saryhxm;
    }

    public void setSaryhxm(String saryhxm) {
        this.saryhxm = saryhxm;
    }

    public String getLabm() {
        return labm;
    }

    public void setLabm(String labm) {
        this.labm = labm;
    }

    public String getCbbm1() {
        return cbbm1;
    }

    public void setCbbm1(String cbbm1) {
        this.cbbm1 = cbbm1;
    }

    public String getCbbmmc() {
        return cbbmmc;
    }

    public void setCbbmmc(String cbbmmc) {
        this.cbbmmc = cbbmmc;
    }

    public String getCbr() {
        return cbr;
    }

    public void setCbr(String cbr) {
        this.cbr = cbr;
    }

    public String getCbryhxm() {
        return cbryhxm;
    }

    public void setCbryhxm(String cbryhxm) {
        this.cbryhxm = cbryhxm;
    }

    public String getFgzl() {
        return fgzl;
    }

    public void setFgzl(String fgzl) {
        this.fgzl = fgzl;
    }

    public String getFgzlyhxm() {
        return fgzlyhxm;
    }

    public void setFgzlyhxm(String fgzlyhxm) {
        this.fgzlyhxm = fgzlyhxm;
    }

    public String getSjy() {
        return sjy;
    }

    public void setSjy(String sjy) {
        this.sjy = sjy;
    }

    public String getSjyyhxm() {
        return sjyyhxm;
    }

    public void setSjyyhxm(String sjyyhxm) {
        this.sjyyhxm = sjyyhxm;
    }

    public String getYslarq() {
        return yslarq;
    }

    public void setYslarq(String yslarq) {
        this.yslarq = yslarq;
    }

    public String getYsjarq() {
        return ysjarq;
    }

    public void setYsjarq(String ysjarq) {
        this.ysjarq = ysjarq;
    }

    public String getFjass() {
        return fjass;
    }

    public void setFjass(String fjass) {
        this.fjass = fjass;
    }

    public String getBszt() {
        return bszt;
    }

    public void setBszt(String bszt) {
        this.bszt = bszt;
    }

    public String getDqclrdm() {
        return dqclrdm;
    }

    public void setDqclrdm(String dqclrdm) {
        this.dqclrdm = dqclrdm;
    }

    public String getDqclrxm() {
        return dqclrxm;
    }

    public void setDqclrxm(String dqclrxm) {
        this.dqclrxm = dqclrxm;
    }

    public Integer getAjcs() {
        return ajcs;
    }

    public void setAjcs(Integer ajcs) {
        this.ajcs = ajcs;
    }

    public String getYsclqd() {
        return ysclqd;
    }

    public void setYsclqd(String ysclqd) {
        this.ysclqd = ysclqd;
    }

    public String getYssy() {
        return yssy;
    }

    public void setYssy(String yssy) {
        this.yssy = yssy;
    }

    public String getYssymc() {
        return yssymc;
    }

    public void setYssymc(String yssymc) {
        this.yssymc = yssymc;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getTcssrq() {
        return tcssrq;
    }

    public void setTcssrq(String tcssrq) {
        this.tcssrq = tcssrq;
    }

    public String getEsajly() {
        return esajly;
    }

    public void setEsajly(String esajly) {
        this.esajly = esajly;
    }

    public Double getSsbdje() {
        return ssbdje;
    }

    public void setSsbdje(Double ssbdje) {
        this.ssbdje = ssbdje;
    }

    public Double getSsajslf() {
        return ssajslf;
    }

    public void setSsajslf(Double ssajslf) {
        this.ssajslf = ssajslf;
    }

    public byte[] getYsws() {
        return ysws;
    }

    public void setYsws(byte[] ysws) {
        this.ysws = ysws;
    }

    public String getYswsgs() {
        return yswsgs;
    }

    public void setYswsgs(String yswsgs) {
        this.yswsgs = yswsgs;
    }

    public String getHsajbs() {
        return hsajbs;
    }

    public void setHsajbs(String hsajbs) {
        this.hsajbs = hsajbs;
    }

    public Integer getHsajlxdm() {
        return hsajlxdm;
    }

    public void setHsajlxdm(Integer hsajlxdm) {
        this.hsajlxdm = hsajlxdm;
    }

    public String getHsah() {
        return hsah;
    }

    public void setHsah(String hsah) {
        this.hsah = hsah;
    }

    public String getHslarq() {
        return hslarq;
    }

    public void setHslarq(String hslarq) {
        this.hslarq = hslarq;
    }

    public String getHsjarq() {
        return hsjarq;
    }

    public void setHsjarq(String hsjarq) {
        this.hsjarq = hsjarq;
    }

    public String getHsjafs() {
        return hsjafs;
    }

    public void setHsjafs(String hsjafs) {
        this.hsjafs = hsjafs;
    }

    public String getHslabm() {
        return hslabm;
    }

    public void setHslabm(String hslabm) {
        this.hslabm = hslabm;
    }

    public String getHscbbm1() {
        return hscbbm1;
    }

    public void setHscbbm1(String hscbbm1) {
        this.hscbbm1 = hscbbm1;
    }

    public String getHscbbmmc() {
        return hscbbmmc;
    }

    public void setHscbbmmc(String hscbbmmc) {
        this.hscbbmmc = hscbbmmc;
    }

    public String getHscbr() {
        return hscbr;
    }

    public void setHscbr(String hscbr) {
        this.hscbr = hscbr;
    }

    public String getHscbryhxm() {
        return hscbryhxm;
    }

    public void setHscbryhxm(String hscbryhxm) {
        this.hscbryhxm = hscbryhxm;
    }

    public String getYsajrq() {
        return ysajrq;
    }

    public void setYsajrq(String ysajrq) {
        this.ysajrq = ysajrq;
    }

    public String getYsajr() {
        return ysajr;
    }

    public void setYsajr(String ysajr) {
        this.ysajr = ysajr;
    }

    public String getSjjsrq() {
        return sjjsrq;
    }

    public void setSjjsrq(String sjjsrq) {
        this.sjjsrq = sjjsrq;
    }

    public String getSjjsr() {
        return sjjsr;
    }

    public void setSjjsr(String sjjsr) {
        this.sjjsr = sjjsr;
    }

    public String getSjtjrq() {
        return sjtjrq;
    }

    public void setSjtjrq(String sjtjrq) {
        this.sjtjrq = sjtjrq;
    }

    public String getSjtjr() {
        return sjtjr;
    }

    public void setSjtjr(String sjtjr) {
        this.sjtjr = sjtjr;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getTzsjrq() {
        return tzsjrq;
    }

    public void setTzsjrq(String tzsjrq) {
        this.tzsjrq = tzsjrq;
    }

    public String getTzsjr() {
        return tzsjr;
    }

    public void setTzsjr(String tzsjr) {
        this.tzsjr = tzsjr;
    }

    public String getSsfw() {
        return ssfw;
    }

    public void setSsfw(String ssfw) {
        this.ssfw = ssfw;
    }

    public String getKsfw() {
        return ksfw;
    }

    public void setKsfw(String ksfw) {
        this.ksfw = ksfw;
    }

    public Integer getXla() {
        return xla;
    }

    public void setXla(Integer xla) {
        this.xla = xla;
    }

    public String getSfks() {
        return sfks;
    }

    public void setSfks(String sfks) {
        this.sfks = sfks;
    }

    public String getSsscxh() {
        return ssscxh;
    }

    public void setSsscxh(String ssscxh) {
        this.ssscxh = ssscxh;
    }

    public String getClrlxdh() {
        return clrlxdh;
    }

    public void setClrlxdh(String clrlxdh) {
        this.clrlxdh = clrlxdh;
    }

    public String getSsyswzh() {
        return ssyswzh;
    }

    public void setSsyswzh(String ssyswzh) {
        this.ssyswzh = ssyswzh;
    }
}
