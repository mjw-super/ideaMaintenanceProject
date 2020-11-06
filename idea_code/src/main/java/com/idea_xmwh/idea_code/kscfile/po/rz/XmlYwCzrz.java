package com.tdh.light.spxt.bp.po.rz;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author zhangz
 * @desc 业务操作日志
 * @date 2020/6/19
 */
@TableName("XML_YW_CZRZ")
public class XmlYwCzrz {

    /**
     * 流水号
     */
    private String lsh;

    /**
     * 案件标识
     */
    private String ahdm2;

    /**
     * 法院代码
     */
    private String fydm;

    /**
     * 业务编号
     */
    private String ywbh;

    /**
     * 案件类型代码
     */
    private Integer ajlxdm;

    /**
     * 操作类型 新增：A，修改:M,删除:D
     */
    private String czlx;

    private String pkval;

    private String rowuuid;

    private Date lastupdate;

    private String rq;

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

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

    public String getYwbh() {
        return ywbh;
    }

    public void setYwbh(String ywbh) {
        this.ywbh = ywbh;
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

    public String getPkval() {
        return pkval;
    }

    public void setPkval(String pkval) {
        this.pkval = pkval;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
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
