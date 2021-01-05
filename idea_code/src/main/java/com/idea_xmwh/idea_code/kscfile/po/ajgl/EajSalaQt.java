package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.ajgl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/25 15        gp     1.0        1.0 Version
 **/
@TableName("EAJ_SALA_QT")
public class EajSalaQt {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("SFZZP")
    private String sfzzp;
    @TableField("SFWSAJ")
    private String sfwsaj;
    @TableField("ZXAJSLFY")
    private String zxajslfy;
    @TableField("ZXAH")
    private String zxah;
    @TableField("SLFFJB")
    private String slffjb;
    @TableField("TYJRPCZT")
    private String tyjrpczt;
    @TableField("TYJRPCDSR")
    private String tyjrpcdsr;
    @TableField("JSWSSL")
    private Integer jswssl;
    @TableField("FSWSSL")
    private Integer fswssl;
    @TableField("ZCJG")
    private String zcjg;
    @TableField("MSWFSDSE")
    private Double mswfsdse;
    @TableField("ZSSCRQ")
    private String zsscrq;
    @TableField("DCAH")
    private String dcah;
    @TableField("DCAJLXDM")
    private Long dcajlxdm;
    @TableField("YSCBR")
    private String yscbr;
    @TableField("SALB")
    private String salb;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField("JCJGDM")
    private String jcjgdm;
    @TableField("SYQLX")
    private String syqlx;
    @TableField("SYQLXSM")
    private String syqlxsm;
    @TableField("JWBLQXY")
    private String jwblqxy;


    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getSfzzp() {
        return sfzzp;
    }

    public void setSfzzp(String sfzzp) {
        this.sfzzp = sfzzp;
    }

    public String getSfwsaj() {
        return sfwsaj;
    }

    public void setSfwsaj(String sfwsaj) {
        this.sfwsaj = sfwsaj;
    }

    public String getZxajslfy() {
        return zxajslfy;
    }

    public void setZxajslfy(String zxajslfy) {
        this.zxajslfy = zxajslfy;
    }

    public String getZxah() {
        return zxah;
    }

    public void setZxah(String zxah) {
        this.zxah = zxah;
    }

    public String getSlffjb() {
        return slffjb;
    }

    public void setSlffjb(String slffjb) {
        this.slffjb = slffjb;
    }

    public String getTyjrpczt() {
        return tyjrpczt;
    }

    public void setTyjrpczt(String tyjrpczt) {
        this.tyjrpczt = tyjrpczt;
    }

    public String getTyjrpcdsr() {
        return tyjrpcdsr;
    }

    public void setTyjrpcdsr(String tyjrpcdsr) {
        this.tyjrpcdsr = tyjrpcdsr;
    }

    public Integer getJswssl() {
        return jswssl;
    }

    public void setJswssl(Integer jswssl) {
        this.jswssl = jswssl;
    }

    public Integer getFswssl() {
        return fswssl;
    }

    public void setFswssl(Integer fswssl) {
        this.fswssl = fswssl;
    }

    public String getZcjg() {
        return zcjg;
    }

    public void setZcjg(String zcjg) {
        this.zcjg = zcjg;
    }

    public Double getMswfsdse() {
        return mswfsdse;
    }

    public void setMswfsdse(Double mswfsdse) {
        this.mswfsdse = mswfsdse;
    }

    public String getZsscrq() {
        return zsscrq;
    }

    public void setZsscrq(String zsscrq) {
        this.zsscrq = zsscrq;
    }

    public String getDcah() {
        return dcah;
    }

    public void setDcah(String dcah) {
        this.dcah = dcah;
    }

    public Long getDcajlxdm() {
        return dcajlxdm;
    }

    public void setDcajlxdm(Long dcajlxdm) {
        this.dcajlxdm = dcajlxdm;
    }

    public String getYscbr() {
        return yscbr;
    }

    public void setYscbr(String yscbr) {
        this.yscbr = yscbr;
    }

    public String getSalb() {
        return salb;
    }

    public void setSalb(String salb) {
        this.salb = salb;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getJcjgdm() {
        return jcjgdm;
    }

    public void setJcjgdm(String jcjgdm) {
        this.jcjgdm = jcjgdm;
    }

    public String getSyqlx() {
        return syqlx;
    }

    public void setSyqlx(String syqlx) {
        this.syqlx = syqlx;
    }

    public String getSyqlxsm() {
        return syqlxsm;
    }

    public void setSyqlxsm(String syqlxsm) {
        this.syqlxsm = syqlxsm;
    }

    public String getJwblqxy() {
        return jwblqxy;
    }

    public void setJwblqxy(String jwblqxy) {
        this.jwblqxy = jwblqxy;
    }

    @Override
    public String toString() {
        return "EajSalaQt{" +
                "ahdm='" + ahdm + '\'' +
                ", sfzzp='" + sfzzp + '\'' +
                ", sfwsaj='" + sfwsaj + '\'' +
                ", zxajslfy='" + zxajslfy + '\'' +
                ", zxah='" + zxah + '\'' +
                ", slffjb='" + slffjb + '\'' +
                ", tyjrpczt='" + tyjrpczt + '\'' +
                ", tyjrpcdsr='" + tyjrpcdsr + '\'' +
                ", jswssl=" + jswssl +
                ", fswssl=" + fswssl +
                ", zcjg='" + zcjg + '\'' +
                ", mswfsdse=" + mswfsdse +
                ", zsscrq='" + zsscrq + '\'' +
                ", dcah='" + dcah + '\'' +
                ", dcajlxdm=" + dcajlxdm +
                ", yscbr='" + yscbr + '\'' +
                ", salb='" + salb + '\'' +
                ", lastupdate=" + lastupdate +
                ", fydm='" + fydm + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", jcjgdm='" + jcjgdm + '\'' +
                ", syqlx='" + syqlx + '\'' +
                ", syqlxsm='" + syqlxsm + '\'' +
                ", jwblqxy='" + jwblqxy + '\'' +
                '}';
    }
}
