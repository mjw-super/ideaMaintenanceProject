package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:HlwTjjg
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/30 19:49   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("HLW_TJJG")
public class HlwTjjg implements Serializable {

    @TableId(value = "TJJGDM",type = IdType.INPUT)
    private String tjjgdm;
    @TableField("TJJGMC")    
    private String tjjgmc;
    @TableField("JGLXDM")   
    private String jglxdm;
    @TableField("JGLXMC")    
    private String jglxmc;
    @TableField("TJLXDM")   
    private String tjlxdm;
    @TableField("TJLXMC")    
    private String tjlxmc;
    @TableField("JGZSTP")   
    private String jgzstp;
    @TableField("JGSHDM")   
    private String jgshdm;
    @TableField("JGSHMC")    
    private String jgshmc;
    @TableField("JGSDM")    
    private String jgsdm;
    @TableField("JGSMC")     
    private String jgsmc;
    @TableField("JGQDM")    
    private String jgqdm;
    @TableField("JGQMC")     
    private String jgqmc;
    @TableField("JGJDDM")   
    private String jgjddm;
    @TableField("JGJDMC")    
    private String jgjdmc;
    @TableField("JGXXDZ")    
    private String jgxxdz;
    @TableField("TJJGJJ")    
    private String tjjgjj;
    @TableField("JGCJSJ")   
    private String jgcjsj;
    @TableField("JGSCLY")    
    private String jgscly;
    @TableField("FYDM")     
    private String fydm;
    @TableField("ROWUUID")  
    private String rowuuid;
    @TableField("LASTUPDATE")
    private Date lastupdate;


    public String getTjjgdm() {
        return tjjgdm;
    }

    public void setTjjgdm(String tjjgdm) {
        this.tjjgdm = tjjgdm;
    }

    public String getTjjgmc() {
        return tjjgmc;
    }

    public void setTjjgmc(String tjjgmc) {
        this.tjjgmc = tjjgmc;
    }

    public String getJglxdm() {
        return jglxdm;
    }

    public void setJglxdm(String jglxdm) {
        this.jglxdm = jglxdm;
    }

    public String getJglxmc() {
        return jglxmc;
    }

    public void setJglxmc(String jglxmc) {
        this.jglxmc = jglxmc;
    }

    public String getTjlxdm() {
        return tjlxdm;
    }

    public void setTjlxdm(String tjlxdm) {
        this.tjlxdm = tjlxdm;
    }

    public String getTjlxmc() {
        return tjlxmc;
    }

    public void setTjlxmc(String tjlxmc) {
        this.tjlxmc = tjlxmc;
    }

    public String getJgzstp() {
        return jgzstp;
    }

    public void setJgzstp(String jgzstp) {
        this.jgzstp = jgzstp;
    }

    public String getJgshdm() {
        return jgshdm;
    }

    public void setJgshdm(String jgshdm) {
        this.jgshdm = jgshdm;
    }

    public String getJgshmc() {
        return jgshmc;
    }

    public void setJgshmc(String jgshmc) {
        this.jgshmc = jgshmc;
    }

    public String getJgsdm() {
        return jgsdm;
    }

    public void setJgsdm(String jgsdm) {
        this.jgsdm = jgsdm;
    }

    public String getJgsmc() {
        return jgsmc;
    }

    public void setJgsmc(String jgsmc) {
        this.jgsmc = jgsmc;
    }

    public String getJgqdm() {
        return jgqdm;
    }

    public void setJgqdm(String jgqdm) {
        this.jgqdm = jgqdm;
    }

    public String getJgqmc() {
        return jgqmc;
    }

    public void setJgqmc(String jgqmc) {
        this.jgqmc = jgqmc;
    }

    public String getJgjddm() {
        return jgjddm;
    }

    public void setJgjddm(String jgjddm) {
        this.jgjddm = jgjddm;
    }

    public String getJgjdmc() {
        return jgjdmc;
    }

    public void setJgjdmc(String jgjdmc) {
        this.jgjdmc = jgjdmc;
    }

    public String getJgxxdz() {
        return jgxxdz;
    }

    public void setJgxxdz(String jgxxdz) {
        this.jgxxdz = jgxxdz;
    }

    public String getTjjgjj() {
        return tjjgjj;
    }

    public void setTjjgjj(String tjjgjj) {
        this.tjjgjj = tjjgjj;
    }

    public String getJgcjsj() {
        return jgcjsj;
    }

    public void setJgcjsj(String jgcjsj) {
        this.jgcjsj = jgcjsj;
    }

    public String getJgscly() {
        return jgscly;
    }

    public void setJgscly(String jgscly) {
        this.jgscly = jgscly;
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
}
