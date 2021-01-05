package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * @Description 案件家暴信息项
 * @author 邱萌
 * @Date 2020-6-18 16:40
 * @Version 1.0
 **/
@TableName("EAJ_JBAJ")
public class EajJbaj {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("JTBLAJLX")
    private String jtblajlx;
    @TableField("SBFXB")
    private String sbfxb;
    @TableField("BSBFXB")
    private String bsbfxb;
    @TableField("SFGX")
    private String sfgx;
    @TableField("BLFS")
    private String blfs;
    @TableField("BQFQL")
    private String bqfql;
    @TableField("FSZQ")
    private String fszq;
    @TableField("QZQX")
    private String qzqx;
    @TableField("SFGXSM")
    private String sfgxsm;
    @TableField("BLFSDY")
    private String blfsdy;
    @TableField("SPJG")
    private String spjg;
    @TableField("YZJTQX")
    private String yzjtqx;
    @TableField("QTQX")
    private String qtqx;
    @TableField("BEIZ")
    private String beiz;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getJtblajlx() {
        return jtblajlx;
    }

    public void setJtblajlx(String jtblajlx) {
        this.jtblajlx = jtblajlx;
    }

    public String getSbfxb() {
        return sbfxb;
    }

    public void setSbfxb(String sbfxb) {
        this.sbfxb = sbfxb;
    }

    public String getBsbfxb() {
        return bsbfxb;
    }

    public void setBsbfxb(String bsbfxb) {
        this.bsbfxb = bsbfxb;
    }

    public String getSfgx() {
        return sfgx;
    }

    public void setSfgx(String sfgx) {
        this.sfgx = sfgx;
    }

    public String getBlfs() {
        return blfs;
    }

    public void setBlfs(String blfs) {
        this.blfs = blfs;
    }

    public String getBqfql() {
        return bqfql;
    }

    public void setBqfql(String bqfql) {
        this.bqfql = bqfql;
    }

    public String getFszq() {
        return fszq;
    }

    public void setFszq(String fszq) {
        this.fszq = fszq;
    }

    public String getQzqx() {
        return qzqx;
    }

    public void setQzqx(String qzqx) {
        this.qzqx = qzqx;
    }

    public String getSfgxsm() {
        return sfgxsm;
    }

    public void setSfgxsm(String sfgxsm) {
        this.sfgxsm = sfgxsm;
    }

    public String getBlfsdy() {
        return blfsdy;
    }

    public void setBlfsdy(String blfsdy) {
        this.blfsdy = blfsdy;
    }

    public String getSpjg() {
        return spjg;
    }

    public void setSpjg(String spjg) {
        this.spjg = spjg;
    }

    public String getYzjtqx() {
        return yzjtqx;
    }

    public void setYzjtqx(String yzjtqx) {
        this.yzjtqx = yzjtqx;
    }

    public String getQtqx() {
        return qtqx;
    }

    public void setQtqx(String qtqx) {
        this.qtqx = qtqx;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public String toString() {
        return "EajJbaj{" +
                "ahdm='" + ahdm + '\'' +
                ", jtblajlx='" + jtblajlx + '\'' +
                ", sbfxb='" + sbfxb + '\'' +
                ", bsbfxb='" + bsbfxb + '\'' +
                ", sfgx='" + sfgx + '\'' +
                ", blfs='" + blfs + '\'' +
                ", bqfql='" + bqfql + '\'' +
                ", fszq='" + fszq + '\'' +
                ", qzqx='" + qzqx + '\'' +
                ", sfgxsm='" + sfgxsm + '\'' +
                ", blfsdy='" + blfsdy + '\'' +
                ", spjg='" + spjg + '\'' +
                ", yzjtqx='" + yzjtqx + '\'' +
                ", qtqx='" + qtqx + '\'' +
                ", beiz='" + beiz + '\'' +
                ", lastupdate=" + lastupdate +
                '}';
    }
}
