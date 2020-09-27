package com.idea_xmwh.idea_code.kscfile.po.dajg;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:DAJG_SSCYRXX表映射
 * Project Name:spxt
 * File Name:DajgSscyrxx
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/10 18:08   hebq         1.0       1.0 Version
 **/
@TableName("DAJG_SSCYRXX")
public class DajgSscyrxx {

    @TableField("LSH")
    private String lsh;

    @TableField("XH")
    private Integer xh;

    @TableField("LX")
    private String lx;

    @TableField("XM")
    private String xm;

    @TableField("XB")
    private String xb;

    @TableField("NL")
    private Integer nl;

    @TableField("ZY")
    private String zy;

    @TableField("WHCD")
    private String whcd;

    public DajgSscyrxx() {
    }

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

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public Integer getNl() {
        return nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }
}
