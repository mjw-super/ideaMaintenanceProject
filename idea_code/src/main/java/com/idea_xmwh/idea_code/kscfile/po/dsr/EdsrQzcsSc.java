package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:个案标签-当事人-强制措施
 * Project Name:spxt
 * File Name:EdsrQzcsSc
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/11 9:54   zhouhua         1.0       1.0 Version
 **/
@TableName("EDSR_QZCS_SC")
public class EdsrQzcsSc {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableId(value = "XH", type = IdType.INPUT)
    private Integer xh;

    @TableId(value = "BGR", type = IdType.INPUT)
    private String bgr;

    @TableField(value = "QZCSZL")
    private String qzcszl;

    @TableField(value = "QZCSSY")
    private String qzcssy;


    @TableField(value = "JYJG")
    private String jyjg;

    @TableField(value = "JYRQ")
    private String jyrq;

    @TableField(value = "JDJG")
    private String jdjg;

    @TableField(value = "JDRQ")
    private String jdrq;

    @TableField(value = "PZJG")
    private String pzjg;

    @TableField(value = "PZRQ")
    private String pzrq;

    @TableField(value = "SFYZX")
    private String sfyzx;

    @TableField(value = "QZCSZXROWUUID")
    private String qzcszxrowuuid;

    @TableField(value = "DJR")
    private String djr;

    @TableField(value = "DJSJ")
    private String djsj;

    @TableField(value = "FYDM")
    private String fydm;

    @TableField(value = "ROWUUID")
    private String rowuuid;

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

    public String getQzcszl() {
        return qzcszl;
    }

    public void setQzcszl(String qzcszl) {
        this.qzcszl = qzcszl;
    }

    public String getQzcssy() {
        return qzcssy;
    }

    public void setQzcssy(String qzcssy) {
        this.qzcssy = qzcssy;
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

    public String getSfyzx() {
        return sfyzx;
    }

    public void setSfyzx(String sfyzx) {
        this.sfyzx = sfyzx;
    }

    public String getQzcszxrowuuid() {
        return qzcszxrowuuid;
    }

    public void setQzcszxrowuuid(String qzcszxrowuuid) {
        this.qzcszxrowuuid = qzcszxrowuuid;
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
