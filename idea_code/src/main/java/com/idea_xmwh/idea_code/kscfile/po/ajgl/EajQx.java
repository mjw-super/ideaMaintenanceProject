package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:案件期限持久化对象
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.ajgl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/21 11        gp     1.0        1.0 Version
 **/
@TableName("EAJ_QX")
public class EajQx {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("FDLAQX")
    private Integer fdlaqx;
    @TableField("SJLATS")
    private Integer sjlats;
    @TableField("LACQTS")
    private Integer lacqts;
    @TableField("FDSXTS")
    private Integer fdsxts;
    @TableField("SJTS")
    private Integer sjts;
    @TableField("CSXTS")
    private Integer csxts;
    @TableField("CSXYY")
    private String csxyy;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("YCTS")
    private Long ycts;
    @TableField("KCTS")
    private Integer kcts;
    @TableField("ZRSLTS")
    private Long zrslts;
    @TableField("CSXDJ")
    private String csxdj;
    @TableField("TXRQ")
    private String txrq;
    @TableField("SFTX")
    private String sftx;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField("LAQXJMRQ")
    private String laqxjmrq;
    @TableField("SXQSRQ")
    private String sxqsrq;
    @TableField("SXJMRQ")
    private String sxjmrq;
    @TableField("SXJSSJ")
    private Date sxjssj;
    @TableField("FYDM")
    private String fydm;
    @TableField("YJRQ")
    private String yjrq;
    @TableField("JAXL")
    private String jaxl;
    @TableField("CBCS")
    private Long cbcs;
    @TableField("CBSJ")
    private Date cbsj;
    @TableField("QTJZRQ")
    private String qtjzrq;
    @TableField("QXBGCS")
    private Integer qxbgcs;
    @TableField("ZHQXBGYY")
    private String zhqxbgyy;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getFdlaqx() {
        return fdlaqx;
    }

    public void setFdlaqx(Integer fdlaqx) {
        this.fdlaqx = fdlaqx;
    }

    public Integer getSjlats() {
        return sjlats;
    }

    public void setSjlats(Integer sjlats) {
        this.sjlats = sjlats;
    }

    public Integer getLacqts() {
        return lacqts;
    }

    public void setLacqts(Integer lacqts) {
        this.lacqts = lacqts;
    }

    public Integer getFdsxts() {
        return fdsxts;
    }

    public void setFdsxts(Integer fdsxts) {
        this.fdsxts = fdsxts;
    }

    public Integer getSjts() {
        return sjts;
    }

    public void setSjts(Integer sjts) {
        this.sjts = sjts;
    }

    public Integer getCsxts() {
        return csxts;
    }

    public void setCsxts(Integer csxts) {
        this.csxts = csxts;
    }

    public String getCsxyy() {
        return csxyy;
    }

    public void setCsxyy(String csxyy) {
        this.csxyy = csxyy;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Long getYcts() {
        return ycts;
    }

    public void setYcts(Long ycts) {
        this.ycts = ycts;
    }

    public Integer getKcts() {
        return kcts;
    }

    public void setKcts(Integer kcts) {
        this.kcts = kcts;
    }

    public Long getZrslts() {
        return zrslts;
    }

    public void setZrslts(Long zrslts) {
        this.zrslts = zrslts;
    }

    public String getCsxdj() {
        return csxdj;
    }

    public void setCsxdj(String csxdj) {
        this.csxdj = csxdj;
    }

    public String getTxrq() {
        return txrq;
    }

    public void setTxrq(String txrq) {
        this.txrq = txrq;
    }

    public String getSftx() {
        return sftx;
    }

    public void setSftx(String sftx) {
        this.sftx = sftx;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getLaqxjmrq() {
        return laqxjmrq;
    }

    public void setLaqxjmrq(String laqxjmrq) {
        this.laqxjmrq = laqxjmrq;
    }

    public String getSxqsrq() {
        return sxqsrq;
    }

    public void setSxqsrq(String sxqsrq) {
        this.sxqsrq = sxqsrq;
    }

    public String getSxjmrq() {
        return sxjmrq;
    }

    public void setSxjmrq(String sxjmrq) {
        this.sxjmrq = sxjmrq;
    }

    public Date getSxjssj() {
        return sxjssj;
    }

    public void setSxjssj(Date sxjssj) {
        this.sxjssj = sxjssj;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getYjrq() {
        return yjrq;
    }

    public void setYjrq(String yjrq) {
        this.yjrq = yjrq;
    }

    public String getJaxl() {
        return jaxl;
    }

    public void setJaxl(String jaxl) {
        this.jaxl = jaxl;
    }

    public Long getCbcs() {
        return cbcs;
    }

    public void setCbcs(Long cbcs) {
        this.cbcs = cbcs;
    }

    public Date getCbsj() {
        return cbsj;
    }

    public void setCbsj(Date cbsj) {
        this.cbsj = cbsj;
    }

    public String getQtjzrq() {
        return qtjzrq;
    }

    public void setQtjzrq(String qtjzrq) {
        this.qtjzrq = qtjzrq;
    }

    public Integer getQxbgcs() {
        return qxbgcs;
    }

    public void setQxbgcs(Integer qxbgcs) {
        this.qxbgcs = qxbgcs;
    }

    public String getZhqxbgyy() {
        return zhqxbgyy;
    }

    public void setZhqxbgyy(String zhqxbgyy) {
        this.zhqxbgyy = zhqxbgyy;
    }

    @Override
    public String toString() {
        return "EajQx{" +
                "ahdm='" + ahdm + '\'' +
                ", fdlaqx=" + fdlaqx +
                ", sjlats=" + sjlats +
                ", lacqts=" + lacqts +
                ", fdsxts=" + fdsxts +
                ", sjts=" + sjts +
                ", csxts=" + csxts +
                ", csxyy='" + csxyy + '\'' +
                ", lastupdate=" + lastupdate +
                ", ycts=" + ycts +
                ", kcts=" + kcts +
                ", zrslts=" + zrslts +
                ", csxdj='" + csxdj + '\'' +
                ", txrq='" + txrq + '\'' +
                ", sftx='" + sftx + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", laqxjmrq='" + laqxjmrq + '\'' +
                ", sxqsrq='" + sxqsrq + '\'' +
                ", sxjmrq='" + sxjmrq + '\'' +
                ", sxjssj=" + sxjssj +
                ", fydm='" + fydm + '\'' +
                ", yjrq='" + yjrq + '\'' +
                ", jaxl='" + jaxl + '\'' +
                ", cbcs=" + cbcs +
                ", cbsj=" + cbsj +
                ", qtjzrq='" + qtjzrq + '\'' +
                ", qxbgcs=" + qxbgcs +
                ", zhqxbgyy='" + zhqxbgyy + '\'' +
                '}';
    }
}
