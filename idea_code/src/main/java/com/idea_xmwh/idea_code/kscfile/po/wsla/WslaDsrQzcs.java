package com.idea_xmwh.idea_code.kscfile.po.wsla;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:
 * Project Name:spxt
 * File Name:WslaDsrQzcs
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/14 10:28   @author liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("WSLA_DSR_QZCS")
public class WslaDsrQzcs {

   @TableField("LSH")
   private String	lsh;
    @TableField("XH")
    private Integer	xh;
   @TableField("DSRXH")
   private String	dsrxh;
   @TableField("QZCSBH")
   private Integer	qzcsbh;
   @TableField("QZCSDM")
   private String	qzcsdm;
   @TableField("QZCSRQ")
   private String	qzcsrq;
   @TableField("PZJG")
   private String	pzjg;
   @TableField("ZXJG")
   private String	zxjg;
   @TableField("ZXRQ")
   private String	zxrq;
    @TableField("JSJZFS")
    private String	jsjzfs;
   @TableField("JSZDDD")
   private String	jszddd;
   @TableField("JYCS")
   private String	jycs;
   @TableField("QZCSJCRQ")
   private String	qzcsjcrq;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public Integer getQzcsbh() {
        return qzcsbh;
    }

    public void setQzcsbh(Integer qzcsbh) {
        this.qzcsbh = qzcsbh;
    }

    public String getQzcsdm() {
        return qzcsdm;
    }

    public void setQzcsdm(String qzcsdm) {
        this.qzcsdm = qzcsdm;
    }

    public String getQzcsrq() {
        return qzcsrq;
    }

    public void setQzcsrq(String qzcsrq) {
        this.qzcsrq = qzcsrq;
    }

    public String getPzjg() {
        return pzjg;
    }

    public void setPzjg(String pzjg) {
        this.pzjg = pzjg;
    }

    public String getZxjg() {
        return zxjg;
    }

    public void setZxjg(String zxjg) {
        this.zxjg = zxjg;
    }

    public String getZxrq() {
        return zxrq;
    }

    public void setZxrq(String zxrq) {
        this.zxrq = zxrq;
    }

    public String getJszddd() {
        return jszddd;
    }

    public void setJszddd(String jszddd) {
        this.jszddd = jszddd;
    }

    public String getJycs() {
        return jycs;
    }

    public void setJycs(String jycs) {
        this.jycs = jycs;
    }

    public String getQzcsjcrq() {
        return qzcsjcrq;
    }

    public void setQzcsjcrq(String qzcsjcrq) {
        this.qzcsjcrq = qzcsjcrq;
    }

    public String getJsjzfs() {
        return jsjzfs;
    }

    public void setJsjzfs(String jsjzfs) {
        this.jsjzfs = jsjzfs;
    }
}
