package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * 当事人行政行为实体
 * @author wuhz
 * @since 2020-06-15
 */
@TableName("EAJ_XZ_GFXWJSC")
public class EajXzGfxwjsc {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableId(value = "XH", type = IdType.INPUT)
    private Integer xh;

    @TableField(value = "FYDM")
    private String fydm;

    @TableField(value = "QQSCRQ")
    private String qqscrq;

    @TableField(value = "SCYJ")
    private String scyj;

    @TableField(value = "SDRQ")
    private String sdrq;

    @TableField(value = "CLJYSWDWLX")
    private String cljyswdwlx;

    @TableField(value = "CLJYSJRQ")
    private String cljysjrq;

    @TableField(value = "GFWJLX")
    private String gfwjlx;

    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    @TableField(value = "ROWUUID")
    private String rowuuid;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField(value = "CREATE_BY")
    private String create_by;

    @TableField(value = "UPDATE_BY")
    private String update_by;

    @TableField("GMT_CREAT")
    private Date gmtCreat;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
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

    public String getQqscrq() {
        return qqscrq;
    }

    public void setQqscrq(String qqscrq) {
        this.qqscrq = qqscrq;
    }

    public String getScyj() {
        return scyj;
    }

    public void setScyj(String scyj) {
        this.scyj = scyj;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getCljyswdwlx() {
        return cljyswdwlx;
    }

    public void setCljyswdwlx(String cljyswdwlx) {
        this.cljyswdwlx = cljyswdwlx;
    }

    public String getCljysjrq() {
        return cljysjrq;
    }

    public void setCljysjrq(String cljysjrq) {
        this.cljysjrq = cljysjrq;
    }

    public String getGfwjlx() {
        return gfwjlx;
    }

    public void setGfwjlx(String gfwjlx) {
        this.gfwjlx = gfwjlx;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }
}
