package com.idea_xmwh.idea_code.kscfile.po.fjfl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:案件繁简分流指标表
 * Project Name:spxt
 * File Name:EajFjflzb
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/10/19 9:14   zhouhua         1.0       1.0 Version
 **/
@TableName("EAJ_FJFLZB")
public class EajFjflzb {

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value="LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("MGRQ")
    private String mgrq;
    @TableField("DSRSL")
    private Integer dsrsl;
    @TableField("BGRSL")
    private Integer bgrsl;
    @TableField("YGSZYFDR")
    private String ygszyfdr;
    @TableField("QSLHCS")
    private Integer qslhcs;
    @TableField("SSQQSL")
    private Integer ssqqsl;
    @TableField("YZJBQSQ")
    private String yzjbqsq;
    @TableField("YXWBQSQ")
    private String yxwbqsq;
    @TableField("JTSS")
    private String jtss;
    @TableField("GLXXLA")
    private String glxxla;
    @TableField("SFJF")
    private String sfjf;
    @TableField("QQYBSCGFXWJ")
    private String qqybscgfxwj;
    @TableField("QQYBJJMSZY")
    private String qqybjjmszy;
    @TableField("QQYBJJPCQQ")
    private String qqybjjpcqq;
    @TableField("BGRYLJS")
    private String bgryljs;

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

    public String getMgrq() {
        return mgrq;
    }

    public void setMgrq(String mgrq) {
        this.mgrq = mgrq;
    }

    public Integer getDsrsl() {
        return dsrsl;
    }

    public void setDsrsl(Integer dsrsl) {
        this.dsrsl = dsrsl;
    }

    public Integer getBgrsl() {
        return bgrsl;
    }

    public void setBgrsl(Integer bgrsl) {
        this.bgrsl = bgrsl;
    }

    public String getYgszyfdr() {
        return ygszyfdr;
    }

    public void setYgszyfdr(String ygszyfdr) {
        this.ygszyfdr = ygszyfdr;
    }

    public Integer getQslhcs() {
        return qslhcs;
    }

    public void setQslhcs(Integer qslhcs) {
        this.qslhcs = qslhcs;
    }

    public Integer getSsqqsl() {
        return ssqqsl;
    }

    public void setSsqqsl(Integer ssqqsl) {
        this.ssqqsl = ssqqsl;
    }

    public String getYzjbqsq() {
        return yzjbqsq;
    }

    public void setYzjbqsq(String yzjbqsq) {
        this.yzjbqsq = yzjbqsq;
    }

    public String getYxwbqsq() {
        return yxwbqsq;
    }

    public void setYxwbqsq(String yxwbqsq) {
        this.yxwbqsq = yxwbqsq;
    }

    public String getJtss() {
        return jtss;
    }

    public void setJtss(String jtss) {
        this.jtss = jtss;
    }

    public String getGlxxla() {
        return glxxla;
    }

    public void setGlxxla(String glxxla) {
        this.glxxla = glxxla;
    }

    public String getSfjf() {
        return sfjf;
    }

    public void setSfjf(String sfjf) {
        this.sfjf = sfjf;
    }

    public String getQqybscgfxwj() {
        return qqybscgfxwj;
    }

    public void setQqybscgfxwj(String qqybscgfxwj) {
        this.qqybscgfxwj = qqybscgfxwj;
    }

    public String getQqybjjmszy() {
        return qqybjjmszy;
    }

    public void setQqybjjmszy(String qqybjjmszy) {
        this.qqybjjmszy = qqybjjmszy;
    }

    public String getQqybjjpcqq() {
        return qqybjjpcqq;
    }

    public void setQqybjjpcqq(String qqybjjpcqq) {
        this.qqybjjpcqq = qqybjjpcqq;
    }

    public String getBgryljs() {
        return bgryljs;
    }

    public void setBgryljs(String bgryljs) {
        this.bgryljs = bgryljs;
    }
}
