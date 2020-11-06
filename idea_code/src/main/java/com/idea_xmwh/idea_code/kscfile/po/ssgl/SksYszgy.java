package com.tdh.light.spxt.bp.po.ssgl;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author: xiongsc
 * @Date: 2020/7/2 14:05
 * @Description:
 */
@TableName("sks_yszgy")
public class SksYszgy {

    @TableField("AHDM")
    private String ahdm;
    @TableField("XH")
    private Short xh;
    @TableField(value = "YSXH" ,fill = FieldFill.INSERT)
    private Integer ysxh;
    @TableField("STM")
    private String stm;
    @TableField("FYDM")
    private String fydm;
    @TableField("ZT")
    private Integer zt;
    @TableField("SBCS")
    private Integer sbcs;
    @TableField("SBYY")
    private String sbyy;
    @TableField("SFTX")
    private String sftx;
    @TableField("LASTUPDATE")
    private Date lastupdate;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Short getXh() {
        return xh;
    }

    public void setXh(Short xh) {
        this.xh = xh;
    }

    public Integer getYsxh() {
        return ysxh;
    }

    public void setYsxh(Integer ysxh) {
        this.ysxh = ysxh;
    }

    public String getStm() {
        return stm;
    }

    public void setStm(String stm) {
        this.stm = stm;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public Integer getSbcs() {
        return sbcs;
    }

    public void setSbcs(Integer sbcs) {
        this.sbcs = sbcs;
    }

    public String getSbyy() {
        return sbyy;
    }

    public void setSbyy(String sbyy) {
        this.sbyy = sbyy;
    }

    public String getSftx() {
        return sftx;
    }

    public void setSftx(String sftx) {
        this.sftx = sftx;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
