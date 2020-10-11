package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description: 当事人强制措施实体（EDSR_QZCS_ZX）
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.dsr
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/06/15        wuhz     1.0        1.0 Version
 **/
@TableName("EDSR_QZCS_ZX")
public class EdsrQzcsZx {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableId(value = "XH", type = IdType.INPUT)
    private Integer xh;

    @TableId(value = "BGR", type = IdType.INPUT)
    private String bgr;

    @TableField(value = "QZCSZL")
    private String qzcszl;

    @TableField(value = "JSJZDD")
    private String jsjzdd;

    @TableField(value = "JSJZFS")
    private String jsjzfs;

    @TableField(value = "JYCS")
    private String jycs;

    @TableField(value = "ZXRQ")
    private String zxrq;

    @TableField(value = "ZXJG")
    private String zxjg;

    @TableField(value = "SFJCHBG")
    private String sfjchbg;

    @TableField(value = "DJR")
    private String djr;

    @TableField(value = "DJSJ")
    private String djsj;

    @TableField(value = "FYDM")
    private String fydm;

    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;

    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    @TableField(value = "JYRQ")
    private String jyrq;

    @TableField(value = "SFJYBJZL")
    private String sfjybjzl;

    @TableField(value = "JYCSSFWJY")
    private String jycssfwjy;

    @TableField(value = "JAZXMONTH")
    private String jazxmonth;

    @TableField(value = "JAZXDAY")
    private String jazxday;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtCreat;


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


    public String getBgr() {
        return bgr;
    }

    public void setBgr(String bgr) {
        this.bgr = bgr;
    }


    public String getQzcszl() {
        return qzcszl;
    }

    public void setQzcszl(String qzcszl) {
        this.qzcszl = qzcszl;
    }


    public String getJsjzdd() {
        return jsjzdd;
    }

    public void setJsjzdd(String jsjzdd) {
        this.jsjzdd = jsjzdd;
    }


    public String getJsjzfs() {
        return jsjzfs;
    }

    public void setJsjzfs(String jsjzfs) {
        this.jsjzfs = jsjzfs;
    }


    public String getJycs() {
        return jycs;
    }

    public void setJycs(String jycs) {
        this.jycs = jycs;
    }


    public String getZxrq() {
        return zxrq;
    }

    public void setZxrq(String zxrq) {
        this.zxrq = zxrq;
    }


    public String getZxjg() {
        return zxjg;
    }

    public void setZxjg(String zxjg) {
        this.zxjg = zxjg;
    }


    public String getSfjchbg() {
        return sfjchbg;
    }

    public void setSfjchbg(String sfjchbg) {
        this.sfjchbg = sfjchbg;
    }


    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }


    public String getDjsj() {
        return djsj;
    }

    public void setDjsj(String djsj) {
        this.djsj = djsj;
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


    public String getJyrq() {
        return jyrq;
    }

    public void setJyrq(String jyrq) {
        this.jyrq = jyrq;
    }


    public String getSfjybjzl() {
        return sfjybjzl;
    }

    public void setSfjybjzl(String sfjybjzl) {
        this.sfjybjzl = sfjybjzl;
    }


    public String getJycssfwjy() {
        return jycssfwjy;
    }

    public void setJycssfwjy(String jycssfwjy) {
        this.jycssfwjy = jycssfwjy;
    }


    public String getJazxmonth() {
        return jazxmonth;
    }

    public void setJazxmonth(String jazxmonth) {
        this.jazxmonth = jazxmonth;
    }


    public String getJazxday() {
        return jazxday;
    }

    public void setJazxday(String jazxday) {
        this.jazxday = jazxday;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }
}
