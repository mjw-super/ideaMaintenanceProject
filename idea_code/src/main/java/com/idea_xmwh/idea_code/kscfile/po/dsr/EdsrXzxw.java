package com.tdh.light.spxt.bp.po.dsr;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * 当事人行政行为实体
 * @author wuhz
 * @since 2020-06-15
 */
@TableName("EDSR_XZXW")
public class EdsrXzxw {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;

    @TableId(value = "XH", type = IdType.INPUT)
    private Integer xh;

    @TableId(value = "BGXH", type = IdType.INPUT)
    private String bgxh;

    @TableField(value = "XZXWZL")
    private String xzxwzl;

    @TableField(value = "ZCXZXWRQ")
    private String zcxzxwrq;

    @TableField(value = "FY")
    private String fy;

    @TableField(value = "FYJG")
    private String fyjg;

    @TableField(value = "FYRQ")
    private String fyrq;

    @TableField(value = "YGTQSSLY")
    private String ygtqssly;

    @TableField(value = "SZGBXZXW")
    private String szgbxzxw;

    @TableField(value = "XZXWPJJG")
    private String xzxwpjjg;

    @TableField(value = "XZXWWFBJ")
    private String xzxwwfbj;

    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;

    @TableField(value = "ROWUUID")
    private String rowuuid;

    @TableField(value = "FYDM")
    private String fydm;

    @TableField(value = "DJR")
    private String djr;

    @TableField(value = "DJSJ")
    private String djsj;

    @TableField(value = "PCCL")
    private String pccl;

    @TableField(value = "PCFS")
    private String pcfs;

    @TableField(value = "PCJE")
    private String pcje;

    @TableField("IS_DELETED")
    private Integer isDeleted;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("GMT_CREAT")
    private Date gmtCreat;

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


    public String getBgxh() {
        return bgxh;
    }

    public void setBgxh(String bgxh) {
        this.bgxh = bgxh;
    }


    public String getXzxwzl() {
        return xzxwzl;
    }

    public void setXzxwzl(String xzxwzl) {
        this.xzxwzl = xzxwzl;
    }


    public String getZcxzxwrq() {
        return zcxzxwrq;
    }

    public void setZcxzxwrq(String zcxzxwrq) {
        this.zcxzxwrq = zcxzxwrq;
    }


    public String getFy() {
        return fy;
    }

    public void setFy(String fy) {
        this.fy = fy;
    }


    public String getFyjg() {
        return fyjg;
    }

    public void setFyjg(String fyjg) {
        this.fyjg = fyjg;
    }


    public String getFyrq() {
        return fyrq;
    }

    public void setFyrq(String fyrq) {
        this.fyrq = fyrq;
    }


    public String getYgtqssly() {
        return ygtqssly;
    }

    public void setYgtqssly(String ygtqssly) {
        this.ygtqssly = ygtqssly;
    }


    public String getSzgbxzxw() {
        return szgbxzxw;
    }

    public void setSzgbxzxw(String szgbxzxw) {
        this.szgbxzxw = szgbxzxw;
    }


    public String getXzxwpjjg() {
        return xzxwpjjg;
    }

    public void setXzxwpjjg(String xzxwpjjg) {
        this.xzxwpjjg = xzxwpjjg;
    }


    public String getXzxwwfbj() {
        return xzxwwfbj;
    }

    public void setXzxwwfbj(String xzxwwfbj) {
        this.xzxwwfbj = xzxwwfbj;
    }


    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
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


    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }


    public String getDjsj() {
        return djsj;
    }

    public void setDjsj(String djsj) {
        this.djsj = djsj;
    }


    public String getPccl() {
        return pccl;
    }

    public void setPccl(String pccl) {
        this.pccl = pccl;
    }


    public String getPcfs() {
        return pcfs;
    }

    public void setPcfs(String pcfs) {
        this.pcfs = pcfs;
    }


    public String getPcje() {
        return pcje;
    }

    public void setPcje(String pcje) {
        this.pcje = pcje;
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
