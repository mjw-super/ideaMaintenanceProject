package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 当事人信息
 * </p>
 *
 * @author cq
 * @since 2019-10-18
 */
@TableName("EDSR")
public class Edsr  {

    private static final long serialVersionUID = 1L;


    public static final String AHDM = "AHDM";
    public static final String XH = "XH";
    public static final String CXZH = "CXZH";
    public static final String CXMM = "CXMM";
    public static final String XB = "XB";
    public static final String SFZHM = "SFZHM";
    public static final String ZZJGDM = "ZZJGDM";
    public static final String MC = "MC";
    public static final String SSDLR = "SSDLR";
    public static final String SSDLRBH = "SSDLR";

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("XH")
    private String xh;
    @TableField("CXZH")
    private String cxzh;
    @TableField("CXMM")
    private String cxmm;
    @TableField("SSDW1")
    private String ssdw1;
    @TableField("SSDW2")
    private String ssdw2;
    @TableField("SSDW3")
    private String ssdw3;
    @TableField("LX")
    private String lx;
    @TableField("MC")
    private String mc;
    @TableField("DZ")
    private String dz;
    @TableField("YZBM")
    private String yzbm;
    @TableField("XWNL")
    private String xwnl;
    @TableField("BGRPXH")
    private Integer bgrpxh;
    @TableField("DWFZZJZRR")
    private String dwfzzjzrr;
    @TableField("DSRLX")
    private String dsrlx;
    @TableField("YDSRGX")
    private String ydsrgx;
    @TableField("XB")
    private String xb;
    @TableField("CSRQ")
    private String csrq;
    @TableField("NL")
    private Integer nl;
    @TableField("GJ")
    private String gj;
    @TableField("MZ")
    private String mz;
    @TableField("SF")
    private String sf;
    @TableField("SFZHM")
    private String sfzhm;
    @TableField("JGZWXZ")
    private String jgzwxz;
    @TableField("JGGBJB")
    private String jggbjb;
    @TableField("ZY")
    private String zy;
    @TableField("WHCD")
    private String whcd;
    @TableField("HYZK")
    private String hyzk;
    @TableField("ZZMM")
    private String zzmm;
    @TableField("XZJB")
    private String xzjb;
    @TableField("SZDW")
    private String szdw;
    @TableField("ZW")
    private String zw;
    @TableField("TSSLHBL")
    private String tsslhbl;
    @TableField("HJSZD")
    private String hjszd;
    @TableField("LDRY")
    private String ldry;
    @TableField("WCNRJTBJ")
    private String wcnrjtbj;
    @TableField("GJDQ")
    private String gjdq;
    @TableField("ZZJGDM")
    private String zzjgdm;
    @TableField("FDDBR")
    private String fddbr;
    @TableField("DBRZJZL")
    private String dbrzjzl;
    @TableField("DBRZJHM")
    private String dbrzjhm;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("SSDLR")
    private String ssdlr;
    @TableField("SSDLRBH")
    private String ssdlrbh;
    @TableField("LAOJ")
    private String laoj;
    @TableField("LEIF")
    private String leif;
    @TableField("WFJS")
    private String wfjs;
    @TableField("WSD")
    private String wsd;
    @TableField("FZJE")
    private Double fzje;
    @TableField("DSRJC")
    private String dsrjc;
    @TableField("BM")
    private String bm;
    @TableField("FZNL")
    private Long fznl;
    @TableField("CFZ")
    private String cfz;
    @TableField("SDDZ")
    private String sddz;
    @TableField("SJHM")
    private String sjhm;
    @TableField("CYM")
    private String cym;
    @TableField("SFLG")
    private String sflg;
    @TableField("SFDZSD")
    private String sfdzsd;
    @TableField("DZSDYY")
    private String dzsdyy;
    @TableField("JYRFH")
    private String jyrfh;
    @TableField("FYDM")
    private String fydm;
    @TableField("SFSFYZ")
    private String sfsfyz;
    @TableField("SFYZJG")
    private String sfyzjg;
    @TableField("XMPY")
    private String xmpy;
    @TableField("SFBCQQZCS")
    private String sfbcqqzcs;
    @TableField("SQRLX")
    private String sqrlx;
    @TableField("HJSZDXZQH")
    private String hjszdxzqh;
    @TableField("SQSY")
    private String sqsy;
    @TableField("TCSQRQ")
    private String tcsqrq;
    @TableField("DWTQR")
    private String dwtqr;
    @TableField("GZDWLX")
    private String gzdwlx;
    @TableField("JGLX")
    private String jglx;
    @TableField("SFZYGJJG")
    private String sfzygjjg;
    @TableField("JX")
    private String jx;
    @TableField("SFRDDB")
    private String sfrddb;
    @TableField("SFZXWY")
    private String sfzxwy;
    @TableField("RDZXCJ")
    private String rdzxcj;
    @TableField("ZWCJ")
    private String zwcj;
    @TableField("SFSQ")
    private String sfsq;
    @TableField("SQLX")
    private String sqlx;
    @TableField("SQGBHDQ")
    private String sqgbhdq;
    @TableField("SFFRDW")
    private String sffrdw;
    @TableField("DWLX")
    private String dwlx;
    @TableField("DWZCDJD")
    private String dwzcdjd;
    @TableField("DWZT")
    private String dwzt;
    @TableField("JCJZDXZQH")
    private String jcjzdxzqh;
    @TableField("ZDCPSX")
    private String zdcpsx;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField("LARQ_R")
    private String larqR;
    @TableField("JARQ_R")
    private String jarqR;
    @TableField("ND_R")
    private String ndR;
    @TableField("AJZT_R")
    private String ajztR;
    @TableField("JYCS")
    private String jycs;
    @TableField("SFZY")
    private String sfzy;
    @TableField("JYRQ")
    private String jyrq;
    @TableField("SFYQKLJ")
    private String sfyqklj;
    @TableField("SFWXSD")
    private String sfwxsd;
    @TableField("PTTYRYBH")
    private String pttyrybh;
    @TableField("SSBDJE")
    private Double ssbdje;
    @TableField("SSAJSLF")
    private Double ssajslf;
    @TableField("LCKDZFM")
    private String lckdzfm;
    @TableField("WSJHM")
    private String wsjhm;
    @TableField("SHSEFZDW")
    private String shsefzdw;
    @TableField("DWXZ")
    private String dwxz;
    @TableField("SFZZSL")
    private String sfzzsl;
    @TableField("ZZSLSY")
    private String zzslsy;
    @TableField("SFZHZSL")
    private String sfzhzsl;
    @TableField("ZHZSLSY")
    private String zhzslsy;
    @TableField("SFZDGZSSDX")
    private String sfzdgzssdx;
    @TableField("SFZHM_M")
    private String sfzhmM;
    @TableField("SJHM_M")
    private String sjhmM;
    @TableField("DZ_M")
    private String dzM;
    @TableField("SDDZ_M")
    private String sddzM;
    @TableField("SSDWMC")
    private String ssdwmc;
    @TableField("QYSYZLX")
    private String qysyzlx;
    @TableField("QYGM")
    private String qygm;
    @TableField("QYSSHYLX")
    private String qysshylx;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtCreat;

    @TableField("SFTYDZSS")
    private String sftydzss;

    @TableField("SFDZSDCPWS")
    private String sfdzsdcpws;


    public String getSftydzss() {
        return sftydzss;
    }

    public void setSftydzss(String sftydzss) {
        this.sftydzss = sftydzss;
    }

    public String getSfdzsdcpws() {
        return sfdzsdcpws;
    }

    public void setSfdzsdcpws(String sfdzsdcpws) {
        this.sfdzsdcpws = sfdzsdcpws;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getCxzh() {
        return cxzh;
    }

    public void setCxzh(String cxzh) {
        this.cxzh = cxzh;
    }

    public String getCxmm() {
        return cxmm;
    }

    public void setCxmm(String cxmm) {
        this.cxmm = cxmm;
    }

    public String getSsdw1() {
        return ssdw1;
    }

    public void setSsdw1(String ssdw1) {
        this.ssdw1 = ssdw1;
    }

    public String getSsdw2() {
        return ssdw2;
    }

    public void setSsdw2(String ssdw2) {
        this.ssdw2 = ssdw2;
    }

    public String getSsdw3() {
        return ssdw3;
    }

    public void setSsdw3(String ssdw3) {
        this.ssdw3 = ssdw3;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    public String getXwnl() {
        return xwnl;
    }

    public void setXwnl(String xwnl) {
        this.xwnl = xwnl;
    }

    public Integer getBgrpxh() {
        return bgrpxh;
    }

    public void setBgrpxh(Integer bgrpxh) {
        this.bgrpxh = bgrpxh;
    }

    public String getDwfzzjzrr() {
        return dwfzzjzrr;
    }

    public void setDwfzzjzrr(String dwfzzjzrr) {
        this.dwfzzjzrr = dwfzzjzrr;
    }

    public String getDsrlx() {
        return dsrlx;
    }

    public void setDsrlx(String dsrlx) {
        this.dsrlx = dsrlx;
    }

    public String getYdsrgx() {
        return ydsrgx;
    }

    public void setYdsrgx(String ydsrgx) {
        this.ydsrgx = ydsrgx;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public Integer getNl() {
        return nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getSf() {
        return sf;
    }

    public void setSf(String sf) {
        this.sf = sf;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public String getJgzwxz() {
        return jgzwxz;
    }

    public void setJgzwxz(String jgzwxz) {
        this.jgzwxz = jgzwxz;
    }

    public String getJggbjb() {
        return jggbjb;
    }

    public void setJggbjb(String jggbjb) {
        this.jggbjb = jggbjb;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    public String getHyzk() {
        return hyzk;
    }

    public void setHyzk(String hyzk) {
        this.hyzk = hyzk;
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    public String getXzjb() {
        return xzjb;
    }

    public void setXzjb(String xzjb) {
        this.xzjb = xzjb;
    }

    public String getSzdw() {
        return szdw;
    }

    public void setSzdw(String szdw) {
        this.szdw = szdw;
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    public String getTsslhbl() {
        return tsslhbl;
    }

    public void setTsslhbl(String tsslhbl) {
        this.tsslhbl = tsslhbl;
    }

    public String getHjszd() {
        return hjszd;
    }

    public void setHjszd(String hjszd) {
        this.hjszd = hjszd;
    }

    public String getLdry() {
        return ldry;
    }

    public void setLdry(String ldry) {
        this.ldry = ldry;
    }

    public String getWcnrjtbj() {
        return wcnrjtbj;
    }

    public void setWcnrjtbj(String wcnrjtbj) {
        this.wcnrjtbj = wcnrjtbj;
    }

    public String getGjdq() {
        return gjdq;
    }

    public void setGjdq(String gjdq) {
        this.gjdq = gjdq;
    }

    public String getZzjgdm() {
        return zzjgdm;
    }

    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    public String getFddbr() {
        return fddbr;
    }

    public void setFddbr(String fddbr) {
        this.fddbr = fddbr;
    }

    public String getDbrzjzl() {
        return dbrzjzl;
    }

    public void setDbrzjzl(String dbrzjzl) {
        this.dbrzjzl = dbrzjzl;
    }

    public String getDbrzjhm() {
        return dbrzjhm;
    }

    public void setDbrzjhm(String dbrzjhm) {
        this.dbrzjhm = dbrzjhm;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getSsdlr() {
        return ssdlr;
    }

    public void setSsdlr(String ssdlr) {
        this.ssdlr = ssdlr;
    }

    public String getSsdlrbh() {
        return ssdlrbh;
    }

    public void setSsdlrbh(String ssdlrbh) {
        this.ssdlrbh = ssdlrbh;
    }

    public String getLaoj() {
        return laoj;
    }

    public void setLaoj(String laoj) {
        this.laoj = laoj;
    }

    public String getLeif() {
        return leif;
    }

    public void setLeif(String leif) {
        this.leif = leif;
    }

    public String getWfjs() {
        return wfjs;
    }

    public void setWfjs(String wfjs) {
        this.wfjs = wfjs;
    }

    public String getWsd() {
        return wsd;
    }

    public void setWsd(String wsd) {
        this.wsd = wsd;
    }

    public Double getFzje() {
        return fzje;
    }

    public void setFzje(Double fzje) {
        this.fzje = fzje;
    }

    public String getDsrjc() {
        return dsrjc;
    }

    public void setDsrjc(String dsrjc) {
        this.dsrjc = dsrjc;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    public Long getFznl() {
        return fznl;
    }

    public void setFznl(Long fznl) {
        this.fznl = fznl;
    }

    public String getCfz() {
        return cfz;
    }

    public void setCfz(String cfz) {
        this.cfz = cfz;
    }

    public String getSddz() {
        return sddz;
    }

    public void setSddz(String sddz) {
        this.sddz = sddz;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getCym() {
        return cym;
    }

    public void setCym(String cym) {
        this.cym = cym;
    }

    public String getSflg() {
        return sflg;
    }

    public void setSflg(String sflg) {
        this.sflg = sflg;
    }

    public String getSfdzsd() {
        return sfdzsd;
    }

    public void setSfdzsd(String sfdzsd) {
        this.sfdzsd = sfdzsd;
    }

    public String getDzsdyy() {
        return dzsdyy;
    }

    public void setDzsdyy(String dzsdyy) {
        this.dzsdyy = dzsdyy;
    }

    public String getJyrfh() {
        return jyrfh;
    }

    public void setJyrfh(String jyrfh) {
        this.jyrfh = jyrfh;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getSfsfyz() {
        return sfsfyz;
    }

    public void setSfsfyz(String sfsfyz) {
        this.sfsfyz = sfsfyz;
    }

    public String getSfyzjg() {
        return sfyzjg;
    }

    public void setSfyzjg(String sfyzjg) {
        this.sfyzjg = sfyzjg;
    }

    public String getXmpy() {
        return xmpy;
    }

    public void setXmpy(String xmpy) {
        this.xmpy = xmpy;
    }

    public String getSfbcqqzcs() {
        return sfbcqqzcs;
    }

    public void setSfbcqqzcs(String sfbcqqzcs) {
        this.sfbcqqzcs = sfbcqqzcs;
    }

    public String getSqrlx() {
        return sqrlx;
    }

    public void setSqrlx(String sqrlx) {
        this.sqrlx = sqrlx;
    }

    public String getHjszdxzqh() {
        return hjszdxzqh;
    }

    public void setHjszdxzqh(String hjszdxzqh) {
        this.hjszdxzqh = hjszdxzqh;
    }

    public String getSqsy() {
        return sqsy;
    }

    public void setSqsy(String sqsy) {
        this.sqsy = sqsy;
    }

    public String getTcsqrq() {
        return tcsqrq;
    }

    public void setTcsqrq(String tcsqrq) {
        this.tcsqrq = tcsqrq;
    }

    public String getDwtqr() {
        return dwtqr;
    }

    public void setDwtqr(String dwtqr) {
        this.dwtqr = dwtqr;
    }

    public String getGzdwlx() {
        return gzdwlx;
    }

    public void setGzdwlx(String gzdwlx) {
        this.gzdwlx = gzdwlx;
    }

    public String getJglx() {
        return jglx;
    }

    public void setJglx(String jglx) {
        this.jglx = jglx;
    }

    public String getSfzygjjg() {
        return sfzygjjg;
    }

    public void setSfzygjjg(String sfzygjjg) {
        this.sfzygjjg = sfzygjjg;
    }

    public String getJx() {
        return jx;
    }

    public void setJx(String jx) {
        this.jx = jx;
    }

    public String getSfrddb() {
        return sfrddb;
    }

    public void setSfrddb(String sfrddb) {
        this.sfrddb = sfrddb;
    }

    public String getSfzxwy() {
        return sfzxwy;
    }

    public void setSfzxwy(String sfzxwy) {
        this.sfzxwy = sfzxwy;
    }

    public String getRdzxcj() {
        return rdzxcj;
    }

    public void setRdzxcj(String rdzxcj) {
        this.rdzxcj = rdzxcj;
    }

    public String getZwcj() {
        return zwcj;
    }

    public void setZwcj(String zwcj) {
        this.zwcj = zwcj;
    }

    public String getSfsq() {
        return sfsq;
    }

    public void setSfsq(String sfsq) {
        this.sfsq = sfsq;
    }

    public String getSqlx() {
        return sqlx;
    }

    public void setSqlx(String sqlx) {
        this.sqlx = sqlx;
    }

    public String getSqgbhdq() {
        return sqgbhdq;
    }

    public void setSqgbhdq(String sqgbhdq) {
        this.sqgbhdq = sqgbhdq;
    }

    public String getSffrdw() {
        return sffrdw;
    }

    public void setSffrdw(String sffrdw) {
        this.sffrdw = sffrdw;
    }

    public String getDwlx() {
        return dwlx;
    }

    public void setDwlx(String dwlx) {
        this.dwlx = dwlx;
    }

    public String getDwzcdjd() {
        return dwzcdjd;
    }

    public void setDwzcdjd(String dwzcdjd) {
        this.dwzcdjd = dwzcdjd;
    }

    public String getDwzt() {
        return dwzt;
    }

    public void setDwzt(String dwzt) {
        this.dwzt = dwzt;
    }

    public String getJcjzdxzqh() {
        return jcjzdxzqh;
    }

    public void setJcjzdxzqh(String jcjzdxzqh) {
        this.jcjzdxzqh = jcjzdxzqh;
    }

    public String getZdcpsx() {
        return zdcpsx;
    }

    public void setZdcpsx(String zdcpsx) {
        this.zdcpsx = zdcpsx;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
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

    public String getNdR() {
        return ndR;
    }

    public void setNdR(String ndR) {
        this.ndR = ndR;
    }

    public String getAjztR() {
        return ajztR;
    }

    public void setAjztR(String ajztR) {
        this.ajztR = ajztR;
    }

    public String getJycs() {
        return jycs;
    }

    public void setJycs(String jycs) {
        this.jycs = jycs;
    }

    public String getSfzy() {
        return sfzy;
    }

    public void setSfzy(String sfzy) {
        this.sfzy = sfzy;
    }

    public String getJyrq() {
        return jyrq;
    }

    public void setJyrq(String jyrq) {
        this.jyrq = jyrq;
    }

    public String getSfyqklj() {
        return sfyqklj;
    }

    public void setSfyqklj(String sfyqklj) {
        this.sfyqklj = sfyqklj;
    }

    public String getSfwxsd() {
        return sfwxsd;
    }

    public void setSfwxsd(String sfwxsd) {
        this.sfwxsd = sfwxsd;
    }

    public String getPttyrybh() {
        return pttyrybh;
    }

    public void setPttyrybh(String pttyrybh) {
        this.pttyrybh = pttyrybh;
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

    public String getLckdzfm() {
        return lckdzfm;
    }

    public void setLckdzfm(String lckdzfm) {
        this.lckdzfm = lckdzfm;
    }

    public String getWsjhm() {
        return wsjhm;
    }

    public void setWsjhm(String wsjhm) {
        this.wsjhm = wsjhm;
    }

    public String getShsefzdw() {
        return shsefzdw;
    }

    public void setShsefzdw(String shsefzdw) {
        this.shsefzdw = shsefzdw;
    }

    public String getDwxz() {
        return dwxz;
    }

    public void setDwxz(String dwxz) {
        this.dwxz = dwxz;
    }

    public String getSfzzsl() {
        return sfzzsl;
    }

    public void setSfzzsl(String sfzzsl) {
        this.sfzzsl = sfzzsl;
    }

    public String getZzslsy() {
        return zzslsy;
    }

    public void setZzslsy(String zzslsy) {
        this.zzslsy = zzslsy;
    }

    public String getSfzhzsl() {
        return sfzhzsl;
    }

    public void setSfzhzsl(String sfzhzsl) {
        this.sfzhzsl = sfzhzsl;
    }

    public String getZhzslsy() {
        return zhzslsy;
    }

    public void setZhzslsy(String zhzslsy) {
        this.zhzslsy = zhzslsy;
    }

    public String getSfzdgzssdx() {
        return sfzdgzssdx;
    }

    public void setSfzdgzssdx(String sfzdgzssdx) {
        this.sfzdgzssdx = sfzdgzssdx;
    }

    public String getSfzhmM() {
        return sfzhmM;
    }

    public void setSfzhmM(String sfzhmM) {
        this.sfzhmM = sfzhmM;
    }

    public String getSjhmM() {
        return sjhmM;
    }

    public void setSjhmM(String sjhmM) {
        this.sjhmM = sjhmM;
    }

    public String getDzM() {
        return dzM;
    }

    public void setDzM(String dzM) {
        this.dzM = dzM;
    }

    public String getSddzM() {
        return sddzM;
    }

    public void setSddzM(String sddzM) {
        this.sddzM = sddzM;
    }

    public String getSsdwmc() {
        return ssdwmc;
    }

    public void setSsdwmc(String ssdwmc) {
        this.ssdwmc = ssdwmc;
    }

    public String getQysyzlx() {
        return qysyzlx;
    }

    public void setQysyzlx(String qysyzlx) {
        this.qysyzlx = qysyzlx;
    }

    public String getQygm() {
        return qygm;
    }

    public void setQygm(String qygm) {
        this.qygm = qygm;
    }

    public String getQysshylx() {
        return qysshylx;
    }

    public void setQysshylx(String qysshylx) {
        this.qysshylx = qysshylx;
    }

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

    @Override
    public String toString() {
        return "Edsr{" +
        "ahdm=" + ahdm +
        ", xh=" + xh +
        ", cxzh=" + cxzh +
        ", cxmm=" + cxmm +
        ", ssdw1=" + ssdw1 +
        ", ssdw2=" + ssdw2 +
        ", ssdw3=" + ssdw3 +
        ", lx=" + lx +
        ", mc=" + mc +
        ", dz=" + dz +
        ", yzbm=" + yzbm +
        ", xwnl=" + xwnl +
        ", bgrpxh=" + bgrpxh +
        ", dwfzzjzrr=" + dwfzzjzrr +
        ", dsrlx=" + dsrlx +
        ", ydsrgx=" + ydsrgx +
        ", xb=" + xb +
        ", csrq=" + csrq +
        ", nl=" + nl +
        ", gj=" + gj +
        ", mz=" + mz +
        ", sf=" + sf +
        ", sfzhm=" + sfzhm +
        ", jgzwxz=" + jgzwxz +
        ", jggbjb=" + jggbjb +
        ", zy=" + zy +
        ", whcd=" + whcd +
        ", hyzk=" + hyzk +
        ", zzmm=" + zzmm +
        ", xzjb=" + xzjb +
        ", szdw=" + szdw +
        ", zw=" + zw +
        ", tsslhbl=" + tsslhbl +
        ", hjszd=" + hjszd +
        ", ldry=" + ldry +
        ", wcnrjtbj=" + wcnrjtbj +
        ", gjdq=" + gjdq +
        ", zzjgdm=" + zzjgdm +
        ", fddbr=" + fddbr +
        ", dbrzjzl=" + dbrzjzl +
        ", dbrzjhm=" + dbrzjhm +
        ", lastupdate=" + lastupdate +
        ", ssdlr=" + ssdlr +
        ", ssdlrbh=" + ssdlrbh +
        ", laoj=" + laoj +
        ", leif=" + leif +
        ", wfjs=" + wfjs +
        ", wsd=" + wsd +
        ", fzje=" + fzje +
        ", dsrjc=" + dsrjc +
        ", bm=" + bm +
        ", fznl=" + fznl +
        ", cfz=" + cfz +
        ", sddz=" + sddz +
        ", sjhm=" + sjhm +
        ", cym=" + cym +
        ", sflg=" + sflg +
        ", sfdzsd=" + sfdzsd +
        ", dzsdyy=" + dzsdyy +
        ", jyrfh=" + jyrfh +
        ", fydm=" + fydm +
        ", sfsfyz=" + sfsfyz +
        ", sfyzjg=" + sfyzjg +
        ", xmpy=" + xmpy +
        ", sfbcqqzcs=" + sfbcqqzcs +
        ", sqrlx=" + sqrlx +
        ", hjszdxzqh=" + hjszdxzqh +
        ", sqsy=" + sqsy +
        ", tcsqrq=" + tcsqrq +
        ", dwtqr=" + dwtqr +
        ", gzdwlx=" + gzdwlx +
        ", jglx=" + jglx +
        ", sfzygjjg=" + sfzygjjg +
        ", jx=" + jx +
        ", sfrddb=" + sfrddb +
        ", sfzxwy=" + sfzxwy +
        ", rdzxcj=" + rdzxcj +
        ", zwcj=" + zwcj +
        ", sfsq=" + sfsq +
        ", sqlx=" + sqlx +
        ", sqgbhdq=" + sqgbhdq +
        ", sffrdw=" + sffrdw +
        ", dwlx=" + dwlx +
        ", dwzcdjd=" + dwzcdjd +
        ", dwzt=" + dwzt +
        ", jcjzdxzqh=" + jcjzdxzqh +
        ", zdcpsx=" + zdcpsx +
        ", rowuuid=" + rowuuid +
        ", larqR=" + larqR +
        ", jarqR=" + jarqR +
        ", ndR=" + ndR +
        ", ajztR=" + ajztR +
        ", jycs=" + jycs +
        ", sfzy=" + sfzy +
        ", jyrq=" + jyrq +
        ", sfyqklj=" + sfyqklj +
        ", sfwxsd=" + sfwxsd +
        ", pttyrybh=" + pttyrybh +
        ", ssbdje=" + ssbdje +
        ", ssajslf=" + ssajslf +
        ", lckdzfm=" + lckdzfm +
        ", wsjhm=" + wsjhm +
        ", shsefzdw=" + shsefzdw +
        ", dwxz=" + dwxz +
        ", sfzzsl=" + sfzzsl +
        ", zzslsy=" + zzslsy +
        ", sfzhzsl=" + sfzhzsl +
        ", zhzslsy=" + zhzslsy +
        ", sfzdgzssdx=" + sfzdgzssdx +
        ", sfzhmM=" + sfzhmM +
        ", sjhmM=" + sjhmM +
        ", dzM=" + dzM +
        ", sddzM=" + sddzM +
        ", ssdwmc=" + ssdwmc +
        ", qysyzlx=" + qysyzlx +
        ", qygm=" + qygm +
        ", qysshylx=" + qysshylx +
        "}";
    }
}
