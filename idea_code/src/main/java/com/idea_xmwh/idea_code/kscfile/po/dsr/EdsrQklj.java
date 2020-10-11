package com.tdh.light.spxt.bp.po.dsr;


import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * 当事人前科劣迹实体
 * @author wuhz
 * @since 2020-06-15
 */
@TableName("EDSR_QKLJ")
public class EdsrQklj {

  private static final long serialVersionUID = 1L;

  @TableId(value = "AHDM", type = IdType.INPUT)
  private String ahdm;

  @TableId(value = "BGR", type = IdType.INPUT)
  private String bgr;

  @TableId(value = "XH", type = IdType.INPUT)
  private Integer xh;

  @TableField(value = "CFNR")
  private String cfnr;

  @TableField(value = "CFYY")
  private String cfyy;

  @TableField(value = "PCJG")
  private String pcjg;

  @TableField(value = "KSRQ")
  private String ksrq;

  @TableField(value = "JSRQ")
  private String jsrq;

  @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
  private Date lastupdate;

  @TableField(value = "ROWUUID")
  private String rowuuid;

  @TableField(value = "FYDM")
  private String fydm;

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


  public String getBgr() {
    return bgr;
  }

  public void setBgr(String bgr) {
    this.bgr = bgr;
  }


  public Integer getXh() {
    return xh;
  }

  public void setXh(Integer xh) {
    this.xh = xh;
  }


  public String getCfnr() {
    return cfnr;
  }

  public void setCfnr(String cfnr) {
    this.cfnr = cfnr;
  }


  public String getCfyy() {
    return cfyy;
  }

  public void setCfyy(String cfyy) {
    this.cfyy = cfyy;
  }


  public String getPcjg() {
    return pcjg;
  }

  public void setPcjg(String pcjg) {
    this.pcjg = pcjg;
  }


  public String getKsrq() {
    return ksrq;
  }

  public void setKsrq(String ksrq) {
    this.ksrq = ksrq;
  }


  public String getJsrq() {
    return jsrq;
  }

  public void setJsrq(String jsrq) {
    this.jsrq = jsrq;
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
