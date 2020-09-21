package com.idea_xmwh.idea_code.kscfile.po.wsla;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt
 * File Name:WslaYsxx
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/8/12 21:12   @author liangbx [bangxi.liang]         1.0       1.0 Version
 **/
@TableName("WSLA_YAXX")
public class WslaYsxx {

     @TableId(value = "LSH",type = IdType.INPUT)
     private String	lsh;
     @TableField("XH")
     private Integer	xh;
     @TableField("YABS")
     private String	yabs;
     @TableField("JBFY")
     private String	jbfy;
     @TableField("AH")
     private String	ah;
     @TableField("AY")
     private Integer	ay;
     @TableField("LARQ")
     private String	larq;
     @TableField("JARQ")
     private String	jarq;
     @TableField("JAFS")
     private String	jafs;
     @TableField("SXRQ")
     private String	sxrq;
     @TableField("YCBBMMC")
     private String	ycbbmmc;
     @TableField("YCBRMC")
     private String	ycbrmc;
     @TableField("YCBR")
     private String	ycbr;
     @TableField("YCBBMBS")
     private String	ycbbmbs;
     @TableField("YCBRBS")
     private String	ycbrbs;
     @TableField("LASTUPDATE")
     private Date lastupdate;

     public String getLsh() {
          return lsh;
     }

     public void setLsh(String lsh) {
          this.lsh = lsh;
     }

     public Integer getXh() {
          return xh;
     }

     public void setXh(Integer xh) {
          this.xh = xh;
     }

     public String getYabs() {
          return yabs;
     }

     public void setYabs(String yabs) {
          this.yabs = yabs;
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

     public Integer getAy() {
          return ay;
     }

     public void setAy(Integer ay) {
          this.ay = ay;
     }

     public String getLarq() {
          return larq;
     }

     public void setLarq(String larq) {
          this.larq = larq;
     }

     public String getJarq() {
          return jarq;
     }

     public void setJarq(String jarq) {
          this.jarq = jarq;
     }

     public String getJafs() {
          return jafs;
     }

     public void setJafs(String jafs) {
          this.jafs = jafs;
     }

     public String getSxrq() {
          return sxrq;
     }

     public void setSxrq(String sxrq) {
          this.sxrq = sxrq;
     }

     public String getYcbbmmc() {
          return ycbbmmc;
     }

     public void setYcbbmmc(String ycbbmmc) {
          this.ycbbmmc = ycbbmmc;
     }

     public String getYcbrmc() {
          return ycbrmc;
     }

     public void setYcbrmc(String ycbrmc) {
          this.ycbrmc = ycbrmc;
     }

     public String getYcbr() {
          return ycbr;
     }

     public void setYcbr(String ycbr) {
          this.ycbr = ycbr;
     }

     public String getYcbbmbs() {
          return ycbbmbs;
     }

     public void setYcbbmbs(String ycbbmbs) {
          this.ycbbmbs = ycbbmbs;
     }

     public String getYcbrbs() {
          return ycbrbs;
     }

     public void setYcbrbs(String ycbrbs) {
          this.ycbrbs = ycbrbs;
     }

     public Date getLastupdate() {
          return lastupdate;
     }

     public void setLastupdate(Date lastupdate) {
          this.lastupdate = lastupdate;
     }


}
