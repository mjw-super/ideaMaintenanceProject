package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * <p>
 * 案件基本信息对象
 * </p>
 * @author XiongWei
 * @since 2019-10-08
 */
@TableName("EAJ_FA")
public class EajFa {

    private static final long serialVersionUID = 1L;

    /**
     * 案件标识
     */
    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;


    @TableField("XH")
    private Integer xh;

    @TableField("LB")
    private String lb;


    @TableField("FASJ")
    private Date fasj;

    @TableField("SPZ")
    private String spz;


    @TableField("CBR")
    private String cbr;


    @TableField("SJY")
    private String sjy;


    @TableField("HYCY")
    private String hycy;

    @TableField("FGZL")
    private String fgzl;

    @TableField("FAR")
    private String far;

    @TableField("FAYY")
    private String fayy;

    @TableField("BEIZ")
    private String beiz;

    @TableField("SFPL")
    private String sfpl;

    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    /**
     * 删除字段
     */
    @TableField("IS_DELETED")
    private Integer  isDeleted;
    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String  createBy;
    /**
     * 最新修改人
     */
    @TableField("UPDATE_BY")
    private String  updateBy;
    /**
     * 创建日期
     */
    @TableField("GMT_CREAT")
    private Date  gmtCreat;


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

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public Date getFasj() {
        return fasj;
    }

    public void setFasj(Date fasj) {
        this.fasj = fasj;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public String getCbr() {
        return cbr;
    }

    public void setCbr(String cbr) {
        this.cbr = cbr;
    }

    public String getSjy() {
        return sjy;
    }

    public void setSjy(String sjy) {
        this.sjy = sjy;
    }

    public String getHycy() {
        return hycy;
    }

    public void setHycy(String hycy) {
        this.hycy = hycy;
    }

    public String getFgzl() {
        return fgzl;
    }

    public void setFgzl(String fgzl) {
        this.fgzl = fgzl;
    }

    public String getFar() {
        return far;
    }

    public void setFar(String far) {
        this.far = far;
    }

    public String getFayy() {
        return fayy;
    }

    public void setFayy(String fayy) {
        this.fayy = fayy;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getSfpl() {
        return sfpl;
    }

    public void setSfpl(String sfpl) {
        this.sfpl = sfpl;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getGmtCreat() {
        return gmtCreat;
    }

    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }
}
