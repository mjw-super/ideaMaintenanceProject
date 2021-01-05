package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:
 * Project Name:spxt
 * File Name:StSx
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/21 15:29   xiongsc         1.0       1.0 Version
 **/
@TableName("ST_SX")
public class StSx {

    @TableField("STBH")
    private String stbh;
    @TableField("BH")
    private String bh;
    @TableField("SXMC")
    private String sxmc;
    @TableField("GFLX")
    private String gflx;
    @TableField("SXSM")
    private String sxsm;
    @TableField("TAB")
    private String tab;
    @TableField("COL")
    private String col;
    @TableField("PXH")
    private Integer pxh;
    @TableField("IOCL")
    private String iocl;
    @TableField("BEIZ")
    private String beiz;
    @TableField("BTX")
    private String btx;
    @TableField("SFFX")
    private String sffx;
    @TableField("GZBH")
    private String gzbh;
    @TableField("SFKZ")
    private String sfkz;
    @TableField("SFSB")
    private String sfsb;
    @TableField("SBSM")
    private String sbsm;

    public String getStbh() {
        return stbh;
    }

    public void setStbh(String stbh) {
        this.stbh = stbh;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getSxmc() {
        return sxmc;
    }

    public void setSxmc(String sxmc) {
        this.sxmc = sxmc;
    }

    public String getGflx() {
        return gflx;
    }

    public void setGflx(String gflx) {
        this.gflx = gflx;
    }

    public String getSxsm() {
        return sxsm;
    }

    public void setSxsm(String sxsm) {
        this.sxsm = sxsm;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public Integer getPxh() {
        return pxh;
    }

    public void setPxh(Integer pxh) {
        this.pxh = pxh;
    }

    public String getIocl() {
        return iocl;
    }

    public void setIocl(String iocl) {
        this.iocl = iocl;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getBtx() {
        return btx;
    }

    public void setBtx(String btx) {
        this.btx = btx;
    }

    public String getSffx() {
        return sffx;
    }

    public void setSffx(String sffx) {
        this.sffx = sffx;
    }

    public String getGzbh() {
        return gzbh;
    }

    public void setGzbh(String gzbh) {
        this.gzbh = gzbh;
    }

    public String getSfkz() {
        return sfkz;
    }

    public void setSfkz(String sfkz) {
        this.sfkz = sfkz;
    }

    public String getSfsb() {
        return sfsb;
    }

    public void setSfsb(String sfsb) {
        this.sfsb = sfsb;
    }

    public String getSbsm() {
        return sbsm;
    }

    public void setSbsm(String sbsm) {
        this.sbsm = sbsm;
    }
}
