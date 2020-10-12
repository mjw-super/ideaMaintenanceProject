package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:并发控制（T_BFKZ）持久化对象
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.system
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/23 14        gp     1.0        1.0 Version
 **/
@TableName("T_BFKZ")
public class TBfkz {
    private static final long serialVersionUID = 1L;

    @TableId(value = "FYDM", type = IdType.INPUT)
    private String fydm;
    @TableField("FL")
    private String fl;
    @TableField("VAL")
    private Long val;


    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public Long getVal() {
        return val;
    }

    public void setVal(Long val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TBfkz{" +
                "fydm='" + fydm + '\'' +
                ", fl='" + fl + '\'' +
                ", val=" + val +
                '}';
    }
}
