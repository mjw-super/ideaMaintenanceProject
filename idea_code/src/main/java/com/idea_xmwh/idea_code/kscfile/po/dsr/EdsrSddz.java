package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 当事人送达地址
 * </p>
 *
 * @author cq
 * @since 2019-10-18
 */
@SuppressWarnings("AliDeprecation")
@TableName("EDSR_SDDZ")
public class EdsrSddz  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ROWUUID", type = IdType.UUID)
    private String rowuuid;
    @TableField("AHDM")
    private String ahdm;
    @TableField("DSRXH")
    private String dsrxh;
    @TableField("XH")
    private Integer xh;
    @TableField("DZ")
    private String dz;
    @TableField("ZDQSR")
    private String zdqsr;
    @TableField("SFMR")
    private String sfmr;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("DZ_M")
    private String dzM;


    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getZdqsr() {
        return zdqsr;
    }

    public void setZdqsr(String zdqsr) {
        this.zdqsr = zdqsr;
    }

    public String getSfmr() {
        return sfmr;
    }

    public void setSfmr(String sfmr) {
        this.sfmr = sfmr;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getDzM() {
        return dzM;
    }

    public void setDzM(String dzM) {
        this.dzM = dzM;
    }



    @Override
    public String toString() {
        return "EdsrSddz{" +
        "rowuuid=" + rowuuid +
        ", ahdm=" + ahdm +
        ", dsrxh=" + dsrxh +
        ", xh=" + xh +
        ", dz=" + dz +
        ", zdqsr=" + zdqsr +
        ", sfmr=" + sfmr +
        ", fydm=" + fydm +
        ", lastupdate=" + lastupdate +
        ", dzM=" + dzM +
        "}";
    }
}
