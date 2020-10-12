package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 * @author XiongWei
 * @since 2019-10-15
 */
@TableName("TS_AY")
public class TsAy {

    @TableId("DM")
    private Long dm;
    @TableField("AYMC")
    private String aymc;
    @TableField("FDM")
    private Long fdm;
    @TableField("LB")
    private String lb;
    @TableField("TJBH")
    private String tjbh;
    @TableField("CYSX")
    private String cysx;
    @TableField("SFCY")
    private String sfcy;
    @TableField("FLAG")
    private String flag;
    @TableField("SFJY")
    private String sfjy;
    @TableField("VER")
    private String ver;
    @TableField("V2005DM")
    private Long v2005dm;
    @TableField("V2009DM")
    private Long v2009dm;
    @TableField("CCBM")
    private String ccbm;
    @TableField("SYCS")
    private Long sycs;
    @TableField("SLFFL")
    private String slffl;
    @TableField("V2014DM")
    private Long v2014dm;
    @TableField("ZSCQLX")
    private String zscqlx;
    @TableField("SYXE")
    private String syxe;
    @TableField("ZMC")
    private String zmc;


    public Long getDm() {
        return dm;
    }

    public void setDm(Long dm) {
        this.dm = dm;
    }

    public String getAymc() {
        return aymc;
    }

    public void setAymc(String aymc) {
        this.aymc = aymc;
    }

    public Long getFdm() {
        return fdm;
    }

    public void setFdm(Long fdm) {
        this.fdm = fdm;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getTjbh() {
        return tjbh;
    }

    public void setTjbh(String tjbh) {
        this.tjbh = tjbh;
    }

    public String getCysx() {
        return cysx;
    }

    public void setCysx(String cysx) {
        this.cysx = cysx;
    }

    public String getSfcy() {
        return sfcy;
    }

    public void setSfcy(String sfcy) {
        this.sfcy = sfcy;
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

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public Long getV2005dm() {
        return v2005dm;
    }

    public void setV2005dm(Long v2005dm) {
        this.v2005dm = v2005dm;
    }

    public Long getV2009dm() {
        return v2009dm;
    }

    public void setV2009dm(Long v2009dm) {
        this.v2009dm = v2009dm;
    }

    public String getCcbm() {
        return ccbm;
    }

    public void setCcbm(String ccbm) {
        this.ccbm = ccbm;
    }

    public Long getSycs() {
        return sycs;
    }

    public void setSycs(Long sycs) {
        this.sycs = sycs;
    }

    public String getSlffl() {
        return slffl;
    }

    public void setSlffl(String slffl) {
        this.slffl = slffl;
    }

    public Long getV2014dm() {
        return v2014dm;
    }

    public void setV2014dm(Long v2014dm) {
        this.v2014dm = v2014dm;
    }

    public String getZscqlx() {
        return zscqlx;
    }

    public void setZscqlx(String zscqlx) {
        this.zscqlx = zscqlx;
    }

    public String getSyxe() {
        return syxe;
    }

    public void setSyxe(String syxe) {
        this.syxe = syxe;
    }

    public String getZmc() {
        return zmc;
    }

    public void setZmc(String zmc) {
        this.zmc = zmc;
    }

    @Override
    public String toString() {
        return "TsAy{" +
                "dm=" + dm +
                ", aymc=" + aymc +
                ", fdm=" + fdm +
                ", lb=" + lb +
                ", tjbh=" + tjbh +
                ", cysx=" + cysx +
                ", sfcy=" + sfcy +
                ", flag=" + flag +
                ", sfjy=" + sfjy +
                ", ver=" + ver +
                ", v2005dm=" + v2005dm +
                ", v2009dm=" + v2009dm +
                ", ccbm=" + ccbm +
                ", sycs=" + sycs +
                ", slffl=" + slffl +
                ", v2014dm=" + v2014dm +
                ", zscqlx=" + zscqlx +
                ", syxe=" + syxe +
                ", zmc=" + zmc +
                "}";
    }
}
