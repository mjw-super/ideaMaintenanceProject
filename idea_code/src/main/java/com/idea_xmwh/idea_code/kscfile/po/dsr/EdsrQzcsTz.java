package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:个案标签-当事人-强制措施-变更 调整类
 * Project Name:spxt
 * File Name:EdsrQzcsTz
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/11 16:06   zhouhua         1.0       1.0 Version
 **/
@TableName("EDSR_QZCS_TZ")
public class EdsrQzcsTz {

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableId(value = "XH", type = IdType.INPUT)
    private Integer xh;

    @TableId(value = "BGR", type = IdType.INPUT)
    private String bgr;

    @TableField("YQZCSZXROWUUID")
    private String yqzcszxrowuuid;

    @TableField("QDFS")
    private String qdfs;

    @TableField("TZXS")
    private String tzxs;

    @TableField("SQRLX")
    private String sqrlx;

    @TableField("SQR")
    private String sqr;

    @TableField("SQRQ")
    private String sqrq;

    @TableField("SCYJ")
    private String scyj;

    @TableField("SDRQ")
    private String sdrq;

    @TableField("QZCSTZSY")
    private String qzcstzsy;

    @TableField("BGHQZCSZL")
    private String bghqzcszl;

    @TableField("QZCSZXROWUUID")
    private String qzcszxrowuuid;

    @TableField("JDJG")
    private String jdjg;

    @TableField("JDRQ")
    private String jdrq;

    @TableField("PZJG")
    private String pzjg;

    @TableField("PZRQ")
    private String pzrq;

    @TableField("JYJG")
    private String jyjg;

    @TableField("JYRQ")
    private String jyrq;

    @TableField("SFYZX")
    private String sfyzx;

    @TableField("DJR")
    private String djr;

    @TableField("FYDM")
    private String fydm;

    @TableField("ROWUUID")
    private String rowuuid;

    @TableField("DJSJ")
    private String djsj;

    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

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

    public String getYqzcszxrowuuid() {
        return yqzcszxrowuuid;
    }

    public void setYqzcszxrowuuid(String yqzcszxrowuuid) {
        this.yqzcszxrowuuid = yqzcszxrowuuid;
    }

    public String getQdfs() {
        return qdfs;
    }

    public void setQdfs(String qdfs) {
        this.qdfs = qdfs;
    }

    public String getTzxs() {
        return tzxs;
    }

    public void setTzxs(String tzxs) {
        this.tzxs = tzxs;
    }

    public String getSqrlx() {
        return sqrlx;
    }

    public void setSqrlx(String sqrlx) {
        this.sqrlx = sqrlx;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getSqrq() {
        return sqrq;
    }

    public void setSqrq(String sqrq) {
        this.sqrq = sqrq;
    }

    public String getScyj() {
        return scyj;
    }

    public void setScyj(String scyj) {
        this.scyj = scyj;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getQzcstzsy() {
        return qzcstzsy;
    }

    public void setQzcstzsy(String qzcstzsy) {
        this.qzcstzsy = qzcstzsy;
    }

    public String getBghqzcszl() {
        return bghqzcszl;
    }

    public void setBghqzcszl(String bghqzcszl) {
        this.bghqzcszl = bghqzcszl;
    }

    public String getQzcszxrowuuid() {
        return qzcszxrowuuid;
    }

    public void setQzcszxrowuuid(String qzcszxrowuuid) {
        this.qzcszxrowuuid = qzcszxrowuuid;
    }

    public String getJdjg() {
        return jdjg;
    }

    public void setJdjg(String jdjg) {
        this.jdjg = jdjg;
    }

    public String getJdrq() {
        return jdrq;
    }

    public void setJdrq(String jdrq) {
        this.jdrq = jdrq;
    }

    public String getPzjg() {
        return pzjg;
    }

    public void setPzjg(String pzjg) {
        this.pzjg = pzjg;
    }

    public String getPzrq() {
        return pzrq;
    }

    public void setPzrq(String pzrq) {
        this.pzrq = pzrq;
    }

    public String getJyjg() {
        return jyjg;
    }

    public void setJyjg(String jyjg) {
        this.jyjg = jyjg;
    }

    public String getJyrq() {
        return jyrq;
    }

    public void setJyrq(String jyrq) {
        this.jyrq = jyrq;
    }

    public String getSfyzx() {
        return sfyzx;
    }

    public void setSfyzx(String sfyzx) {
        this.sfyzx = sfyzx;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
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

    public String getDjsj() {
        return djsj;
    }

    public void setDjsj(String djsj) {
        this.djsj = djsj;
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
