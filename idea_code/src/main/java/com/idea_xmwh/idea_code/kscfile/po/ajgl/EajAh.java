package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 案号表
 * </p>
 * @author XiongWei
 * @since 2019-10-08
 */

@TableName("EAJ_AH")
public class EajAh {

    private static final long serialVersionUID = 1L;

    /**
     * 案件标识
     */
    @TableField("AHDM")
    private String ahdm;

    @TableId(value = "AH",type = IdType.INPUT)
    private String ah;

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    @Override
    public String toString() {
        return "EajAh{" +
                "ahdm=" + ahdm +
                ", ah=" + ah +
                "}";
    }
}
