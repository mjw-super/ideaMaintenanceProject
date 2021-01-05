package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:YQ_XBB
 * Project Name:spxt
 * File Name:YqDjbEntity
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/11 10:59   zhongcg         1.0       1.0 Version
 **/
@TableName("YQ_XXB")
public class YqXxbEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField("AHDM")
    private String ahdm;
    @TableField("YQXH")
    private Integer yqxh;
    @TableField("TITLE")
    private String title;
    @TableField("SUMMARY")
    private String summary;
    @TableField("PLATFORM")
    private String platform;
    @TableField("AUTHOR")
    private String author;
    @TableField("POSTTIME")
    private Date positime;
    @TableField("DETAILSANDREASON")
    private String detailsandreason;
    @TableField("SITUATION")
    private String situation;
    @TableField("FYDM")
    private String dydm;
    @TableField("INFOID")
    private String infoid;
    @TableField("SFCN")
    private String sfcn;
    @TableField(value = "TSSJ")
    private Date tssj;
    @TableField("SFBZTX")
    private String sfbztx;
    @TableField("DLFXLY")
    private String dlfxly;
    @TableField("JYFXDJ")
    private String jffxdj;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getYqxh() {
        return yqxh;
    }

    public void setYqxh(Integer yqxh) {
        this.yqxh = yqxh;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPositime() {
        return positime;
    }

    public void setPositime(Date positime) {
        this.positime = positime;
    }

    public String getDetailsandreason() {
        return detailsandreason;
    }

    public void setDetailsandreason(String detailsandreason) {
        this.detailsandreason = detailsandreason;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getDydm() {
        return dydm;
    }

    public void setDydm(String dydm) {
        this.dydm = dydm;
    }

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid;
    }

    public String getSfcn() {
        return sfcn;
    }

    public void setSfcn(String sfcn) {
        this.sfcn = sfcn;
    }

    public Date getTssj() {
        return tssj;
    }

    public void setTssj(Date tssj) {
        this.tssj = tssj;
    }

    public String getSfbztx() {
        return sfbztx;
    }

    public void setSfbztx(String sfbztx) {
        this.sfbztx = sfbztx;
    }

    public String getDlfxly() {
        return dlfxly;
    }

    public void setDlfxly(String dlfxly) {
        this.dlfxly = dlfxly;
    }

    public String getJffxdj() {
        return jffxdj;
    }

    public void setJffxdj(String jffxdj) {
        this.jffxdj = jffxdj;
    }
}
