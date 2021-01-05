package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:EajJjsxxf
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/8 14:38   liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("EAJ_JJSXXF")
public class EajJjsxxf {

     @TableId(value = "AHDM",type = IdType.INPUT)
     private String	ahdm;
     @TableField("JBFY")
     private String	jbfy;
     @TableField("AH")
     private String	ah;
     @TableField("SXPJQDZM")
     private Integer	sxpjqdzm;
     @TableField("PCZX")
     private String	pczx;
     @TableField("ZXXQN")
     private Integer	zxxqn;
     @TableField("ZXXQY")
     private Integer	zxxqy;
     @TableField("HXXQN")
     private Integer	hxxqn;
     @TableField("HXXQY")
     private Integer	hxxqy;
     @TableField("BDZZQLN")
     private Integer	bdzzqln;
     @TableField("BDZZQLY")
     private Integer	bdzzqly;
     @TableField("YPXGRQ")
     private String	ypxgrq;
     @TableField("ZFBJYKSRQ")
     private String	zfbjyksrq;
     @TableField("LASTUPDATE")
     private Date lastupdate;
     @TableField("MSCCJE")
     private double	msccje;
     @TableField("FJSE")
     private double	fjse;
     @TableField("QXRQ")
     private String	qxrq;
     @TableField("XMRQ")
     private String	xmrq;
     @TableField("RJRQ")
     private String	rjrq;
     @TableField("SXPJQDZMMC")
     private String	sxpjqdzmmc;
     @TableField("SXSYFS")
     private String	sxsyfs;
     @TableField("ZXXQR")
     private Integer	zxxqr;
     @TableField("HXXQR")
     private Integer	hxxqr;
     @TableField("FJXSYFS")
     private String	fjxsyfs;
     @TableField("FJXZL")
     private String	fjxzl;
     @TableField("BDZZQLLX")
     private String	bdzzqllx;
     @TableField("BDZZQLR")
     private Integer	bdzzqlr;
     @TableField("MSCCLX")
     private String	mscclx;
     @TableField("ROWUUID")
     private String	rowuuid;
     @TableField("IS_DELETED")
     private Integer	is_deleted;
     @TableField("CREATE_BY")
     private String	create_by;
     @TableField("UPDATE_BY")
     private String	update_by;
     @TableField("GMT_CREAT")
     private Date	gmt_creat;

     public String getAhdm() {
          return ahdm;
     }

     public void setAhdm(String ahdm) {
          this.ahdm = ahdm;
     }

     public String getJbfy() {
          return jbfy;
     }

     public void setJbfy(String jbfy) {
          this.jbfy = jbfy;
     }

     public String getAh() {
          return ah;
     }

     public void setAh(String ah) {
          this.ah = ah;
     }

     public Integer getSxpjqdzm() {
          return sxpjqdzm;
     }

     public void setSxpjqdzm(Integer sxpjqdzm) {
          this.sxpjqdzm = sxpjqdzm;
     }

     public String getPczx() {
          return pczx;
     }

     public void setPczx(String pczx) {
          this.pczx = pczx;
     }

     public Integer getZxxqn() {
          return zxxqn;
     }

     public void setZxxqn(Integer zxxqn) {
          this.zxxqn = zxxqn;
     }

     public Integer getZxxqy() {
          return zxxqy;
     }

     public void setZxxqy(Integer zxxqy) {
          this.zxxqy = zxxqy;
     }

     public Integer getHxxqn() {
          return hxxqn;
     }

     public void setHxxqn(Integer hxxqn) {
          this.hxxqn = hxxqn;
     }

     public Integer getHxxqy() {
          return hxxqy;
     }

     public void setHxxqy(Integer hxxqy) {
          this.hxxqy = hxxqy;
     }

     public Integer getBdzzqln() {
          return bdzzqln;
     }

     public void setBdzzqln(Integer bdzzqln) {
          this.bdzzqln = bdzzqln;
     }

     public Integer getBdzzqly() {
          return bdzzqly;
     }

     public void setBdzzqly(Integer bdzzqly) {
          this.bdzzqly = bdzzqly;
     }

     public String getYpxgrq() {
          return ypxgrq;
     }

     public void setYpxgrq(String ypxgrq) {
          this.ypxgrq = ypxgrq;
     }

     public String getZfbjyksrq() {
          return zfbjyksrq;
     }

     public void setZfbjyksrq(String zfbjyksrq) {
          this.zfbjyksrq = zfbjyksrq;
     }

     public Date getLastupdate() {
          return lastupdate;
     }

     public void setLastupdate(Date lastupdate) {
          this.lastupdate = lastupdate;
     }

     public double getMsccje() {
          return msccje;
     }

     public void setMsccje(double msccje) {
          this.msccje = msccje;
     }

     public double getFjse() {
          return fjse;
     }

     public void setFjse(double fjse) {
          this.fjse = fjse;
     }

     public String getQxrq() {
          return qxrq;
     }

     public void setQxrq(String qxrq) {
          this.qxrq = qxrq;
     }

     public String getXmrq() {
          return xmrq;
     }

     public void setXmrq(String xmrq) {
          this.xmrq = xmrq;
     }

     public String getRjrq() {
          return rjrq;
     }

     public void setRjrq(String rjrq) {
          this.rjrq = rjrq;
     }

     public String getSxpjqdzmmc() {
          return sxpjqdzmmc;
     }

     public void setSxpjqdzmmc(String sxpjqdzmmc) {
          this.sxpjqdzmmc = sxpjqdzmmc;
     }

     public String getSxsyfs() {
          return sxsyfs;
     }

     public void setSxsyfs(String sxsyfs) {
          this.sxsyfs = sxsyfs;
     }

     public Integer getZxxqr() {
          return zxxqr;
     }

     public void setZxxqr(Integer zxxqr) {
          this.zxxqr = zxxqr;
     }

     public Integer getHxxqr() {
          return hxxqr;
     }

     public void setHxxqr(Integer hxxqr) {
          this.hxxqr = hxxqr;
     }

     public String getFjxsyfs() {
          return fjxsyfs;
     }

     public void setFjxsyfs(String fjxsyfs) {
          this.fjxsyfs = fjxsyfs;
     }

     public String getFjxzl() {
          return fjxzl;
     }

     public void setFjxzl(String fjxzl) {
          this.fjxzl = fjxzl;
     }

     public String getBdzzqllx() {
          return bdzzqllx;
     }

     public void setBdzzqllx(String bdzzqllx) {
          this.bdzzqllx = bdzzqllx;
     }

     public Integer getBdzzqlr() {
          return bdzzqlr;
     }

     public void setBdzzqlr(Integer bdzzqlr) {
          this.bdzzqlr = bdzzqlr;
     }

     public String getMscclx() {
          return mscclx;
     }

     public void setMscclx(String mscclx) {
          this.mscclx = mscclx;
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
}

