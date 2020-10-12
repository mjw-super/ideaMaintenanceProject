package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 *
 * </p>
 * @author XiongWei
 * @since 2019-10-15
 */
@TableName("TS_AJCXBM2015")
public class TsAjcxbm2015 {

    @TableId("LSH")
    private Long lsh;
    @TableField("DM")
    private Long dm;
    @TableField("FDM")
    private Long fdm;
    @TableField("AJMC")
    private String ajmc;
    @TableField("DZLX")
    private String dzlx;
    @TableField("DZMC")
    private String dzmc;
    @TableField("AJXZ")
    private String ajxz;
    @TableField("AJXZMC")
    private String ajxzmc;
    @TableField("SPCX")
    private String spcx;
    @TableField("SPCXMC")
    private String spcxmc;
    @TableField("AJBM")
    private String ajbm;
    @TableField("AJMS")
    private String ajms;
    @TableField("CCBM")
    private String ccbm;
    @TableField("FLAG")
    private String flag;
    @TableField("SFJY")
    private String sfjy;
    @TableField("PXH")
    private Long pxh;
    @TableField("YWLXDM")
    private Long ywlxdm;
    @TableField("JAFSKIND")
    private String jafskind;
    @TableField("JAFSCODE")
    private String jafscode;
    @TableField("AJBMN")
    private String ajbmn;
    @TableField("AJLYKIND")
    private String ajlykind;
    @TableField("AJLYCODE")
    private String ajlycode;
    @TableField("SFQYZNBA")
    private String sfqyznba;
    @TableField("AY")
    private String ay;
    @TableField("LASCJLKIND")
    private String lascjlkind;
    @TableField("LASPJLKIND")
    private String laspjlkind;
    @TableField("AJLXBS")
    private String ajlxbs;
    @TableField("LASC")
    private String lasc;
    @TableField("LASP")
    private String lasp;
    @TableField("QYFJSB")
    private String qyfjsb;
    @TableField("BXYWSJAFS")
    private String bxywsjafs;

    @TableField("SFKWSLA")
    private String sfkwsla;


    public Long getLsh() {
        return lsh;
    }

    public void setLsh(Long lsh) {
        this.lsh = lsh;
    }

    public Long getDm() {
        return dm;
    }

    public void setDm(Long dm) {
        this.dm = dm;
    }

    public Long getFdm() {
        return fdm;
    }

    public void setFdm(Long fdm) {
        this.fdm = fdm;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    public String getDzlx() {
        return dzlx;
    }

    public void setDzlx(String dzlx) {
        this.dzlx = dzlx;
    }

    public String getDzmc() {
        return dzmc;
    }

    public void setDzmc(String dzmc) {
        this.dzmc = dzmc;
    }

    public String getAjxz() {
        return ajxz;
    }

    public void setAjxz(String ajxz) {
        this.ajxz = ajxz;
    }

    public String getAjxzmc() {
        return ajxzmc;
    }

    public void setAjxzmc(String ajxzmc) {
        this.ajxzmc = ajxzmc;
    }

    public String getSpcx() {
        return spcx;
    }

    public void setSpcx(String spcx) {
        this.spcx = spcx;
    }

    public String getSpcxmc() {
        return spcxmc;
    }

    public void setSpcxmc(String spcxmc) {
        this.spcxmc = spcxmc;
    }

    public String getAjbm() {
        return ajbm;
    }

    public void setAjbm(String ajbm) {
        this.ajbm = ajbm;
    }

    public String getAjms() {
        return ajms;
    }

    public void setAjms(String ajms) {
        this.ajms = ajms;
    }

    public String getCcbm() {
        return ccbm;
    }

    public void setCcbm(String ccbm) {
        this.ccbm = ccbm;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy;
    }

    public Long getPxh() {
        return pxh;
    }

    public void setPxh(Long pxh) {
        this.pxh = pxh;
    }

    public Long getYwlxdm() {
        return ywlxdm;
    }

    public void setYwlxdm(Long ywlxdm) {
        this.ywlxdm = ywlxdm;
    }

    public String getJafskind() {
        return jafskind;
    }

    public void setJafskind(String jafskind) {
        this.jafskind = jafskind;
    }

    public String getJafscode() {
        return jafscode;
    }

    public void setJafscode(String jafscode) {
        this.jafscode = jafscode;
    }

    public String getAjbmn() {
        return ajbmn;
    }

    public void setAjbmn(String ajbmn) {
        this.ajbmn = ajbmn;
    }

    public String getAjlykind() {
        return ajlykind;
    }

    public void setAjlykind(String ajlykind) {
        this.ajlykind = ajlykind;
    }

    public String getAjlycode() {
        return ajlycode;
    }

    public void setAjlycode(String ajlycode) {
        this.ajlycode = ajlycode;
    }

    public String getSfqyznba() {
        return sfqyznba;
    }

    public void setSfqyznba(String sfqyznba) {
        this.sfqyznba = sfqyznba;
    }

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
        this.ay = ay;
    }

    public String getLascjlkind() {
        return lascjlkind;
    }

    public void setLascjlkind(String lascjlkind) {
        this.lascjlkind = lascjlkind;
    }

    public String getLaspjlkind() {
        return laspjlkind;
    }

    public void setLaspjlkind(String laspjlkind) {
        this.laspjlkind = laspjlkind;
    }

    public String getAjlxbs() {
        return ajlxbs;
    }

    public void setAjlxbs(String ajlxbs) {
        this.ajlxbs = ajlxbs;
    }

    public String getLasc() {
        return lasc;
    }

    public void setLasc(String lasc) {
        this.lasc = lasc;
    }

    public String getLasp() {
        return lasp;
    }

    public void setLasp(String lasp) {
        this.lasp = lasp;
    }

    public String getQyfjsb() {
        return qyfjsb;
    }

    public void setQyfjsb(String qyfjsb) {
        this.qyfjsb = qyfjsb;
    }

    public String getBxywsjafs() {
        return bxywsjafs;
    }

    public void setBxywsjafs(String bxywsjafs) {
        this.bxywsjafs = bxywsjafs;
    }

    public String getSfkwsla() {
        return sfkwsla;
    }

    public void setSfkwsla(String sfkwsla) {
        this.sfkwsla = sfkwsla;
    }

    @Override
    public String toString() {
        return "TsAjcxbm2015{" +
                "lsh=" + lsh +
                ", dm=" + dm +
                ", fdm=" + fdm +
                ", ajmc=" + ajmc +
                ", dzlx=" + dzlx +
                ", dzmc=" + dzmc +
                ", ajxz=" + ajxz +
                ", ajxzmc=" + ajxzmc +
                ", spcx=" + spcx +
                ", spcxmc=" + spcxmc +
                ", ajbm=" + ajbm +
                ", ajms=" + ajms +
                ", ccbm=" + ccbm +
                ", flag=" + flag +
                ", sfjy=" + sfjy +
                ", pxh=" + pxh +
                ", ywlxdm=" + ywlxdm +
                ", jafskind=" + jafskind +
                ", jafscode=" + jafscode +
                ", ajbmn=" + ajbmn +
                ", ajlykind=" + ajlykind +
                ", ajlycode=" + ajlycode +
                ", sfqyznba=" + sfqyznba +
                ", ay=" + ay +
                ", lascjlkind=" + lascjlkind +
                ", laspjlkind=" + laspjlkind +
                ", ajlxbs=" + ajlxbs +
                ", lasc=" + lasc +
                ", lasp=" + lasp +
                ", qyfjsb=" + qyfjsb +
                ", bxywsjafs=" + bxywsjafs +
                ", sfkwsla=" + sfkwsla +
                "}";
    }
}
