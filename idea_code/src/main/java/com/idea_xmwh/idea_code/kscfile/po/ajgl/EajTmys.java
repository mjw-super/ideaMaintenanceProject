package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:条码移送
 * Project Name:spxt
 * File Name:EajTmys
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/7 11:39   zhouhua         1.0       1.0 Version
 **/
@TableName("EAJ_TMYS")
public class EajTmys {
    private static final long serialVersionUID = 1L;

    /**
     * 案件标识
     */
    @TableId(value = "LSH",type = IdType.INPUT)
    private String lsh;
    @TableField("LB")
    private String lb;
    @TableField("AHDMC")
    private String ahdmc;
    @TableField("LBMC")
    private String lbmc;

    /**
     * 删除字段
     */
    @TableField("IS_DELETED")
    private Integer  isDeleted;
    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String  createBy;
    /**
     * 最新修改人
     */
    @TableField("UPDATE_BY")
    private String  updateBy;
    /**
     * 创建日期
     */
    @TableField("GMT_CREAT")
    private Date gmtCreat;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getAhdmc() {
        return ahdmc;
    }

    public void setAhdmc(String ahdmc) {
        this.ahdmc = ahdmc;
    }

    public String getLbmc() {
        return lbmc;
    }

    public void setLbmc(String lbmc) {
        this.lbmc = lbmc;
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
