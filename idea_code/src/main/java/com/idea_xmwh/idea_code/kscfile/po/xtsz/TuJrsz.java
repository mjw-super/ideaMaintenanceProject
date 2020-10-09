package com.tdh.light.spxt.bp.po.xtsz;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:
 * Project Name:spxt
 * File Name:TuJrsz
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/27 10:52   xiongsc         1.0       1.0 Version
 **/
@TableName("TU_JRSZ")
public class TuJrsz {

    @TableField("FYDM")
    private String fydm;
    @TableField("XH")
    private Integer xh;
    @TableField("LX")
    private String lx;
    @TableField("JRLB")
    private String jrlb;
    @TableField("KSRQ")
    private String ksrq;
    @TableField("ZZRQ")
    private String zzrq;
    @TableField("SM")
    private String sm;

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getJrlb() {
        return jrlb;
    }

    public void setJrlb(String jrlb) {
        this.jrlb = jrlb;
    }

    public String getKsrq() {
        return ksrq;
    }

    public void setKsrq(String ksrq) {
        this.ksrq = ksrq;
    }

    public String getZzrq() {
        return zzrq;
    }

    public void setZzrq(String zzrq) {
        this.zzrq = zzrq;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }
}
