package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:个案标签-辅助功能-期限变更
 * Project Name:spxt
 * File Name:EajQxbgAjgl
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/21 18:16   zhouhua         1.0       1.0 Version
 **/
@TableName("EAJ_QXBG_AJGL")
public class EajQxbgAjgl {

    @TableId(value = "ROWUUID",type = IdType.INPUT)
    private String rowuuid;

    @TableField("QXBGUUID")
    private String qxbguuid;

    @TableField("AJGLUUID")
    private String ajgluuid;

    @TableField("FYDM")
    private String fydm;

    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

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
    private Date  gmtCreat;

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getQxbguuid() {
        return qxbguuid;
    }

    public void setQxbguuid(String qxbguuid) {
        this.qxbguuid = qxbguuid;
    }

    public String getAjgluuid() {
        return ajgluuid;
    }

    public void setAjgluuid(String ajgluuid) {
        this.ajgluuid = ajgluuid;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
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
