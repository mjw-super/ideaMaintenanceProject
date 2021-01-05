package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EajJxjsqk
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/7 10:42   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("EAJ_JXJSQK")
public class EajJxjsqk {

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String	ahdm;
    @TableField("LASTUPDATE")
    private Date lastupDate;
    @TableField("XZJX")
    private String	xzjx;
    @TableField("XIDUS")
    private String	xidus;
    @TableField("LAONF")
    private String	laonf;
    @TableField("WCNF")
    private String	wcnf;
    @TableField("BCF")
    private String	bcf;
    @TableField("XFBGLX")
    private String	xfbglx;
    @TableField("BGHZX")
    private String	bghzx;
    @TableField("BGHZYXQN")
    private Integer	bghzyxqn;
    @TableField("BGHZYXQY")
    private Integer	bghzyxqy;
    @TableField("BGHHXXQN")
    private Integer	bghhxxqn;
    @TableField("BGHHXXQY")
    private Integer	bghhxxqy;
    @TableField("BGHBDZZQLN")
    private Integer	bghbdzzqln;
    @TableField("BGHBDZZQLY")
    private Integer	bghbdzzqly;
    @TableField("BGHXMRQ")
    private String	bghxmrq;
    @TableField("JSKYKSRQ")
    private String	jskyksrq;
    @TableField("JSKYJSRQ")
    private String	jskyjsrq;
    @TableField("JXFD")
    private String	jxfd;
    @TableField("SYFT")
    private String	syft;
    @TableField("LGBX")
    private String	lgbx;
    @TableField("ZDLGBX")
    private String	zdlgbx;
    @TableField("JSFJJE")
    private Integer	jsfjje;
    @TableField("BBSCLX")
    private String	bbsclx;
    @TableField("BGHZYXQR")
    private Integer	bghzyxqr;
    @TableField("BGHHXXQR")
    private Integer	bghhxxqr;
    @TableField("BGHBDZZQLR")
    private Integer	bghbdzzqlr;
    @TableField("BGHXQRQ")
    private String	bghxqrq;
    @TableField("JXXQN")
    private Integer	jxxqn;
    @TableField("JXXQY")
    private Integer	 jxxqy;
    @TableField("BQJG")
    private String	bqjg;
    @TableField("JYGLJGMC")
    private String	jygljgmc;
    @TableField("SQJMFJSE")
    private Integer	sqjmfjse;
    @TableField("SQJXXQN")
    private Integer	sqjxxqn;
    @TableField("SQJXXQY")
    private Integer	sqjxxqy;
    @TableField("FYDM")
    private String	fydm;
    @TableField("ROWUUID")
    private String	rowuuid;
    @TableField("SFJGXFBG")
    private String	sfjgxfbg;
    @TableField("SQJXXQR")
    private Integer	sqjxxqr;
    @TableField("JXXQR")
    private Integer	jxxqr;
    @TableField("BJRXQN")
    private Integer	bjrxqn;
    @TableField("BJRXQY")
    private Integer	bjrxqy;
    @TableField("BJRXQR")
    private Integer	bjrxqr;
    @TableField("BGHFJXSYFS")
    private String	bghfjxsyfs;
    @TableField("BGHFJXZL")
    private String	bghfjxzl;
    @TableField("BGHMSCCLX")
    private String	bghmscclx;
    @TableField("BGHMSCCJE")
    private Integer	bghmsccje;
    @TableField("BGHFJSE")
    private Integer	bghfjse;
    @TableField("BGHZXZT")
    private String	bghzxzt;
    @TableField("BGHBDZZQLLX")
    private String	bghbdzzqllx;
    @TableField("IS_DELETED")
    private Integer	is_deleted;
    @TableField("CREATE_BY")
    private String	create_by;
    @TableField("UPDate_BY")
    private String	upDate_by;
    @TableField("GMT_CREAT")
    private Date	gmt_creat;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Date getLastupDate() {
        return lastupDate;
    }

    public void setLastupDate(Date lastupDate) {
        this.lastupDate = lastupDate;
    }

    public String getXzjx() {
        return xzjx;
    }

    public void setXzjx(String xzjx) {
        this.xzjx = xzjx;
    }

    public String getXidus() {
        return xidus;
    }

    public void setXidus(String xidus) {
        this.xidus = xidus;
    }

    public String getLaonf() {
        return laonf;
    }

    public void setLaonf(String laonf) {
        this.laonf = laonf;
    }

    public String getWcnf() {
        return wcnf;
    }

    public void setWcnf(String wcnf) {
        this.wcnf = wcnf;
    }

    public String getBcf() {
        return bcf;
    }

    public void setBcf(String bcf) {
        this.bcf = bcf;
    }

    public String getXfbglx() {
        return xfbglx;
    }

    public void setXfbglx(String xfbglx) {
        this.xfbglx = xfbglx;
    }

    public String getBghzx() {
        return bghzx;
    }

    public void setBghzx(String bghzx) {
        this.bghzx = bghzx;
    }

    public Integer getBghzyxqn() {
        return bghzyxqn;
    }

    public void setBghzyxqn(Integer bghzyxqn) {
        this.bghzyxqn = bghzyxqn;
    }

    public Integer getBghzyxqy() {
        return bghzyxqy;
    }

    public void setBghzyxqy(Integer bghzyxqy) {
        this.bghzyxqy = bghzyxqy;
    }

    public Integer getBghhxxqn() {
        return bghhxxqn;
    }

    public void setBghhxxqn(Integer bghhxxqn) {
        this.bghhxxqn = bghhxxqn;
    }

    public Integer getBghhxxqy() {
        return bghhxxqy;
    }

    public void setBghhxxqy(Integer bghhxxqy) {
        this.bghhxxqy = bghhxxqy;
    }

    public Integer getBghbdzzqln() {
        return bghbdzzqln;
    }

    public void setBghbdzzqln(Integer bghbdzzqln) {
        this.bghbdzzqln = bghbdzzqln;
    }

    public Integer getBghbdzzqly() {
        return bghbdzzqly;
    }

    public void setBghbdzzqly(Integer bghbdzzqly) {
        this.bghbdzzqly = bghbdzzqly;
    }

    public String getBghxmrq() {
        return bghxmrq;
    }

    public void setBghxmrq(String bghxmrq) {
        this.bghxmrq = bghxmrq;
    }

    public String getJskyksrq() {
        return jskyksrq;
    }

    public void setJskyksrq(String jskyksrq) {
        this.jskyksrq = jskyksrq;
    }

    public String getJskyjsrq() {
        return jskyjsrq;
    }

    public void setJskyjsrq(String jskyjsrq) {
        this.jskyjsrq = jskyjsrq;
    }

    public String getJxfd() {
        return jxfd;
    }

    public void setJxfd(String jxfd) {
        this.jxfd = jxfd;
    }

    public String getSyft() {
        return syft;
    }

    public void setSyft(String syft) {
        this.syft = syft;
    }

    public String getLgbx() {
        return lgbx;
    }

    public void setLgbx(String lgbx) {
        this.lgbx = lgbx;
    }

    public String getZdlgbx() {
        return zdlgbx;
    }

    public void setZdlgbx(String zdlgbx) {
        this.zdlgbx = zdlgbx;
    }

    public Integer getJsfjje() {
        return jsfjje;
    }

    public void setJsfjje(Integer jsfjje) {
        this.jsfjje = jsfjje;
    }

    public String getBbsclx() {
        return bbsclx;
    }

    public void setBbsclx(String bbsclx) {
        this.bbsclx = bbsclx;
    }

    public Integer getBghzyxqr() {
        return bghzyxqr;
    }

    public void setBghzyxqr(Integer bghzyxqr) {
        this.bghzyxqr = bghzyxqr;
    }

    public Integer getBghhxxqr() {
        return bghhxxqr;
    }

    public void setBghhxxqr(Integer bghhxxqr) {
        this.bghhxxqr = bghhxxqr;
    }

    public Integer getBghbdzzqlr() {
        return bghbdzzqlr;
    }

    public void setBghbdzzqlr(Integer bghbdzzqlr) {
        this.bghbdzzqlr = bghbdzzqlr;
    }

    public String getBghxqrq() {
        return bghxqrq;
    }

    public void setBghxqrq(String bghxqrq) {
        this.bghxqrq = bghxqrq;
    }

    public Integer getJxxqn() {
        return jxxqn;
    }

    public void setJxxqn(Integer jxxqn) {
        this.jxxqn = jxxqn;
    }

    public Integer getJxxqy() {
        return jxxqy;
    }

    public void setJxxqy(Integer jxxqy) {
        this.jxxqy = jxxqy;
    }

    public String getBqjg() {
        return bqjg;
    }

    public void setBqjg(String bqjg) {
        this.bqjg = bqjg;
    }

    public String getJygljgmc() {
        return jygljgmc;
    }

    public void setJygljgmc(String jygljgmc) {
        this.jygljgmc = jygljgmc;
    }

    public Integer getSqjmfjse() {
        return sqjmfjse;
    }

    public void setSqjmfjse(Integer sqjmfjse) {
        this.sqjmfjse = sqjmfjse;
    }

    public Integer getSqjxxqn() {
        return sqjxxqn;
    }

    public void setSqjxxqn(Integer sqjxxqn) {
        this.sqjxxqn = sqjxxqn;
    }

    public Integer getSqjxxqy() {
        return sqjxxqy;
    }

    public void setSqjxxqy(Integer sqjxxqy) {
        this.sqjxxqy = sqjxxqy;
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

    public String getSfjgxfbg() {
        return sfjgxfbg;
    }

    public void setSfjgxfbg(String sfjgxfbg) {
        this.sfjgxfbg = sfjgxfbg;
    }

    public Integer getSqjxxqr() {
        return sqjxxqr;
    }

    public void setSqjxxqr(Integer sqjxxqr) {
        this.sqjxxqr = sqjxxqr;
    }

    public Integer getJxxqr() {
        return jxxqr;
    }

    public void setJxxqr(Integer jxxqr) {
        this.jxxqr = jxxqr;
    }

    public Integer getBjrxqn() {
        return bjrxqn;
    }

    public void setBjrxqn(Integer bjrxqn) {
        this.bjrxqn = bjrxqn;
    }

    public Integer getBjrxqy() {
        return bjrxqy;
    }

    public void setBjrxqy(Integer bjrxqy) {
        this.bjrxqy = bjrxqy;
    }

    public Integer getBjrxqr() {
        return bjrxqr;
    }

    public void setBjrxqr(Integer bjrxqr) {
        this.bjrxqr = bjrxqr;
    }

    public String getBghfjxsyfs() {
        return bghfjxsyfs;
    }

    public void setBghfjxsyfs(String bghfjxsyfs) {
        this.bghfjxsyfs = bghfjxsyfs;
    }

    public String getBghfjxzl() {
        return bghfjxzl;
    }

    public void setBghfjxzl(String bghfjxzl) {
        this.bghfjxzl = bghfjxzl;
    }

    public String getBghmscclx() {
        return bghmscclx;
    }

    public void setBghmscclx(String bghmscclx) {
        this.bghmscclx = bghmscclx;
    }

    public Integer getBghmsccje() {
        return bghmsccje;
    }

    public void setBghmsccje(Integer bghmsccje) {
        this.bghmsccje = bghmsccje;
    }

    public Integer getBghfjse() {
        return bghfjse;
    }

    public void setBghfjse(Integer bghfjse) {
        this.bghfjse = bghfjse;
    }

    public String getBghzxzt() {
        return bghzxzt;
    }

    public void setBghzxzt(String bghzxzt) {
        this.bghzxzt = bghzxzt;
    }

    public String getBghbdzzqllx() {
        return bghbdzzqllx;
    }

    public void setBghbdzzqllx(String bghbdzzqllx) {
        this.bghbdzzqllx = bghbdzzqllx;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpDate_by() {
        return upDate_by;
    }

    public void setUpDate_by(String upDate_by) {
        this.upDate_by = upDate_by;
    }

    public Date getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(Date gmt_creat) {
        this.gmt_creat = gmt_creat;
    }
}
