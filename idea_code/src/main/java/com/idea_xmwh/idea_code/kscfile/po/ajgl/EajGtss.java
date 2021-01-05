package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:案件共同诉讼信息持久化对象
 * Project Name:spxt
 * File Name:EajGtss
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020-7-23 15:10   邱萌         1.0       1.0 Version
 **/
@TableName("EAJ_GTSS")
public class EajGtss {
    private static final long serialVersionUID = 1L;

    /**
     * 案件标识
     * */
    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    /**
     * 法院代码
     * */
    @TableField("FYDM")
    private String fydm;

    /**
     * 共同诉讼类型
     * */
    @TableField("GTSSLX")
    private String gtsslx;

    /**
     * 公告起始日期
     * */
    @TableField("GGQSRQ")
    private String ggqsrq;

    /**
     * 公告届满日期
     * */
    @TableField("GGJMRQ")
    private String ggjmrq;

    /**
     * 权利登记起始日期
     * */
    @TableField("QLDJQSRQ")
    private String qldjqsrq;

    /**
     * 权利登记届满日期
     * */
    @TableField("QLDJJMRQ")
    private String qldjjmrq;

    /**
     * 代表人确定方式
     * */
    @TableField("DBRQDFS")
    private String dbrqdfs;

    /**
     * 共同诉讼代表人
     * */
    @TableField("GTSSDBR")
    private String gtssdbr;

    /**
     * 未登记当事人另诉案号
     * */
    @TableField("WDJDSRLSAH")
    private String wdjdsrlsah;

    /**
     * 行记录唯一标识
     * */
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;

    /**
     * 最后更新时间
     * */
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    /**
     * 是否删除
     * */
    @TableField("IS_DELETED")
    private Integer isDeleted;

    /**
     * 提交人
     * */
    @TableField("CREATE_BY")
    private String createBy;

    /**
     * 最后修改人
     * */
    @TableField("UPDATE_BY")
    private String updateBy;

    /**
     * 插入时间
     * */
    @TableField("GMT_CREAT")
    private Date gmtCreat;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getGtsslx() {
        return gtsslx;
    }

    public void setGtsslx(String gtsslx) {
        this.gtsslx = gtsslx;
    }

    public String getGgqsrq() {
        return ggqsrq;
    }

    public void setGgqsrq(String ggqsrq) {
        this.ggqsrq = ggqsrq;
    }

    public String getGgjmrq() {
        return ggjmrq;
    }

    public void setGgjmrq(String ggjmrq) {
        this.ggjmrq = ggjmrq;
    }

    public String getQldjqsrq() {
        return qldjqsrq;
    }

    public void setQldjqsrq(String qldjqsrq) {
        this.qldjqsrq = qldjqsrq;
    }

    public String getQldjjmrq() {
        return qldjjmrq;
    }

    public void setQldjjmrq(String qldjjmrq) {
        this.qldjjmrq = qldjjmrq;
    }

    public String getDbrqdfs() {
        return dbrqdfs;
    }

    public void setDbrqdfs(String dbrqdfs) {
        this.dbrqdfs = dbrqdfs;
    }

    public String getGtssdbr() {
        return gtssdbr;
    }

    public void setGtssdbr(String gtssdbr) {
        this.gtssdbr = gtssdbr;
    }

    public String getWdjdsrlsah() {
        return wdjdsrlsah;
    }

    public void setWdjdsrlsah(String wdjdsrlsah) {
        this.wdjdsrlsah = wdjdsrlsah;
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

    @Override
    public String toString() {
        return "EajGtss{" +
                "ahdm='" + ahdm + '\'' +
                ", fydm='" + fydm + '\'' +
                ", gtsslx='" + gtsslx + '\'' +
                ", ggqsrq='" + ggqsrq + '\'' +
                ", ggjmrq='" + ggjmrq + '\'' +
                ", qldjqsrq='" + qldjqsrq + '\'' +
                ", qldjjmrq='" + qldjjmrq + '\'' +
                ", dbrqdfs='" + dbrqdfs + '\'' +
                ", gtssdbr='" + gtssdbr + '\'' +
                ", wdjdsrlsah='" + wdjdsrlsah + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", lastupdate=" + lastupdate +
                ", isDeleted=" + isDeleted +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", gmtCreat=" + gmtCreat +
                '}';
    }
}
