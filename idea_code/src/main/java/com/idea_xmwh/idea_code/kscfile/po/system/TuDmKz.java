package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 * @author XiongWei
 * @since 2019-10-15
 */
@TableName("TU_DM_KZ")
public class TuDmKz {

    @TableField("FL")
    private String fl;
    @TableId("DM")
    private String dm;
    @TableId("FYDM")
    private String fydm;
    @TableField("VAL")
    private String val;
    @TableField("SM")
    private String sm;
    @TableField("SFKXG")
    private String sfkxg;


    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String getSfkxg() {
        return sfkxg;
    }

    public void setSfkxg(String sfkxg) {
        this.sfkxg = sfkxg;
    }

    @Override
    public String toString() {
        return "TuDmKz{" +
                "fl=" + fl +
                ", dm=" + dm +
                ", fydm=" + fydm +
                ", val=" + val +
                ", sm=" + sm +
                ", sfkxg=" + sfkxg +
                "}";
    }
}
