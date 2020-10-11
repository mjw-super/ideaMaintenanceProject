package com.tdh.light.spxt.bp.po.dsr;


import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * 当事人指控罪名实体
 * @author wuhz
 * @since 2020-06-15
 */
@TableName("EDSR_ZKZM")
public class EdsrZkzm {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableId(value = "BGR", type = IdType.INPUT)
    private String bgr;

    @TableId(value = "XH", type = IdType.INPUT)
    private Integer xh;

    @TableField(value = "ZM")
    private String zm;

    @TableField(value = "ZMZS")
    private String zmzs;

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


    public String getBgr() {
        return bgr;
    }

    public void setBgr(String bgr) {
        this.bgr = bgr;
    }


    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }


    public String getZm() {
        return zm;
    }

    public void setZm(String zm) {
        this.zm = zm;
    }


    public String getZmzs() {
        return zmzs;
    }

    public void setZmzs(String zmzs) {
        this.zmzs = zmzs;
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
