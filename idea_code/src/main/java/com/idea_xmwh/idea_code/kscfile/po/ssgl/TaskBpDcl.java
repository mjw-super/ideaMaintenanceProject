package com.tdh.light.spxt.bp.po.ssgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:TASK_BP_DCL表映射，中台专用任务表
 * Project Name:spxt
 * File Name:TaskDcl
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/5 15:33   hebq         1.0       1.0 Version
 **/
@TableName("TASK_BP_DCL")
public class TaskBpDcl {

    @TableId(value = "ROWUUID", type = IdType.INPUT)
    private String rowuuid;

    @TableField("AHDM")
    private String ahdm;

    @TableField("FYDM")
    private String fydm;

    @TableField("CREATE_BY")
    private String createby;

    @TableField("RWDM")
    private String rwdm;

    @TableField("RWCS")
    private String rwcs;

    @TableField("RWCS2")
    private String rwcs2;

    @TableField("ERRMSG")
    private String errmsg;

    @TableField("SBCS")
    private Integer sbcs;

    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    public TaskBpDcl() {
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
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

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getRwdm() {
        return rwdm;
    }

    public void setRwdm(String rwdm) {
        this.rwdm = rwdm;
    }

    public String getRwcs() {
        return rwcs;
    }

    public void setRwcs(String rwcs) {
        this.rwcs = rwcs;
    }

    public String getRwcs2() {
        return rwcs2;
    }

    public void setRwcs2(String rwcs2) {
        this.rwcs2 = rwcs2;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Integer getSbcs() {
        return sbcs;
    }

    public void setSbcs(Integer sbcs) {
        this.sbcs = sbcs;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
