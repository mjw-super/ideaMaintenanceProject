package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * @Description 案件立案移交数据项
 * @author 邱萌
 * @Date 2020-7-1 15:49
 * @Version 1.0
 **/
@TableName("EAJ_YJHTA")
public class EajYjhta {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;//案件标识
    @TableId(value = "XH")
    private Integer xh;//序号_移交
    @TableId(value = "LAYJTSBS")
    private String layjtsbs;//立案移交庭室标识
    @TableId(value = "LAYJTS")
    private String layjts;//立案移交庭室
    @TableId(value = "LAYJR")
    private String layjr;//立案移交人
    @TableId(value = "CBTBS")
    private String cbtbs;//承办庭标识
    @TableId(value = "CBSPT")
    private String cbspt;//承办审判庭
    @TableId(value = "LAYJRQ")
    private String layjrq;//立案移交日期
    @TableId(value = "TAR")
    private String tar;//退案人(退卷人)
    @TableId(value = "TARQ")
    private String tarq;//退案日期(退卷日期)
    @TableId(value = "TAYY")
    private String tayy;//退案原因(退卷原因)
    @TableId(value = "TAJSR")
    private String tajsr;//退案接收人(退卷接收人)
    @TableId(value = "TZTAJMRQ")
    private String tztajmrq;//庭长调案届满日期
    @TableId(value = "FYDM")
    private String fydm;//法院代码
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;//行记录唯一标识
    @TableId(value = "IS_DELETED")
    private Integer is_deleted;//是否删除
    @TableId(value = "CREATE_BY")
    private String create_by;//提交人
    @TableId(value = "UPDATE_BY")
    private String update_by;//最近修改人
    @TableId(value = "GMT_CREAT")
    private Date gmt_creat;//插入时间
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

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

    public String getLayjtsbs() {
        return layjtsbs;
    }

    public void setLayjtsbs(String layjtsbs) {
        this.layjtsbs = layjtsbs;
    }

    public String getLayjts() {
        return layjts;
    }

    public void setLayjts(String layjts) {
        this.layjts = layjts;
    }

    public String getLayjr() {
        return layjr;
    }

    public void setLayjr(String layjr) {
        this.layjr = layjr;
    }

    public String getCbtbs() {
        return cbtbs;
    }

    public void setCbtbs(String cbtbs) {
        this.cbtbs = cbtbs;
    }

    public String getCbspt() {
        return cbspt;
    }

    public void setCbspt(String cbspt) {
        this.cbspt = cbspt;
    }

    public String getLayjrq() {
        return layjrq;
    }

    public void setLayjrq(String layjrq) {
        this.layjrq = layjrq;
    }

    public String getTar() {
        return tar;
    }

    public void setTar(String tar) {
        this.tar = tar;
    }

    public String getTarq() {
        return tarq;
    }

    public void setTarq(String tarq) {
        this.tarq = tarq;
    }

    public String getTayy() {
        return tayy;
    }

    public void setTayy(String tayy) {
        this.tayy = tayy;
    }

    public String getTajsr() {
        return tajsr;
    }

    public void setTajsr(String tajsr) {
        this.tajsr = tajsr;
    }

    public String getTztajmrq() {
        return tztajmrq;
    }

    public void setTztajmrq(String tztajmrq) {
        this.tztajmrq = tztajmrq;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
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
        return "EajYjhta{" +
                "ahdm='" + ahdm + '\'' +
                ", xh=" + xh +
                ", layjtsbs='" + layjtsbs + '\'' +
                ", layjts='" + layjts + '\'' +
                ", layjr='" + layjr + '\'' +
                ", cbtbs='" + cbtbs + '\'' +
                ", cbspt='" + cbspt + '\'' +
                ", layjrq='" + layjrq + '\'' +
                ", tar='" + tar + '\'' +
                ", tarq='" + tarq + '\'' +
                ", tayy='" + tayy + '\'' +
                ", tajsr='" + tajsr + '\'' +
                ", tztajmrq='" + tztajmrq + '\'' +
                ", fydm='" + fydm + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", is_deleted=" + is_deleted +
                ", create_by='" + create_by + '\'' +
                ", update_by='" + update_by + '\'' +
                ", gmt_creat=" + gmt_creat +
                ", lastupdate=" + lastupdate +
                '}';
    }
}
