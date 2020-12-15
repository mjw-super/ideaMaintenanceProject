package com.idea_xmwh.idea_code.kscfile.po.fjfl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:繁简分流指标-指标项
 * Project Name:spxt
 * File Name:FjflZbZbx
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/10/19 9:14   zhouhua         1.0       1.0 Version
 **/
@TableName("FJFL_ZB_ZBX")
public class FjflZbZbx {

    @TableId("BH")
    private Integer bh;
    @TableField("FL")
    private String fl;
    @TableField("FLMC")
    private String flmc;
    @TableField("FLPXH")
    private Integer flpxh;
    @TableField("ZBXMC")
    private String zbxmc;
    @TableField("ZBXSM")
    private String zbxsm;
    @TableField("SFJY")
    private String sfjy;
    @TableField("ZBXBS")
    private String zbxbs;
    @TableField("ZBXTB")
    private String zbxtb;
    @TableField("ZBXCOL")
    private String zbxcol;
    @TableField("ZBXSQL")
    private String zbxsql;
    @TableField("ZBXPXH")
    private Integer zbxpxh;

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getFlmc() {
        return flmc;
    }

    public void setFlmc(String flmc) {
        this.flmc = flmc;
    }

    public Integer getFlpxh() {
        return flpxh;
    }

    public void setFlpxh(Integer flpxh) {
        this.flpxh = flpxh;
    }

    public String getZbxmc() {
        return zbxmc;
    }

    public void setZbxmc(String zbxmc) {
        this.zbxmc = zbxmc;
    }

    public String getZbxsm() {
        return zbxsm;
    }

    public void setZbxsm(String zbxsm) {
        this.zbxsm = zbxsm;
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy;
    }

    public String getZbxbs() {
        return zbxbs;
    }

    public void setZbxbs(String zbxbs) {
        this.zbxbs = zbxbs;
    }

    public String getZbxtb() {
        return zbxtb;
    }

    public void setZbxtb(String zbxtb) {
        this.zbxtb = zbxtb;
    }

    public String getZbxcol() {
        return zbxcol;
    }

    public void setZbxcol(String zbxcol) {
        this.zbxcol = zbxcol;
    }

    public String getZbxsql() {
        return zbxsql;
    }

    public void setZbxsql(String zbxsql) {
        this.zbxsql = zbxsql;
    }

    public Integer getZbxpxh() {
        return zbxpxh;
    }

    public void setZbxpxh(Integer zbxpxh) {
        this.zbxpxh = zbxpxh;
    }
}
