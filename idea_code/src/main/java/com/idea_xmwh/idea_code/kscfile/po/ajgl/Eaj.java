package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * <p>
 * 案件基本信息对象
 * </p>
 * @author XiongWei
 * @since 2019-10-08
 */
@TableName("EAJ")
public class Eaj {

    private static final long serialVersionUID = 1L;

    /**
     * 案件标识
     */
    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("AH")
    private String ah;
    @TableField("LSAH")
    private String lsah;
    @TableField("AJSD")
    private String ajsd;
    @TableField("MQZZ")
    private String mqzz;
    @TableField("AJLX")
    private String ajlx;
    @TableField("XLA")
    private Integer xla;
    @TableField("FYDM")
    private String fydm;
    @TableField("ND")
    private String nd;
    @TableField("FYJC")
    private String fyjc;
    @TableField("DZ")
    private String dz;
    @TableField("XH")
    private Integer xh;
    @TableField("NDXH")
    private Integer ndxh;
    @TableField("SARQ")
    private String sarq;
    @TableField("LARQ")
    private String larq;
    @TableField("JARQ")
    private String jarq;
    @TableField("SDRQ")
    private String sdrq;
    @TableField("SXRQ")
    private String sxrq;
    @TableField("TJGDRQ")
    private String tjgdrq;
    @TableField("GDJSRQ")
    private String gdjsrq;
    @TableField("KTRQ")
    private String ktrq;
    @TableField("SATJ")
    private String satj;
    @TableField("JATJ")
    private String jatj;
    @TableField("SXTJ")
    private String sxtj;
    @TableField("TJBH")
    private String tjbh;
    @TableField("AJLY")
    private String ajly;
    @TableField("SYCX")
    private String sycx;
    @TableField("SAAY")
    private Integer saay;
    @TableField("AYMS")
    private String ayms;
    @TableField("BDJE")
    private Double bdje;
    @TableField("YSSX")
    private String yssx;
    @TableField("JAFS")
    private String jafs;
    @TableField("DSR")
    private String dsr;
    @TableField("LABM")
    private String labm;
    @TableField("SAR")
    private String sar;
    @TableField("CBBM1")
    private String cbbm1;
    @TableField("CBBM2")
    private String cbbm2;
    @TableField("CBR")
    private String cbr;
    @TableField("SPZ")
    private String spz;
    @TableField("SJY")
    private String sjy;
    @TableField("HYCY")
    private String hycy;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("SCR")
    private String scr;
    @TableField("AJLB")
    private String ajlb;
    @TableField("XTAJLX")
    private String xtajlx;
    @TableField("SPCX")
    private String spcx;
    @TableField("PCZT")
    private String pczt;
    @TableField("AJZT")
    private String ajzt;
    @TableField("AJDJ")
    private Long ajdj;
    @TableField("DQFXDJ")
    private String dqfxdj;
    @TableField("FGZL")
    private String fgzl;
    @TableField("ZT")
    private String zt;
    @TableField("FJM")
    private String fjm;
    @TableField("PBJL")
    private String pbjl;
    @TableField("BCYSFTJ")
    private String bcysftj;
    @TableField("DQYQFXDJ")
    private String dqyqfxdj;
    @TableField("SXZT")
    private String sxzt;
    @TableField("AJMC")
    private String ajmc;
    @TableField("FGBM")
    private String fgbm;
    @TableField("AJLXDM")
    private Integer ajlxdm;
    @TableField("SFSS")
    private String sfss;
    @TableField("SFZSQ")
    private String sfzsq;
    @TableField("SFSM")
    private String sfsm;
    @TableField("ZSCQLX")
    private String zscqlx;
    @TableField("ZSCQBJ")
    private String zscqbj;
    @TableField("TSSPGKLC")
    private String tsspgklc;
    @TableField("KTFT")
    private String ktft;
    @TableField("AJJD")
    private String ajjd;
    @TableField("PXAH")
    private String pxah;
    @TableField("CPWSSFSW")
    private String cpwssfsw;
    @TableField("SYTS")
    private Integer syts;
    @TableField("QFSYTS")
    private Integer qfsyts;
    @TableField("LASYTS")
    private Integer lasyts;
    @TableField("YJRQ")
    private String yjrq;
    @TableField("SWAI")
    private String swai;
    @TableField("AJZLB")
    private String ajzlb;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField("SFSC")
    private String sfsc;
    @TableField("SWCN")
    private String swcn;
    @TableField("QTJF")
    private String qtjf;
    @TableField("LASH")
    private String lash;
    @TableField("ZNJZ")
    private String znjz;
    @TableField("SFTJJG")
    private String sftjjg;
    @TableField("SPR")
    private String spr;
    @TableField("AJFZR")
    private String ajfzr;
    @TableField("AHCFXH")
    private String ahcfxh;
    @TableField("AJLXBS")
    private String ajlxbs;
    @TableField("SJTS_R")
    private Integer sjtsR;
    @TableField("FDSXTS_R")
    private Integer fdsxtsR;
    @TableField("YSFYDM")
    private String ysfydm;
    @TableField("SXJMRQ_R")
    private String sxjmrqR;
    @TableField("YSAH")
    private String ysah;
    @TableField("HGAJWYM")
    private String hgajwym;
    @TableField("LAYJRQ_R")
    private String layjrqR;
    @TableField("JABDJE_R")
    private Double jabdjeR;
    @TableField("JAAY_R")
    private Double jaayR;
    @TableField("FDSXNJA")
    private String fdsxnja;
    @TableField("AJNYD")
    private String ajnyd;
    @TableField("SPTDFZR")
    private String sptdfzr;
    @TableField("SCKTRQ")
    private String scktrq;
    @TableField("KTCS")
    private Double ktcs;
    @TableField("JAJMRQ")
    private String jajmrq;
    @TableField("JAQX")
    private Double jaqx;
    @TableField("SZMQ_R")
    private String szmqR;
    @TableField("AJSLF_R")
    private Double ajslfR;
    @TableField("SFYDSD")
    private String sfydsd;
    @TableField("JABJRQ_R")
    private String jabjrqR;
    @TableField("SFSB")
    private String sfsb;
    @TableField("HSXXZDHT")
    private String hsxxzdht;
    @TableField("SFYDGK")
    private String sfydgk;
    @TableField("SFDB")
    private String sfdb;
    @TableField("ZRSLTS_R")
    private Integer zrsltsR;
    @TableField("JSSP")
    private String jssp;
    @TableField("YQDJ")
    private String yqdj;
    @TableField("YYDM")
    private String yydm;
    @TableField("JASY1_R")
    private String jasy1R;
    @TableField("SFKS")
    private String sfks;
    @TableField("MGAJ")
    private String mgaj;
    @TableField("TJZT")
    private String tjzt;
    @TableField("JMLBZ")
    private String jmlbz;
    @TableField("AJDJYJ")
    private String ajdjyj;
    @TableField("DABQ")
    private String dabq;
    @TableField("BSWYGK")
    private String bswygk;
    @TableField("SFSLAJ")
    private String sfslaj;
    @TableField("SFXYTF")
    private String sfxytf;
    @TableField("JABJTH_R")
    private String jabjthR;
    @TableField("SJYSHTS")
    private Double sjyshts;

    /**
     * 删除字段
     */
    @TableField("IS_DELETED")
    private Integer  isDeleted;
    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String  createBy;
    /**
     * 最新修改人
     */
    @TableField("UPDATE_BY")
    private String  updateBy;
    /**
     * 创建日期
     */
    @TableField("GMT_CREAT")
    private Date  gmtCreat;

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getLsah() {
        return lsah;
    }

    public void setLsah(String lsah) {
        this.lsah = lsah;
    }

    public String getAjsd() {
        return ajsd;
    }

    public void setAjsd(String ajsd) {
        this.ajsd = ajsd;
    }

    public String getMqzz() {
        return mqzz;
    }

    public void setMqzz(String mqzz) {
        this.mqzz = mqzz;
    }

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
    }

    public Integer getXla() {
        return xla;
    }

    public void setXla(Integer xla) {
        this.xla = xla;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getFyjc() {
        return fyjc;
    }

    public void setFyjc(String fyjc) {
        this.fyjc = fyjc;
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

    public Integer getNdxh() {
        return ndxh;
    }

    public void setNdxh(Integer ndxh) {
        this.ndxh = ndxh;
    }

    public String getSarq() {
        return sarq;
    }

    public void setSarq(String sarq) {
        this.sarq = sarq;
    }

    public String getLarq() {
        return larq;
    }

    public void setLarq(String larq) {
        this.larq = larq;
    }

    public String getJarq() {
        return jarq;
    }

    public void setJarq(String jarq) {
        this.jarq = jarq;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getSxrq() {
        return sxrq;
    }

    public void setSxrq(String sxrq) {
        this.sxrq = sxrq;
    }

    public String getTjgdrq() {
        return tjgdrq;
    }

    public void setTjgdrq(String tjgdrq) {
        this.tjgdrq = tjgdrq;
    }

    public String getGdjsrq() {
        return gdjsrq;
    }

    public void setGdjsrq(String gdjsrq) {
        this.gdjsrq = gdjsrq;
    }

    public String getKtrq() {
        return ktrq;
    }

    public void setKtrq(String ktrq) {
        this.ktrq = ktrq;
    }

    public String getSatj() {
        return satj;
    }

    public void setSatj(String satj) {
        this.satj = satj;
    }

    public String getJatj() {
        return jatj;
    }

    public void setJatj(String jatj) {
        this.jatj = jatj;
    }

    public String getSxtj() {
        return sxtj;
    }

    public void setSxtj(String sxtj) {
        this.sxtj = sxtj;
    }

    public String getTjbh() {
        return tjbh;
    }

    public void setTjbh(String tjbh) {
        this.tjbh = tjbh;
    }

    public String getAjly() {
        return ajly;
    }

    public void setAjly(String ajly) {
        this.ajly = ajly;
    }

    public String getSycx() {
        return sycx;
    }

    public void setSycx(String sycx) {
        this.sycx = sycx;
    }


    public Integer getSaay() {
        return saay;
    }

    public void setSaay(Integer saay) {
        this.saay = saay;
    }

    public String getAyms() {
        return ayms;
    }

    public void setAyms(String ayms) {
        this.ayms = ayms;
    }

    public Double getBdje() {
        return bdje;
    }

    public void setBdje(Double bdje) {
        this.bdje = bdje;
    }

    public String getYssx() {
        return yssx;
    }

    public void setYssx(String yssx) {
        this.yssx = yssx;
    }

    public String getJafs() {
        return jafs;
    }

    public void setJafs(String jafs) {
        this.jafs = jafs;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public String getLabm() {
        return labm;
    }

    public void setLabm(String labm) {
        this.labm = labm;
    }

    public String getSar() {
        return sar;
    }

    public void setSar(String sar) {
        this.sar = sar;
    }

    public String getCbbm1() {
        return cbbm1;
    }

    public void setCbbm1(String cbbm1) {
        this.cbbm1 = cbbm1;
    }

    public String getCbbm2() {
        return cbbm2;
    }

    public void setCbbm2(String cbbm2) {
        this.cbbm2 = cbbm2;
    }

    public String getCbr() {
        return cbr;
    }

    public void setCbr(String cbr) {
        this.cbr = cbr;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public String getSjy() {
        return sjy;
    }

    public void setSjy(String sjy) {
        this.sjy = sjy;
    }

    public String getHycy() {
        return hycy;
    }

    public void setHycy(String hycy) {
        this.hycy = hycy;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getScr() {
        return scr;
    }

    public void setScr(String scr) {
        this.scr = scr;
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    public String getXtajlx() {
        return xtajlx;
    }

    public void setXtajlx(String xtajlx) {
        this.xtajlx = xtajlx;
    }

    public String getSpcx() {
        return spcx;
    }

    public void setSpcx(String spcx) {
        this.spcx = spcx;
    }

    public String getPczt() {
        return pczt;
    }

    public void setPczt(String pczt) {
        this.pczt = pczt;
    }

    public String getAjzt() {
        return ajzt;
    }

    public void setAjzt(String ajzt) {
        this.ajzt = ajzt;
    }

    public Long getAjdj() {
        return ajdj;
    }

    public void setAjdj(Long ajdj) {
        this.ajdj = ajdj;
    }

    public String getDqfxdj() {
        return dqfxdj;
    }

    public void setDqfxdj(String dqfxdj) {
        this.dqfxdj = dqfxdj;
    }

    public String getFgzl() {
        return fgzl;
    }

    public void setFgzl(String fgzl) {
        this.fgzl = fgzl;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getFjm() {
        return fjm;
    }

    public void setFjm(String fjm) {
        this.fjm = fjm;
    }

    public String getPbjl() {
        return pbjl;
    }

    public void setPbjl(String pbjl) {
        this.pbjl = pbjl;
    }

    public String getBcysftj() {
        return bcysftj;
    }

    public void setBcysftj(String bcysftj) {
        this.bcysftj = bcysftj;
    }

    public String getDqyqfxdj() {
        return dqyqfxdj;
    }

    public void setDqyqfxdj(String dqyqfxdj) {
        this.dqyqfxdj = dqyqfxdj;
    }

    public String getSxzt() {
        return sxzt;
    }

    public void setSxzt(String sxzt) {
        this.sxzt = sxzt;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    public String getFgbm() {
        return fgbm;
    }

    public void setFgbm(String fgbm) {
        this.fgbm = fgbm;
    }

    public Integer getAjlxdm() {
        return ajlxdm;
    }

    public void setAjlxdm(Integer ajlxdm) {
        this.ajlxdm = ajlxdm;
    }

    public String getSfss() {
        return sfss;
    }

    public void setSfss(String sfss) {
        this.sfss = sfss;
    }

    public String getSfzsq() {
        return sfzsq;
    }

    public void setSfzsq(String sfzsq) {
        this.sfzsq = sfzsq;
    }

    public String getSfsm() {
        return sfsm;
    }

    public void setSfsm(String sfsm) {
        this.sfsm = sfsm;
    }

    public String getZscqlx() {
        return zscqlx;
    }

    public void setZscqlx(String zscqlx) {
        this.zscqlx = zscqlx;
    }

    public String getZscqbj() {
        return zscqbj;
    }

    public void setZscqbj(String zscqbj) {
        this.zscqbj = zscqbj;
    }

    public String getTsspgklc() {
        return tsspgklc;
    }

    public void setTsspgklc(String tsspgklc) {
        this.tsspgklc = tsspgklc;
    }

    public String getKtft() {
        return ktft;
    }

    public void setKtft(String ktft) {
        this.ktft = ktft;
    }

    public String getAjjd() {
        return ajjd;
    }

    public void setAjjd(String ajjd) {
        this.ajjd = ajjd;
    }

    public String getPxah() {
        return pxah;
    }

    public void setPxah(String pxah) {
        this.pxah = pxah;
    }

    public String getCpwssfsw() {
        return cpwssfsw;
    }

    public void setCpwssfsw(String cpwssfsw) {
        this.cpwssfsw = cpwssfsw;
    }

    public Integer getSyts() {
        return syts;
    }

    public void setSyts(Integer syts) {
        this.syts = syts;
    }

    public Integer getLasyts() {
        return lasyts;
    }

    public void setLasyts(Integer lasyts) {
        this.lasyts = lasyts;
    }

    public String getYjrq() {
        return yjrq;
    }

    public void setYjrq(String yjrq) {
        this.yjrq = yjrq;
    }

    public String getSwai() {
        return swai;
    }

    public void setSwai(String swai) {
        this.swai = swai;
    }

    public String getAjzlb() {
        return ajzlb;
    }

    public void setAjzlb(String ajzlb) {
        this.ajzlb = ajzlb;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getSfsc() {
        return sfsc;
    }

    public void setSfsc(String sfsc) {
        this.sfsc = sfsc;
    }

    public String getSwcn() {
        return swcn;
    }

    public void setSwcn(String swcn) {
        this.swcn = swcn;
    }

    public String getQtjf() {
        return qtjf;
    }

    public void setQtjf(String qtjf) {
        this.qtjf = qtjf;
    }

    public String getLash() {
        return lash;
    }

    public void setLash(String lash) {
        this.lash = lash;
    }

    public String getZnjz() {
        return znjz;
    }

    public void setZnjz(String znjz) {
        this.znjz = znjz;
    }

    public String getSftjjg() {
        return sftjjg;
    }

    public void setSftjjg(String sftjjg) {
        this.sftjjg = sftjjg;
    }

    public String getSpr() {
        return spr;
    }

    public void setSpr(String spr) {
        this.spr = spr;
    }

    public String getAjfzr() {
        return ajfzr;
    }

    public void setAjfzr(String ajfzr) {
        this.ajfzr = ajfzr;
    }

    public String getAhcfxh() {
        return ahcfxh;
    }

    public void setAhcfxh(String ahcfxh) {
        this.ahcfxh = ahcfxh;
    }

    public String getAjlxbs() {
        return ajlxbs;
    }

    public void setAjlxbs(String ajlxbs) {
        this.ajlxbs = ajlxbs;
    }

    public Integer getSjtsR() {
        return sjtsR;
    }

    public void setSjtsR(Integer sjtsR) {
        this.sjtsR = sjtsR;
    }

    public Integer getFdsxtsR() {
        return fdsxtsR;
    }

    public void setFdsxtsR(Integer fdsxtsR) {
        this.fdsxtsR = fdsxtsR;
    }

    public String getYsfydm() {
        return ysfydm;
    }

    public void setYsfydm(String ysfydm) {
        this.ysfydm = ysfydm;
    }

    public String getSxjmrqR() {
        return sxjmrqR;
    }

    public void setSxjmrqR(String sxjmrqR) {
        this.sxjmrqR = sxjmrqR;
    }

    public String getYsah() {
        return ysah;
    }

    public void setYsah(String ysah) {
        this.ysah = ysah;
    }

    public String getHgajwym() {
        return hgajwym;
    }

    public void setHgajwym(String hgajwym) {
        this.hgajwym = hgajwym;
    }

    public String getLayjrqR() {
        return layjrqR;
    }

    public void setLayjrqR(String layjrqR) {
        this.layjrqR = layjrqR;
    }

    public Double getJabdjeR() {
        return jabdjeR;
    }

    public void setJabdjeR(Double jabdjeR) {
        this.jabdjeR = jabdjeR;
    }

    public Double getJaayR() {
        return jaayR;
    }

    public void setJaayR(Double jaayR) {
        this.jaayR = jaayR;
    }

    public String getFdsxnja() {
        return fdsxnja;
    }

    public void setFdsxnja(String fdsxnja) {
        this.fdsxnja = fdsxnja;
    }

    public String getAjnyd() {
        return ajnyd;
    }

    public void setAjnyd(String ajnyd) {
        this.ajnyd = ajnyd;
    }

    public String getSptdfzr() {
        return sptdfzr;
    }

    public void setSptdfzr(String sptdfzr) {
        this.sptdfzr = sptdfzr;
    }

    public String getScktrq() {
        return scktrq;
    }

    public void setScktrq(String scktrq) {
        this.scktrq = scktrq;
    }

    public Double getKtcs() {
        return ktcs;
    }

    public void setKtcs(Double ktcs) {
        this.ktcs = ktcs;
    }

    public String getJajmrq() {
        return jajmrq;
    }

    public void setJajmrq(String jajmrq) {
        this.jajmrq = jajmrq;
    }

    public Double getJaqx() {
        return jaqx;
    }

    public void setJaqx(Double jaqx) {
        this.jaqx = jaqx;
    }

    public String getSzmqR() {
        return szmqR;
    }

    public void setSzmqR(String szmqR) {
        this.szmqR = szmqR;
    }

    public Double getAjslfR() {
        return ajslfR;
    }

    public void setAjslfR(Double ajslfR) {
        this.ajslfR = ajslfR;
    }

    public String getSfydsd() {
        return sfydsd;
    }

    public void setSfydsd(String sfydsd) {
        this.sfydsd = sfydsd;
    }

    public String getJabjrqR() {
        return jabjrqR;
    }

    public void setJabjrqR(String jabjrqR) {
        this.jabjrqR = jabjrqR;
    }

    public String getSfsb() {
        return sfsb;
    }

    public void setSfsb(String sfsb) {
        this.sfsb = sfsb;
    }

    public String getHsxxzdht() {
        return hsxxzdht;
    }

    public void setHsxxzdht(String hsxxzdht) {
        this.hsxxzdht = hsxxzdht;
    }

    public String getSfydgk() {
        return sfydgk;
    }

    public void setSfydgk(String sfydgk) {
        this.sfydgk = sfydgk;
    }

    public String getSfdb() {
        return sfdb;
    }

    public void setSfdb(String sfdb) {
        this.sfdb = sfdb;
    }

    public Integer getZrsltsR() {
        return zrsltsR;
    }

    public void setZrsltsR(Integer zrsltsR) {
        this.zrsltsR = zrsltsR;
    }

    public String getJssp() {
        return jssp;
    }

    public void setJssp(String jssp) {
        this.jssp = jssp;
    }

    public String getYqdj() {
        return yqdj;
    }

    public void setYqdj(String yqdj) {
        this.yqdj = yqdj;
    }

    public String getYydm() {
        return yydm;
    }

    public void setYydm(String yydm) {
        this.yydm = yydm;
    }

    public String getJasy1R() {
        return jasy1R;
    }

    public void setJasy1R(String jasy1R) {
        this.jasy1R = jasy1R;
    }

    public String getSfks() {
        return sfks;
    }

    public void setSfks(String sfks) {
        this.sfks = sfks;
    }

    public String getMgaj() {
        return mgaj;
    }

    public void setMgaj(String mgaj) {
        this.mgaj = mgaj;
    }

    public String getTjzt() {
        return tjzt;
    }

    public void setTjzt(String tjzt) {
        this.tjzt = tjzt;
    }

    public String getJmlbz() {
        return jmlbz;
    }

    public void setJmlbz(String jmlbz) {
        this.jmlbz = jmlbz;
    }

    public String getAjdjyj() {
        return ajdjyj;
    }

    public void setAjdjyj(String ajdjyj) {
        this.ajdjyj = ajdjyj;
    }

    public String getDabq() {
        return dabq;
    }

    public void setDabq(String dabq) {
        this.dabq = dabq;
    }

    public String getBswygk() {
        return bswygk;
    }

    public void setBswygk(String bswygk) {
        this.bswygk = bswygk;
    }

    public String getSfslaj() {
        return sfslaj;
    }

    public void setSfslaj(String sfslaj) {
        this.sfslaj = sfslaj;
    }

    public String getSfxytf() {
        return sfxytf;
    }

    public void setSfxytf(String sfxytf) {
        this.sfxytf = sfxytf;
    }

    public String getJabjthR() {
        return jabjthR;
    }

    public void setJabjthR(String jabjthR) {
        this.jabjthR = jabjthR;
    }

    public Double getSjyshts() {
        return sjyshts;
    }

    public void setSjyshts(Double sjyshts) {
        this.sjyshts = sjyshts;
    }

    public Integer getQfsyts() {
        return qfsyts;
    }

    public void setQfsyts(Integer qfsyts) {
        this.qfsyts = qfsyts;
    }

    @Override
    public String toString() {
        return "Eaj{" +
                "ahdm=" + ahdm +
                ", ah=" + ah +
                ", lsah=" + lsah +
                ", ajsd=" + ajsd +
                ", mqzz=" + mqzz +
                ", ajlx=" + ajlx +
                ", xla=" + xla +
                ", fydm=" + fydm +
                ", nd=" + nd +
                ", fyjc=" + fyjc +
                ", dz=" + dz +
                ", xh=" + xh +
                ", ndxh=" + ndxh +
                ", sarq=" + sarq +
                ", larq=" + larq +
                ", jarq=" + jarq +
                ", sdrq=" + sdrq +
                ", sxrq=" + sxrq +
                ", tjgdrq=" + tjgdrq +
                ", gdjsrq=" + gdjsrq +
                ", ktrq=" + ktrq +
                ", satj=" + satj +
                ", jatj=" + jatj +
                ", sxtj=" + sxtj +
                ", tjbh=" + tjbh +
                ", ajly=" + ajly +
                ", sycx=" + sycx +
                ", saay=" + saay +
                ", ayms=" + ayms +
                ", bdje=" + bdje +
                ", yssx=" + yssx +
                ", jafs=" + jafs +
                ", dsr=" + dsr +
                ", labm=" + labm +
                ", sar=" + sar +
                ", cbbm1=" + cbbm1 +
                ", cbbm2=" + cbbm2 +
                ", cbr=" + cbr +
                ", spz=" + spz +
                ", sjy=" + sjy +
                ", hycy=" + hycy +
                ", lastupdate=" + lastupdate +
                ", scr=" + scr +
                ", ajlb=" + ajlb +
                ", xtajlx=" + xtajlx +
                ", spcx=" + spcx +
                ", pczt=" + pczt +
                ", ajzt=" + ajzt +
                ", ajdj=" + ajdj +
                ", dqfxdj=" + dqfxdj +
                ", fgzl=" + fgzl +
                ", zt=" + zt +
                ", fjm=" + fjm +
                ", pbjl=" + pbjl +
                ", bcysftj=" + bcysftj +
                ", dqyqfxdj=" + dqyqfxdj +
                ", sxzt=" + sxzt +
                ", ajmc=" + ajmc +
                ", fgbm=" + fgbm +
                ", ajlxdm=" + ajlxdm +
                ", sfss=" + sfss +
                ", sfzsq=" + sfzsq +
                ", sfsm=" + sfsm +
                ", zscqlx=" + zscqlx +
                ", zscqbj=" + zscqbj +
                ", tsspgklc=" + tsspgklc +
                ", ktft=" + ktft +
                ", ajjd=" + ajjd +
                ", pxah=" + pxah +
                ", cpwssfsw=" + cpwssfsw +
                ", syts=" + syts +
                ", lasyts=" + lasyts +
                ", yjrq=" + yjrq +
                ", swai=" + swai +
                ", ajzlb=" + ajzlb +
                ", rowuuid=" + rowuuid +
                ", sfsc=" + sfsc +
                ", swcn=" + swcn +
                ", qtjf=" + qtjf +
                ", lash=" + lash +
                ", znjz=" + znjz +
                ", sftjjg=" + sftjjg +
                ", spr=" + spr +
                ", ajfzr=" + ajfzr +
                ", ahcfxh=" + ahcfxh +
                ", ajlxbs=" + ajlxbs +
                ", sjtsR=" + sjtsR +
                ", fdsxtsR=" + fdsxtsR +
                ", ysfydm=" + ysfydm +
                ", sxjmrqR=" + sxjmrqR +
                ", ysah=" + ysah +
                ", hgajwym=" + hgajwym +
                ", layjrqR=" + layjrqR +
                ", jabdjeR=" + jabdjeR +
                ", jaayR=" + jaayR +
                ", fdsxnja=" + fdsxnja +
                ", ajnyd=" + ajnyd +
                ", sptdfzr=" + sptdfzr +
                ", scktrq=" + scktrq +
                ", ktcs=" + ktcs +
                ", jajmrq=" + jajmrq +
                ", jaqx=" + jaqx +
                ", szmqR=" + szmqR +
                ", ajslfR=" + ajslfR +
                ", sfydsd=" + sfydsd +
                ", jabjrqR=" + jabjrqR +
                ", sfsb=" + sfsb +
                ", hsxxzdht=" + hsxxzdht +
                ", sfydgk=" + sfydgk +
                ", sfdb=" + sfdb +
                ", zrsltsR=" + zrsltsR +
                ", jssp=" + jssp +
                ", yqdj=" + yqdj +
                ", yydm=" + yydm +
                ", jasy1R=" + jasy1R +
                ", sfks=" + sfks +
                ", mgaj=" + mgaj +
                ", tjzt=" + tjzt +
                ", jmlbz=" + jmlbz +
                ", ajdjyj=" + ajdjyj +
                ", dabq=" + dabq +
                ", bswygk=" + bswygk +
                ", sfslaj=" + sfslaj +
                ", sfxytf=" + sfxytf +
                ", jabjthR=" + jabjthR +
                "}";
    }
}
