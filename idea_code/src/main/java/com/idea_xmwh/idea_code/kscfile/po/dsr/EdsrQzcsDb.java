package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:个案标签-当事人-强制措施
 * Project Name:spxt
 * File Name:EdsrQzcsDb
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/11 10:17   zhouhua         1.0       1.0 Version
 **/
@TableName("EDSR_QZCS_DB")
public class EdsrQzcsDb {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableId(value = "XH", type = IdType.INPUT)
    private Integer xh;

    @TableId(value = "BGR", type = IdType.INPUT)
    private String bgr;

    @TableField("DBFS")
    private String dbfs;

    @TableField("JNBZJSE")
    private String jnbzjse;

    @TableField("BZR")
    private String bzr;

    @TableField("BZJCLFS")
    private String bzjclfs;

    @TableField("MSBZJSY")
    private String msbzjsy;

    @TableField("CXJNBZJSE")
    private String cxjnbzjse;

    @TableField("THBZJSE")
    private String thbzjse;

    @TableField("DJR")
    private String djr;

    @TableField("DJSJ")
    private String djsj;

    @TableField("FYDM")
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

    public String getDbfs() {
        return dbfs;
    }

    public void setDbfs(String dbfs) {
        this.dbfs = dbfs;
    }

    public String getJnbzjse() {
        return jnbzjse;
    }

    public void setJnbzjse(String jnbzjse) {
        this.jnbzjse = jnbzjse;
    }

    public String getBzr() {
        return bzr;
    }

    public void setBzr(String bzr) {
        this.bzr = bzr;
    }

    public String getBzjclfs() {
        return bzjclfs;
    }

    public void setBzjclfs(String bzjclfs) {
        this.bzjclfs = bzjclfs;
    }

    public String getMsbzjsy() {
        return msbzjsy;
    }

    public void setMsbzjsy(String msbzjsy) {
        this.msbzjsy = msbzjsy;
    }

    public String getCxjnbzjse() {
        return cxjnbzjse;
    }

    public void setCxjnbzjse(String cxjnbzjse) {
        this.cxjnbzjse = cxjnbzjse;
    }

    public String getThbzjse() {
        return thbzjse;
    }

    public void setThbzjse(String thbzjse) {
        this.thbzjse = thbzjse;
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
