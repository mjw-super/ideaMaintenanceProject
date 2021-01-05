package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:案件审理信息对象
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.ajgl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/21 17        zh     1.0        1.0 Version
 **/
@TableName("EAJ_SL")
public class EajSl {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("JSRQ")
    private String jsrq;
    @TableField("CBSPT")
    private String cbspt;
    @TableField("BGRTYRZCX")
    private String bgrtyrzcx;
    @TableField("GXYJ")
    private String gxyj;
    @TableField("TQZJJH")
    private String tqzjjh;
    @TableField("FYSJDQZJ")
    private String fysjdqzj;
    @TableField("CBRQ")
    private String cbrq;
    @TableField("DYSJ")
    private String dysj;
    @TableField("AJSJ")
    private String ajsj;
    @TableField("GTFZ")
    private String gtfz;
    @TableField("AJJZ")
    private Double ajjz;
    @TableField("SLBG")
    private String slbg;
    @TableField("SZDHYSFY")
    private String szdhysfy;
    @TableField("KTSL")
    private String ktsl;
    @TableField("PTCXJYS")
    private String ptcxjys;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("ZDBHRS")
    private Integer zdbhrs;
    @TableField("PJWH")
    private Double pjwh;
    @TableField("JIAZRS")
    private Integer jiazrs;
    @TableField("JIANQRS")
    private Integer jianqrs;
    @TableField("MIANYRS")
    private Integer mianyrs;
    @TableField("WUZRS")
    private Integer wuzrs;
    @TableField("QITRS")
    private Integer qitrs;
    @TableField("AZWFJS")
    private String azwfjs;
    @TableField("CLJG")
    private String cljg;
    @TableField("CWSYFLRS")
    private Long cwsyflrs;
    @TableField("FDDBRCTF")
    private String fddbrctf;
    @TableField("FLYZLSRS")
    private Long flyzlsrs;
    @TableField("FZJTRS")
    private Long fzjtrs;
    @TableField("GPZRS")
    private Long gpzrs;
    @TableField("GTFZRS")
    private Long gtfzrs;
    @TableField("HYGXCZJG")
    private String hygxczjg;
    @TableField("JGXZFY")
    private String jgxzfy;
    @TableField("JSRR")
    private String jsrr;
    @TableField("LSRS")
    private Integer lsrs;
    @TableField("LXBDRS")
    private Long lxbdrs;
    @TableField("LXJY")
    private String lxjy;
    @TableField("LXJYCN")
    private String lxjycn;
    @TableField("PCQCBL")
    private Double pcqcbl;
    @TableField("QTYYGBRS")
    private Long qtyygbrs;
    @TableField("SDRS")
    private Long sdrs;
    @TableField("SHRS")
    private Long shrs;
    @TableField("SQRS")
    private Long sqrs;
    @TableField("SSBQRS")
    private Long ssbqrs;
    @TableField("WCRS")
    private Long wcrs;
    @TableField("XPRQ")
    private String xprq;
    @TableField("XSHJ")
    private String xshj;
    @TableField("DWFZ")
    private String dwfz;
    @TableField("CBQX")
    private Integer cbqx;
    @TableField("SHEYU")
    private String sheyu;
    @TableField("CPWSXH")
    private String cpwsxh;
    @TableField("DARQ")
    private String darq;
    @TableField("DAZZ")
    private String dazz;
    @TableField("QFR")
    private String qfr;
    @TableField("YZQFRQ")
    private String yzqfrq;
    @TableField("CBRBPRQ")
    private String cbrbprq;
    @TableField("SPZSQRQ")
    private String spzsqrq;
    @TableField("TZSQRQ")
    private String tzsqrq;
    @TableField("YKZXNR")
    private String ykzxnr;
    @TableField("QXSL")
    private String qxsl;
    @TableField("QXXP")
    private String qxxp;
    @TableField("SPZZXS")
    private String spzzxs;
    @TableField("FZRGDCT")
    private String fzrgdct;
    @TableField("CBLX")
    private String cblx;
    @TableField("XZXT")
    private String xzxt;
    @TableField("KNPCSNYQTX")
    private String knpcsnyqtx;
    @TableField("TQHY")
    private String tqhy;
    @TableField("FFZJPC")
    private String ffzjpc;
    @TableField("SFTQYZTJSWH")
    private String sftqyztjswh;
    @TableField("SFTQYJ")
    private String sftqyj;
    @TableField("TQYJFS")
    private String tqyjfs;
    @TableField("SDFS")
    private String sdfs;
    @TableField("XHBA")
    private String xhba;
    @TableField("SLQKSM")
    private String slqksm;
    @TableField("WJYYSM")
    private String wjyysm;
    @TableField("ZJTSJLGG")
    private String zjtsjlgg;
    @TableField("XHKTSL")
    private String xhktsl;
    @TableField("SFZDAJ")
    private String sfzdaj;
    @TableField("SSZMC")
    private String sszmc;
    @TableField("FTBL")
    private String ftbl;
    @TableField("FTDC")
    private String ftdc;
    @TableField("SHDC")
    private String shdc;
    @TableField("SFGSCPWS")
    private String sfgscpws;
    @TableField("CPWSYS")
    private String cpwsys;
    @TableField("SFGTFZ")
    private String sfgtfz;
    @TableField("SQTX")
    private String sqtx;
    @TableField("SFQWXSAJ")
    private String sfqwxsaj;
    @TableField("SFBRZ")
    private String sfbrz;
    @TableField("SRDDB")
    private String srddb;
    @TableField("XZJGCTRY")
    private String xzjgctry;
    @TableField("FDGFXWJSC")
    private String fdgfxwjsc;
    @TableField("GFXWJSCJL")
    private String gfxwjscjl;
    @TableField("CDXYZX")
    private String cdxyzx;
    @TableField("BKT")
    private String bkt;
    @TableField("JGZFQQFXCZ")
    private String jgzfqqfxcz;
    @TableField("SJDLMJJD")
    private String sjdlmjjd;
    @TableField("PCZHHCX")
    private String pczhhcx;
    @TableField("PCZHCXRQ")
    private String pczhcxrq;
    @TableField("PCCXZHWS")
    private String pccxzhws;
    @TableField("QZYL")
    private String qzyl;
    @TableField("SJY")
    private String sjy;
    @TableField("BHLYS")
    private Integer bhlys;
    @TableField("BHLTS")
    private Integer bhlts;
    @TableField("BHLZCRQ")
    private String bhlzcrq;
    @TableField("SFYJAWS")
    private String sfyjaws;
    @TableField("WJAWSLY")
    private String wjawsly;
    @TableField("XBMZY")
    private String xbmzy;
    @TableField("CBCS")
    private Integer cbcs;
    @TableField("DBCS")
    private Integer dbcs;
    @TableField("SFSDWBGY")
    private String sfsdwbgy;
    @TableField("SFSDNBGW")
    private String sfsdnbgw;
    @TableField("KNPCYNYSYQTX")
    private String knpcynysyqtx;
    @TableField("SPLCGK")
    private String splcgk;
    @TableField("AJPLD")
    private String ajpld;
    @TableField("SLAJ")
    private String slaj;
    @TableField("SGANG")
    private String sgang;
    @TableField("SAO")
    private String sao;
    @TableField("STAI")
    private String stai;
    @TableField("SWQX")
    private String swqx;
    @TableField("SGATQX")
    private String sgatqx;
    @TableField("CJSSBHRS")
    private Long cjssbhrs;
    @TableField("AJDJYJ")
    private String ajdjyj;
    @TableField("CBFY")
    private String cbfy;
    @TableField("JYCXSYFS")
    private String jycxsyfs;
    @TableField("SFRMTJZZCYTJ")
    private String sfrmtjzzcytj;
    @TableField("SFYDLLS")
    private String sfydlls;
    @TableField("AWRCYTJ")
    private String awrcytj;
    @TableField("SFGTSS")
    private String sfgtss;
    @TableField("SFYBJDQZYL")
    private String sfybjdqzyl;
    @TableField("SFCXQZYLJD")
    private String sfcxqzyljd;
    @TableField("TZSY")
    private String tzsy;
    @TableField("BSYJYCXSY")
    private String bsyjycxsy;
    @TableField("SYJYCPWS")
    private String syjycpws;
    @TableField("DCQZJG")
    private String dcqzjg;
    @TableField("ZXFS")
    private String zxfs;
    @TableField("SFGKSL")
    private String sfgksl;
    @TableField("SWCN")
    private String swcn;
    @TableField("CPWSSWZT")
    private String cpwsswzt;
    @TableField("CPWSBSWLY")
    private String cpwsbswly;
    @TableField("CPWSBSW")
    private String cpwsbsw;
    @TableField("BYGKSPLC")
    private String bygksplc;
    @TableField("SPLCBGKYY")
    private String splcbgkyy;
    @TableField("NRJGPT")
    private String nrjgpt;
    @TableField("KNPCYNYQTX")
    private String knpcynyqtx;
    @TableField("XZJGFZRYCT")
    private String xzjgfzryct;
    @TableField("SFSYTSYH")
    private String sfsytsyh;
    @TableField("SLAJZLX")
    private String slajzlx;
    @TableField("SFTJJG")
    private String sftjjg;
    @TableField("FYJGGTBG")
    private String fyjggtbg;
    @TableField("CTFZRFBYJ")
    private String ctfzrfbyj;
    @TableField("XZJGBS")
    private String xzjgbs;
    @TableField("YBJJMSZYAH")
    private String ybjjmszyah;
    @TableField("XZJGJB")
    private String xzjgjb;
    @TableField("CTFZRQK")
    private String ctfzrqk;

    @TableField("QZCPWSXH")
    private String qzcpwsxh;//签章后文书序号

    @TableField("FGHP")
    private String fghp;//法官互评

    @TableField("FGBHPYY")
    private String fgbhpyy;//法官不互评原因

    @TableField("ZCAJJSDCG")
    private String zcajjsdcg;//知产案件技术调查官

    @TableField("SSHFZJE")
    private Double sshfzje;

    @TableField("ZDLXRQ")
    private String zdlxrq;

    @TableField("SFYLXNR")
    private String sfylxnr;//是否有履行内容

    @TableField("YQELX")
    private String yqelx;//已全额履行

    @TableField("SFDRZHY")
    private String sfdrzhy;//是否独任转合议

    @TableField("RZRFRS")
    private Integer rzrfrs;//认罪认罚人数

    @TableField("JZLXRS")
    private Integer jzlxrs;//精准量刑人数

    @TableField("FDLXRS")
    private Integer fdlxrs;//幅度量刑人数

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

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    public String getCbspt() {
        return cbspt;
    }

    public void setCbspt(String cbspt) {
        this.cbspt = cbspt;
    }

    public String getBgrtyrzcx() {
        return bgrtyrzcx;
    }

    public void setBgrtyrzcx(String bgrtyrzcx) {
        this.bgrtyrzcx = bgrtyrzcx;
    }

    public String getGxyj() {
        return gxyj;
    }

    public void setGxyj(String gxyj) {
        this.gxyj = gxyj;
    }

    public String getTqzjjh() {
        return tqzjjh;
    }

    public void setTqzjjh(String tqzjjh) {
        this.tqzjjh = tqzjjh;
    }

    public String getFysjdqzj() {
        return fysjdqzj;
    }

    public void setFysjdqzj(String fysjdqzj) {
        this.fysjdqzj = fysjdqzj;
    }

    public String getCbrq() {
        return cbrq;
    }

    public void setCbrq(String cbrq) {
        this.cbrq = cbrq;
    }

    public String getDysj() {
        return dysj;
    }

    public void setDysj(String dysj) {
        this.dysj = dysj;
    }

    public String getAjsj() {
        return ajsj;
    }

    public void setAjsj(String ajsj) {
        this.ajsj = ajsj;
    }

    public String getGtfz() {
        return gtfz;
    }

    public void setGtfz(String gtfz) {
        this.gtfz = gtfz;
    }

    public Double getAjjz() {
        return ajjz;
    }

    public void setAjjz(Double ajjz) {
        this.ajjz = ajjz;
    }

    public String getSlbg() {
        return slbg;
    }

    public void setSlbg(String slbg) {
        this.slbg = slbg;
    }

    public String getSzdhysfy() {
        return szdhysfy;
    }

    public void setSzdhysfy(String szdhysfy) {
        this.szdhysfy = szdhysfy;
    }

    public String getKtsl() {
        return ktsl;
    }

    public void setKtsl(String ktsl) {
        this.ktsl = ktsl;
    }

    public String getPtcxjys() {
        return ptcxjys;
    }

    public void setPtcxjys(String ptcxjys) {
        this.ptcxjys = ptcxjys;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getZdbhrs() {
        return zdbhrs;
    }

    public void setZdbhrs(Integer zdbhrs) {
        this.zdbhrs = zdbhrs;
    }

    public Double getPjwh() {
        return pjwh;
    }

    public void setPjwh(Double pjwh) {
        this.pjwh = pjwh;
    }

    public Integer getJiazrs() {
        return jiazrs;
    }

    public void setJiazrs(Integer jiazrs) {
        this.jiazrs = jiazrs;
    }

    public Integer getJianqrs() {
        return jianqrs;
    }

    public void setJianqrs(Integer jianqrs) {
        this.jianqrs = jianqrs;
    }

    public Integer getMianyrs() {
        return mianyrs;
    }

    public void setMianyrs(Integer mianyrs) {
        this.mianyrs = mianyrs;
    }

    public Integer getWuzrs() {
        return wuzrs;
    }

    public void setWuzrs(Integer wuzrs) {
        this.wuzrs = wuzrs;
    }

    public Integer getQitrs() {
        return qitrs;
    }

    public void setQitrs(Integer qitrs) {
        this.qitrs = qitrs;
    }

    public String getAzwfjs() {
        return azwfjs;
    }

    public void setAzwfjs(String azwfjs) {
        this.azwfjs = azwfjs;
    }

    public String getCljg() {
        return cljg;
    }

    public void setCljg(String cljg) {
        this.cljg = cljg;
    }

    public Long getCwsyflrs() {
        return cwsyflrs;
    }

    public void setCwsyflrs(Long cwsyflrs) {
        this.cwsyflrs = cwsyflrs;
    }

    public String getFddbrctf() {
        return fddbrctf;
    }

    public void setFddbrctf(String fddbrctf) {
        this.fddbrctf = fddbrctf;
    }

    public Long getFlyzlsrs() {
        return flyzlsrs;
    }

    public void setFlyzlsrs(Long flyzlsrs) {
        this.flyzlsrs = flyzlsrs;
    }

    public Long getFzjtrs() {
        return fzjtrs;
    }

    public void setFzjtrs(Long fzjtrs) {
        this.fzjtrs = fzjtrs;
    }

    public Long getGpzrs() {
        return gpzrs;
    }

    public void setGpzrs(Long gpzrs) {
        this.gpzrs = gpzrs;
    }

    public Long getGtfzrs() {
        return gtfzrs;
    }

    public void setGtfzrs(Long gtfzrs) {
        this.gtfzrs = gtfzrs;
    }

    public String getHygxczjg() {
        return hygxczjg;
    }

    public void setHygxczjg(String hygxczjg) {
        this.hygxczjg = hygxczjg;
    }

    public String getJgxzfy() {
        return jgxzfy;
    }

    public void setJgxzfy(String jgxzfy) {
        this.jgxzfy = jgxzfy;
    }

    public String getJsrr() {
        return jsrr;
    }

    public void setJsrr(String jsrr) {
        this.jsrr = jsrr;
    }

    public Integer getLsrs() {
        return lsrs;
    }

    public void setLsrs(Integer lsrs) {
        this.lsrs = lsrs;
    }

    public Long getLxbdrs() {
        return lxbdrs;
    }

    public void setLxbdrs(Long lxbdrs) {
        this.lxbdrs = lxbdrs;
    }

    public String getLxjy() {
        return lxjy;
    }

    public void setLxjy(String lxjy) {
        this.lxjy = lxjy;
    }

    public String getLxjycn() {
        return lxjycn;
    }

    public void setLxjycn(String lxjycn) {
        this.lxjycn = lxjycn;
    }

    public Double getPcqcbl() {
        return pcqcbl;
    }

    public void setPcqcbl(Double pcqcbl) {
        this.pcqcbl = pcqcbl;
    }

    public Long getQtyygbrs() {
        return qtyygbrs;
    }

    public void setQtyygbrs(Long qtyygbrs) {
        this.qtyygbrs = qtyygbrs;
    }

    public Long getSdrs() {
        return sdrs;
    }

    public void setSdrs(Long sdrs) {
        this.sdrs = sdrs;
    }

    public Long getShrs() {
        return shrs;
    }

    public void setShrs(Long shrs) {
        this.shrs = shrs;
    }

    public Long getSqrs() {
        return sqrs;
    }

    public void setSqrs(Long sqrs) {
        this.sqrs = sqrs;
    }

    public Long getSsbqrs() {
        return ssbqrs;
    }

    public void setSsbqrs(Long ssbqrs) {
        this.ssbqrs = ssbqrs;
    }

    public Long getWcrs() {
        return wcrs;
    }

    public void setWcrs(Long wcrs) {
        this.wcrs = wcrs;
    }

    public String getXprq() {
        return xprq;
    }

    public void setXprq(String xprq) {
        this.xprq = xprq;
    }

    public String getXshj() {
        return xshj;
    }

    public void setXshj(String xshj) {
        this.xshj = xshj;
    }

    public String getDwfz() {
        return dwfz;
    }

    public void setDwfz(String dwfz) {
        this.dwfz = dwfz;
    }

    public Integer getCbqx() {
        return cbqx;
    }

    public void setCbqx(Integer cbqx) {
        this.cbqx = cbqx;
    }

    public String getSheyu() {
        return sheyu;
    }

    public void setSheyu(String sheyu) {
        this.sheyu = sheyu;
    }

    public String getCpwsxh() {
        return cpwsxh;
    }

    public void setCpwsxh(String cpwsxh) {
        this.cpwsxh = cpwsxh;
    }

    public String getDarq() {
        return darq;
    }

    public void setDarq(String darq) {
        this.darq = darq;
    }

    public String getDazz() {
        return dazz;
    }

    public void setDazz(String dazz) {
        this.dazz = dazz;
    }

    public String getQfr() {
        return qfr;
    }

    public void setQfr(String qfr) {
        this.qfr = qfr;
    }

    public String getYzqfrq() {
        return yzqfrq;
    }

    public void setYzqfrq(String yzqfrq) {
        this.yzqfrq = yzqfrq;
    }

    public String getCbrbprq() {
        return cbrbprq;
    }

    public void setCbrbprq(String cbrbprq) {
        this.cbrbprq = cbrbprq;
    }

    public String getSpzsqrq() {
        return spzsqrq;
    }

    public void setSpzsqrq(String spzsqrq) {
        this.spzsqrq = spzsqrq;
    }

    public String getTzsqrq() {
        return tzsqrq;
    }

    public void setTzsqrq(String tzsqrq) {
        this.tzsqrq = tzsqrq;
    }

    public String getYkzxnr() {
        return ykzxnr;
    }

    public void setYkzxnr(String ykzxnr) {
        this.ykzxnr = ykzxnr;
    }

    public String getQxsl() {
        return qxsl;
    }

    public void setQxsl(String qxsl) {
        this.qxsl = qxsl;
    }

    public String getQxxp() {
        return qxxp;
    }

    public void setQxxp(String qxxp) {
        this.qxxp = qxxp;
    }

    public String getSpzzxs() {
        return spzzxs;
    }

    public void setSpzzxs(String spzzxs) {
        this.spzzxs = spzzxs;
    }

    public String getFzrgdct() {
        return fzrgdct;
    }

    public void setFzrgdct(String fzrgdct) {
        this.fzrgdct = fzrgdct;
    }

    public String getCblx() {
        return cblx;
    }

    public void setCblx(String cblx) {
        this.cblx = cblx;
    }

    public String getXzxt() {
        return xzxt;
    }

    public void setXzxt(String xzxt) {
        this.xzxt = xzxt;
    }

    public String getKnpcsnyqtx() {
        return knpcsnyqtx;
    }

    public void setKnpcsnyqtx(String knpcsnyqtx) {
        this.knpcsnyqtx = knpcsnyqtx;
    }

    public String getTqhy() {
        return tqhy;
    }

    public void setTqhy(String tqhy) {
        this.tqhy = tqhy;
    }

    public String getFfzjpc() {
        return ffzjpc;
    }

    public void setFfzjpc(String ffzjpc) {
        this.ffzjpc = ffzjpc;
    }

    public String getSftqyztjswh() {
        return sftqyztjswh;
    }

    public void setSftqyztjswh(String sftqyztjswh) {
        this.sftqyztjswh = sftqyztjswh;
    }

    public String getSftqyj() {
        return sftqyj;
    }

    public void setSftqyj(String sftqyj) {
        this.sftqyj = sftqyj;
    }

    public String getTqyjfs() {
        return tqyjfs;
    }

    public void setTqyjfs(String tqyjfs) {
        this.tqyjfs = tqyjfs;
    }

    public String getSdfs() {
        return sdfs;
    }

    public void setSdfs(String sdfs) {
        this.sdfs = sdfs;
    }

    public String getXhba() {
        return xhba;
    }

    public void setXhba(String xhba) {
        this.xhba = xhba;
    }

    public String getSlqksm() {
        return slqksm;
    }

    public void setSlqksm(String slqksm) {
        this.slqksm = slqksm;
    }

    public String getWjyysm() {
        return wjyysm;
    }

    public void setWjyysm(String wjyysm) {
        this.wjyysm = wjyysm;
    }

    public String getZjtsjlgg() {
        return zjtsjlgg;
    }

    public void setZjtsjlgg(String zjtsjlgg) {
        this.zjtsjlgg = zjtsjlgg;
    }

    public String getXhktsl() {
        return xhktsl;
    }

    public void setXhktsl(String xhktsl) {
        this.xhktsl = xhktsl;
    }

    public String getSfzdaj() {
        return sfzdaj;
    }

    public void setSfzdaj(String sfzdaj) {
        this.sfzdaj = sfzdaj;
    }

    public String getSszmc() {
        return sszmc;
    }

    public void setSszmc(String sszmc) {
        this.sszmc = sszmc;
    }

    public String getFtbl() {
        return ftbl;
    }

    public void setFtbl(String ftbl) {
        this.ftbl = ftbl;
    }

    public String getFtdc() {
        return ftdc;
    }

    public void setFtdc(String ftdc) {
        this.ftdc = ftdc;
    }

    public String getShdc() {
        return shdc;
    }

    public void setShdc(String shdc) {
        this.shdc = shdc;
    }

    public String getSfgscpws() {
        return sfgscpws;
    }

    public void setSfgscpws(String sfgscpws) {
        this.sfgscpws = sfgscpws;
    }

    public String getCpwsys() {
        return cpwsys;
    }

    public void setCpwsys(String cpwsys) {
        this.cpwsys = cpwsys;
    }

    public String getSfgtfz() {
        return sfgtfz;
    }

    public void setSfgtfz(String sfgtfz) {
        this.sfgtfz = sfgtfz;
    }

    public String getSqtx() {
        return sqtx;
    }

    public void setSqtx(String sqtx) {
        this.sqtx = sqtx;
    }

    public String getSfqwxsaj() {
        return sfqwxsaj;
    }

    public void setSfqwxsaj(String sfqwxsaj) {
        this.sfqwxsaj = sfqwxsaj;
    }

    public String getSfbrz() {
        return sfbrz;
    }

    public void setSfbrz(String sfbrz) {
        this.sfbrz = sfbrz;
    }

    public String getSrddb() {
        return srddb;
    }

    public void setSrddb(String srddb) {
        this.srddb = srddb;
    }

    public String getXzjgctry() {
        return xzjgctry;
    }

    public void setXzjgctry(String xzjgctry) {
        this.xzjgctry = xzjgctry;
    }

    public String getFdgfxwjsc() {
        return fdgfxwjsc;
    }

    public void setFdgfxwjsc(String fdgfxwjsc) {
        this.fdgfxwjsc = fdgfxwjsc;
    }

    public String getGfxwjscjl() {
        return gfxwjscjl;
    }

    public void setGfxwjscjl(String gfxwjscjl) {
        this.gfxwjscjl = gfxwjscjl;
    }

    public String getCdxyzx() {
        return cdxyzx;
    }

    public void setCdxyzx(String cdxyzx) {
        this.cdxyzx = cdxyzx;
    }

    public String getBkt() {
        return bkt;
    }

    public void setBkt(String bkt) {
        this.bkt = bkt;
    }

    public String getJgzfqqfxcz() {
        return jgzfqqfxcz;
    }

    public void setJgzfqqfxcz(String jgzfqqfxcz) {
        this.jgzfqqfxcz = jgzfqqfxcz;
    }

    public String getSjdlmjjd() {
        return sjdlmjjd;
    }

    public void setSjdlmjjd(String sjdlmjjd) {
        this.sjdlmjjd = sjdlmjjd;
    }

    public String getPczhhcx() {
        return pczhhcx;
    }

    public void setPczhhcx(String pczhhcx) {
        this.pczhhcx = pczhhcx;
    }

    public String getPczhcxrq() {
        return pczhcxrq;
    }

    public void setPczhcxrq(String pczhcxrq) {
        this.pczhcxrq = pczhcxrq;
    }

    public String getPccxzhws() {
        return pccxzhws;
    }

    public void setPccxzhws(String pccxzhws) {
        this.pccxzhws = pccxzhws;
    }

    public String getQzyl() {
        return qzyl;
    }

    public void setQzyl(String qzyl) {
        this.qzyl = qzyl;
    }

    public String getSjy() {
        return sjy;
    }

    public void setSjy(String sjy) {
        this.sjy = sjy;
    }

    public Integer getBhlys() {
        return bhlys;
    }

    public void setBhlys(Integer bhlys) {
        this.bhlys = bhlys;
    }

    public Integer getBhlts() {
        return bhlts;
    }

    public void setBhlts(Integer bhlts) {
        this.bhlts = bhlts;
    }

    public String getBhlzcrq() {
        return bhlzcrq;
    }

    public void setBhlzcrq(String bhlzcrq) {
        this.bhlzcrq = bhlzcrq;
    }

    public String getSfyjaws() {
        return sfyjaws;
    }

    public void setSfyjaws(String sfyjaws) {
        this.sfyjaws = sfyjaws;
    }

    public String getWjawsly() {
        return wjawsly;
    }

    public void setWjawsly(String wjawsly) {
        this.wjawsly = wjawsly;
    }

    public String getXbmzy() {
        return xbmzy;
    }

    public void setXbmzy(String xbmzy) {
        this.xbmzy = xbmzy;
    }

    public Integer getCbcs() {
        return cbcs;
    }

    public void setCbcs(Integer cbcs) {
        this.cbcs = cbcs;
    }

    public Integer getDbcs() {
        return dbcs;
    }

    public void setDbcs(Integer dbcs) {
        this.dbcs = dbcs;
    }

    public String getSfsdwbgy() {
        return sfsdwbgy;
    }

    public void setSfsdwbgy(String sfsdwbgy) {
        this.sfsdwbgy = sfsdwbgy;
    }

    public String getSfsdnbgw() {
        return sfsdnbgw;
    }

    public void setSfsdnbgw(String sfsdnbgw) {
        this.sfsdnbgw = sfsdnbgw;
    }

    public String getKnpcynysyqtx() {
        return knpcynysyqtx;
    }

    public void setKnpcynysyqtx(String knpcynysyqtx) {
        this.knpcynysyqtx = knpcynysyqtx;
    }

    public String getSplcgk() {
        return splcgk;
    }

    public void setSplcgk(String splcgk) {
        this.splcgk = splcgk;
    }

    public String getAjpld() {
        return ajpld;
    }

    public void setAjpld(String ajpld) {
        this.ajpld = ajpld;
    }

    public String getSlaj() {
        return slaj;
    }

    public void setSlaj(String slaj) {
        this.slaj = slaj;
    }

    public String getSgang() {
        return sgang;
    }

    public void setSgang(String sgang) {
        this.sgang = sgang;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }

    public String getStai() {
        return stai;
    }

    public void setStai(String stai) {
        this.stai = stai;
    }

    public String getSwqx() {
        return swqx;
    }

    public void setSwqx(String swqx) {
        this.swqx = swqx;
    }

    public String getSgatqx() {
        return sgatqx;
    }

    public void setSgatqx(String sgatqx) {
        this.sgatqx = sgatqx;
    }

    public Long getCjssbhrs() {
        return cjssbhrs;
    }

    public void setCjssbhrs(Long cjssbhrs) {
        this.cjssbhrs = cjssbhrs;
    }

    public String getAjdjyj() {
        return ajdjyj;
    }

    public void setAjdjyj(String ajdjyj) {
        this.ajdjyj = ajdjyj;
    }

    public String getCbfy() {
        return cbfy;
    }

    public void setCbfy(String cbfy) {
        this.cbfy = cbfy;
    }

    public String getJycxsyfs() {
        return jycxsyfs;
    }

    public void setJycxsyfs(String jycxsyfs) {
        this.jycxsyfs = jycxsyfs;
    }

    public String getSfrmtjzzcytj() {
        return sfrmtjzzcytj;
    }

    public void setSfrmtjzzcytj(String sfrmtjzzcytj) {
        this.sfrmtjzzcytj = sfrmtjzzcytj;
    }

    public String getSfydlls() {
        return sfydlls;
    }

    public void setSfydlls(String sfydlls) {
        this.sfydlls = sfydlls;
    }

    public String getAwrcytj() {
        return awrcytj;
    }

    public void setAwrcytj(String awrcytj) {
        this.awrcytj = awrcytj;
    }

    public String getSfgtss() {
        return sfgtss;
    }

    public void setSfgtss(String sfgtss) {
        this.sfgtss = sfgtss;
    }

    public String getSfybjdqzyl() {
        return sfybjdqzyl;
    }

    public void setSfybjdqzyl(String sfybjdqzyl) {
        this.sfybjdqzyl = sfybjdqzyl;
    }

    public String getSfcxqzyljd() {
        return sfcxqzyljd;
    }

    public void setSfcxqzyljd(String sfcxqzyljd) {
        this.sfcxqzyljd = sfcxqzyljd;
    }

    public String getTzsy() {
        return tzsy;
    }

    public void setTzsy(String tzsy) {
        this.tzsy = tzsy;
    }

    public String getBsyjycxsy() {
        return bsyjycxsy;
    }

    public void setBsyjycxsy(String bsyjycxsy) {
        this.bsyjycxsy = bsyjycxsy;
    }

    public String getSyjycpws() {
        return syjycpws;
    }

    public void setSyjycpws(String syjycpws) {
        this.syjycpws = syjycpws;
    }

    public String getDcqzjg() {
        return dcqzjg;
    }

    public void setDcqzjg(String dcqzjg) {
        this.dcqzjg = dcqzjg;
    }

    public String getZxfs() {
        return zxfs;
    }

    public void setZxfs(String zxfs) {
        this.zxfs = zxfs;
    }

    public String getSfgksl() {
        return sfgksl;
    }

    public void setSfgksl(String sfgksl) {
        this.sfgksl = sfgksl;
    }

    public String getSwcn() {
        return swcn;
    }

    public void setSwcn(String swcn) {
        this.swcn = swcn;
    }

    public String getCpwsswzt() {
        return cpwsswzt;
    }

    public void setCpwsswzt(String cpwsswzt) {
        this.cpwsswzt = cpwsswzt;
    }

    public String getCpwsbswly() {
        return cpwsbswly;
    }

    public void setCpwsbswly(String cpwsbswly) {
        this.cpwsbswly = cpwsbswly;
    }

    public String getCpwsbsw() {
        return cpwsbsw;
    }

    public void setCpwsbsw(String cpwsbsw) {
        this.cpwsbsw = cpwsbsw;
    }

    public String getBygksplc() {
        return bygksplc;
    }

    public void setBygksplc(String bygksplc) {
        this.bygksplc = bygksplc;
    }

    public String getSplcbgkyy() {
        return splcbgkyy;
    }

    public void setSplcbgkyy(String splcbgkyy) {
        this.splcbgkyy = splcbgkyy;
    }

    public String getNrjgpt() {
        return nrjgpt;
    }

    public void setNrjgpt(String nrjgpt) {
        this.nrjgpt = nrjgpt;
    }

    public String getKnpcynyqtx() {
        return knpcynyqtx;
    }

    public void setKnpcynyqtx(String knpcynyqtx) {
        this.knpcynyqtx = knpcynyqtx;
    }

    public String getXzjgfzryct() {
        return xzjgfzryct;
    }

    public void setXzjgfzryct(String xzjgfzryct) {
        this.xzjgfzryct = xzjgfzryct;
    }

    public String getSfsytsyh() {
        return sfsytsyh;
    }

    public void setSfsytsyh(String sfsytsyh) {
        this.sfsytsyh = sfsytsyh;
    }

    public String getSlajzlx() {
        return slajzlx;
    }

    public void setSlajzlx(String slajzlx) {
        this.slajzlx = slajzlx;
    }

    public String getSftjjg() {
        return sftjjg;
    }

    public void setSftjjg(String sftjjg) {
        this.sftjjg = sftjjg;
    }

    public String getFyjggtbg() {
        return fyjggtbg;
    }

    public void setFyjggtbg(String fyjggtbg) {
        this.fyjggtbg = fyjggtbg;
    }

    public String getCtfzrfbyj() {
        return ctfzrfbyj;
    }

    public void setCtfzrfbyj(String ctfzrfbyj) {
        this.ctfzrfbyj = ctfzrfbyj;
    }

    public String getXzjgbs() {
        return xzjgbs;
    }

    public void setXzjgbs(String xzjgbs) {
        this.xzjgbs = xzjgbs;
    }

    public String getYbjjmszyah() {
        return ybjjmszyah;
    }

    public void setYbjjmszyah(String ybjjmszyah) {
        this.ybjjmszyah = ybjjmszyah;
    }

    public String getXzjgjb() {
        return xzjgjb;
    }

    public void setXzjgjb(String xzjgjb) {
        this.xzjgjb = xzjgjb;
    }

    public String getCtfzrqk() {
        return ctfzrqk;
    }

    public void setCtfzrqk(String ctfzrqk) {
        this.ctfzrqk = ctfzrqk;
    }

    public String getQzcpwsxh() {
        return qzcpwsxh;
    }

    public void setQzcpwsxh(String qzcpwsxh) {
        this.qzcpwsxh = qzcpwsxh;
    }

    public String getFghp() {
        return fghp;
    }

    public void setFghp(String fghp) {
        this.fghp = fghp;
    }

    public String getFgbhpyy() {
        return fgbhpyy;
    }

    public void setFgbhpyy(String fgbhpyy) {
        this.fgbhpyy = fgbhpyy;
    }

    public String getZcajjsdcg() {
        return zcajjsdcg;
    }

    public void setZcajjsdcg(String zcajjsdcg) {
        this.zcajjsdcg = zcajjsdcg;
    }

    public Double getSshfzje() {
        return sshfzje;
    }

    public void setSshfzje(Double sshfzje) {
        this.sshfzje = sshfzje;
    }

    public String getZdlxrq() {
        return zdlxrq;
    }

    public void setZdlxrq(String zdlxrq) {
        this.zdlxrq = zdlxrq;
    }

    public String getSfylxnr() {
        return sfylxnr;
    }

    public void setSfylxnr(String sfylxnr) {
        this.sfylxnr = sfylxnr;
    }

    public String getYqelx() {
        return yqelx;
    }

    public void setYqelx(String yqelx) {
        this.yqelx = yqelx;
    }

    public String getSfdrzhy() {
        return sfdrzhy;
    }

    public void setSfdrzhy(String sfdrzhy) {
        this.sfdrzhy = sfdrzhy;
    }

    public Integer getRzrfrs() {
        return rzrfrs;
    }

    public void setRzrfrs(Integer rzrfrs) {
        this.rzrfrs = rzrfrs;
    }

    public Integer getJzlxrs() {
        return jzlxrs;
    }

    public void setJzlxrs(Integer jzlxrs) {
        this.jzlxrs = jzlxrs;
    }

    public Integer getFdlxrs() {
        return fdlxrs;
    }

    public void setFdlxrs(Integer fdlxrs) {
        this.fdlxrs = fdlxrs;
    }

    @Override
    public String toString() {
        return "EajSl{" +
                "ahdm=" + ahdm +
                ", jsrq=" + jsrq +
                ", cbspt=" + cbspt +
                ", bgrtyrzcx=" + bgrtyrzcx +
                ", gxyj=" + gxyj +
                ", tqzjjh=" + tqzjjh +
                ", fysjdqzj=" + fysjdqzj +
                ", cbrq=" + cbrq +
                ", dysj=" + dysj +
                ", ajsj=" + ajsj +
                ", gtfz=" + gtfz +
                ", ajjz=" + ajjz +
                ", slbg=" + slbg +
                ", szdhysfy=" + szdhysfy +
                ", ktsl=" + ktsl +
                ", ptcxjys=" + ptcxjys +
                ", lastupdate=" + lastupdate +
                ", zdbhrs=" + zdbhrs +
                ", pjwh=" + pjwh +
                ", jiazrs=" + jiazrs +
                ", jianqrs=" + jianqrs +
                ", mianyrs=" + mianyrs +
                ", wuzrs=" + wuzrs +
                ", qitrs=" + qitrs +
                ", azwfjs=" + azwfjs +
                ", cljg=" + cljg +
                ", cwsyflrs=" + cwsyflrs +
                ", fddbrctf=" + fddbrctf +
                ", flyzlsrs=" + flyzlsrs +
                ", fzjtrs=" + fzjtrs +
                ", gpzrs=" + gpzrs +
                ", gtfzrs=" + gtfzrs +
                ", hygxczjg=" + hygxczjg +
                ", jgxzfy=" + jgxzfy +
                ", jsrr=" + jsrr +
                ", lsrs=" + lsrs +
                ", lxbdrs=" + lxbdrs +
                ", lxjy=" + lxjy +
                ", lxjycn=" + lxjycn +
                ", pcqcbl=" + pcqcbl +
                ", qtyygbrs=" + qtyygbrs +
                ", sdrs=" + sdrs +
                ", shrs=" + shrs +
                ", sqrs=" + sqrs +
                ", ssbqrs=" + ssbqrs +
                ", wcrs=" + wcrs +
                ", xprq=" + xprq +
                ", xshj=" + xshj +
                ", dwfz=" + dwfz +
                ", cbqx=" + cbqx +
                ", sheyu=" + sheyu +
                ", cpwsxh=" + cpwsxh +
                ", darq=" + darq +
                ", dazz=" + dazz +
                ", qfr=" + qfr +
                ", yzqfrq=" + yzqfrq +
                ", cbrbprq=" + cbrbprq +
                ", spzsqrq=" + spzsqrq +
                ", tzsqrq=" + tzsqrq +
                ", ykzxnr=" + ykzxnr +
                ", qxsl=" + qxsl +
                ", qxxp=" + qxxp +
                ", spzzxs=" + spzzxs +
                ", fzrgdct=" + fzrgdct +
                ", cblx=" + cblx +
                ", xzxt=" + xzxt +
                ", knpcsnyqtx=" + knpcsnyqtx +
                ", tqhy=" + tqhy +
                ", ffzjpc=" + ffzjpc +
                ", sftqyztjswh=" + sftqyztjswh +
                ", sftqyj=" + sftqyj +
                ", tqyjfs=" + tqyjfs +
                ", sdfs=" + sdfs +
                ", xhba=" + xhba +
                ", slqksm=" + slqksm +
                ", wjyysm=" + wjyysm +
                ", zjtsjlgg=" + zjtsjlgg +
                ", xhktsl=" + xhktsl +
                ", sfzdaj=" + sfzdaj +
                ", sszmc=" + sszmc +
                ", ftbl=" + ftbl +
                ", ftdc=" + ftdc +
                ", shdc=" + shdc +
                ", sfgscpws=" + sfgscpws +
                ", cpwsys=" + cpwsys +
                ", sfgtfz=" + sfgtfz +
                ", sqtx=" + sqtx +
                ", sfqwxsaj=" + sfqwxsaj +
                ", sfbrz=" + sfbrz +
                ", srddb=" + srddb +
                ", xzjgctry=" + xzjgctry +
                ", fdgfxwjsc=" + fdgfxwjsc +
                ", gfxwjscjl=" + gfxwjscjl +
                ", cdxyzx=" + cdxyzx +
                ", bkt=" + bkt +
                ", jgzfqqfxcz=" + jgzfqqfxcz +
                ", sjdlmjjd=" + sjdlmjjd +
                ", pczhhcx=" + pczhhcx +
                ", pczhcxrq=" + pczhcxrq +
                ", pccxzhws=" + pccxzhws +
                ", qzyl=" + qzyl +
                ", sjy=" + sjy +
                ", bhlys=" + bhlys +
                ", bhlts=" + bhlts +
                ", bhlzcrq=" + bhlzcrq +
                ", sfyjaws=" + sfyjaws +
                ", wjawsly=" + wjawsly +
                ", xbmzy=" + xbmzy +
                ", cbcs=" + cbcs +
                ", dbcs=" + dbcs +
                ", sfsdwbgy=" + sfsdwbgy +
                ", sfsdnbgw=" + sfsdnbgw +
                ", knpcynysyqtx=" + knpcynysyqtx +
                ", splcgk=" + splcgk +
                ", ajpld=" + ajpld +
                ", slaj=" + slaj +
                ", sgang=" + sgang +
                ", sao=" + sao +
                ", stai=" + stai +
                ", swqx=" + swqx +
                ", sgatqx=" + sgatqx +
                ", cjssbhrs=" + cjssbhrs +
                ", ajdjyj=" + ajdjyj +
                ", cbfy=" + cbfy +
                ", jycxsyfs=" + jycxsyfs +
                ", sfrmtjzzcytj=" + sfrmtjzzcytj +
                ", sfydlls=" + sfydlls +
                ", awrcytj=" + awrcytj +
                ", sfgtss=" + sfgtss +
                ", sfybjdqzyl=" + sfybjdqzyl +
                ", sfcxqzyljd=" + sfcxqzyljd +
                ", tzsy=" + tzsy +
                ", bsyjycxsy=" + bsyjycxsy +
                ", syjycpws=" + syjycpws +
                ", dcqzjg=" + dcqzjg +
                ", zxfs=" + zxfs +
                ", sfgksl=" + sfgksl +
                ", swcn=" + swcn +
                ", cpwsswzt=" + cpwsswzt +
                ", cpwsbswly=" + cpwsbswly +
                ", cpwsbsw=" + cpwsbsw +
                ", bygksplc=" + bygksplc +
                ", splcbgkyy=" + splcbgkyy +
                ", nrjgpt=" + nrjgpt +
                ", knpcynyqtx=" + knpcynyqtx +
                ", xzjgfzryct=" + xzjgfzryct +
                ", sfsytsyh=" + sfsytsyh +
                ", slajzlx=" + slajzlx +
                ", sftjjg=" + sftjjg +
                ", fyjggtbg=" + fyjggtbg +
                ", ctfzrfbyj=" + ctfzrfbyj +
                ", xzjgbs=" + xzjgbs +
                ", ybjjmszyah=" + ybjjmszyah +
                ", xzjgjb=" + xzjgjb +
                ", ctfzrqk=" + ctfzrqk +
                "}";
    }
}

