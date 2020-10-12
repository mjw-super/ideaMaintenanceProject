package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 用户自定义案件分类
 * </p>
 * @author XiongWei
 * @since 2019-10-21
 */
@TableName("TU_AJFL")
public class TuAjfl {

    @TableId("FYDM")
    private String fydm;
    @TableId("AJBM")
    private String ajbm;
    @TableField("AJMC")
    private String ajmc;
    @TableField("FBZH")
    private String fbzh;
    @TableField("AJHY")
    private String ajhy;
    @TableField("AJSXY")
    private Integer ajsxy;
    @TableField("AJSXR")
    private Integer ajsxr;
    @TableField("AJXH")
    private Integer ajxh;
    @TableField("CPSP")
    private String cpsp;
    @TableField("JASP")
    private String jasp;
    @TableField("SLBM")
    private String slbm;
    @TableField("SFPQ")
    private String sfpq;
    @TableField("SXGZ")
    private String sxgz;
    @TableField("YSCL")
    private String yscl;
    @TableField("YQKTTS")
    private Integer yqktts;
    @TableField("ZDKTTS")
    private Integer zdktts;
    @TableField("WSJC")
    private String wsjc;
    @TableField("LASTUPDATE")
    private Date lastupdate;
    @TableField("SFJY")
    private String sfjy;
    @TableField("TJMSLB")
    private String tjmslb;
    @TableField("SFTJ")
    private String sftj;
    @TableField("CPWSSW")
    private String cpwssw;
    @TableField("BCYSFTJ")
    private String bcysftj;
    @TableField("LABXSZCBBM")
    private String labxszcbbm;
    @TableField("ZDPQ")
    private String zdpq;
    @TableField("BXYGD")
    private String bxygd;
    @TableField("GDPC")
    private String gdpc;
    @TableField("JAPC")
    private String japc;
    @TableField("AJLXDMC")
    private String ajlxdmc;
    @TableField("NEW")
    private String neww;
    @TableField("WSXXBD")
    private String wsxxbd;
    @TableField("EXTENT")
    private String extent;
    @TableField("LATJGLAJ")
    private String latjglaj;
    @TableField("AJLX")
    private String ajlx;
    @TableField("LASC")
    private String lasc;
    @TableField("LASP")
    private String lasp;
    @TableField("SWJD")
    private String swjd;
    @TableField("SWTJ")
    private String swtj;
    @TableField("JAQXY")
    private Integer jaqxy;
    @TableField("JAQXR")
    private Integer jaqxr;
    @TableField("LADKGLAJ")
    private String ladkglaj;
    @TableField("CPWSBXSW")
    private String cpwsbxsw;
    @TableField("SPLCGKKZ")
    private String splcgkkz;
    @TableField("SFXPSY")
    private String sfxpsy;
    @TableField("YXJJC")
    private String yxjjc;
    @TableField("WSQZJC")
    private String wsqzjc;
    @TableField("JAQWSSP")
    private String jaqwssp;
    @TableField("JAQFXPG")
    private String jaqfxpg;
    @TableField("KSTJ")
    private String kstj;
    @TableField("JAWSXXBD")
    private String jawsxxbd;
    @TableField("WDAJ")
    private String wdaj;
    @TableField("YXGKJC")
    private String yxgkjc;
    @TableField("BXFJSB")
    private String bxfjsb;
    @TableField("SSFJC")
    private String ssfjc;
    @TableField("WSGKJC")
    private String wsgkjc;
    @TableField("DLRJC")
    private String dlrjc;
    @TableField("GWJATX")
    private String gwjatx;

    /**
     * 结案文书签章提示
     */
    @TableField("JAWSQZTS")
    private String jawsqzts;

    public String getSsfjc() {
        return ssfjc;
    }

    public void setSsfjc(String ssfjc) {
        this.ssfjc = ssfjc;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getAjbm() {
        return ajbm;
    }

    public void setAjbm(String ajbm) {
        this.ajbm = ajbm;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    public String getFbzh() {
        return fbzh;
    }

    public void setFbzh(String fbzh) {
        this.fbzh = fbzh;
    }

    public String getAjhy() {
        return ajhy;
    }

    public void setAjhy(String ajhy) {
        this.ajhy = ajhy;
    }

    public Integer getAjsxy() {
        return ajsxy;
    }

    public void setAjsxy(Integer ajsxy) {
        this.ajsxy = ajsxy;
    }

    public Integer getAjsxr() {
        return ajsxr;
    }

    public void setAjsxr(Integer ajsxr) {
        this.ajsxr = ajsxr;
    }

    public Integer getAjxh() {
        return ajxh;
    }

    public void setAjxh(Integer ajxh) {
        this.ajxh = ajxh;
    }

    public String getCpsp() {
        return cpsp;
    }

    public void setCpsp(String cpsp) {
        this.cpsp = cpsp;
    }

    public String getJasp() {
        return jasp;
    }

    public void setJasp(String jasp) {
        this.jasp = jasp;
    }

    public String getSlbm() {
        return slbm;
    }

    public void setSlbm(String slbm) {
        this.slbm = slbm;
    }

    public String getSfpq() {
        return sfpq;
    }

    public void setSfpq(String sfpq) {
        this.sfpq = sfpq;
    }

    public String getSxgz() {
        return sxgz;
    }

    public void setSxgz(String sxgz) {
        this.sxgz = sxgz;
    }

    public String getYscl() {
        return yscl;
    }

    public void setYscl(String yscl) {
        this.yscl = yscl;
    }

    public Integer getYqktts() {
        return yqktts;
    }

    public void setYqktts(Integer yqktts) {
        this.yqktts = yqktts;
    }

    public Integer getZdktts() {
        return zdktts;
    }

    public void setZdktts(Integer zdktts) {
        this.zdktts = zdktts;
    }

    public String getWsjc() {
        return wsjc;
    }

    public void setWsjc(String wsjc) {
        this.wsjc = wsjc;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy;
    }

    public String getTjmslb() {
        return tjmslb;
    }

    public void setTjmslb(String tjmslb) {
        this.tjmslb = tjmslb;
    }

    public String getSftj() {
        return sftj;
    }

    public void setSftj(String sftj) {
        this.sftj = sftj;
    }

    public String getCpwssw() {
        return cpwssw;
    }

    public void setCpwssw(String cpwssw) {
        this.cpwssw = cpwssw;
    }

    public String getBcysftj() {
        return bcysftj;
    }

    public void setBcysftj(String bcysftj) {
        this.bcysftj = bcysftj;
    }

    public String getLabxszcbbm() {
        return labxszcbbm;
    }

    public void setLabxszcbbm(String labxszcbbm) {
        this.labxszcbbm = labxszcbbm;
    }

    public String getZdpq() {
        return zdpq;
    }

    public void setZdpq(String zdpq) {
        this.zdpq = zdpq;
    }

    public String getBxygd() {
        return bxygd;
    }

    public void setBxygd(String bxygd) {
        this.bxygd = bxygd;
    }

    public String getGdpc() {
        return gdpc;
    }

    public void setGdpc(String gdpc) {
        this.gdpc = gdpc;
    }

    public String getJapc() {
        return japc;
    }

    public void setJapc(String japc) {
        this.japc = japc;
    }

    public String getAjlxdmc() {
        return ajlxdmc;
    }

    public void setAjlxdmc(String ajlxdmc) {
        this.ajlxdmc = ajlxdmc;
    }

    public String getNeww() {
        return neww;
    }

    public void setNeww(String neww) {
        this.neww = neww;
    }

    public String getWsxxbd() {
        return wsxxbd;
    }

    public void setWsxxbd(String wsxxbd) {
        this.wsxxbd = wsxxbd;
    }

    public String getExtent() {
        return extent;
    }

    public void setExtent(String extent) {
        this.extent = extent;
    }

    public String getLatjglaj() {
        return latjglaj;
    }

    public void setLatjglaj(String latjglaj) {
        this.latjglaj = latjglaj;
    }

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
    }

    public String getLasc() {
        return lasc;
    }

    public void setLasc(String lasc) {
        this.lasc = lasc;
    }

    public String getLasp() {
        return lasp;
    }

    public void setLasp(String lasp) {
        this.lasp = lasp;
    }

    public String getSwjd() {
        return swjd;
    }

    public void setSwjd(String swjd) {
        this.swjd = swjd;
    }

    public String getSwtj() {
        return swtj;
    }

    public void setSwtj(String swtj) {
        this.swtj = swtj;
    }

    public Integer getJaqxy() {
        return jaqxy;
    }

    public void setJaqxy(Integer jaqxy) {
        this.jaqxy = jaqxy;
    }

    public Integer getJaqxr() {
        return jaqxr;
    }

    public void setJaqxr(Integer jaqxr) {
        this.jaqxr = jaqxr;
    }

    public String getLadkglaj() {
        return ladkglaj;
    }

    public void setLadkglaj(String ladkglaj) {
        this.ladkglaj = ladkglaj;
    }

    public String getCpwsbxsw() {
        return cpwsbxsw;
    }

    public void setCpwsbxsw(String cpwsbxsw) {
        this.cpwsbxsw = cpwsbxsw;
    }

    public String getSplcgkkz() {
        return splcgkkz;
    }

    public void setSplcgkkz(String splcgkkz) {
        this.splcgkkz = splcgkkz;
    }

    public String getSfxpsy() {
        return sfxpsy;
    }

    public void setSfxpsy(String sfxpsy) {
        this.sfxpsy = sfxpsy;
    }

    public String getYxjjc() {
        return yxjjc;
    }

    public void setYxjjc(String yxjjc) {
        this.yxjjc = yxjjc;
    }

    public String getWsqzjc() {
        return wsqzjc;
    }

    public void setWsqzjc(String wsqzjc) {
        this.wsqzjc = wsqzjc;
    }

    public String getJaqwssp() {
        return jaqwssp;
    }

    public void setJaqwssp(String jaqwssp) {
        this.jaqwssp = jaqwssp;
    }

    public String getJaqfxpg() {
        return jaqfxpg;
    }

    public void setJaqfxpg(String jaqfxpg) {
        this.jaqfxpg = jaqfxpg;
    }

    public String getKstj() {
        return kstj;
    }

    public void setKstj(String kstj) {
        this.kstj = kstj;
    }

    public String getJawsxxbd() {
        return jawsxxbd;
    }

    public void setJawsxxbd(String jawsxxbd) {
        this.jawsxxbd = jawsxxbd;
    }

    public String getWdaj() {
        return wdaj;
    }

    public void setWdaj(String wdaj) {
        this.wdaj = wdaj;
    }

    public String getYxgkjc() {
        return yxgkjc;
    }

    public void setYxgkjc(String yxgkjc) {
        this.yxgkjc = yxgkjc;
    }

    public String getBxfjsb() {
        return bxfjsb;
    }

    public void setBxfjsb(String bxfjsb) {
        this.bxfjsb = bxfjsb;
    }

    public String getJawsqzts() {
        return jawsqzts;
    }

    public void setJawsqzts(String jawsqzts) {
        this.jawsqzts = jawsqzts;
    }

    public String getWsgkjc() {
        return wsgkjc;
    }

    public void setWsgkjc(String wsgkjc) {
        this.wsgkjc = wsgkjc;
    }

    public String getDlrjc() {
        return dlrjc;
    }

    public void setDlrjc(String dlrjc) {
        this.dlrjc = dlrjc;
    }

    public String getGwjatx() {
        return gwjatx;
    }

    public void setGwjatx(String gwjatx) {
        this.gwjatx = gwjatx;
    }
}
