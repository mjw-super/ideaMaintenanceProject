package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 *  用户对象
 * </p>
 * @author XiongWei
 * @since 2019-10-25
 */
@TableName("T_USER")
public class TUser {

    public static final String YHDM = "YHDM";
    public static final String DWDM = "DWDM";
    public static final String YHID = "YHID";
    public static final String YHXM = "YHXM";
    public static final String YHKL = "YHKL";
    public static final String YHXB = "YHXB";
    public static final String YHBM = "YHBM";
    public static final String CSRQ = "CSRQ";
    public static final String MZ = "MZ";
    public static final String HYZK = "HYZK";
    public static final String RYBZ = "RYBZ";
    public static final String SFSPZ = "SFSPZ";
    public static final String SFPSY = "SFPSY";
    public static final String SFZHM = "SFZHM";
    public static final String WHCD = "WHCD";
    public static final String ZZMM = "ZZMM";
    public static final String XZJB = "XZJB";
    public static final String YHZW = "YHZW";
    public static final String FLZW = "FLZW";
    public static final String RYDJ = "RYDJ";
    public static final String GZSJ = "GZSJ";
    public static final String JYSJ = "JYSJ";
    public static final String LXFS = "LXFS";
    public static final String YHZP = "YHZP";
    public static final String YHDH = "YHDH";
    public static final String PXH = "PXH";
    public static final String SFJY = "SFJY";
    public static final String SFTB = "SFTB";
    public static final String KJMENU = "KJMENU";
    public static final String LY = "LY";
    public static final String BS = "BS";
    public static final String LX = "LX";
    public static final String NL = "NL";
    public static final String GJ = "GJ";
    public static final String SF = "SF";
    public static final String XYJRSF = "XYJRSF";
    public static final String JGZWXZ = "JGZWXZ";
    public static final String JGGBJB = "JGGBJB";
    public static final String QTZJZL = "QTZJZL";
    public static final String QTZJHM = "QTZJHM";
    public static final String ZY = "ZY";
    public static final String SZDW = "SZDW";
    public static final String TSSF = "TSSF";
    public static final String TSSLHBL = "TSSLHBL";
    public static final String HJSZD = "HJSZD";
    public static final String JL = "JL";
    public static final String LDRY = "LDRY";
    public static final String WCNRJTBJ = "WCNRJTBJ";
    public static final String JTJJZK = "JTJJZK";
    public static final String DZ = "DZ";
    public static final String YZBM = "YZBM";
    public static final String DZYX = "DZYX";
    public static final String QTLXFF = "QTLXFF";
    public static final String QSAJFW = "QSAJFW";
    public static final String GXBM = "GXBM";
    public static final String QSJS = "QSJS";
    public static final String LASTUPDATE = "LASTUPDATE";
    public static final String SFDL = "SFDL";
    public static final String YHQM = "YHQM";
    public static final String USERID = "USERID";
    public static final String RYGH = "RYGH";
    public static final String MD5 = "MD5";
    public static final String SFXN = "SFXN";
    public static final String XMQP = "XMQP";
    public static final String XMSZM = "XMSZM";
    public static final String LOGINIP = "LOGINIP";
    public static final String LOGINTIME = "LOGINTIME";
    public static final String DHM = "DHM";
    public static final String BGSH = "BGSH";
    public static final String FJH = "FJH";
    public static final String ZZDH = "ZZDH";
    public static final String WSXXBGK = "WSXXBGK";
    public static final String LCLX = "LCLX";
    public static final String TSTAMP = "TSTAMP";
    public static final String BGDH = "BGDH";
    public static final String YDDH = "YDDH";
    public static final String RYUID = "RYUID";
    public static final String YHUID = "YHUID";
    public static final String SFREFG = "SFREFG";
    public static final String SFCADL = "SFCADL";
    public static final String OPENID = "OPENID";
    private static final long serialVersionUID = 1L;
    @TableId("YHDM")
    private String yhdm;
    @TableField("DWDM")
    private String dwdm;
    @TableField("YHID")
    private String yhid;
    @TableField("YHXM")
    private String yhxm;
    @TableField("YHKL")
    private String yhkl;
    @TableField("YHXB")
    private String yhxb;
    @TableField("YHBM")
    private String yhbm;
    @TableField("CSRQ")
    private String csrq;
    @TableField("MZ")
    private String mz;
    @TableField("HYZK")
    private String hyzk;
    @TableField("RYBZ")
    private String rybz;
    @TableField("SFSPZ")
    private String sfspz;
    @TableField("SFPSY")
    private String sfpsy;
    @TableField("SFZHM")
    private String sfzhm;
    @TableField("WHCD")
    private String whcd;
    @TableField("ZZMM")
    private String zzmm;
    @TableField("XZJB")
    private String xzjb;
    @TableField("YHZW")
    private String yhzw;
    @TableField("FLZW")
    private String flzw;
    @TableField("RYDJ")
    private String rydj;
    @TableField("GZSJ")
    private String gzsj;
    @TableField("JYSJ")
    private String jysj;
    @TableField("LXFS")
    private String lxfs;
    @TableField("YHZP")
    private Object yhzp;
    @TableField("YHDH")
    private String yhdh;
    @TableField("PXH")
    private Long pxh;
    @TableField("SFJY")
    private String sfjy;
    @TableField("SFTB")
    private String sftb;
    @TableField("KJMENU")
    private String kjmenu;
    @TableField("LY")
    private String ly;
    @TableField("BS")
    private Long bs;
    @TableField("LX")
    private String lx;
    @TableField("NL")
    private Integer nl;
    @TableField("GJ")
    private String gj;
    @TableField("SF")
    private String sf;
    @TableField("XYJRSF")
    private String xyjrsf;
    @TableField("JGZWXZ")
    private String jgzwxz;
    @TableField("JGGBJB")
    private String jggbjb;
    @TableField("QTZJZL")
    private String qtzjzl;
    @TableField("QTZJHM")
    private String qtzjhm;
    @TableField("ZY")
    private String zy;
    @TableField("SZDW")
    private String szdw;
    @TableField("TSSF")
    private String tssf;
    @TableField("TSSLHBL")
    private String tsslhbl;
    @TableField("HJSZD")
    private String hjszd;
    @TableField("JL")
    private String jl;
    @TableField("LDRY")
    private String ldry;
    @TableField("WCNRJTBJ")
    private String wcnrjtbj;
    @TableField("JTJJZK")
    private String jtjjzk;
    @TableField("DZ")
    private String dz;
    @TableField("YZBM")
    private String yzbm;
    @TableField("DZYX")
    private String dzyx;
    @TableField("QTLXFF")
    private String qtlxff;
    @TableField("QSAJFW")
    private String qsajfw;
    @TableField("GXBM")
    private String gxbm;
    @TableField("QSJS")
    private String qsjs;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("SFDL")
    private String sfdl;
    @TableField("YHQM")
    private Object yhqm;
    @TableField("USERID")
    private String userid;
    @TableField("RYGH")
    private String rygh;
    @TableField("MD5")
    private String md5;
    @TableField("SFXN")
    private String sfxn;
    @TableField("XMQP")
    private String xmqp;
    @TableField("XMSZM")
    private String xmszm;
    @TableField("LOGINIP")
    private String loginip;
    @TableField("LOGINTIME")
    private Date logintime;
    @TableField("DHM")
    private String dhm;
    @TableField("BGSH")
    private String bgsh;
    @TableField("FJH")
    private String fjh;
    @TableField("ZZDH")
    private String zzdh;
    @TableField("WSXXBGK")
    private String wsxxbgk;
    @TableField("LCLX")
    private String lclx;
    @TableField("TSTAMP")
    private Date tstamp;
    @TableField("BGDH")
    private String bgdh;
    @TableField("YDDH")
    private String yddh;
    @TableField("RYUID")
    private String ryuid;
    @TableField("YHUID")
    private String yhuid;
    @TableField("SFREFG")
    private String sfrefg;
    @TableField("SFCADL")
    private String sfcadl;
    @TableField("OPENID")
    private String openid;

    public String getYhdm() {
        return yhdm;
    }

    public void setYhdm(String yhdm) {
        this.yhdm = yhdm;
    }

    public String getDwdm() {
        return dwdm;
    }

    public void setDwdm(String dwdm) {
        this.dwdm = dwdm;
    }

    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    public String getYhxm() {
        return yhxm;
    }

    public void setYhxm(String yhxm) {
        this.yhxm = yhxm;
    }

    public String getYhkl() {
        return yhkl;
    }

    public void setYhkl(String yhkl) {
        this.yhkl = yhkl;
    }

    public String getYhxb() {
        return yhxb;
    }

    public void setYhxb(String yhxb) {
        this.yhxb = yhxb;
    }

    public String getYhbm() {
        return yhbm;
    }

    public void setYhbm(String yhbm) {
        this.yhbm = yhbm;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getHyzk() {
        return hyzk;
    }

    public void setHyzk(String hyzk) {
        this.hyzk = hyzk;
    }

    public String getRybz() {
        return rybz;
    }

    public void setRybz(String rybz) {
        this.rybz = rybz;
    }

    public String getSfspz() {
        return sfspz;
    }

    public void setSfspz(String sfspz) {
        this.sfspz = sfspz;
    }

    public String getSfpsy() {
        return sfpsy;
    }

    public void setSfpsy(String sfpsy) {
        this.sfpsy = sfpsy;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
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

    public String getYhzw() {
        return yhzw;
    }

    public void setYhzw(String yhzw) {
        this.yhzw = yhzw;
    }

    public String getFlzw() {
        return flzw;
    }

    public void setFlzw(String flzw) {
        this.flzw = flzw;
    }

    public String getRydj() {
        return rydj;
    }

    public void setRydj(String rydj) {
        this.rydj = rydj;
    }

    public String getGzsj() {
        return gzsj;
    }

    public void setGzsj(String gzsj) {
        this.gzsj = gzsj;
    }

    public String getJysj() {
        return jysj;
    }

    public void setJysj(String jysj) {
        this.jysj = jysj;
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public Object getYhzp() {
        return yhzp;
    }

    public void setYhzp(Object yhzp) {
        this.yhzp = yhzp;
    }

    public String getYhdh() {
        return yhdh;
    }

    public void setYhdh(String yhdh) {
        this.yhdh = yhdh;
    }

    public Long getPxh() {
        return pxh;
    }

    public void setPxh(Long pxh) {
        this.pxh = pxh;
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy;
    }

    public String getSftb() {
        return sftb;
    }

    public void setSftb(String sftb) {
        this.sftb = sftb;
    }

    public String getKjmenu() {
        return kjmenu;
    }

    public void setKjmenu(String kjmenu) {
        this.kjmenu = kjmenu;
    }

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly;
    }

    public Long getBs() {
        return bs;
    }

    public void setBs(Long bs) {
        this.bs = bs;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
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

    public String getSf() {
        return sf;
    }

    public void setSf(String sf) {
        this.sf = sf;
    }

    public String getXyjrsf() {
        return xyjrsf;
    }

    public void setXyjrsf(String xyjrsf) {
        this.xyjrsf = xyjrsf;
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

    public String getQtzjzl() {
        return qtzjzl;
    }

    public void setQtzjzl(String qtzjzl) {
        this.qtzjzl = qtzjzl;
    }

    public String getQtzjhm() {
        return qtzjhm;
    }

    public void setQtzjhm(String qtzjhm) {
        this.qtzjhm = qtzjhm;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getSzdw() {
        return szdw;
    }

    public void setSzdw(String szdw) {
        this.szdw = szdw;
    }

    public String getTssf() {
        return tssf;
    }

    public void setTssf(String tssf) {
        this.tssf = tssf;
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

    public String getJl() {
        return jl;
    }

    public void setJl(String jl) {
        this.jl = jl;
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

    public String getJtjjzk() {
        return jtjjzk;
    }

    public void setJtjjzk(String jtjjzk) {
        this.jtjjzk = jtjjzk;
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

    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
    }

    public String getQtlxff() {
        return qtlxff;
    }

    public void setQtlxff(String qtlxff) {
        this.qtlxff = qtlxff;
    }

    public String getQsajfw() {
        return qsajfw;
    }

    public void setQsajfw(String qsajfw) {
        this.qsajfw = qsajfw;
    }

    public String getGxbm() {
        return gxbm;
    }

    public void setGxbm(String gxbm) {
        this.gxbm = gxbm;
    }

    public String getQsjs() {
        return qsjs;
    }

    public void setQsjs(String qsjs) {
        this.qsjs = qsjs;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getSfdl() {
        return sfdl;
    }

    public void setSfdl(String sfdl) {
        this.sfdl = sfdl;
    }

    public Object getYhqm() {
        return yhqm;
    }

    public void setYhqm(Object yhqm) {
        this.yhqm = yhqm;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRygh() {
        return rygh;
    }

    public void setRygh(String rygh) {
        this.rygh = rygh;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getSfxn() {
        return sfxn;
    }

    public void setSfxn(String sfxn) {
        this.sfxn = sfxn;
    }

    public String getXmqp() {
        return xmqp;
    }

    public void setXmqp(String xmqp) {
        this.xmqp = xmqp;
    }

    public String getXmszm() {
        return xmszm;
    }

    public void setXmszm(String xmszm) {
        this.xmszm = xmszm;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getDhm() {
        return dhm;
    }

    public void setDhm(String dhm) {
        this.dhm = dhm;
    }

    public String getBgsh() {
        return bgsh;
    }

    public void setBgsh(String bgsh) {
        this.bgsh = bgsh;
    }

    public String getFjh() {
        return fjh;
    }

    public void setFjh(String fjh) {
        this.fjh = fjh;
    }

    public String getZzdh() {
        return zzdh;
    }

    public void setZzdh(String zzdh) {
        this.zzdh = zzdh;
    }

    public String getWsxxbgk() {
        return wsxxbgk;
    }

    public void setWsxxbgk(String wsxxbgk) {
        this.wsxxbgk = wsxxbgk;
    }

    public String getLclx() {
        return lclx;
    }

    public void setLclx(String lclx) {
        this.lclx = lclx;
    }

    public Date getTstamp() {
        return tstamp;
    }

    public void setTstamp(Date tstamp) {
        this.tstamp = tstamp;
    }

    public String getBgdh() {
        return bgdh;
    }

    public void setBgdh(String bgdh) {
        this.bgdh = bgdh;
    }

    public String getYddh() {
        return yddh;
    }

    public void setYddh(String yddh) {
        this.yddh = yddh;
    }

    public String getRyuid() {
        return ryuid;
    }

    public void setRyuid(String ryuid) {
        this.ryuid = ryuid;
    }

    public String getYhuid() {
        return yhuid;
    }

    public void setYhuid(String yhuid) {
        this.yhuid = yhuid;
    }

    public String getSfrefg() {
        return sfrefg;
    }

    public void setSfrefg(String sfrefg) {
        this.sfrefg = sfrefg;
    }

    public String getSfcadl() {
        return sfcadl;
    }

    public void setSfcadl(String sfcadl) {
        this.sfcadl = sfcadl;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "yhdm=" + yhdm +
                ", dwdm=" + dwdm +
                ", yhid=" + yhid +
                ", yhxm=" + yhxm +
                ", yhkl=" + yhkl +
                ", yhxb=" + yhxb +
                ", yhbm=" + yhbm +
                ", csrq=" + csrq +
                ", mz=" + mz +
                ", hyzk=" + hyzk +
                ", rybz=" + rybz +
                ", sfspz=" + sfspz +
                ", sfpsy=" + sfpsy +
                ", sfzhm=" + sfzhm +
                ", whcd=" + whcd +
                ", zzmm=" + zzmm +
                ", xzjb=" + xzjb +
                ", yhzw=" + yhzw +
                ", flzw=" + flzw +
                ", rydj=" + rydj +
                ", gzsj=" + gzsj +
                ", jysj=" + jysj +
                ", lxfs=" + lxfs +
                ", yhzp=" + yhzp +
                ", yhdh=" + yhdh +
                ", pxh=" + pxh +
                ", sfjy=" + sfjy +
                ", sftb=" + sftb +
                ", kjmenu=" + kjmenu +
                ", ly=" + ly +
                ", bs=" + bs +
                ", lx=" + lx +
                ", nl=" + nl +
                ", gj=" + gj +
                ", sf=" + sf +
                ", xyjrsf=" + xyjrsf +
                ", jgzwxz=" + jgzwxz +
                ", jggbjb=" + jggbjb +
                ", qtzjzl=" + qtzjzl +
                ", qtzjhm=" + qtzjhm +
                ", zy=" + zy +
                ", szdw=" + szdw +
                ", tssf=" + tssf +
                ", tsslhbl=" + tsslhbl +
                ", hjszd=" + hjszd +
                ", jl=" + jl +
                ", ldry=" + ldry +
                ", wcnrjtbj=" + wcnrjtbj +
                ", jtjjzk=" + jtjjzk +
                ", dz=" + dz +
                ", yzbm=" + yzbm +
                ", dzyx=" + dzyx +
                ", qtlxff=" + qtlxff +
                ", qsajfw=" + qsajfw +
                ", gxbm=" + gxbm +
                ", qsjs=" + qsjs +
                ", lastupdate=" + lastupdate +
                ", sfdl=" + sfdl +
                ", yhqm=" + yhqm +
                ", userid=" + userid +
                ", rygh=" + rygh +
                ", md5=" + md5 +
                ", sfxn=" + sfxn +
                ", xmqp=" + xmqp +
                ", xmszm=" + xmszm +
                ", loginip=" + loginip +
                ", logintime=" + logintime +
                ", dhm=" + dhm +
                ", bgsh=" + bgsh +
                ", fjh=" + fjh +
                ", zzdh=" + zzdh +
                ", wsxxbgk=" + wsxxbgk +
                ", lclx=" + lclx +
                ", tstamp=" + tstamp +
                ", bgdh=" + bgdh +
                ", yddh=" + yddh +
                ", ryuid=" + ryuid +
                ", yhuid=" + yhuid +
                ", sfrefg=" + sfrefg +
                ", sfcadl=" + sfcadl +
                ", openid=" + openid +
                "}";
    }
}
