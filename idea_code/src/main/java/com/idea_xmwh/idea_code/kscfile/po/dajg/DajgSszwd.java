package com.idea_xmwh.idea_code.kscfile.po.dajg;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:DAJG_SSZWD表映射
 * Project Name:spxt
 * File Name:DajgSszwd
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/3 19:46   hebq         1.0       1.0 Version
 **/
@TableName("DAJG_SSZWD")
public class DajgSszwd {

    @TableField("LSH")
    private String lsh;

    @TableField("XH")
    private Integer xh;

    @TableField("NR")
    private String nr;

    @TableField("BH")
    private String bh;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }
}
