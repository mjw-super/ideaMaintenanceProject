package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:案件特征信息
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.ajgl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/25 15        gp     1.0        1.0 Version
 **/
@TableName("EAJ_TZXX")
public class EajTzxx {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("LARQ_R")
    private String larqR;
    @TableField("JARQ_R")
    private String jarqR;
    @TableField("AJZT_R")
    private String ajztR;
    @TableField("ND_R")
    private String ndR;
    @TableField("QMTZYCFW_R")
    private String qmtzycfwR;
    @TableField("SHEGAT")
    private String shegat;
    @TableField("GYSS")
    private String gyss;
    @TableField("SFKXZQH_R")
    private String sfkxzqhR;
    @TableField("WSLA")
    private String wsla;
    @TableField("KYLA")
    private String kyla;
    @TableField("LATJ_R")
    private String latjR;
    @TableField("TCGXYY")
    private String tcgxyy;
    @TableField("CZFS_R")
    private String czfsR;
    @TableField("SQBQ")
    private String sqbq;
    @TableField("XHBA_R")
    private String xhbaR;
    @TableField("FDMSPC_R")
    private String fdmspcR;
    @TableField("QXXP_R")
    private String qxxpR;
    @TableField("DTCP_R")
    private String dtcpR;
    @TableField("PSYCS")
    private String psycs;
    @TableField("XZXT_R")
    private String xzxtR;
    @TableField("FDDBRCTF_R")
    private String fddbrctfR;
    @TableField("FDGFXWJSC_R")
    private String fdgfxwjscR;
    @TableField("SFYJAWS_R")
    private String sfyjawsR;
    @TableField("SYJYCPWS_R")
    private String syjycpwsR;
    @TableField("ROWUUID")
    private String rowuuid;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("SJUN_R")
    private String sjunR;
    @TableField("SJING_R")
    private String sjingR;
    @TableField("SHEYU_R")
    private String sheyuR;
    @TableField("QXSL_R")
    private String qxslR;
    @TableField("CPWSYSW")
    private String cpwsysw;
    @TableField("CPWSSWRQ_R")
    private String cpwsswrqR;
    @TableField("CPWSSFSW_R")
    private String cpwssfswR;
    @TableField("CBBM1_R")
    private String cbbm1R;
    @TableField("CBR_R")
    private String cbrR;
    @TableField("SJY_R")
    private String sjyR;
    @TableField("CPWSBSWLY")
    private String cpwsbswly;
    @TableField("AJLXDM_R")
    private Long ajlxdmR;
    @TableField("CPWSSWZT")
    private String cpwsswzt;
    @TableField("CPWSBSW")
    private String cpwsbsw;
    @TableField("CZFS")
    private String czfs;
    @TableField("XHBA")
    private String xhba;
    @TableField("FDMSPC")
    private String fdmspc;
    @TableField("SYJYCPWS")
    private String syjycpws;
    @TableField("SFYJAWS")
    private String sfyjaws;
    @TableField("FDGFXWJSC")
    private String fdgfxwjsc;
    @TableField("FDDBRCTF")
    private String fddbrctf;
    @TableField("XZXT")
    private String xzxt;
    @TableField("DTCP")
    private String dtcp;
    @TableField("QXXP")
    private String qxxp;
    @TableField("QXSL")
    private String qxsl;
    @TableField("SPZ_R")
    private String spzR;
    @TableField("FGZL_R")
    private String fgzlR;
    @TableField("BGRTYRZCX_R")
    private String bgrtyrzcxR;
    @TableField("SDAJTJ")
    private String sdajtj;
    @TableField("SFQZ")
    private String sfqz;
    @TableField("SHEGANG")
    private String shegang;
    @TableField("SHEAO")
    private String sheao;
    @TableField("SHETAI")
    private String shetai;
    @TableField("SJDP")
    private String sjdp;
    @TableField("SJQZ")
    private String sjqz;
    @TableField("SJSX")
    private String sjsx;
    @TableField("PSYCY")
    private String psycy;
    @TableField("XCKYHCK")
    private String xckyhck;
    @TableField("SFXCJDYJ")
    private String sfxcjdyj;
    @TableField("SFFSSFJY")
    private String sffssfjy;
    @TableField("SFSJPGJD")
    private String sfsjpgjd;
    @TableField("SFPM")
    private String sfpm;
    @TableField("SFTX")
    private String sftx;
    @TableField("TSHDCXW")
    private String tshdcxw;
    @TableField("TQHY")
    private String tqhy;
    @TableField("FJFL")
    private String fjfl;
    @TableField("TBHYYH")
    private String tbhyyh;
    @TableField("TSZB")
    private String tszb;
    @TableField("SFGMT")
    private String sfgmt;
    @TableField("CPWSCX")
    private String cpwscx;
    @TableField("XZ_QT")
    private String xzQt;
    @TableField("MGAJ_R")
    private String mgajR;
    @TableField("SHSE")
    private String shse;
    @TableField("SHSELX")
    private String shselx;
    @TableField("SAKW")
    private String sakw;
    @TableField("SMY")
    private String smy;
    @TableField("SMS")
    private String sms;
    @TableField("JDSWZJSA")
    private String jdswzjsa;
    @TableField("DAJLY")
    private String dajly;
    @TableField("SFGYGW")
    private String sfgygw;
    @TableField("XZSSAJ")
    private String xzssaj;
    @TableField("XTJZYTD")
    private String xtjzytd;
    @TableField("SYQING")
    private String syqing;
    @TableField("SHJZY")
    private String shjzy;
    @TableField("WZHYYQK")
    private String wzhyyqk;
    @TableField("SFCZLACL")
    private String sfczlacl;
    @TableField("DSRHYXE")
    private String dsrhyxe;
    @TableField("CQWJF")
    private String cqwjf;
    @TableField("SFPC")
    private String sfpc;
    @TableField("SXXSFZ")
    private String sxxsfz;
    @TableField("MTZXTC")
    private String mtzxtc;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getLarqR() {
        return larqR;
    }

    public void setLarqR(String larqR) {
        this.larqR = larqR;
    }

    public String getJarqR() {
        return jarqR;
    }

    public void setJarqR(String jarqR) {
        this.jarqR = jarqR;
    }

    public String getAjztR() {
        return ajztR;
    }

    public void setAjztR(String ajztR) {
        this.ajztR = ajztR;
    }

    public String getNdR() {
        return ndR;
    }

    public void setNdR(String ndR) {
        this.ndR = ndR;
    }

    public String getQmtzycfwR() {
        return qmtzycfwR;
    }

    public void setQmtzycfwR(String qmtzycfwR) {
        this.qmtzycfwR = qmtzycfwR;
    }

    public String getShegat() {
        return shegat;
    }

    public void setShegat(String shegat) {
        this.shegat = shegat;
    }

    public String getGyss() {
        return gyss;
    }

    public void setGyss(String gyss) {
        this.gyss = gyss;
    }

    public String getSfkxzqhR() {
        return sfkxzqhR;
    }

    public void setSfkxzqhR(String sfkxzqhR) {
        this.sfkxzqhR = sfkxzqhR;
    }

    public String getWsla() {
        return wsla;
    }

    public void setWsla(String wsla) {
        this.wsla = wsla;
    }

    public String getKyla() {
        return kyla;
    }

    public void setKyla(String kyla) {
        this.kyla = kyla;
    }

    public String getLatjR() {
        return latjR;
    }

    public void setLatjR(String latjR) {
        this.latjR = latjR;
    }

    public String getTcgxyy() {
        return tcgxyy;
    }

    public void setTcgxyy(String tcgxyy) {
        this.tcgxyy = tcgxyy;
    }

    public String getCzfsR() {
        return czfsR;
    }

    public void setCzfsR(String czfsR) {
        this.czfsR = czfsR;
    }

    public String getSqbq() {
        return sqbq;
    }

    public void setSqbq(String sqbq) {
        this.sqbq = sqbq;
    }

    public String getXhbaR() {
        return xhbaR;
    }

    public void setXhbaR(String xhbaR) {
        this.xhbaR = xhbaR;
    }

    public String getFdmspcR() {
        return fdmspcR;
    }

    public void setFdmspcR(String fdmspcR) {
        this.fdmspcR = fdmspcR;
    }

    public String getQxxpR() {
        return qxxpR;
    }

    public void setQxxpR(String qxxpR) {
        this.qxxpR = qxxpR;
    }

    public String getDtcpR() {
        return dtcpR;
    }

    public void setDtcpR(String dtcpR) {
        this.dtcpR = dtcpR;
    }

    public String getPsycs() {
        return psycs;
    }

    public void setPsycs(String psycs) {
        this.psycs = psycs;
    }

    public String getXzxtR() {
        return xzxtR;
    }

    public void setXzxtR(String xzxtR) {
        this.xzxtR = xzxtR;
    }

    public String getFddbrctfR() {
        return fddbrctfR;
    }

    public void setFddbrctfR(String fddbrctfR) {
        this.fddbrctfR = fddbrctfR;
    }

    public String getFdgfxwjscR() {
        return fdgfxwjscR;
    }

    public void setFdgfxwjscR(String fdgfxwjscR) {
        this.fdgfxwjscR = fdgfxwjscR;
    }

    public String getSfyjawsR() {
        return sfyjawsR;
    }

    public void setSfyjawsR(String sfyjawsR) {
        this.sfyjawsR = sfyjawsR;
    }

    public String getSyjycpwsR() {
        return syjycpwsR;
    }

    public void setSyjycpwsR(String syjycpwsR) {
        this.syjycpwsR = syjycpwsR;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getSjunR() {
        return sjunR;
    }

    public void setSjunR(String sjunR) {
        this.sjunR = sjunR;
    }

    public String getSjingR() {
        return sjingR;
    }

    public void setSjingR(String sjingR) {
        this.sjingR = sjingR;
    }

    public String getSheyuR() {
        return sheyuR;
    }

    public void setSheyuR(String sheyuR) {
        this.sheyuR = sheyuR;
    }

    public String getQxslR() {
        return qxslR;
    }

    public void setQxslR(String qxslR) {
        this.qxslR = qxslR;
    }

    public String getCpwsysw() {
        return cpwsysw;
    }

    public void setCpwsysw(String cpwsysw) {
        this.cpwsysw = cpwsysw;
    }

    public String getCpwsswrqR() {
        return cpwsswrqR;
    }

    public void setCpwsswrqR(String cpwsswrqR) {
        this.cpwsswrqR = cpwsswrqR;
    }

    public String getCpwssfswR() {
        return cpwssfswR;
    }

    public void setCpwssfswR(String cpwssfswR) {
        this.cpwssfswR = cpwssfswR;
    }

    public String getCbbm1R() {
        return cbbm1R;
    }

    public void setCbbm1R(String cbbm1R) {
        this.cbbm1R = cbbm1R;
    }

    public String getCbrR() {
        return cbrR;
    }

    public void setCbrR(String cbrR) {
        this.cbrR = cbrR;
    }

    public String getSjyR() {
        return sjyR;
    }

    public void setSjyR(String sjyR) {
        this.sjyR = sjyR;
    }

    public String getCpwsbswly() {
        return cpwsbswly;
    }

    public void setCpwsbswly(String cpwsbswly) {
        this.cpwsbswly = cpwsbswly;
    }

    public Long getAjlxdmR() {
        return ajlxdmR;
    }

    public void setAjlxdmR(Long ajlxdmR) {
        this.ajlxdmR = ajlxdmR;
    }

    public String getCpwsswzt() {
        return cpwsswzt;
    }

    public void setCpwsswzt(String cpwsswzt) {
        this.cpwsswzt = cpwsswzt;
    }

    public String getCpwsbsw() {
        return cpwsbsw;
    }

    public void setCpwsbsw(String cpwsbsw) {
        this.cpwsbsw = cpwsbsw;
    }

    public String getCzfs() {
        return czfs;
    }

    public void setCzfs(String czfs) {
        this.czfs = czfs;
    }

    public String getXhba() {
        return xhba;
    }

    public void setXhba(String xhba) {
        this.xhba = xhba;
    }

    public String getFdmspc() {
        return fdmspc;
    }

    public void setFdmspc(String fdmspc) {
        this.fdmspc = fdmspc;
    }

    public String getSyjycpws() {
        return syjycpws;
    }

    public void setSyjycpws(String syjycpws) {
        this.syjycpws = syjycpws;
    }

    public String getSfyjaws() {
        return sfyjaws;
    }

    public void setSfyjaws(String sfyjaws) {
        this.sfyjaws = sfyjaws;
    }

    public String getFdgfxwjsc() {
        return fdgfxwjsc;
    }

    public void setFdgfxwjsc(String fdgfxwjsc) {
        this.fdgfxwjsc = fdgfxwjsc;
    }

    public String getFddbrctf() {
        return fddbrctf;
    }

    public void setFddbrctf(String fddbrctf) {
        this.fddbrctf = fddbrctf;
    }

    public String getXzxt() {
        return xzxt;
    }

    public void setXzxt(String xzxt) {
        this.xzxt = xzxt;
    }

    public String getDtcp() {
        return dtcp;
    }

    public void setDtcp(String dtcp) {
        this.dtcp = dtcp;
    }

    public String getQxxp() {
        return qxxp;
    }

    public void setQxxp(String qxxp) {
        this.qxxp = qxxp;
    }

    public String getQxsl() {
        return qxsl;
    }

    public void setQxsl(String qxsl) {
        this.qxsl = qxsl;
    }

    public String getSpzR() {
        return spzR;
    }

    public void setSpzR(String spzR) {
        this.spzR = spzR;
    }

    public String getFgzlR() {
        return fgzlR;
    }

    public void setFgzlR(String fgzlR) {
        this.fgzlR = fgzlR;
    }

    public String getBgrtyrzcxR() {
        return bgrtyrzcxR;
    }

    public void setBgrtyrzcxR(String bgrtyrzcxR) {
        this.bgrtyrzcxR = bgrtyrzcxR;
    }

    public String getSdajtj() {
        return sdajtj;
    }

    public void setSdajtj(String sdajtj) {
        this.sdajtj = sdajtj;
    }

    public String getSfqz() {
        return sfqz;
    }

    public void setSfqz(String sfqz) {
        this.sfqz = sfqz;
    }

    public String getShegang() {
        return shegang;
    }

    public void setShegang(String shegang) {
        this.shegang = shegang;
    }

    public String getSheao() {
        return sheao;
    }

    public void setSheao(String sheao) {
        this.sheao = sheao;
    }

    public String getShetai() {
        return shetai;
    }

    public void setShetai(String shetai) {
        this.shetai = shetai;
    }

    public String getSjdp() {
        return sjdp;
    }

    public void setSjdp(String sjdp) {
        this.sjdp = sjdp;
    }

    public String getSjqz() {
        return sjqz;
    }

    public void setSjqz(String sjqz) {
        this.sjqz = sjqz;
    }

    public String getSjsx() {
        return sjsx;
    }

    public void setSjsx(String sjsx) {
        this.sjsx = sjsx;
    }

    public String getPsycy() {
        return psycy;
    }

    public void setPsycy(String psycy) {
        this.psycy = psycy;
    }

    public String getXckyhck() {
        return xckyhck;
    }

    public void setXckyhck(String xckyhck) {
        this.xckyhck = xckyhck;
    }

    public String getSfxcjdyj() {
        return sfxcjdyj;
    }

    public void setSfxcjdyj(String sfxcjdyj) {
        this.sfxcjdyj = sfxcjdyj;
    }

    public String getSffssfjy() {
        return sffssfjy;
    }

    public void setSffssfjy(String sffssfjy) {
        this.sffssfjy = sffssfjy;
    }

    public String getSfsjpgjd() {
        return sfsjpgjd;
    }

    public void setSfsjpgjd(String sfsjpgjd) {
        this.sfsjpgjd = sfsjpgjd;
    }

    public String getSfpm() {
        return sfpm;
    }

    public void setSfpm(String sfpm) {
        this.sfpm = sfpm;
    }

    public String getSftx() {
        return sftx;
    }

    public void setSftx(String sftx) {
        this.sftx = sftx;
    }

    public String getTshdcxw() {
        return tshdcxw;
    }

    public void setTshdcxw(String tshdcxw) {
        this.tshdcxw = tshdcxw;
    }

    public String getTqhy() {
        return tqhy;
    }

    public void setTqhy(String tqhy) {
        this.tqhy = tqhy;
    }

    public String getFjfl() {
        return fjfl;
    }

    public void setFjfl(String fjfl) {
        this.fjfl = fjfl;
    }

    public String getTbhyyh() {
        return tbhyyh;
    }

    public void setTbhyyh(String tbhyyh) {
        this.tbhyyh = tbhyyh;
    }

    public String getTszb() {
        return tszb;
    }

    public void setTszb(String tszb) {
        this.tszb = tszb;
    }

    public String getSfgmt() {
        return sfgmt;
    }

    public void setSfgmt(String sfgmt) {
        this.sfgmt = sfgmt;
    }

    public String getCpwscx() {
        return cpwscx;
    }

    public void setCpwscx(String cpwscx) {
        this.cpwscx = cpwscx;
    }

    public String getXzQt() {
        return xzQt;
    }

    public void setXzQt(String xzQt) {
        this.xzQt = xzQt;
    }

    public String getMgajR() {
        return mgajR;
    }

    public void setMgajR(String mgajR) {
        this.mgajR = mgajR;
    }

    public String getShse() {
        return shse;
    }

    public void setShse(String shse) {
        this.shse = shse;
    }

    public String getShselx() {
        return shselx;
    }

    public void setShselx(String shselx) {
        this.shselx = shselx;
    }

    public String getSakw() {
        return sakw;
    }

    public void setSakw(String sakw) {
        this.sakw = sakw;
    }

    public String getSmy() {
        return smy;
    }

    public void setSmy(String smy) {
        this.smy = smy;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getJdswzjsa() {
        return jdswzjsa;
    }

    public void setJdswzjsa(String jdswzjsa) {
        this.jdswzjsa = jdswzjsa;
    }

    public String getDajly() {
        return dajly;
    }

    public void setDajly(String dajly) {
        this.dajly = dajly;
    }

    public String getSfgygw() {
        return sfgygw;
    }

    public void setSfgygw(String sfgygw) {
        this.sfgygw = sfgygw;
    }

    public String getXzssaj() {
        return xzssaj;
    }

    public void setXzssaj(String xzssaj) {
        this.xzssaj = xzssaj;
    }

    public String getXtjzytd() {
        return xtjzytd;
    }

    public void setXtjzytd(String xtjzytd) {
        this.xtjzytd = xtjzytd;
    }

    public String getSyqing() {
        return syqing;
    }

    public void setSyqing(String syqing) {
        this.syqing = syqing;
    }

    public String getShjzy() {
        return shjzy;
    }

    public void setShjzy(String shjzy) {
        this.shjzy = shjzy;
    }

    public String getWzhyyqk() {
        return wzhyyqk;
    }

    public void setWzhyyqk(String wzhyyqk) {
        this.wzhyyqk = wzhyyqk;
    }

    public String getSfczlacl() {
        return sfczlacl;
    }

    public void setSfczlacl(String sfczlacl) {
        this.sfczlacl = sfczlacl;
    }

    public String getDsrhyxe() {
        return dsrhyxe;
    }

    public void setDsrhyxe(String dsrhyxe) {
        this.dsrhyxe = dsrhyxe;
    }

    public String getCqwjf() {
        return cqwjf;
    }

    public void setCqwjf(String cqwjf) {
        this.cqwjf = cqwjf;
    }

    public String getSfpc() {
        return sfpc;
    }

    public void setSfpc(String sfpc) {
        this.sfpc = sfpc;
    }

    public String getMtzxtc() {
        return mtzxtc;
    }

    public void setMtzxtc(String mtzxtc) {
        this.mtzxtc = mtzxtc;
    }

    public String getSxxsfz() {
        return sxxsfz;
    }

    public void setSxxsfz(String sxxsfz) {
        this.sxxsfz = sxxsfz;
    }

    @Override
    public String toString() {
        return "EajTzxx{" +
                "ahdm='" + ahdm + '\'' +
                ", fydm='" + fydm + '\'' +
                ", larqR='" + larqR + '\'' +
                ", jarqR='" + jarqR + '\'' +
                ", ajztR='" + ajztR + '\'' +
                ", ndR='" + ndR + '\'' +
                ", qmtzycfwR='" + qmtzycfwR + '\'' +
                ", shegat='" + shegat + '\'' +
                ", gyss='" + gyss + '\'' +
                ", sfkxzqhR='" + sfkxzqhR + '\'' +
                ", wsla='" + wsla + '\'' +
                ", kyla='" + kyla + '\'' +
                ", latjR='" + latjR + '\'' +
                ", tcgxyy='" + tcgxyy + '\'' +
                ", czfsR='" + czfsR + '\'' +
                ", sqbq='" + sqbq + '\'' +
                ", xhbaR='" + xhbaR + '\'' +
                ", fdmspcR='" + fdmspcR + '\'' +
                ", qxxpR='" + qxxpR + '\'' +
                ", dtcpR='" + dtcpR + '\'' +
                ", psycs='" + psycs + '\'' +
                ", xzxtR='" + xzxtR + '\'' +
                ", fddbrctfR='" + fddbrctfR + '\'' +
                ", fdgfxwjscR='" + fdgfxwjscR + '\'' +
                ", sfyjawsR='" + sfyjawsR + '\'' +
                ", syjycpwsR='" + syjycpwsR + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", lastupdate=" + lastupdate +
                ", sjunR='" + sjunR + '\'' +
                ", sjingR='" + sjingR + '\'' +
                ", sheyuR='" + sheyuR + '\'' +
                ", qxslR='" + qxslR + '\'' +
                ", cpwsysw='" + cpwsysw + '\'' +
                ", cpwsswrqR='" + cpwsswrqR + '\'' +
                ", cpwssfswR='" + cpwssfswR + '\'' +
                ", cbbm1R='" + cbbm1R + '\'' +
                ", cbrR='" + cbrR + '\'' +
                ", sjyR='" + sjyR + '\'' +
                ", cpwsbswly='" + cpwsbswly + '\'' +
                ", ajlxdmR=" + ajlxdmR +
                ", cpwsswzt='" + cpwsswzt + '\'' +
                ", cpwsbsw='" + cpwsbsw + '\'' +
                ", czfs='" + czfs + '\'' +
                ", xhba='" + xhba + '\'' +
                ", fdmspc='" + fdmspc + '\'' +
                ", syjycpws='" + syjycpws + '\'' +
                ", sfyjaws='" + sfyjaws + '\'' +
                ", fdgfxwjsc='" + fdgfxwjsc + '\'' +
                ", fddbrctf='" + fddbrctf + '\'' +
                ", xzxt='" + xzxt + '\'' +
                ", dtcp='" + dtcp + '\'' +
                ", qxxp='" + qxxp + '\'' +
                ", qxsl='" + qxsl + '\'' +
                ", spzR='" + spzR + '\'' +
                ", fgzlR='" + fgzlR + '\'' +
                ", bgrtyrzcxR='" + bgrtyrzcxR + '\'' +
                ", sdajtj='" + sdajtj + '\'' +
                ", sfqz='" + sfqz + '\'' +
                ", shegang='" + shegang + '\'' +
                ", sheao='" + sheao + '\'' +
                ", shetai='" + shetai + '\'' +
                ", sjdp='" + sjdp + '\'' +
                ", sjqz='" + sjqz + '\'' +
                ", sjsx='" + sjsx + '\'' +
                ", psycy='" + psycy + '\'' +
                ", xckyhck='" + xckyhck + '\'' +
                ", sfxcjdyj='" + sfxcjdyj + '\'' +
                ", sffssfjy='" + sffssfjy + '\'' +
                ", sfsjpgjd='" + sfsjpgjd + '\'' +
                ", sfpm='" + sfpm + '\'' +
                ", sftx='" + sftx + '\'' +
                ", tshdcxw='" + tshdcxw + '\'' +
                ", tqhy='" + tqhy + '\'' +
                ", fjfl='" + fjfl + '\'' +
                ", tbhyyh='" + tbhyyh + '\'' +
                ", tszb='" + tszb + '\'' +
                ", sfgmt='" + sfgmt + '\'' +
                ", cpwscx='" + cpwscx + '\'' +
                ", xzQt='" + xzQt + '\'' +
                ", mgajR='" + mgajR + '\'' +
                ", shse='" + shse + '\'' +
                ", shselx='" + shselx + '\'' +
                ", sakw='" + sakw + '\'' +
                ", smy='" + smy + '\'' +
                ", sms='" + sms + '\'' +
                ", jdswzjsa='" + jdswzjsa + '\'' +
                ", dajly='" + dajly + '\'' +
                ", sfgygw='" + sfgygw + '\'' +
                ", xzssaj='" + xzssaj + '\'' +
                ", xtjzytd='" + xtjzytd + '\'' +
                ", syqing='" + syqing + '\'' +
                ", shjzy='" + shjzy + '\'' +
                ", wzhyyqk='" + wzhyyqk + '\'' +
                ", sfczlacl='" + sfczlacl + '\'' +
                ", dsrhyxe='" + dsrhyxe + '\'' +
                ", cqwjf='" + cqwjf + '\'' +
                ", sfpc='" + sfpc + '\'' +
                ", mtzxtc='" + mtzxtc + '\'' +
                '}';
    }
}
