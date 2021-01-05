package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author: xiongsc
 * @Date: 2020/7/2 09:10
 * @Description:
 */
@TableName("EAJ_SKS")
public class EajSks {
    @TableField("AHDM")
    private String ahdm;
    @TableField("XH")
    private String xh;
    @TableField("LB")
    private String lb;
    @TableField("TQSSRQ")
    private String tqssrq;
    @TableField("SSLX")
    private String sslx;
    @TableField("KSLY")
    private String ksly;
    @TableField("SSFW")
    private String ssfw;
    @TableField("KSJG")
    private String ksjg;
    @TableField("SSCL")
    private String sscl;
    @TableField("SSBDE")
    private Double ssbde;
    @TableField("YJSSFTZ")
    private String yjssftz;
    @TableField("JFJE")
    private Double jfje;
    @TableField("JFRQ")
    private String jfrq;
    @TableField("SJHM")
    private String sjhm;
    @TableField("FBSDFS")
    private String fbsdfs;
    @TableField("SDRQ")
    private String sdrq;
    @TableField("SFCHES")
    private String sfches;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("JFID")
    private String jfid;
    @TableField("SFXYJNSSF")
    private String sfxyjnssf;
    @TableField("CJSSFRQ")
    private String cjssfrq;
    @TableField("CJSSFTZ")
    private String cjssftz;
    @TableField("HSFY")
    private String hsfy;
    @TableField("DJR")
    private String djr;
    @TableField("DJRQ")
    private String djrq;
    @TableField("SSR")
    private String ssr;
    @TableField("JSFY")
    private String jsfy;
    @TableField("FYMC")
    private String fymc;
    @TableField("FYDM")
    private String fydm;
    @TableField("ROWUUID")
    private String rowuuid;
    @TableField("CHSKSRQ")
    private String chsksrq;
    @TableField("YSSY")
    private String yssy;
    @TableField("KSFW")
    private String ksfw;
    @TableField("SFCHSS")
    private String sfchss;
    @TableField("LCJDRID")
    private String lcjdrid;
    @TableField("SSZFBSFSD")
    private String sszfbsfsd;
    @TableField("CHSSRQ")
    private String chssrq;
    @TableField("SSCLYS")
    private String ssclys;
    @TableField("SDSSZRQ")
    private String sdsszrq;
    @TableField("SDDBZRQ")
    private String sddbzrq;
    @TableField("SFYDBZ")
    private String sfydbz;
    @TableField("DBZFBSFSD")
    private String dbzfbsfsd;
    @TableField("DBZFBSDRQ")
    private String dbzfbsdrq;
    @TableField("IS_DELETED")
    private String isDeleted;
    @TableField("CREATE_BY")
    private String createBy;
    @TableField("UPDATE_BY")
    private String updateBy;
    @TableField("GMT_CREAT")
    private Date gmtCreat;

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

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getTqssrq() {
        return tqssrq;
    }

    public void setTqssrq(String tqssrq) {
        this.tqssrq = tqssrq;
    }

    public String getSslx() {
        return sslx;
    }

    public void setSslx(String sslx) {
        this.sslx = sslx;
    }

    public String getKsly() {
        return ksly;
    }

    public void setKsly(String ksly) {
        this.ksly = ksly;
    }

    public String getSsfw() {
        return ssfw;
    }

    public void setSsfw(String ssfw) {
        this.ssfw = ssfw;
    }

    public String getKsjg() {
        return ksjg;
    }

    public void setKsjg(String ksjg) {
        this.ksjg = ksjg;
    }

    public String getSscl() {
        return sscl;
    }

    public void setSscl(String sscl) {
        this.sscl = sscl;
    }

    public Double getSsbde() {
        return ssbde;
    }

    public void setSsbde(Double ssbde) {
        this.ssbde = ssbde;
    }

    public String getYjssftz() {
        return yjssftz;
    }

    public void setYjssftz(String yjssftz) {
        this.yjssftz = yjssftz;
    }

    public Double getJfje() {
        return jfje;
    }

    public void setJfje(Double jfje) {
        this.jfje = jfje;
    }

    public String getJfrq() {
        return jfrq;
    }

    public void setJfrq(String jfrq) {
        this.jfrq = jfrq;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getFbsdfs() {
        return fbsdfs;
    }

    public void setFbsdfs(String fbsdfs) {
        this.fbsdfs = fbsdfs;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getSfches() {
        return sfches;
    }

    public void setSfches(String sfches) {
        this.sfches = sfches;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getJfid() {
        return jfid;
    }

    public void setJfid(String jfid) {
        this.jfid = jfid;
    }

    public String getSfxyjnssf() {
        return sfxyjnssf;
    }

    public void setSfxyjnssf(String sfxyjnssf) {
        this.sfxyjnssf = sfxyjnssf;
    }

    public String getCjssfrq() {
        return cjssfrq;
    }

    public void setCjssfrq(String cjssfrq) {
        this.cjssfrq = cjssfrq;
    }

    public String getCjssftz() {
        return cjssftz;
    }

    public void setCjssftz(String cjssftz) {
        this.cjssftz = cjssftz;
    }

    public String getHsfy() {
        return hsfy;
    }

    public void setHsfy(String hsfy) {
        this.hsfy = hsfy;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getSsr() {
        return ssr;
    }

    public void setSsr(String ssr) {
        this.ssr = ssr;
    }

    public String getJsfy() {
        return jsfy;
    }

    public void setJsfy(String jsfy) {
        this.jsfy = jsfy;
    }

    public String getFymc() {
        return fymc;
    }

    public void setFymc(String fymc) {
        this.fymc = fymc;
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

    public String getChsksrq() {
        return chsksrq;
    }

    public void setChsksrq(String chsksrq) {
        this.chsksrq = chsksrq;
    }

    public String getYssy() {
        return yssy;
    }

    public void setYssy(String yssy) {
        this.yssy = yssy;
    }

    public String getKsfw() {
        return ksfw;
    }

    public void setKsfw(String ksfw) {
        this.ksfw = ksfw;
    }

    public String getSfchss() {
        return sfchss;
    }

    public void setSfchss(String sfchss) {
        this.sfchss = sfchss;
    }

    public String getLcjdrid() {
        return lcjdrid;
    }

    public void setLcjdrid(String lcjdrid) {
        this.lcjdrid = lcjdrid;
    }

    public String getSszfbsfsd() {
        return sszfbsfsd;
    }

    public void setSszfbsfsd(String sszfbsfsd) {
        this.sszfbsfsd = sszfbsfsd;
    }

    public String getChssrq() {
        return chssrq;
    }

    public void setChssrq(String chssrq) {
        this.chssrq = chssrq;
    }

    public String getSsclys() {
        return ssclys;
    }

    public void setSsclys(String ssclys) {
        this.ssclys = ssclys;
    }

    public String getSdsszrq() {
        return sdsszrq;
    }

    public void setSdsszrq(String sdsszrq) {
        this.sdsszrq = sdsszrq;
    }

    public String getSddbzrq() {
        return sddbzrq;
    }

    public void setSddbzrq(String sddbzrq) {
        this.sddbzrq = sddbzrq;
    }

    public String getDbzfbsfsd() {
        return dbzfbsfsd;
    }

    public void setDbzfbsfsd(String dbzfbsfsd) {
        this.dbzfbsfsd = dbzfbsfsd;
    }

    public String getDbzfbsdrq() {
        return dbzfbsdrq;
    }

    public void setDbzfbsdrq(String dbzfbsdrq) {
        this.dbzfbsdrq = dbzfbsdrq;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
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

    public String getSfydbz() {
        return sfydbz;
    }

    public void setSfydbz(String sfydbz) {
        this.sfydbz = sfydbz;
    }
}
