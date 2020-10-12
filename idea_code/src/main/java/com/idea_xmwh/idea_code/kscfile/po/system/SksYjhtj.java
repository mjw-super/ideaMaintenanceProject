package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangz
 * @desc 上诉移送和退卷日志
 * @date 2020/6/30
 */
@TableName("sks_yjhtj")
public class SksYjhtj implements Serializable {

    private static final long serialVersionUID = 8263115913620288099L;
    @TableField("LSH")
    private String lsh;

    @TableField("XH")
    private Short xh;

    @TableField("FYDM")
    private String fydm;

    @TableField("AHDM")
    private String ahdm;

    @TableField("YSJSYWLB")
    private String ysjsywlb;

    @TableField("YSJSYWSM")
    private String ysjsywsm;

    @TableField("CLRYHDM")
    private String clryhdm;

    @TableField("CLRYHXM")
    private String clryhxm;

    @TableField("CLSJ")
    private String clsj;

    @TableField("CLQKSM")
    private String clqksm;

    @TableField("LASTUPDATE")
    private Date lastupdate;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtCreat;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public Short getXh() {
        return xh;
    }

    public void setXh(Short xh) {
        this.xh = xh;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getYsjsywlb() {
        return ysjsywlb;
    }

    public void setYsjsywlb(String ysjsywlb) {
        this.ysjsywlb = ysjsywlb;
    }

    public String getYsjsywsm() {
        return ysjsywsm;
    }

    public void setYsjsywsm(String ysjsywsm) {
        this.ysjsywsm = ysjsywsm;
    }

    public String getClryhdm() {
        return clryhdm;
    }

    public void setClryhdm(String clryhdm) {
        this.clryhdm = clryhdm;
    }

    public String getClryhxm() {
        return clryhxm;
    }

    public void setClryhxm(String clryhxm) {
        this.clryhxm = clryhxm;
    }

    public String getClsj() {
        return clsj;
    }

    public void setClsj(String clsj) {
        this.clsj = clsj;
    }

    public String getClqksm() {
        return clqksm;
    }

    public void setClqksm(String clqksm) {
        this.clqksm = clqksm;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
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
