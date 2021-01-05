package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description: 上诉移送当事人
 * Project Name:spxt
 * File Name:EajSksDsrMapper
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/16 11:46   zhangz         1.0       1.0 Version
 **/
@TableName("EAJ_SKS_DSR")
public class EajSksDsr {

    private String ahdm;
    private Integer ysxh;
    private Integer xh;
    private String fydm;
    private String dsrxh;
    private String dsrmc;
    private String ssdw1dm;
    private String ssdw1ms;
    private String ssdw2dm;
    private String ssdw2ms;
    private String zdcpsx;
    private Short bgrpxh;
    private Date lastupdate;
    private String lx;
    @TableField("IS_DELETED")
    private String isDeleted;
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

    public Integer getYsxh() {
        return ysxh;
    }

    public void setYsxh(Integer ysxh) {
        this.ysxh = ysxh;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public String getDsrmc() {
        return dsrmc;
    }

    public void setDsrmc(String dsrmc) {
        this.dsrmc = dsrmc;
    }

    public String getSsdw1dm() {
        return ssdw1dm;
    }

    public void setSsdw1dm(String ssdw1dm) {
        this.ssdw1dm = ssdw1dm;
    }

    public String getSsdw1ms() {
        return ssdw1ms;
    }

    public void setSsdw1ms(String ssdw1ms) {
        this.ssdw1ms = ssdw1ms;
    }

    public String getSsdw2dm() {
        return ssdw2dm;
    }

    public void setSsdw2dm(String ssdw2dm) {
        this.ssdw2dm = ssdw2dm;
    }

    public String getSsdw2ms() {
        return ssdw2ms;
    }

    public void setSsdw2ms(String ssdw2ms) {
        this.ssdw2ms = ssdw2ms;
    }

    public String getZdcpsx() {
        return zdcpsx;
    }

    public void setZdcpsx(String zdcpsx) {
        this.zdcpsx = zdcpsx;
    }

    public Short getBgrpxh() {
        return bgrpxh;
    }

    public void setBgrpxh(Short bgrpxh) {
        this.bgrpxh = bgrpxh;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
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
