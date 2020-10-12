package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 *
 * </p>
 * @author XiongWei
 * @since 2019-10-15
 */
@TableName("TS_DM")
public class TsDm {


    @TableId("KIND")
    private String kind;
    @TableField("BT")
    private String bt;
    @TableId("CODE")
    private String code;
    @TableField("MC")
    private String mc;
    @TableField("SFJY")
    private String sfjy;
    @TableField("BZ")
    private String bz;
    @TableField("PXH")
    private Integer pxh;
    @TableField("EJKIND")
    private String ejkind;
    @TableField("SYAJLX")
    private String syajlx;


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

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Integer getPxh() {
        return pxh;
    }

    public void setPxh(Integer pxh) {
        this.pxh = pxh;
    }

    public String getEjkind() {
        return ejkind;
    }

    public void setEjkind(String ejkind) {
        this.ejkind = ejkind;
    }

    public String getSyajlx() {
        return syajlx;
    }

    public void setSyajlx(String syajlx) {
        this.syajlx = syajlx;
    }

    @Override
    public String toString() {
        return "TsDm{" +
                "kind=" + kind +
                ", bt=" + bt +
                ", code=" + code +
                ", mc=" + mc +
                ", sfjy=" + sfjy +
                ", bz=" + bz +
                ", pxh=" + pxh +
                ", ejkind=" + ejkind +
                ", syajlx=" + syajlx +
                "}";
    }
}
