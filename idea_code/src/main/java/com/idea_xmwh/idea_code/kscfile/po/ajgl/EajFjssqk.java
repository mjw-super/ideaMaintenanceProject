package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * @Description 附加诉讼审查情况信息项
 * @author 邱萌
 * @Date 2020-6-16 9:57
 * @Version 1.0
 **/

@TableName("EAJ_FJSSQK")
public class EajFjssqk {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("XH")
    private Integer xh;
    @TableField("FJSSLX")
    private String fjsslx;
    @TableField("FDMSSSYG")
    private String fdmsssyg;
    @TableField("FDMSSSBG")
    private String fdmsssbg;
    @TableField("FDMSSSBGLX")
    private String fdmsssbglx;
    @TableField("FDMSSSBDE")
    private Double fdmsssbde;
    @TableField("FSR")
    private String fsr;
    @TableField("FJSSTQRQ")
    private String fjsstqrq;
    @TableField("SCYJ")
    private String scyj;
    @TableField("BYSLSY")
    private String byslsy;
    @TableField("SDRQ")
    private String sdrq;
    @TableField("SCR")
    private String scr;
    @TableField("JARQ")
    private String jarq;
    @TableField("JAFS")
    private String jafs;
    @TableField("JASY")
    private String jasy;
    @TableField("JABDJE")
    private Double jabdje;
    @TableField("JAWS")
    private String jaws;
    @TableField("SSQQ")
    private String ssqq;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("ZSAJAH")
    private String zsajah;
    @TableField("ZSR")
    private String zsr;
    @TableField("SQCL")
    private String sqcl;
    @TableField("BYSLSYDM")
    private String byslsydm;


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

    public String getFjsslx() {
        return fjsslx;
    }

    public void setFjsslx(String fjsslx) {
        this.fjsslx = fjsslx;
    }

    public String getFdmsssyg() {
        return fdmsssyg;
    }

    public void setFdmsssyg(String fdmsssyg) {
        this.fdmsssyg = fdmsssyg;
    }

    public String getFdmsssbg() {
        return fdmsssbg;
    }

    public void setFdmsssbg(String fdmsssbg) {
        this.fdmsssbg = fdmsssbg;
    }

    public String getFdmsssbglx() {
        return fdmsssbglx;
    }

    public void setFdmsssbglx(String fdmsssbglx) {
        this.fdmsssbglx = fdmsssbglx;
    }


    public String getFsr() {
        return fsr;
    }

    public void setFsr(String fsr) {
        this.fsr = fsr;
    }

    public String getFjsstqrq() {
        return fjsstqrq;
    }

    public void setFjsstqrq(String fjsstqrq) {
        this.fjsstqrq = fjsstqrq;
    }

    public String getScyj() {
        return scyj;
    }

    public void setScyj(String scyj) {
        this.scyj = scyj;
    }

    public String getByslsy() {
        return byslsy;
    }

    public void setByslsy(String byslsy) {
        this.byslsy = byslsy;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getScr() {
        return scr;
    }

    public void setScr(String scr) {
        this.scr = scr;
    }

    public String getJarq() {
        return jarq;
    }

    public void setJarq(String jarq) {
        this.jarq = jarq;
    }

    public String getJafs() {
        return jafs;
    }

    public void setJafs(String jafs) {
        this.jafs = jafs;
    }

    public String getJasy() {
        return jasy;
    }

    public void setJasy(String jasy) {
        this.jasy = jasy;
    }


    public String getJaws() {
        return jaws;
    }

    public void setJaws(String jaws) {
        this.jaws = jaws;
    }

    public String getSsqq() {
        return ssqq;
    }

    public void setSsqq(String ssqq) {
        this.ssqq = ssqq;
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

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getZsajah() {
        return zsajah;
    }

    public void setZsajah(String zsajah) {
        this.zsajah = zsajah;
    }

    public String getZsr() {
        return zsr;
    }

    public void setZsr(String zsr) {
        this.zsr = zsr;
    }

    public String getSqcl() {
        return sqcl;
    }

    public void setSqcl(String sqcl) {
        this.sqcl = sqcl;
    }

    public String getByslsydm() {
        return byslsydm;
    }

    public void setByslsydm(String byslsydm) {
        this.byslsydm = byslsydm;
    }

    public Double getFdmsssbde() {
        return fdmsssbde;
    }

    public void setFdmsssbde(Double fdmsssbde) {
        this.fdmsssbde = fdmsssbde;
    }

    public Double getJabdje() {
        return jabdje;
    }

    public void setJabdje(Double jabdje) {
        this.jabdje = jabdje;
    }

    @Override
    public String toString() {
        return "EajFjssqk{" +
                "ahdm='" + ahdm + '\'' +
                ", xh=" + xh +
                ", fjsslx='" + fjsslx + '\'' +
                ", fdmsssyg='" + fdmsssyg + '\'' +
                ", fdmsssbg='" + fdmsssbg + '\'' +
                ", fdmsssbglx='" + fdmsssbglx + '\'' +
                ", fdmsssbde=" + fdmsssbde +
                ", fsr='" + fsr + '\'' +
                ", fjsstqrq='" + fjsstqrq + '\'' +
                ", scyj='" + scyj + '\'' +
                ", byslsy='" + byslsy + '\'' +
                ", sdrq='" + sdrq + '\'' +
                ", scr='" + scr + '\'' +
                ", jarq='" + jarq + '\'' +
                ", jafs='" + jafs + '\'' +
                ", jasy='" + jasy + '\'' +
                ", jabdje=" + jabdje +
                ", jaws='" + jaws + '\'' +
                ", ssqq='" + ssqq + '\'' +
                ", fydm='" + fydm + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", lastupdate=" + lastupdate +
                ", zsajah='" + zsajah + '\'' +
                ", zsr='" + zsr + '\'' +
                ", sqcl='" + sqcl + '\'' +
                ", byslsydm='" + byslsydm + '\'' +
                '}';
    }
}
