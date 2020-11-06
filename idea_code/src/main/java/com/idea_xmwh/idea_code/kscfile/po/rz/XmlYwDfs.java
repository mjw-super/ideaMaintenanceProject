package com.tdh.light.spxt.bp.po.rz;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:XmlYwDfsMapper
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/7/20 10:54   zhangz         1.0       1.0 Version
 **/
public class XmlYwDfs implements Serializable {

    private static final long serialVersionUID = -3200452426029530954L;
    //流水号
    private String lsh;
    //业务ID
    private String ywbh;
    //案号代码
    private String ahdm;
    //主键值
    private String pkval;
    //发送状态
    private String fszt;
    //更新时间
    private Date lastupdate;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    public String getYwbh() {
        return ywbh;
    }

    public void setYwbh(String ywbh) {
        this.ywbh = ywbh;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getPkval() {
        return pkval;
    }

    public void setPkval(String pkval) {
        this.pkval = pkval;
    }

    public String getFszt() {
        return fszt;
    }

    public void setFszt(String fszt) {
        this.fszt = fszt;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
