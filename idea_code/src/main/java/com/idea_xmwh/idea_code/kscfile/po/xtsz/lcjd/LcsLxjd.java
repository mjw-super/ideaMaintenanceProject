package com.idea_xmwh.idea_code.kscfile.po.xtsz.lcjd;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:
 * Project Name:spxt
 * File Name:LcsLxjd
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             author      Version     Description
 * ------------------------------------------------------------------
 * 2020/10/23 15:39   xiongsc         1.0       1.0 Version
 **/
@TableName("LCS_LXJD")
public class LcsLxjd {
    @TableField("AJLX")
    private String ajlx;
    @TableField("HDID")
    private Integer hdid;
    @TableField("LCJD")
    private String lcjd;
    @TableField("PXH")
    private Integer pxh;
    @TableField("JDLX")
    private String jdlx;

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
    }

    public Integer getHdid() {
        return hdid;
    }

    public void setHdid(Integer hdid) {
        this.hdid = hdid;
    }

    public String getLcjd() {
        return lcjd;
    }

    public void setLcjd(String lcjd) {
        this.lcjd = lcjd;
    }

    public Integer getPxh() {
        return pxh;
    }

    public void setPxh(Integer pxh) {
        this.pxh = pxh;
    }

    public String getJdlx() {
        return jdlx;
    }

    public void setJdlx(String jdlx) {
        this.jdlx = jdlx;
    }
}
