package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:破产审结信息表
 * Project Name:spxt
 * File Name:EajPcqsSjqk
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/20 15:07   zhongcg         1.0       1.0 Version
 **/
@TableName("EAJ_PCQS_SJQK")
public class EajPcqsSjqk {
    private static final long serialVersionUID = 1L;

    /**
     * 案件标识
     */
    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField(value = "FYDM")
    private String fydm;
    @TableField(value = "PCQYZCJZ")
    private Double pcqyzcjz;
    @TableField(value = "PCZWZE")
    private Double pczwze;
    @TableField(value = "QCZE")
    private Double qcze;
    @TableField(value = "KGFPDCCE")
    private Double kgfpdcce;
    @TableField(value = "ZMZCJZ")
    private Double zmzcjz;
    @TableField(value = "YDBDCCJZ")
    private Double ydbdccjz;
    @TableField(value = "QYHZW")
    private Double qyhzw;
    @TableField(value = "QZGZW")
    private Double qzgzw;
    @TableField(value = "SJPCQYRS")
    private Integer sjpcqyrs;
    @TableField(value = "XGPCRQ")
    private String xgpcrq;
    @TableField(value = "XGPCSY")
    private String xgpcsy;
    @TableField(value = "PCFYZE")
    private Double pcfyze;
    @TableField(value = "PCCXZHSCYJ")
    private String pccxzhscyj;
    @TableField(value = "PCCXZHCDRQ")
    private String pccxzhcdrq;
    @TableField(value = "PCCXZHWS")
    private String pccxzhws;
    @TableField(value = "SJDLMJJD")
    private String sjdlmjjd;
    @TableField(value = "JGZFQQFXCZ")
    private String jgzfqqfxcz;
    @TableField(value = "CCFPFA")
    private String ccfpfa;
    @TableField(value = "DBZQJE")
    private Double dbzqje;
    @TableField(value = "SSZQJE")
    private Double sszqje;
    @TableField(value = "PTZQJE")
    private Double ptzqje;
    @TableField(value = "PTZQQCL")
    private Double ptzqqcl;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

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

    public Double getPcqyzcjz() {
        return pcqyzcjz;
    }

    public void setPcqyzcjz(Double pcqyzcjz) {
        this.pcqyzcjz = pcqyzcjz;
    }

    public Double getPczwze() {
        return pczwze;
    }

    public void setPczwze(Double pczwze) {
        this.pczwze = pczwze;
    }

    public Double getQcze() {
        return qcze;
    }

    public void setQcze(Double qcze) {
        this.qcze = qcze;
    }

    public Double getKgfpdcce() {
        return kgfpdcce;
    }

    public void setKgfpdcce(Double kgfpdcce) {
        this.kgfpdcce = kgfpdcce;
    }

    public Double getZmzcjz() {
        return zmzcjz;
    }

    public void setZmzcjz(Double zmzcjz) {
        this.zmzcjz = zmzcjz;
    }

    public Double getYdbdccjz() {
        return ydbdccjz;
    }

    public void setYdbdccjz(Double ydbdccjz) {
        this.ydbdccjz = ydbdccjz;
    }

    public Double getQyhzw() {
        return qyhzw;
    }

    public void setQyhzw(Double qyhzw) {
        this.qyhzw = qyhzw;
    }

    public Double getQzgzw() {
        return qzgzw;
    }

    public void setQzgzw(Double qzgzw) {
        this.qzgzw = qzgzw;
    }

    public Integer getSjpcqyrs() {
        return sjpcqyrs;
    }

    public void setSjpcqyrs(Integer sjpcqyrs) {
        this.sjpcqyrs = sjpcqyrs;
    }

    public String getXgpcrq() {
        return xgpcrq;
    }

    public void setXgpcrq(String xgpcrq) {
        this.xgpcrq = xgpcrq;
    }

    public String getXgpcsy() {
        return xgpcsy;
    }

    public void setXgpcsy(String xgpcsy) {
        this.xgpcsy = xgpcsy;
    }

    public Double getPcfyze() {
        return pcfyze;
    }

    public void setPcfyze(Double pcfyze) {
        this.pcfyze = pcfyze;
    }

    public String getPccxzhscyj() {
        return pccxzhscyj;
    }

    public void setPccxzhscyj(String pccxzhscyj) {
        this.pccxzhscyj = pccxzhscyj;
    }

    public String getPccxzhcdrq() {
        return pccxzhcdrq;
    }

    public void setPccxzhcdrq(String pccxzhcdrq) {
        this.pccxzhcdrq = pccxzhcdrq;
    }

    public String getPccxzhws() {
        return pccxzhws;
    }

    public void setPccxzhws(String pccxzhws) {
        this.pccxzhws = pccxzhws;
    }

    public String getSjdlmjjd() {
        return sjdlmjjd;
    }

    public void setSjdlmjjd(String sjdlmjjd) {
        this.sjdlmjjd = sjdlmjjd;
    }

    public String getJgzfqqfxcz() {
        return jgzfqqfxcz;
    }

    public void setJgzfqqfxcz(String jgzfqqfxcz) {
        this.jgzfqqfxcz = jgzfqqfxcz;
    }

    public String getCcfpfa() {
        return ccfpfa;
    }

    public void setCcfpfa(String ccfpfa) {
        this.ccfpfa = ccfpfa;
    }

    public Double getDbzqje() {
        return dbzqje;
    }

    public void setDbzqje(Double dbzqje) {
        this.dbzqje = dbzqje;
    }

    public Double getSszqje() {
        return sszqje;
    }

    public void setSszqje(Double sszqje) {
        this.sszqje = sszqje;
    }

    public Double getPtzqje() {
        return ptzqje;
    }

    public void setPtzqje(Double ptzqje) {
        this.ptzqje = ptzqje;
    }

    public Double getPtzqqcl() {
        return ptzqqcl;
    }

    public void setPtzqqcl(Double ptzqqcl) {
        this.ptzqqcl = ptzqqcl;
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
}
