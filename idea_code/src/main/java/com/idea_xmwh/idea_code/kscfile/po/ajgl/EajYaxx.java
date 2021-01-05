package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:案件原案信息持久化对象
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.ajgl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/21 14        gp     1.0        1.0 Version
 **/
@TableName("EAJ_YAXX")
public class EajYaxx {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("XH")
    private Integer xh;
    @TableField("YABS")
    private String yabs;
    @TableField("JBFY")
    private String jbfy;
    @TableField("AH")
    private String ah;
    @TableField("AY")
    private Integer ay;
    @TableField("LARQ")
    private String larq;
    @TableField("JARQ")
    private String jarq;
    @TableField("JAFS")
    private String jafs;
    @TableField("SXRQ")
    private String sxrq;
    @TableField("YCBBMMC")
    private String ycbbmmc;
    @TableField("YCBR")
    private String ycbr;
    @TableField("YCBBMBS")
    private String ycbbmbs;
    @TableField("YCBRBS")
    private String ycbrbs;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("AJLB")
    private String ajlb;
    @TableField("JZXH")
    private String jzxh;
    @TableField("GSJG")
    private String gsjg;
    @TableField("SDJZCS")
    private Integer sdjzcs;
    @TableField("SDJZRQ")
    private String sdjzrq;
    @TableField("SJR")
    private String sjr;
    @TableField("SSAJLB")
    private String ssajlb;
    @TableField("YSAJLXDM")
    private Long ysajlxdm;
    @TableField(value = "ROWUUID")
    private String rowuuid;
    @TableField("ND")
    private String nd;
    @TableField("YAAH2")
    private String yaah2;
    @TableField("SKSYSXH")
    private Integer sksysxh;
    @TableField("SJFYAJAH")
    private String sjfyajah;
    @TableField("DAJLY")
    private String dajly;
    @TableField("DALYRQ")
    private String dalyrq;
    @TableField("SSYSWZH")
    private String ssyswzh;
    @TableField("YCBRMC")
    private String ycbrmc;

    @TableField("SKSTJAJBS")
    private String skstjajbs; //上抗诉调解案件标识
    @TableField("SJTS")
    private Integer sjts; // 实际天数
    @TableField("GGSD")
    private String ggsd; // 公告送达
    @TableField("AJLY")
    private String ajly; // 案件来源
    @TableField("KTSLCS")
    private Integer ktslcs; // 开庭审理次数
    @TableField("SSZZS")
    private Integer sszzs; //上诉状字数
    @TableField("DAZJCS")
    private Integer dazjcs; //档案正卷册数
    @TableField("SFWLS")
    private String sfwls; //是否无律师
    @TableField("SSRQXSL")
    private String ssrqxsl;//上诉人缺席审理
    @TableField("JABDJE")
    private Double jabdje;//结案标的金额
    @TableField("SQDQZJ")
    private String sqdqzj ; //诉前调取证据
    @TableField("YSSYCX")
    private String yssycx ; //一审适用程序

    @TableField("SFSLAJ")
    private String sfslaj;      //是否四类案件
    @TableField("YSQSFLWT ")
    private String ysqsflwt;    //一审向中院请示法律适用问题的
    @TableField("YSJSWH")
    private String ysjswh;      //一审经审委会讨论
    @TableField("SSZFS")
    private Integer sszfs;       //上诉状份数
    @TableField("SSZFS")
    private Integer sszys;       //上诉状页数
    @TableField("HYGXCZJG")
    private String hygxczjg;    //一审判决不准离婚
    @TableField("JZYFGHY")
    private String jzyfghy;     //一审经过专业法官会议
    @TableField("GAJJS")
    private Integer gajjs;       //公安卷卷数


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

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    public String getJzxh() {
        return jzxh;
    }

    public void setJzxh(String jzxh) {
        this.jzxh = jzxh;
    }

    public String getGsjg() {
        return gsjg;
    }

    public void setGsjg(String gsjg) {
        this.gsjg = gsjg;
    }

    public Integer getSdjzcs() {
        return sdjzcs;
    }

    public void setSdjzcs(Integer sdjzcs) {
        this.sdjzcs = sdjzcs;
    }

    public String getSdjzrq() {
        return sdjzrq;
    }

    public void setSdjzrq(String sdjzrq) {
        this.sdjzrq = sdjzrq;
    }

    public String getSjr() {
        return sjr;
    }

    public void setSjr(String sjr) {
        this.sjr = sjr;
    }

    public String getSsajlb() {
        return ssajlb;
    }

    public void setSsajlb(String ssajlb) {
        this.ssajlb = ssajlb;
    }

    public Long getYsajlxdm() {
        return ysajlxdm;
    }

    public void setYsajlxdm(Long ysajlxdm) {
        this.ysajlxdm = ysajlxdm;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getYaah2() {
        return yaah2;
    }

    public void setYaah2(String yaah2) {
        this.yaah2 = yaah2;
    }

    public Integer getSksysxh() {
        return sksysxh;
    }

    public void setSksysxh(Integer sksysxh) {
        this.sksysxh = sksysxh;
    }

    public String getSjfyajah() {
        return sjfyajah;
    }

    public void setSjfyajah(String sjfyajah) {
        this.sjfyajah = sjfyajah;
    }

    public String getDajly() {
        return dajly;
    }

    public void setDajly(String dajly) {
        this.dajly = dajly;
    }

    public String getDalyrq() {
        return dalyrq;
    }

    public void setDalyrq(String dalyrq) {
        this.dalyrq = dalyrq;
    }

    public String getSsyswzh() {
        return ssyswzh;
    }

    public void setSsyswzh(String ssyswzh) {
        this.ssyswzh = ssyswzh;
    }

    public String getYcbrmc() {
        return ycbrmc;
    }

    public void setYcbrmc(String ycbrmc) {
        this.ycbrmc = ycbrmc;
    }

    public String getSkstjajbs() {
        return skstjajbs;
    }

    public void setSkstjajbs(String skstjajbs) {
        this.skstjajbs = skstjajbs;
    }

    public Integer getSjts() {
        return sjts;
    }

    public void setSjts(Integer sjts) {
        this.sjts = sjts;
    }

    public String getGgsd() {
        return ggsd;
    }

    public void setGgsd(String ggsd) {
        this.ggsd = ggsd;
    }

    public String getAjly() {
        return ajly;
    }

    public void setAjly(String ajly) {
        this.ajly = ajly;
    }

    public Integer getKtslcs() {
        return ktslcs;
    }

    public void setKtslcs(Integer ktslcs) {
        this.ktslcs = ktslcs;
    }

    public Integer getSszzs() {
        return sszzs;
    }

    public void setSszzs(Integer sszzs) {
        this.sszzs = sszzs;
    }

    public Integer getDazjcs() {
        return dazjcs;
    }

    public void setDazjcs(Integer dazjcs) {
        this.dazjcs = dazjcs;
    }

    public String getSfwls() {
        return sfwls;
    }

    public void setSfwls(String sfwls) {
        this.sfwls = sfwls;
    }

    public String getSsrqxsl() {
        return ssrqxsl;
    }

    public void setSsrqxsl(String ssrqxsl) {
        this.ssrqxsl = ssrqxsl;
    }

    public Double getJabdje() {
        return jabdje;
    }

    public void setJabdje(Double jabdje) {
        this.jabdje = jabdje;
    }

    public String getSqdqzj() {
        return sqdqzj;
    }

    public void setSqdqzj(String sqdqzj) {
        this.sqdqzj = sqdqzj;
    }

    public String getYssycx() {
        return yssycx;
    }

    public void setYssycx(String yssycx) {
        this.yssycx = yssycx;
    }

    public String getSfslaj() {
        return sfslaj;
    }

    public void setSfslaj(String sfslaj) {
        this.sfslaj = sfslaj;
    }

    public String getYsqsflwt() {
        return ysqsflwt;
    }

    public void setYsqsflwt(String ysqsflwt) {
        this.ysqsflwt = ysqsflwt;
    }

    public String getYsjswh() {
        return ysjswh;
    }

    public void setYsjswh(String ysjswh) {
        this.ysjswh = ysjswh;
    }

    public Integer getSszfs() {
        return sszfs;
    }

    public void setSszfs(Integer sszfs) {
        this.sszfs = sszfs;
    }

    public Integer getSszys() {
        return sszys;
    }

    public void setSszys(Integer sszys) {
        this.sszys = sszys;
    }

    public String getHygxczjg() {
        return hygxczjg;
    }

    public void setHygxczjg(String hygxczjg) {
        this.hygxczjg = hygxczjg;
    }

    public String getJzyfghy() {
        return jzyfghy;
    }

    public void setJzyfghy(String jzyfghy) {
        this.jzyfghy = jzyfghy;
    }

    public Integer getGajjs() {
        return gajjs;
    }

    public void setGajjs(Integer gajjs) {
        this.gajjs = gajjs;
    }

    @Override
    public String toString() {
        return "EajYaxx{" +
                "ahdm='" + ahdm + '\'' +
                ", xh=" + xh +
                ", yabs='" + yabs + '\'' +
                ", jbfy='" + jbfy + '\'' +
                ", ah='" + ah + '\'' +
                ", ay=" + ay +
                ", larq='" + larq + '\'' +
                ", jarq='" + jarq + '\'' +
                ", jafs='" + jafs + '\'' +
                ", sxrq='" + sxrq + '\'' +
                ", ycbbmmc='" + ycbbmmc + '\'' +
                ", ycbr='" + ycbr + '\'' +
                ", ycbbmbs='" + ycbbmbs + '\'' +
                ", ycbrbs='" + ycbrbs + '\'' +
                ", lastupdate=" + lastupdate +
                ", ajlb='" + ajlb + '\'' +
                ", jzxh='" + jzxh + '\'' +
                ", gsjg='" + gsjg + '\'' +
                ", sdjzcs=" + sdjzcs +
                ", sdjzrq='" + sdjzrq + '\'' +
                ", sjr='" + sjr + '\'' +
                ", ssajlb='" + ssajlb + '\'' +
                ", ysajlxdm=" + ysajlxdm +
                ", rowuuid='" + rowuuid + '\'' +
                ", nd='" + nd + '\'' +
                ", yaah2='" + yaah2 + '\'' +
                ", sksysxh=" + sksysxh +
                ", sjfyajah='" + sjfyajah + '\'' +
                ", dajly='" + dajly + '\'' +
                ", dalyrq='" + dalyrq + '\'' +
                ", ssyswzh='" + ssyswzh + '\'' +
                ", ycbrmc='" + ycbrmc + '\'' +
                ", skstjajbs='" + skstjajbs + '\'' +
                ", sjts=" + sjts +
                ", ggsd='" + ggsd + '\'' +
                ", ajly='" + ajly + '\'' +
                ", ktslcs=" + ktslcs +
                ", sszzs=" + sszzs +
                ", dazjcs=" + dazjcs +
                ", sfwls='" + sfwls + '\'' +
                ", ssrqxsl='" + ssrqxsl + '\'' +
                ", jabdje=" + jabdje +
                ", sqdqzj='" + sqdqzj + '\'' +
                ", yssycx='" + yssycx + '\'' +
                ", sfslaj='" + sfslaj + '\'' +
                ", ysqsflwt='" + ysqsflwt + '\'' +
                ", ysjswh='" + ysjswh + '\'' +
                ", sszfs=" + sszfs +
                ", sszys=" + sszys +
                ", hygxczjg='" + hygxczjg + '\'' +
                ", jzyfghy='" + jzyfghy + '\'' +
                ", gajjs=" + gajjs +
                '}';
    }
}
