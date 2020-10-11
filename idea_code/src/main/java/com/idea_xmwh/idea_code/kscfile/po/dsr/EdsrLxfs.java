package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 当事人-联系方式
 * </p>
 * @author XiongWei
 * @since 2019-10-22
 */
@TableName("EDSR_LXFS")
public class EdsrLxfs {

    public static final String ROWUUID = "ROWUUID";
    public static final String AHDM = "AHDM";
    public static final String XH = "XH";
    public static final String LXFSLX = "LXFSLX";
    public static final String LXFSNR = "LXFSNR";
    public static final String SFMR = "SFMR";
    public static final String FYDM = "FYDM";
    public static final String LASTUPDATE = "LASTUPDATE";
    public static final String DSRXH = "DSRXH";
    public static final String BEIZ = "BEIZ";
    public static final String LXFSNR_M = "LXFSNR_M";
    private static final long serialVersionUID = 1L;
    @SuppressWarnings("AliDeprecation")
    @TableId(value = "ROWUUID", type = IdType.UUID)
    private String rowuuid;
    @TableField("AHDM")
    private String ahdm;
    @TableField("XH")
    private Integer xh;
    @TableField("LXFSLX")
    private String lxfslx;
    @TableField("LXFSNR")
    private String lxfsnr;
    @TableField("SFMR")
    private String sfmr;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("DSRXH")
    private String dsrxh;
    @TableField("BEIZ")
    private String beiz;
    @TableField("LXFSNR_M")
    private String lxfsnrM;

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

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getLxfslx() {
        return lxfslx;
    }

    public void setLxfslx(String lxfslx) {
        this.lxfslx = lxfslx;
    }

    public String getLxfsnr() {
        return lxfsnr;
    }

    public void setLxfsnr(String lxfsnr) {
        this.lxfsnr = lxfsnr;
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

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getLxfsnrM() {
        return lxfsnrM;
    }

    public void setLxfsnrM(String lxfsnrM) {
        this.lxfsnrM = lxfsnrM;
    }

    @Override
    public String toString() {
        return "EdsrLxfs{" +
                "rowuuid=" + rowuuid +
                ", ahdm=" + ahdm +
                ", xh=" + xh +
                ", lxfslx=" + lxfslx +
                ", lxfsnr=" + lxfsnr +
                ", sfmr=" + sfmr +
                ", fydm=" + fydm +
                ", lastupdate=" + lastupdate +
                ", dsrxh=" + dsrxh +
                ", beiz=" + beiz +
                ", lxfsnrM=" + lxfsnrM +
                "}";
    }
}
