package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Description:
 * Project Name:spxt
 * File Name:TuSlffl
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/29 10:32   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("TU_SLFFL")
public class TuSlffl {

    @TableId(value = "FYDM",type = IdType.INPUT)
    private String	fydm;
    @TableId(value = "DM")
    private Integer	dm;
    @TableId(value = "SLFFL")
    private String	slffl;

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Integer getDm() {
        return dm;
    }

    public void setDm(Integer dm) {
        this.dm = dm;
    }

    public String getSlffl() {
        return slffl;
    }

    public void setSlffl(String slffl) {
        this.slffl = slffl;
    }
}
