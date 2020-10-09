package com.tdh.light.spxt.bp.po.xtsz;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * Description:生成文书自定义  TU_SCWS_ZDY
 * Project Name:spxt
 * File Name:ScwsZdy
 * Package com.tdh.light.spxt.bp.po.xtsz
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/14 11:50   cd_gongpei      1.0           1.0 Version
 **/
@TableName("TU_SCWS_ZDY")
public class ScwsZdy implements Serializable {
    @TableField("ROWUUID")
    private String rowuuid;
    @TableField("FYDM")
    private String fydm;
    @TableField("AJLXDM")
    private Integer ajlxdm;
    @TableField("CZ")
    private String cz;
    @TableField("XXHH")
    private Integer xxhh;
    @TableField("AJLX")
    private String ajlx;
    @TableField("YSLB")
    private String yslb;
    @TableField("YSID")
    private Integer ysid;
    @TableField("YSMC")
    private String ysmc;
    @TableField("SYFW")
    private String syfw;
    @TableField("BMDM")
    private String bmdm;
    @TableField("YHDM")
    private String yhdm;
    @TableField("SCFS")
    private String scfs;
    @TableField("HBWD")
    private String hbwd;
    @TableField("TSTJ")
    private String tstj;
    @TableField("TSTJSQL")
    private String tstjsql;
    @TableField("DSRLX")
    private String dsrlx;
    @TableField("SSSC")
    private String sssc;
    @TableField("YBSC")
    private String ybsc;

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Integer getAjlxdm() {
        return ajlxdm;
    }

    public void setAjlxdm(Integer ajlxdm) {
        this.ajlxdm = ajlxdm;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public Integer getXxhh() {
        return xxhh;
    }

    public void setXxhh(Integer xxhh) {
        this.xxhh = xxhh;
    }

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
    }

    public String getYslb() {
        return yslb;
    }

    public void setYslb(String yslb) {
        this.yslb = yslb;
    }

    public Integer getYsid() {
        return ysid;
    }

    public void setYsid(Integer ysid) {
        this.ysid = ysid;
    }

    public String getYsmc() {
        return ysmc;
    }

    public void setYsmc(String ysmc) {
        this.ysmc = ysmc;
    }

    public String getSyfw() {
        return syfw;
    }

    public void setSyfw(String syfw) {
        this.syfw = syfw;
    }

    public String getBmdm() {
        return bmdm;
    }

    public void setBmdm(String bmdm) {
        this.bmdm = bmdm;
    }

    public String getYhdm() {
        return yhdm;
    }

    public void setYhdm(String yhdm) {
        this.yhdm = yhdm;
    }

    public String getScfs() {
        return scfs;
    }

    public void setScfs(String scfs) {
        this.scfs = scfs;
    }

    public String getHbwd() {
        return hbwd;
    }

    public void setHbwd(String hbwd) {
        this.hbwd = hbwd;
    }

    public String getTstj() {
        return tstj;
    }

    public void setTstj(String tstj) {
        this.tstj = tstj;
    }

    public String getTstjsql() {
        return tstjsql;
    }

    public void setTstjsql(String tstjsql) {
        this.tstjsql = tstjsql;
    }

    public String getDsrlx() {
        return dsrlx;
    }

    public void setDsrlx(String dsrlx) {
        this.dsrlx = dsrlx;
    }

    public String getSssc() {
        return sssc;
    }

    public void setSssc(String sssc) {
        this.sssc = sssc;
    }

    public String getYbsc() {
        return ybsc;
    }

    public void setYbsc(String ybsc) {
        this.ybsc = ybsc;
    }
}
