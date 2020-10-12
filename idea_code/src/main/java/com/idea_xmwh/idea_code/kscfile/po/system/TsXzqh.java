package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 行政区划
 * </p>
 * @author XiongWei
 * @since 2019-10-18
 */
@TableName("TS_XZQH")
public class TsXzqh {

    @TableId("QHDM")
    private String qhdm;
    @TableField("QHMC")
    private String qhmc;
    @TableField("FLJB")
    private String fljb;
    @TableField("QHJC")
    private String qhjc;


    public String getQhdm() {
        return qhdm;
    }

    public void setQhdm(String qhdm) {
        this.qhdm = qhdm;
    }

    public String getQhmc() {
        return qhmc;
    }

    public void setQhmc(String qhmc) {
        this.qhmc = qhmc;
    }

    public String getFljb() {
        return fljb;
    }

    public void setFljb(String fljb) {
        this.fljb = fljb;
    }

    public String getQhjc() {
        return qhjc;
    }

    public void setQhjc(String qhjc) {
        this.qhjc = qhjc;
    }

    @Override
    public String toString() {
        return "TsXzqh{" +
                "qhdm=" + qhdm +
                ", qhmc=" + qhmc +
                ", fljb=" + fljb +
                ", qhjc=" + qhjc +
                "}";
    }
}
