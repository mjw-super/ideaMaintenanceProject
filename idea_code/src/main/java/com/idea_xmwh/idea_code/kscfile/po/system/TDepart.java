package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 部门对象
 * </p>
 * @author XiongWei
 * @since 2019-10-25
 */
@TableName("T_DEPART")
public class TDepart {

    public static final String BMDM = "BMDM";
    public static final String FBMDM = "FBMDM";
    public static final String DWDM = "DWDM";
    public static final String BMID = "BMID";
    public static final String BMMC = "BMMC";
    public static final String BMJC = "BMJC";
    public static final String PCFT = "PCFT";
    public static final String LXRR = "LXRR";
    public static final String LXDH = "LXDH";
    public static final String SFLAST = "SFLAST";
    public static final String SFJY = "SFJY";
    public static final String PXH = "PXH";
    public static final String BMBS = "BMBS";
    public static final String LASTUPDATE = "LASTUPDATE";
    public static final String DEPTID = "DEPTID";
    public static final String WSXXBGK = "WSXXBGK";
    public static final String YZBM = "YZBM";
    public static final String DZ = "DZ";
    public static final String TSTAMP = "TSTAMP";
    public static final String BMUID = "BMUID";
    private static final long serialVersionUID = 1L;
    @TableId("BMDM")
    private String bmdm;
    @TableField("FBMDM")
    private String fbmdm;
    @TableField("DWDM")
    private String dwdm;
    @TableField("BMID")
    private String bmid;
    @TableField("BMMC")
    private String bmmc;
    @TableField("BMJC")
    private String bmjc;
    @TableField("PCFT")
    private String pcft;
    @TableField("LXRR")
    private String lxrr;
    @TableField("LXDH")
    private String lxdh;
    @TableField("SFLAST")
    private String sflast;
    @TableField("SFJY")
    private String sfjy;
    @TableField("PXH")
    private Long pxh;
    @TableField("BMBS")
    private Long bmbs;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("DEPTID")
    private String deptid;
    @TableField("WSXXBGK")
    private String wsxxbgk;
    @TableField("YZBM")
    private String yzbm;
    @TableField("DZ")
    private String dz;
    @TableField("TSTAMP")
    private Date tstamp;
    @TableField("BMUID")
    private String bmuid;

    public String getBmdm() {
        return bmdm;
    }

    public void setBmdm(String bmdm) {
        this.bmdm = bmdm;
    }

    public String getFbmdm() {
        return fbmdm;
    }

    public void setFbmdm(String fbmdm) {
        this.fbmdm = fbmdm;
    }

    public String getDwdm() {
        return dwdm;
    }

    public void setDwdm(String dwdm) {
        this.dwdm = dwdm;
    }

    public String getBmid() {
        return bmid;
    }

    public void setBmid(String bmid) {
        this.bmid = bmid;
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    public String getBmjc() {
        return bmjc;
    }

    public void setBmjc(String bmjc) {
        this.bmjc = bmjc;
    }

    public String getPcft() {
        return pcft;
    }

    public void setPcft(String pcft) {
        this.pcft = pcft;
    }

    public String getLxrr() {
        return lxrr;
    }

    public void setLxrr(String lxrr) {
        this.lxrr = lxrr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getSflast() {
        return sflast;
    }

    public void setSflast(String sflast) {
        this.sflast = sflast;
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

    public Long getBmbs() {
        return bmbs;
    }

    public void setBmbs(Long bmbs) {
        this.bmbs = bmbs;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getWsxxbgk() {
        return wsxxbgk;
    }

    public void setWsxxbgk(String wsxxbgk) {
        this.wsxxbgk = wsxxbgk;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public Date getTstamp() {
        return tstamp;
    }

    public void setTstamp(Date tstamp) {
        this.tstamp = tstamp;
    }

    public String getBmuid() {
        return bmuid;
    }

    public void setBmuid(String bmuid) {
        this.bmuid = bmuid;
    }


    @Override
    public String toString() {
        return "TDepart{" +
                "bmdm=" + bmdm +
                ", fbmdm=" + fbmdm +
                ", dwdm=" + dwdm +
                ", bmid=" + bmid +
                ", bmmc=" + bmmc +
                ", bmjc=" + bmjc +
                ", pcft=" + pcft +
                ", lxrr=" + lxrr +
                ", lxdh=" + lxdh +
                ", sflast=" + sflast +
                ", sfjy=" + sfjy +
                ", pxh=" + pxh +
                ", bmbs=" + bmbs +
                ", lastupdate=" + lastupdate +
                ", deptid=" + deptid +
                ", wsxxbgk=" + wsxxbgk +
                ", yzbm=" + yzbm +
                ", dz=" + dz +
                ", tstamp=" + tstamp +
                ", bmuid=" + bmuid +
                "}";
    }
}
