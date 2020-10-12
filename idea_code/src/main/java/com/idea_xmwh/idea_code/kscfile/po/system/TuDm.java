package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 *
 * </p>
 * @author XiongWei
 * @since 2019-10-21
 */
@TableName("TU_DM")
public class TuDm {

    @TableId("FYDM")
    private String fydm;
    @TableId("KIND")
    private String kind;
    @TableField("BT")
    private String bt;
    @TableField("CODE")
    private String code;
    @TableField("SM")
    private String sm;
    @TableField("SFJY")
    private String sfjy;
    @TableField("SFYH")
    private String sfyh;
    @TableField("BZ")
    private String bz;
    @TableField("PXH")
    private Long pxh;


    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy;
    }

    public String getSfyh() {
        return sfyh;
    }

    public void setSfyh(String sfyh) {
        this.sfyh = sfyh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Long getPxh() {
        return pxh;
    }

    public void setPxh(Long pxh) {
        this.pxh = pxh;
    }

}
