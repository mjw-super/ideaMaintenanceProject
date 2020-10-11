package com.tdh.light.spxt.bp.po.dlr;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author XiongWei
 * @since 2019-10-24
 */
@TableName("EDSR_QT")
public class EdsrQt {

    public static final String AHDM = "AHDM";
    public static final String XH = "XH";
    public static final String JS = "JS";
    public static final String LX = "LX";
    public static final String MC = "MC";
    public static final String DZ = "DZ";
    public static final String YZBM = "YZBM";
    public static final String LXDH = "LXDH";
    public static final String DZYX = "DZYX";
    public static final String BGRPXH = "BGRPXH";
    public static final String BGLDXTCL = "BGLDXTCL";
    public static final String XB = "XB";
    public static final String CSRQ = "CSRQ";
    public static final String NL = "NL";
    public static final String GJ = "GJ";
    public static final String MZ = "MZ";
    public static final String SF = "SF";
    public static final String SFZHM = "SFZHM";
    public static final String QTZJZL = "QTZJZL";
    public static final String QTZJHM = "QTZJHM";
    public static final String ZY = "ZY";
    public static final String WHCD = "WHCD";
    public static final String HYZK = "HYZK";
    public static final String ZZMM = "ZZMM";
    public static final String XZJB = "XZJB";
    public static final String SZDW = "SZDW";
    public static final String ZW = "ZW";
    public static final String GJDQ = "GJDQ";
    public static final String ZZJGDM = "ZZJGDM";
    public static final String DWXZ = "DWXZ";
    public static final String FDDBR = "FDDBR";
    public static final String DBRZJZL = "DBRZJZL";
    public static final String DBRZJHM = "DBRZJHM";
    public static final String LASTUPDATE = "LASTUPDATE";
    public static final String LB = "LB";
    public static final String BHLX = "BHLX";
    public static final String DSRXH = "DSRXH";
    public static final String FDDLRJS = "FDDLRJS";
    public static final String SFDZSD = "SFDZSD";
    public static final String LSZYZGZH = "LSZYZGZH";
    public static final String DWDZ = "DWDZ";
    public static final String ROWUUID = "ROWUUID";
    public static final String SFFLYZ = "SFFLYZ";
    public static final String SJHM = "SJHM";
    public static final String YDSRGX = "YDSRGX";
    public static final String FYDM = "FYDM";
    public static final String BHRLX = "BHRLX";
    public static final String GLRLX = "GLRLX";
    public static final String DRGLRZW = "DRGLRZW";
    public static final String GLRCSFS = "GLRCSFS";
    public static final String XWNL = "XWNL";
    public static final String GLRBC = "GLRBC";
    public static final String LCKDZFM = "LCKDZFM";
    public static final String BGDH = "BGDH";
    public static final String BHRSWRQ = "BHRSWRQ";
    public static final String ZRYCZZ = "ZRYCZZ";
    public static final String DLRQX = "DLRQX";
    public static final String YTB = "YTB";
    private static final long serialVersionUID = 1L;
    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableId("XH")
    private String xh;
    @TableField("JS")
    private String js;
    @TableField("LX")
    private String lx;
    @TableField("MC")
    private String mc;
    @TableField("DZ")
    private String dz;
    @TableField("YZBM")
    private String yzbm;
    @TableField("LXDH")
    private String lxdh;
    @TableField("DZYX")
    private String dzyx;
    @TableField("BGRPXH")
    private Integer bgrpxh;
    @TableField("BGLDXTCL")
    private String bgldxtcl;
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
    @TableField("QTZJZL")
    private String qtzjzl;
    @TableField("QTZJHM")
    private String qtzjhm;
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
    @TableField("GJDQ")
    private String gjdq;
    @TableField("ZZJGDM")
    private String zzjgdm;
    @TableField("DWXZ")
    private String dwxz;
    @TableField("FDDBR")
    private String fddbr;
    @TableField("DBRZJZL")
    private String dbrzjzl;
    @TableField("DBRZJHM")
    private String dbrzjhm;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("LB")
    private String lb;
    @TableField("BHLX")
    private String bhlx;
    @TableField("DSRXH")
    private String dsrxh;
    @TableField("FDDLRJS")
    private String fddlrjs;
    @TableField("SFDZSD")
    private String sfdzsd;
    @TableField("LSZYZGZH")
    private String lszyzgzh;
    @TableField("DWDZ")
    private String dwdz;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField("SFFLYZ")
    private String sfflyz;
    @TableField("SJHM")
    private String sjhm;
    @TableField("YDSRGX")
    private String ydsrgx;
    @TableField("FYDM")
    private String fydm;
    @TableField("BHRLX")
    private String bhrlx;
    @TableField("GLRLX")
    private String glrlx;
    @TableField("DRGLRZW")
    private String drglrzw;
    @TableField("GLRCSFS")
    private String glrcsfs;
    @TableField("XWNL")
    private String xwnl;
    @TableField("GLRBC")
    private Double glrbc;
    @TableField("LCKDZFM")
    private String lckdzfm;
    @TableField("BGDH")
    private String bgdh;
    @TableField("BHRSWRQ")
    private String bhrswrq;
    @TableField("ZRYCZZ")
    private String zryczz;
    @TableField("DLRQX")
    private String dlrqx;
    /**
     * 逻辑删除字段
     */
    @TableField("IS_DELETED")
    private Integer isDeleted;
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

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
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

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
    }

    public Integer getBgrpxh() {
        return bgrpxh;
    }

    public void setBgrpxh(Integer bgrpxh) {
        this.bgrpxh = bgrpxh;
    }

    public String getBgldxtcl() {
        return bgldxtcl;
    }

    public void setBgldxtcl(String bgldxtcl) {
        this.bgldxtcl = bgldxtcl;
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

    public String getDwxz() {
        return dwxz;
    }

    public void setDwxz(String dwxz) {
        this.dwxz = dwxz;
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

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getBhlx() {
        return bhlx;
    }

    public void setBhlx(String bhlx) {
        this.bhlx = bhlx;
    }

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public String getFddlrjs() {
        return fddlrjs;
    }

    public void setFddlrjs(String fddlrjs) {
        this.fddlrjs = fddlrjs;
    }

    public String getSfdzsd() {
        return sfdzsd;
    }

    public void setSfdzsd(String sfdzsd) {
        this.sfdzsd = sfdzsd;
    }

    public String getLszyzgzh() {
        return lszyzgzh;
    }

    public void setLszyzgzh(String lszyzgzh) {
        this.lszyzgzh = lszyzgzh;
    }

    public String getDwdz() {
        return dwdz;
    }

    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getSfflyz() {
        return sfflyz;
    }

    public void setSfflyz(String sfflyz) {
        this.sfflyz = sfflyz;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getYdsrgx() {
        return ydsrgx;
    }

    public void setYdsrgx(String ydsrgx) {
        this.ydsrgx = ydsrgx;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getBhrlx() {
        return bhrlx;
    }

    public void setBhrlx(String bhrlx) {
        this.bhrlx = bhrlx;
    }

    public String getGlrlx() {
        return glrlx;
    }

    public void setGlrlx(String glrlx) {
        this.glrlx = glrlx;
    }

    public String getDrglrzw() {
        return drglrzw;
    }

    public void setDrglrzw(String drglrzw) {
        this.drglrzw = drglrzw;
    }

    public String getGlrcsfs() {
        return glrcsfs;
    }

    public void setGlrcsfs(String glrcsfs) {
        this.glrcsfs = glrcsfs;
    }

    public String getXwnl() {
        return xwnl;
    }

    public void setXwnl(String xwnl) {
        this.xwnl = xwnl;
    }

    public Double getGlrbc() {
        return glrbc;
    }

    public void setGlrbc(Double glrbc) {
        this.glrbc = glrbc;
    }

    public String getLckdzfm() {
        return lckdzfm;
    }

    public void setLckdzfm(String lckdzfm) {
        this.lckdzfm = lckdzfm;
    }

    public String getBgdh() {
        return bgdh;
    }

    public void setBgdh(String bgdh) {
        this.bgdh = bgdh;
    }

    public String getBhrswrq() {
        return bhrswrq;
    }

    public void setBhrswrq(String bhrswrq) {
        this.bhrswrq = bhrswrq;
    }

    public String getZryczz() {
        return zryczz;
    }

    public void setZryczz(String zryczz) {
        this.zryczz = zryczz;
    }

    public String getDlrqx() {
        return dlrqx;
    }

    public void setDlrqx(String dlrqx) {
        this.dlrqx = dlrqx;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
