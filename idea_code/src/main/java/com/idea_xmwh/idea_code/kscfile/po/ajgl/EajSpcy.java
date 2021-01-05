package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * @Description 案件审判成员数据项
 * @author 邱萌
 * @Date 2020-7-1 14:28
 * @Version 1.0
 **/
@TableName("EAJ_SPCY")
public class EajSpcy {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;//案件标识
    @TableField("XH")
    private Integer xh;//序号_成员
    @TableField("JS")
    private String js;//角色
    @TableField("CY")
    private String cy;//成员
    @TableField("AJZT_R")
    private String ajzt_r;//案件状态
    @TableField("SFPSY")
    private String sfpsy;//是否陪审员
    @TableField("SFZDFA")
    private String sfzdfa;//是否自动分案
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;//行记录唯一标识
    @TableField("FYDM")
    private String fydm;//法院代码
    @TableField("WSXH")
    private String wsxh;//文书序号
    @TableField("SFSCFG")
    private String sfscfg;//是否速裁法官
    @TableField("IS_DELETED")
    private Integer is_deleted;//是否删除
    @TableField("CREATE_BY")
    private String create_by;//提交人
    @TableField("UPDATE_BY")
    private String update_by;//最近修改人
    @TableField("GMT_CREAT")
    private Date gmt_creat;//插入时间
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getCy() {
        return cy;
    }

    public void setCy(String cy) {
        this.cy = cy;
    }

    public String getAjzt_r() {
        return ajzt_r;
    }

    public void setAjzt_r(String ajzt_r) {
        this.ajzt_r = ajzt_r;
    }

    public String getSfpsy() {
        return sfpsy;
    }

    public void setSfpsy(String sfpsy) {
        this.sfpsy = sfpsy;
    }

    public String getSfzdfa() {
        return sfzdfa;
    }

    public void setSfzdfa(String sfzdfa) {
        this.sfzdfa = sfzdfa;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getWsxh() {
        return wsxh;
    }

    public void setWsxh(String wsxh) {
        this.wsxh = wsxh;
    }

    public String getSfscfg() {
        return sfscfg;
    }

    public void setSfscfg(String sfscfg) {
        this.sfscfg = sfscfg;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(Date gmt_creat) {
        this.gmt_creat = gmt_creat;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public String toString() {
        return "CaseMembers{" +
                "ahdm='" + ahdm + '\'' +
                ", xh=" + xh +
                ", js='" + js + '\'' +
                ", cy='" + cy + '\'' +
                ", ajzt_r='" + ajzt_r + '\'' +
                ", sfpsy='" + sfpsy + '\'' +
                ", sfzdfa='" + sfzdfa + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", fydm='" + fydm + '\'' +
                ", wsxh='" + wsxh + '\'' +
                ", sfscfg='" + sfscfg + '\'' +
                ", is_deleted=" + is_deleted +
                ", create_by='" + create_by + '\'' +
                ", update_by='" + update_by + '\'' +
                ", gmt_creat=" + gmt_creat +
                ", lastupdate=" + lastupdate +
                '}';
    }
}
