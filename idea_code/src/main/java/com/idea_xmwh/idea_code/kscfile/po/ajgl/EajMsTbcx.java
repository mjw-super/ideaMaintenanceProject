package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 * @author XiongWei
 * @since 2019-11-01
 */
@TableName("EAJ_MS_TBCX")
public class EajMsTbcx {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("XJWYH")
    private String xjwyh;
    @TableField("XJR")
    private String xjr;
    @TableField("SAAH")
    private String saah;
    @TableField("DBZQSE")
    private Double dbzqse;
    @TableField("TJXYQDRQ")
    private String tjxyqdrq;
    @TableField("SSJD")
    private String ssjd;
    @TableField("SQZRXZJJSE")
    private Double sqzrxzjjse;
    @TableField("JGMC")
    private String jgmc;
    @TableField("YRDW")
    private String yrdw;
    @TableField("CBQSZSH")
    private String cbqszsh;
    @TableField("CBMC")
    private String cbmc;
    @TableField("CGDJLX")
    private String cgdjlx;
    @TableField("SQSX")
    private String sqsx;
    @TableField("PJPMSE")
    private Double pjpmse;
    @TableField("PJFKRQ")
    private String pjfkrq;
    @TableField("SQZFSX")
    private String sqzfsx;
    @TableField("CPXS")
    private String cpxs;
    @TableField("CPDW")
    private String cpdw;
    @TableField("SQLX")
    private String sqlx;
    @TableField("CPAY")
    private String cpay;
    @TableField("PJRQ")
    private String pjrq;
    @TableField("CPSXRQ")
    private String cpsxrq;
    @TableField("CPKQZZXRQ")
    private String cpkqzzxrq;
    @TableField("LSZC")
    private String lszc;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("GGRQ")
    private String ggrq;
    @TableField("GGQX")
    private String ggqx;
    @TableField("SYSE")
    private Double syse;
    @TableField("THRQ")
    private String thrq;
    @TableField("ZYSLJJCDSXRQ")
    private String zysljjcdsxrq;
    @TableField("SLJJXS")
    private String sljjxs;
    @TableField("BZJSE")
    private Double bzjse;
    @TableField("DBCCJZ")
    private Double dbccjz;
    @TableField("ZRXZSE")
    private Double zrxzse;
    @TableField("LX")
    private Double lx;
    @TableField("JJSLRQ")
    private String jjslrq;
    @TableField("BQZT")
    private String bqzt;
    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtCreat;

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

    public String getXjwyh() {
        return xjwyh;
    }

    public void setXjwyh(String xjwyh) {
        this.xjwyh = xjwyh;
    }

    public String getXjr() {
        return xjr;
    }

    public void setXjr(String xjr) {
        this.xjr = xjr;
    }

    public String getSaah() {
        return saah;
    }

    public void setSaah(String saah) {
        this.saah = saah;
    }

    public Double getDbzqse() {
        return dbzqse;
    }

    public void setDbzqse(Double dbzqse) {
        this.dbzqse = dbzqse;
    }

    public String getTjxyqdrq() {
        return tjxyqdrq;
    }

    public void setTjxyqdrq(String tjxyqdrq) {
        this.tjxyqdrq = tjxyqdrq;
    }

    public String getSsjd() {
        return ssjd;
    }

    public void setSsjd(String ssjd) {
        this.ssjd = ssjd;
    }

    public Double getSqzrxzjjse() {
        return sqzrxzjjse;
    }

    public void setSqzrxzjjse(Double sqzrxzjjse) {
        this.sqzrxzjjse = sqzrxzjjse;
    }

    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public String getYrdw() {
        return yrdw;
    }

    public void setYrdw(String yrdw) {
        this.yrdw = yrdw;
    }

    public String getCbqszsh() {
        return cbqszsh;
    }

    public void setCbqszsh(String cbqszsh) {
        this.cbqszsh = cbqszsh;
    }

    public String getCbmc() {
        return cbmc;
    }

    public void setCbmc(String cbmc) {
        this.cbmc = cbmc;
    }

    public String getCgdjlx() {
        return cgdjlx;
    }

    public void setCgdjlx(String cgdjlx) {
        this.cgdjlx = cgdjlx;
    }

    public String getSqsx() {
        return sqsx;
    }

    public void setSqsx(String sqsx) {
        this.sqsx = sqsx;
    }

    public Double getPjpmse() {
        return pjpmse;
    }

    public void setPjpmse(Double pjpmse) {
        this.pjpmse = pjpmse;
    }

    public String getPjfkrq() {
        return pjfkrq;
    }

    public void setPjfkrq(String pjfkrq) {
        this.pjfkrq = pjfkrq;
    }

    public String getSqzfsx() {
        return sqzfsx;
    }

    public void setSqzfsx(String sqzfsx) {
        this.sqzfsx = sqzfsx;
    }

    public String getCpxs() {
        return cpxs;
    }

    public void setCpxs(String cpxs) {
        this.cpxs = cpxs;
    }

    public String getCpdw() {
        return cpdw;
    }

    public void setCpdw(String cpdw) {
        this.cpdw = cpdw;
    }

    public String getSqlx() {
        return sqlx;
    }

    public void setSqlx(String sqlx) {
        this.sqlx = sqlx;
    }

    public String getCpay() {
        return cpay;
    }

    public void setCpay(String cpay) {
        this.cpay = cpay;
    }

    public String getPjrq() {
        return pjrq;
    }

    public void setPjrq(String pjrq) {
        this.pjrq = pjrq;
    }

    public String getCpsxrq() {
        return cpsxrq;
    }

    public void setCpsxrq(String cpsxrq) {
        this.cpsxrq = cpsxrq;
    }

    public String getCpkqzzxrq() {
        return cpkqzzxrq;
    }

    public void setCpkqzzxrq(String cpkqzzxrq) {
        this.cpkqzzxrq = cpkqzzxrq;
    }

    public String getLszc() {
        return lszc;
    }

    public void setLszc(String lszc) {
        this.lszc = lszc;
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

    public String getGgrq() {
        return ggrq;
    }

    public void setGgrq(String ggrq) {
        this.ggrq = ggrq;
    }

    public String getGgqx() {
        return ggqx;
    }

    public void setGgqx(String ggqx) {
        this.ggqx = ggqx;
    }

    public Double getSyse() {
        return syse;
    }

    public void setSyse(Double syse) {
        this.syse = syse;
    }

    public String getThrq() {
        return thrq;
    }

    public void setThrq(String thrq) {
        this.thrq = thrq;
    }

    public String getZysljjcdsxrq() {
        return zysljjcdsxrq;
    }

    public void setZysljjcdsxrq(String zysljjcdsxrq) {
        this.zysljjcdsxrq = zysljjcdsxrq;
    }

    public String getSljjxs() {
        return sljjxs;
    }

    public void setSljjxs(String sljjxs) {
        this.sljjxs = sljjxs;
    }

    public Double getBzjse() {
        return bzjse;
    }

    public void setBzjse(Double bzjse) {
        this.bzjse = bzjse;
    }

    public Double getDbccjz() {
        return dbccjz;
    }

    public void setDbccjz(Double dbccjz) {
        this.dbccjz = dbccjz;
    }

    public Double getZrxzse() {
        return zrxzse;
    }

    public void setZrxzse(Double zrxzse) {
        this.zrxzse = zrxzse;
    }

    public Double getLx() {
        return lx;
    }

    public void setLx(Double lx) {
        this.lx = lx;
    }

    public String getJjslrq() {
        return jjslrq;
    }

    public void setJjslrq(String jjslrq) {
        this.jjslrq = jjslrq;
    }

    public String getBqzt() {
        return bqzt;
    }

    public void setBqzt(String bqzt) {
        this.bqzt = bqzt;
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
        return "EajMsTbcx{" +
                "ahdm='" + ahdm + '\'' +
                ", fydm='" + fydm + '\'' +
                ", xjwyh='" + xjwyh + '\'' +
                ", xjr='" + xjr + '\'' +
                ", saah='" + saah + '\'' +
                ", dbzqse=" + dbzqse +
                ", tjxyqdrq='" + tjxyqdrq + '\'' +
                ", ssjd='" + ssjd + '\'' +
                ", sqzrxzjjse=" + sqzrxzjjse +
                ", jgmc='" + jgmc + '\'' +
                ", yrdw='" + yrdw + '\'' +
                ", cbqszsh='" + cbqszsh + '\'' +
                ", cbmc='" + cbmc + '\'' +
                ", cgdjlx='" + cgdjlx + '\'' +
                ", sqsx='" + sqsx + '\'' +
                ", pjpmse=" + pjpmse +
                ", pjfkrq='" + pjfkrq + '\'' +
                ", sqzfsx='" + sqzfsx + '\'' +
                ", cpxs='" + cpxs + '\'' +
                ", cpdw='" + cpdw + '\'' +
                ", sqlx='" + sqlx + '\'' +
                ", cpay='" + cpay + '\'' +
                ", pjrq='" + pjrq + '\'' +
                ", cpsxrq='" + cpsxrq + '\'' +
                ", cpkqzzxrq='" + cpkqzzxrq + '\'' +
                ", lszc='" + lszc + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", lastupdate=" + lastupdate +
                ", ggrq='" + ggrq + '\'' +
                ", ggqx='" + ggqx + '\'' +
                ", syse=" + syse +
                ", thrq='" + thrq + '\'' +
                ", zysljjcdsxrq='" + zysljjcdsxrq + '\'' +
                ", sljjxs='" + sljjxs + '\'' +
                ", bzjse=" + bzjse +
                ", dbccjz=" + dbccjz +
                ", zrxzse=" + zrxzse +
                ", lx=" + lx +
                ", jjslrq='" + jjslrq + '\'' +
                ", bqzt='" + bqzt + '\'' +
                ", isDeleted=" + isDeleted +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", gmtCreat=" + gmtCreat +
                '}';
    }
}
