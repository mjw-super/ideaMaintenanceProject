package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EajJjxfbg
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/8 17:19   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("EAJ_JJXFBG")
public class EajJjxfbg {

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String	ahdm;
    @TableField("BQJG")
    private String	bqjg;
    @TableField("SQCS")
    private Integer	sqcs;
    @TableField("XFXDD")
    private String	xfxdd;
    @TableField("BGQZX")
    private String	bgqzx;
    @TableField("BGQZYXQN")
    private Integer	bgqzyxqn;
    @TableField("BGQZYXQY")
    private Integer	bgqzyxqy;
    @TableField("BGQHXXQN")
    private Integer	bgqhxxqn;
    @TableField("BGQHXXQY")
    private Integer	bgqhxxqy;
    @TableField("BGQBDZZQLXQN")
    private Integer	bgqbdzzqlxqn;
    @TableField("BGQBDZZQLXQY")
    private Integer	bgqbdzzqlxqy;
    @TableField("SCJXRQ")
    private String	scjxrq;
    @TableField("YFXQN")
    private Integer	yfxqn;
    @TableField("YFXQY")
    private Integer	yfxqy;
    @TableField("YFXQR")
    private Integer	yfxqr;
    @TableField("YJXQN")
    private Integer	yjxqn;
    @TableField("YJXQY")
    private Integer	yjxqy;
    @TableField("YJXQR")
    private Integer	yjxqr;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("SCJJAH")
    private String	scjjah;
    @TableField("XMRQ")
    private String	xmrq;
    @TableField("SXSYFS")
    private String	sxsyfs;
    @TableField("BGQHXXQR")
    private Integer	bgqhxxqr;
    @TableField("FJXSYFS")
    private String	fjxsyfs;
    @TableField("FJXZL")
    private String	fjxzl;
    @TableField("BGQBDZZQLLX")
    private String	bgqbdzzqllx;
    @TableField("BGQBDZZQLXQR")
    private Integer	bgqbdzzqlxqr;
    @TableField("QXRQ")
    private String	qxrq;
    @TableField("MSCCLX")
    private String	mscclx;
    @TableField("MSCCJE")
    private double	msccje;
    @TableField("ZXZT")
    private String	zxzt;
    @TableField("ZYJWZXSY")
    private String	zyjwzxsy;
    @TableField("ZYJWZXJDJG")
    private String	zyjwzxjdjg;
    @TableField("PZJG")
    private String	pzjg;
    @TableField("XFXJG")
    private String	xfxjg;
    @TableField("SQJZJG")
    private String	sqjzjg;
    @TableField("ROWUUID")
    private String	rowuuid;
    @TableField("BGQZYXQR")
    private Integer	bgqzyxqr;
    @TableField("JBFY")
    private String	jbfy;
    @TableField("FJSE")
    private double	fjse;
    @TableField("IS_DELETED")
    private Integer	is_deleted;
    @TableField("CREATE_BY")
    private String	create_by;
    @TableField("UPDATE_BY")
    private String	update_by;
    @TableField("GMT_CREAT")
    private Date	gmt_creat;


    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getBqjg() {
        return bqjg;
    }

    public void setBqjg(String bqjg) {
        this.bqjg = bqjg;
    }

    public Integer getSqcs() {
        return sqcs;
    }

    public void setSqcs(Integer sqcs) {
        this.sqcs = sqcs;
    }

    public String getXfxdd() {
        return xfxdd;
    }

    public void setXfxdd(String xfxdd) {
        this.xfxdd = xfxdd;
    }

    public String getBgqzx() {
        return bgqzx;
    }

    public void setBgqzx(String bgqzx) {
        this.bgqzx = bgqzx;
    }

    public Integer getBgqzyxqn() {
        return bgqzyxqn;
    }

    public void setBgqzyxqn(Integer bgqzyxqn) {
        this.bgqzyxqn = bgqzyxqn;
    }

    public Integer getBgqzyxqy() {
        return bgqzyxqy;
    }

    public void setBgqzyxqy(Integer bgqzyxqy) {
        this.bgqzyxqy = bgqzyxqy;
    }

    public Integer getBgqhxxqn() {
        return bgqhxxqn;
    }

    public void setBgqhxxqn(Integer bgqhxxqn) {
        this.bgqhxxqn = bgqhxxqn;
    }

    public Integer getBgqhxxqy() {
        return bgqhxxqy;
    }

    public void setBgqhxxqy(Integer bgqhxxqy) {
        this.bgqhxxqy = bgqhxxqy;
    }

    public Integer getBgqbdzzqlxqn() {
        return bgqbdzzqlxqn;
    }

    public void setBgqbdzzqlxqn(Integer bgqbdzzqlxqn) {
        this.bgqbdzzqlxqn = bgqbdzzqlxqn;
    }

    public Integer getBgqbdzzqlxqy() {
        return bgqbdzzqlxqy;
    }

    public void setBgqbdzzqlxqy(Integer bgqbdzzqlxqy) {
        this.bgqbdzzqlxqy = bgqbdzzqlxqy;
    }

    public String getScjxrq() {
        return scjxrq;
    }

    public void setScjxrq(String scjxrq) {
        this.scjxrq = scjxrq;
    }

    public Integer getYfxqn() {
        return yfxqn;
    }

    public void setYfxqn(Integer yfxqn) {
        this.yfxqn = yfxqn;
    }

    public Integer getYfxqy() {
        return yfxqy;
    }

    public void setYfxqy(Integer yfxqy) {
        this.yfxqy = yfxqy;
    }

    public Integer getYfxqr() {
        return yfxqr;
    }

    public void setYfxqr(Integer yfxqr) {
        this.yfxqr = yfxqr;
    }

    public Integer getYjxqn() {
        return yjxqn;
    }

    public void setYjxqn(Integer yjxqn) {
        this.yjxqn = yjxqn;
    }

    public Integer getYjxqy() {
        return yjxqy;
    }

    public void setYjxqy(Integer yjxqy) {
        this.yjxqy = yjxqy;
    }

    public Integer getYjxqr() {
        return yjxqr;
    }

    public void setYjxqr(Integer yjxqr) {
        this.yjxqr = yjxqr;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getScjjah() {
        return scjjah;
    }

    public void setScjjah(String scjjah) {
        this.scjjah = scjjah;
    }

    public String getXmrq() {
        return xmrq;
    }

    public void setXmrq(String xmrq) {
        this.xmrq = xmrq;
    }

    public String getSxsyfs() {
        return sxsyfs;
    }

    public void setSxsyfs(String sxsyfs) {
        this.sxsyfs = sxsyfs;
    }

    public Integer getBgqhxxqr() {
        return bgqhxxqr;
    }

    public void setBgqhxxqr(Integer bgqhxxqr) {
        this.bgqhxxqr = bgqhxxqr;
    }

    public String getFjxsyfs() {
        return fjxsyfs;
    }

    public void setFjxsyfs(String fjxsyfs) {
        this.fjxsyfs = fjxsyfs;
    }

    public String getFjxzl() {
        return fjxzl;
    }

    public void setFjxzl(String fjxzl) {
        this.fjxzl = fjxzl;
    }

    public String getBgqbdzzqllx() {
        return bgqbdzzqllx;
    }

    public void setBgqbdzzqllx(String bgqbdzzqllx) {
        this.bgqbdzzqllx = bgqbdzzqllx;
    }

    public Integer getBgqbdzzqlxqr() {
        return bgqbdzzqlxqr;
    }

    public void setBgqbdzzqlxqr(Integer bgqbdzzqlxqr) {
        this.bgqbdzzqlxqr = bgqbdzzqlxqr;
    }

    public String getQxrq() {
        return qxrq;
    }

    public void setQxrq(String qxrq) {
        this.qxrq = qxrq;
    }

    public String getMscclx() {
        return mscclx;
    }

    public void setMscclx(String mscclx) {
        this.mscclx = mscclx;
    }

    public double getMsccje() {
        return msccje;
    }

    public void setMsccje(double msccje) {
        this.msccje = msccje;
    }

    public double getFjse() {
        return fjse;
    }

    public void setFjse(double fjse) {
        this.fjse = fjse;
    }

    public String getZxzt() {
        return zxzt;
    }

    public void setZxzt(String zxzt) {
        this.zxzt = zxzt;
    }

    public String getZyjwzxsy() {
        return zyjwzxsy;
    }

    public void setZyjwzxsy(String zyjwzxsy) {
        this.zyjwzxsy = zyjwzxsy;
    }

    public String getZyjwzxjdjg() {
        return zyjwzxjdjg;
    }

    public void setZyjwzxjdjg(String zyjwzxjdjg) {
        this.zyjwzxjdjg = zyjwzxjdjg;
    }

    public String getPzjg() {
        return pzjg;
    }

    public void setPzjg(String pzjg) {
        this.pzjg = pzjg;
    }

    public String getXfxjg() {
        return xfxjg;
    }

    public void setXfxjg(String xfxjg) {
        this.xfxjg = xfxjg;
    }

    public String getSqjzjg() {
        return sqjzjg;
    }

    public void setSqjzjg(String sqjzjg) {
        this.sqjzjg = sqjzjg;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public Integer getBgqzyxqr() {
        return bgqzyxqr;
    }

    public void setBgqzyxqr(Integer bgqzyxqr) {
        this.bgqzyxqr = bgqzyxqr;
    }

    public String getJbfy() {
        return jbfy;
    }

    public void setJbfy(String jbfy) {
        this.jbfy = jbfy;
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

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(Date gmt_creat) {
        this.gmt_creat = gmt_creat;
    }
}
