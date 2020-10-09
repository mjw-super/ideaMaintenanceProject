package com.tdh.light.spxt.bp.po.xtsz.lasz;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: 权限案件类型
 * Project Name:spxt
 * File Name:ImportantFocusQueryEO
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/18        mengjw         1.0       1.0 Version
 **/
@TableName("TU_QX_AJLX")
public class TuQxAjlx implements Serializable {

    private static final long serialVersionUID = 3585909042423045453L;
    @TableId(value = "AJLX",type = IdType.INPUT)
    private String ajlx;
    @TableId(value = "YHDM",type = IdType.INPUT)
    private String yhdm;
    @TableId(value = "FYDM",type = IdType.INPUT)
    private String fydm;
    @TableId(value = "CZ",type = IdType.INPUT)
    private String cz;
    @TableField("SYCS")
    private Integer sycs;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
    }

    public String getYhdm() {
        return yhdm;
    }

    public void setYhdm(String yhdm) {
        this.yhdm = yhdm;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public Integer getSycs() {
        return sycs;
    }

    public void setSycs(Integer sycs) {
        this.sycs = sycs;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
