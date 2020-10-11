package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


import java.util.Date;

/**
 * <p>
 * 当事人证件信息
 * </p>
 *
 * @author cq
 * @since 2019-10-18
 */
@SuppressWarnings("ALL")
@TableName("EDSR_ZJ")
public class EdsrZj  {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ROWUUID", type = IdType.UUID)
    private String rowuuid;

    @TableField("AHDM")
    private String ahdm;
    @TableField("DSRXH")
    private String dsrxh;
    @TableField("XH")
    private Integer xh;
    @TableField("ZJZL")
    private String zjzl;
    @TableField("ZJHM")
    private String zjhm;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("QTZJMC")
    private String qtzjmc;
    @TableField("ZJHM_M")
    private String zjhmM;
    @TableField("IS_DELETED")
    private Integer isDeleted;


    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getDsrxh() {
        return dsrxh;
    }

    public void setDsrxh(String dsrxh) {
        this.dsrxh = dsrxh;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getZjzl() {
        return zjzl;
    }

    public void setZjzl(String zjzl) {
        this.zjzl = zjzl;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
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

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getQtzjmc() {
        return qtzjmc;
    }

    public void setQtzjmc(String qtzjmc) {
        this.qtzjmc = qtzjmc;
    }

    public String getZjhmM() {
        return zjhmM;
    }

    public void setZjhmM(String zjhmM) {
        this.zjhmM = zjhmM;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "EdsrZj{" +
        "ahdm=" + ahdm +
        ", dsrxh=" + dsrxh +
        ", xh=" + xh +
        ", zjzl=" + zjzl +
        ", zjhm=" + zjhm +
        ", fydm=" + fydm +
        ", lastupdate=" + lastupdate +
        ", rowuuid=" + rowuuid +
        ", qtzjmc=" + qtzjmc +
        ", zjhmM=" + zjhmM +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
