package com.tdh.light.spxt.bp.po.rz;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author zhangz
 * @desc 案件操作日志表
 * @date 2020/6/19
 */
@TableName("XML_AJ_CZRZ")
public class XmlAjCzrz {

    @TableId(value = "AHDM2")
    private String ahdm2;

    private String fydm;

    private Integer ajlxdm;

    private String czlx;

    private Date lastupdate;

    private String rq;

    public String getAhdm2() {
        return ahdm2;
    }

    public void setAhdm2(String ahdm2) {
        this.ahdm2 = ahdm2;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public Integer getAjlxdm() {
        return ajlxdm;
    }

    public void setAjlxdm(Integer ajlxdm) {
        this.ajlxdm = ajlxdm;
    }

    public String getCzlx() {
        return czlx;
    }

    public void setCzlx(String czlx) {
        this.czlx = czlx;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getRq() {
        return rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }
}
