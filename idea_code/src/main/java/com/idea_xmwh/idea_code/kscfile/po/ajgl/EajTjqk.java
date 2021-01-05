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
@TableName("EAJ_TJQK")
public class EajTjqk {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField("TJFS")
    private String tjfs;
    @TableField("TJJD")
    private String tjjd;
    @TableField("TJDW")
    private String tjdw;
    @TableField("WTTJRQ")
    private String wttjrq;
    @TableField("TJJG")
    private String tjjg;
    @TableField("TJRQ")
    private String tjrq;
    @TableField("TJR")
    private String tjr;
    @TableField("TJJGSM")
    private String tjjgsm;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("TJLB")
    private String tjlb;
    @TableField("SQDJCX")
    private String sqdjcx;
    @TableField("ZHLASY")
    private String zhlasy;
    @TableField("SSBDW")
    private String ssbdw;
    @TableField("TJYX")
    private String tjyx;
    @TableField("YXTJSJ")
    private String yxtjsj;
    @TableField("TJBM")
    private String tjbm;
    @TableField("TJFG")
    private String tjfg;
    @TableField("WPDW")
    private String wpdw;
    @TableField("TJDD")
    private String tjdd;
    @TableField("SFFGCY")
    private String sffgcy;
    @TableField("QTFS")
    private String qtfs;
    @TableField("TJRLB")
    private String tjrlb;
    @TableField("SFYQ")
    private String sfyq;
    @TableField("SFLX")
    private String sflx;
    @TableField("LXQK")
    private String lxqk;
    @TableField("SFZFL")
    private String sfzfl;
    @TableField("LAAHDM")
    private String laahdm;
    @TableField("LAAH")
    private String laah;
    @TableField("ZLA")
    private String zla;
    @TableField("TJBL")
    private String tjbl;
    @TableField("TJS")
    private String tjs;
    @TableField("TJDWDM")
    private String tjdwdm;
    @TableField("WSTJBS")
    private String wstjbs;
    @TableField("SQAHDM")
    private String sqahdm;
    @TableField("TJPT")
    private String tjpt;
    @TableField("RMTJYTJ")
    private String rmtjytj;
    @TableField("TJSQSM")
    private String tjsqsm;
    @TableField("SFTJAH")
    private String sftjah;
    @TableField("TJWS")
    private String tjws;
    @TableField("SFBX")
    private String sfbx;
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

    public String getTjfs() {
        return tjfs;
    }

    public void setTjfs(String tjfs) {
        this.tjfs = tjfs;
    }

    public String getTjjd() {
        return tjjd;
    }

    public void setTjjd(String tjjd) {
        this.tjjd = tjjd;
    }

    public String getTjdw() {
        return tjdw;
    }

    public void setTjdw(String tjdw) {
        this.tjdw = tjdw;
    }

    public String getWttjrq() {
        return wttjrq;
    }

    public void setWttjrq(String wttjrq) {
        this.wttjrq = wttjrq;
    }

    public String getTjjg() {
        return tjjg;
    }

    public void setTjjg(String tjjg) {
        this.tjjg = tjjg;
    }

    public String getTjrq() {
        return tjrq;
    }

    public void setTjrq(String tjrq) {
        this.tjrq = tjrq;
    }

    public String getTjr() {
        return tjr;
    }

    public void setTjr(String tjr) {
        this.tjr = tjr;
    }

    public String getTjjgsm() {
        return tjjgsm;
    }

    public void setTjjgsm(String tjjgsm) {
        this.tjjgsm = tjjgsm;
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

    public String getTjlb() {
        return tjlb;
    }

    public void setTjlb(String tjlb) {
        this.tjlb = tjlb;
    }

    public String getSqdjcx() {
        return sqdjcx;
    }

    public void setSqdjcx(String sqdjcx) {
        this.sqdjcx = sqdjcx;
    }

    public String getZhlasy() {
        return zhlasy;
    }

    public void setZhlasy(String zhlasy) {
        this.zhlasy = zhlasy;
    }

    public String getSsbdw() {
        return ssbdw;
    }

    public void setSsbdw(String ssbdw) {
        this.ssbdw = ssbdw;
    }

    public String getTjyx() {
        return tjyx;
    }

    public void setTjyx(String tjyx) {
        this.tjyx = tjyx;
    }

    public String getYxtjsj() {
        return yxtjsj;
    }

    public void setYxtjsj(String yxtjsj) {
        this.yxtjsj = yxtjsj;
    }

    public String getTjbm() {
        return tjbm;
    }

    public void setTjbm(String tjbm) {
        this.tjbm = tjbm;
    }

    public String getTjfg() {
        return tjfg;
    }

    public void setTjfg(String tjfg) {
        this.tjfg = tjfg;
    }

    public String getWpdw() {
        return wpdw;
    }

    public void setWpdw(String wpdw) {
        this.wpdw = wpdw;
    }

    public String getTjdd() {
        return tjdd;
    }

    public void setTjdd(String tjdd) {
        this.tjdd = tjdd;
    }

    public String getSffgcy() {
        return sffgcy;
    }

    public void setSffgcy(String sffgcy) {
        this.sffgcy = sffgcy;
    }

    public String getQtfs() {
        return qtfs;
    }

    public void setQtfs(String qtfs) {
        this.qtfs = qtfs;
    }

    public String getTjrlb() {
        return tjrlb;
    }

    public void setTjrlb(String tjrlb) {
        this.tjrlb = tjrlb;
    }

    public String getSfyq() {
        return sfyq;
    }

    public void setSfyq(String sfyq) {
        this.sfyq = sfyq;
    }

    public String getSflx() {
        return sflx;
    }

    public void setSflx(String sflx) {
        this.sflx = sflx;
    }

    public String getLxqk() {
        return lxqk;
    }

    public void setLxqk(String lxqk) {
        this.lxqk = lxqk;
    }

    public String getSfzfl() {
        return sfzfl;
    }

    public void setSfzfl(String sfzfl) {
        this.sfzfl = sfzfl;
    }

    public String getLaahdm() {
        return laahdm;
    }

    public void setLaahdm(String laahdm) {
        this.laahdm = laahdm;
    }

    public String getLaah() {
        return laah;
    }

    public void setLaah(String laah) {
        this.laah = laah;
    }

    public String getZla() {
        return zla;
    }

    public void setZla(String zla) {
        this.zla = zla;
    }

    public String getTjbl() {
        return tjbl;
    }

    public void setTjbl(String tjbl) {
        this.tjbl = tjbl;
    }

    public String getTjs() {
        return tjs;
    }

    public void setTjs(String tjs) {
        this.tjs = tjs;
    }

    public String getTjdwdm() {
        return tjdwdm;
    }

    public void setTjdwdm(String tjdwdm) {
        this.tjdwdm = tjdwdm;
    }

    public String getWstjbs() {
        return wstjbs;
    }

    public void setWstjbs(String wstjbs) {
        this.wstjbs = wstjbs;
    }

    public String getTjpt() {
        return tjpt;
    }

    public void setTjpt(String tjpt) {
        this.tjpt = tjpt;
    }

    public String getSqahdm() {
        return sqahdm;
    }

    public void setSqahdm(String sqahdm) {
        this.sqahdm = sqahdm;
    }

    public String getRmtjytj() {
        return rmtjytj;
    }

    public void setRmtjytj(String rmtjytj) {
        this.rmtjytj = rmtjytj;
    }

    public String getTjsqsm() {
        return tjsqsm;
    }

    public void setTjsqsm(String tjsqsm) {
        this.tjsqsm = tjsqsm;
    }

    public String getSftjah() {
        return sftjah;
    }

    public void setSftjah(String sftjah) {
        this.sftjah = sftjah;
    }

    public String getTjws() {
        return tjws;
    }

    public void setTjws(String tjws) {
        this.tjws = tjws;
    }

    public String getSfbx() {
        return sfbx;
    }

    public void setSfbx(String sfbx) {
        this.sfbx = sfbx;
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
        return "EajTjqk{" +
                "ahdm='" + ahdm + '\'' +
                ", fydm='" + fydm + '\'' +
                ", tjfs='" + tjfs + '\'' +
                ", tjjd='" + tjjd + '\'' +
                ", tjdw='" + tjdw + '\'' +
                ", wttjrq='" + wttjrq + '\'' +
                ", tjjg='" + tjjg + '\'' +
                ", tjrq='" + tjrq + '\'' +
                ", tjr='" + tjr + '\'' +
                ", tjjgsm='" + tjjgsm + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", lastupdate=" + lastupdate +
                ", tjlb='" + tjlb + '\'' +
                ", sqdjcx='" + sqdjcx + '\'' +
                ", zhlasy='" + zhlasy + '\'' +
                ", ssbdw='" + ssbdw + '\'' +
                ", tjyx='" + tjyx + '\'' +
                ", yxtjsj='" + yxtjsj + '\'' +
                ", tjbm='" + tjbm + '\'' +
                ", tjfg='" + tjfg + '\'' +
                ", wpdw='" + wpdw + '\'' +
                ", tjdd='" + tjdd + '\'' +
                ", sffgcy='" + sffgcy + '\'' +
                ", qtfs='" + qtfs + '\'' +
                ", tjrlb='" + tjrlb + '\'' +
                ", sfyq='" + sfyq + '\'' +
                ", sflx='" + sflx + '\'' +
                ", lxqk='" + lxqk + '\'' +
                ", sfzfl='" + sfzfl + '\'' +
                ", laahdm='" + laahdm + '\'' +
                ", laah='" + laah + '\'' +
                ", zla='" + zla + '\'' +
                ", tjbl='" + tjbl + '\'' +
                ", tjs='" + tjs + '\'' +
                ", tjdwdm='" + tjdwdm + '\'' +
                ", wstjbs='" + wstjbs + '\'' +
                ", sqahdm='" + sqahdm + '\'' +
                ", tjpt='" + tjpt + '\'' +
                ", rmtjytj='" + rmtjytj + '\'' +
                ", tjsqsm='" + tjsqsm + '\'' +
                ", sftjah='" + sftjah + '\'' +
                ", tjws='" + tjws + '\'' +
                ", sfbx='" + sfbx + '\'' +
                ", isDeleted=" + isDeleted +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", gmtCreat=" + gmtCreat +
                '}';
    }
}
