package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangz
 * @desc 文书送达
 * @date 2020/7/3
 */
@TableName("EAJ_SD")
public class EajSd implements Serializable {
    private static final long serialVersionUID = 7365351412462480885L;


    private String ahdm;
    private Integer xh;
    private String ws;
    private String ysdrq;
    private String sdfs;
    private String stfy;
    private String ggrq;
    private String jyrq;
    private String sdrq;
    private String sdr;
    private String ssdr;
    private String qsr;
    private String dqr;
    private String qssj;
    private String jbqs;
    private String wsdyy;
    private Date lastupdate;
    private String flwsmc;
    private String wslb;

    private Integer pch;

    private String sdhz; //送达回证

    private Integer sdlcjd;
    private String sfsdcg;

    private String sdgg;
    private String beiz;
    private String sdzt;

    private String sddz;
    private String sfysdjg;
    private String yjzt; //电子送达邮件主题
    private String hzthrq;
   // private String dqysqgx;
    private String dsrlx;//当事人类型
    private Integer yjid;////邮寄系统ID
    private String zddsr;
    private String zjrq;
    private String zjqtfyrq;//ZJQTFYRQ
    private String tyrq;
    private String jsyjrq;
    private Integer ggqy;
    private Integer ggqt;
    private String dzyjfsrq;
    private String jqrq;
    private String rowuuid;
    private String fydm;
    private String sdjdlx;
    private String lcjdrid;
    private String ggqx;//公告期限
    private String ggksrq;//公告开始日期
    private String ggjsrq;//公告结束日期

    private String ssdrxh;//受送达人序号
    private String qtws;//其他文书
    private String sfdzsd;//是否电子送达
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

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public String getYsdrq() {
        return ysdrq;
    }

    public void setYsdrq(String ysdrq) {
        this.ysdrq = ysdrq;
    }

    public String getSdfs() {
        return sdfs;
    }

    public void setSdfs(String sdfs) {
        this.sdfs = sdfs;
    }

    public String getStfy() {
        return stfy;
    }

    public void setStfy(String stfy) {
        this.stfy = stfy;
    }

    public String getGgrq() {
        return ggrq;
    }

    public void setGgrq(String ggrq) {
        this.ggrq = ggrq;
    }

    public String getJyrq() {
        return jyrq;
    }

    public void setJyrq(String jyrq) {
        this.jyrq = jyrq;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getSdr() {
        return sdr;
    }

    public void setSdr(String sdr) {
        this.sdr = sdr;
    }

    public String getSsdr() {
        return ssdr;
    }

    public void setSsdr(String ssdr) {
        this.ssdr = ssdr;
    }

    public String getQsr() {
        return qsr;
    }

    public void setQsr(String qsr) {
        this.qsr = qsr;
    }

    public String getDqr() {
        return dqr;
    }

    public void setDqr(String dqr) {
        this.dqr = dqr;
    }

    public String getQssj() {
        return qssj;
    }

    public void setQssj(String qssj) {
        this.qssj = qssj;
    }

    public String getJbqs() {
        return jbqs;
    }

    public void setJbqs(String jbqs) {
        this.jbqs = jbqs;
    }

    public String getWsdyy() {
        return wsdyy;
    }

    public void setWsdyy(String wsdyy) {
        this.wsdyy = wsdyy;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getFlwsmc() {
        return flwsmc;
    }

    public void setFlwsmc(String flwsmc) {
        this.flwsmc = flwsmc;
    }

    public String getWslb() {
        return wslb;
    }

    public void setWslb(String wslb) {
        this.wslb = wslb;
    }

    public Integer getPch() {
        return pch;
    }

    public void setPch(Integer pch) {
        this.pch = pch;
    }

    public String getSdhz() {
        return sdhz;
    }

    public void setSdhz(String sdhz) {
        this.sdhz = sdhz;
    }

    public Integer getSdlcjd() {
        return sdlcjd;
    }

    public void setSdlcjd(Integer sdlcjd) {
        this.sdlcjd = sdlcjd;
    }

    public String getSfsdcg() {
        return sfsdcg;
    }

    public void setSfsdcg(String sfsdcg) {
        this.sfsdcg = sfsdcg;
    }

    public String getSdgg() {
        return sdgg;
    }

    public void setSdgg(String sdgg) {
        this.sdgg = sdgg;
    }

    public String getBeiz() {
        return beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
    }

    public String getSdzt() {
        return sdzt;
    }

    public void setSdzt(String sdzt) {
        this.sdzt = sdzt;
    }

    public String getSddz() {
        return sddz;
    }

    public void setSddz(String sddz) {
        this.sddz = sddz;
    }

    public String getSfysdjg() {
        return sfysdjg;
    }

    public void setSfysdjg(String sfysdjg) {
        this.sfysdjg = sfysdjg;
    }

    public String getYjzt() {
        return yjzt;
    }

    public void setYjzt(String yjzt) {
        this.yjzt = yjzt;
    }

    public String getHzthrq() {
        return hzthrq;
    }

    public void setHzthrq(String hzthrq) {
        this.hzthrq = hzthrq;
    }

    /*public String getDqysqgx() {
        return dqysqgx;
    }

    public void setDqysqgx(String dqysqgx) {
        this.dqysqgx = dqysqgx;
    }*/

    public String getDsrlx() {
        return dsrlx;
    }

    public void setDsrlx(String dsrlx) {
        this.dsrlx = dsrlx;
    }

    public Integer getYjid() {
        return yjid;
    }

    public void setYjid(Integer yjid) {
        this.yjid = yjid;
    }

    public String getZddsr() {
        return zddsr;
    }

    public void setZddsr(String zddsr) {
        this.zddsr = zddsr;
    }

    public String getZjrq() {
        return zjrq;
    }

    public void setZjrq(String zjrq) {
        this.zjrq = zjrq;
    }

    public String getZjqtfyrq() {
        return zjqtfyrq;
    }

    public void setZjqtfyrq(String zjqtfyrq) {
        this.zjqtfyrq = zjqtfyrq;
    }

    public String getTyrq() {
        return tyrq;
    }

    public void setTyrq(String tyrq) {
        this.tyrq = tyrq;
    }

    public String getJsyjrq() {
        return jsyjrq;
    }

    public void setJsyjrq(String jsyjrq) {
        this.jsyjrq = jsyjrq;
    }

    public Integer getGgqy() {
        return ggqy;
    }

    public void setGgqy(Integer ggqy) {
        this.ggqy = ggqy;
    }

    public Integer getGgqt() {
        return ggqt;
    }

    public void setGgqt(Integer ggqt) {
        this.ggqt = ggqt;
    }

    public String getDzyjfsrq() {
        return dzyjfsrq;
    }

    public void setDzyjfsrq(String dzyjfsrq) {
        this.dzyjfsrq = dzyjfsrq;
    }

    public String getJqrq() {
        return jqrq;
    }

    public void setJqrq(String jqrq) {
        this.jqrq = jqrq;
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

    public String getSdjdlx() {
        return sdjdlx;
    }

    public void setSdjdlx(String sdjdlx) {
        this.sdjdlx = sdjdlx;
    }

    public String getLcjdrid() {
        return lcjdrid;
    }

    public void setLcjdrid(String lcjdrid) {
        this.lcjdrid = lcjdrid;
    }

    public String getGgqx() {
        return ggqx;
    }

    public void setGgqx(String ggqx) {
        this.ggqx = ggqx;
    }

    public String getGgksrq() {
        return ggksrq;
    }

    public void setGgksrq(String ggksrq) {
        this.ggksrq = ggksrq;
    }

    public String getGgjsrq() {
        return ggjsrq;
    }

    public void setGgjsrq(String ggjsrq) {
        this.ggjsrq = ggjsrq;
    }

    public String getSsdrxh() {
        return ssdrxh;
    }

    public void setSsdrxh(String ssdrxh) {
        this.ssdrxh = ssdrxh;
    }

    public String getQtws() {
        return qtws;
    }

    public void setQtws(String qtws) {
        this.qtws = qtws;
    }

    public String getSfdzsd() {
        return sfdzsd;
    }

    public void setSfdzsd(String sfdzsd) {
        this.sfdzsd = sfdzsd;
    }
}
