package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;

/**
 * Description:
 * Project Name:spxt-light
 * File Name:Code
 * Package com.tdh.light.spxt.bp.po.ajgl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019/10/24 13        gp     1.0        1.0 Version
 **/
@TableName("EAJ_SJQK")
public class EajSjqk {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("AY")
    private Integer ay;
    @TableField("CXYY")
    private String cxyy;
    @TableField("ZCYSYGSSQQ")
    private String zcysygssqq;
    @TableField("BGBSYY")
    private String bgbsyy;
    @TableField("JABDJE")
    private Double jabdje;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("JGZZ")
    private String jgzz;
    @TableField("DTCP")
    private String dtcp;
    @TableField("JASY1")
    private String jasy1;
    @TableField("JASY2")
    private String jasy2;
    @TableField("JABJRQ")
    private String jabjrq;
    @TableField("ZSAHDM")
    private String zsahdm;
    @TableField("SFYZCCJYZ")
    private String sfyzccjyz;
    @TableField("XZJGWCZXRQ")
    private String xzjgwczxrq;
    @TableField("CGDQXWFK")
    private String cgdqxwfk;
    @TableField("XZJGSSQKBEIZ")
    private String xzjgssqkbeiz;
    @TableField("DSRSMXSBF")
    private String dsrsmxsbf;
    @TableField("XSBFWS")
    private String xsbfws;
    @TableField("SXLVQKSM")
    private String sxlvqksm;
    @TableField("BZXRXLBM")
    private String bzxrxlbm;
    @TableField("WLFZ")
    private String wlfz;
    @TableField("BHLCSZL")
    private String bhlcszl;
    @TableField("JABJTH")
    private String jabjth;
    @TableField("SFJZJE")
    private Double sfjzje;
    @TableField("GCYY")
    private String gcyy;
    @TableField("SFXSPC")
    private String sfxspc;
    @TableField("ZJCS")
    private Long zjcs;
    @TableField("FJCS")
    private Long fjcs;
    @TableField("JAFSSM")
    private String jafssm;
    @TableField("YBJDQZYL")
    private String ybjdqzyl;
    @TableField("SDRQ")
    private String sdrq;
    @TableField("CBFY")
    private String cbfy;
    @TableField("SFYSZS")
    private String sfyszs;
    @TableField("YSZSSSLX")
    private String yszssslx;
    @TableField("JAXZXWZL")
    private String jaxzxwzl;
    @TableField("JAXZBZWZL")
    private String jaxzbzwzl;
    @TableField("SFCQBJCS")
    private String sfcqbjcs;
    @TableField("SFPJPCSS")
    private String sfpjpcss;
    @TableField("SFZLYJKGHZL")
    private String sfzlyjkghzl;
    @TableField("SFJTJZZPJ")
    private String sfjtjzzpj;
    @TableField("SFJZQK")
    private String sfjzqk;
    @TableField("JASPRQ")
    private String jasprq;
    @TableField("JASPR")
    private String jaspr;
    @TableField("JASPYJ")
    private String jaspyj;
    @TableField("JASPJL")
    private String jaspjl;
    @TableField("ZDZXLAQK")
    private String zdzxlaqk;
    @TableField("SJDWJE")
    private Double sjdwje;
    @TableField("YJARQ")
    private String yjarq;
    @TableField("HSTJCS")
    private Long hstjcs;
    @TableField("HSTJDW")
    private String hstjdw;
    @TableField("HSTJRQ")
    private String hstjrq;
    @TableField("HSXXHTFS")
    private String hsxxhtfs;
    @TableField("TJFLQK")
    private String tjflqk;
    @TableField("SFYXJA")
    private String sfyxja;
    @TableField("XZCPJG")
    private String xzcpjg;
    @TableField("XZBSJG")
    private String xzbsjg;
    @TableField("PCFS")
    private String pcfs;//赔偿方式
    @TableField(value = "PCJE",updateStrategy = FieldStrategy.IGNORED,insertStrategy =FieldStrategy.IGNORED,jdbcType= JdbcType.DOUBLE )
    private Double pcje;//赔偿金额
    @TableField("XJSSQX")
    private String xjssqx;//虚假诉讼情况

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

    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    public String getCxyy() {
        return cxyy;
    }

    public void setCxyy(String cxyy) {
        this.cxyy = cxyy;
    }

    public String getZcysygssqq() {
        return zcysygssqq;
    }

    public void setZcysygssqq(String zcysygssqq) {
        this.zcysygssqq = zcysygssqq;
    }

    public String getBgbsyy() {
        return bgbsyy;
    }

    public void setBgbsyy(String bgbsyy) {
        this.bgbsyy = bgbsyy;
    }

    public Double getJabdje() {
        return jabdje;
    }

    public void setJabdje(Double jabdje) {
        this.jabdje = jabdje;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getJgzz() {
        return jgzz;
    }

    public void setJgzz(String jgzz) {
        this.jgzz = jgzz;
    }

    public String getDtcp() {
        return dtcp;
    }

    public void setDtcp(String dtcp) {
        this.dtcp = dtcp;
    }

    public String getJasy1() {
        return jasy1;
    }

    public void setJasy1(String jasy1) {
        this.jasy1 = jasy1;
    }

    public String getJasy2() {
        return jasy2;
    }

    public void setJasy2(String jasy2) {
        this.jasy2 = jasy2;
    }

    public String getJabjrq() {
        return jabjrq;
    }

    public void setJabjrq(String jabjrq) {
        this.jabjrq = jabjrq;
    }

    public String getZsahdm() {
        return zsahdm;
    }

    public void setZsahdm(String zsahdm) {
        this.zsahdm = zsahdm;
    }

    public String getSfyzccjyz() {
        return sfyzccjyz;
    }

    public void setSfyzccjyz(String sfyzccjyz) {
        this.sfyzccjyz = sfyzccjyz;
    }

    public String getXzjgwczxrq() {
        return xzjgwczxrq;
    }

    public void setXzjgwczxrq(String xzjgwczxrq) {
        this.xzjgwczxrq = xzjgwczxrq;
    }

    public String getCgdqxwfk() {
        return cgdqxwfk;
    }

    public void setCgdqxwfk(String cgdqxwfk) {
        this.cgdqxwfk = cgdqxwfk;
    }

    public String getXzjgssqkbeiz() {
        return xzjgssqkbeiz;
    }

    public void setXzjgssqkbeiz(String xzjgssqkbeiz) {
        this.xzjgssqkbeiz = xzjgssqkbeiz;
    }

    public String getDsrsmxsbf() {
        return dsrsmxsbf;
    }

    public void setDsrsmxsbf(String dsrsmxsbf) {
        this.dsrsmxsbf = dsrsmxsbf;
    }

    public String getXsbfws() {
        return xsbfws;
    }

    public void setXsbfws(String xsbfws) {
        this.xsbfws = xsbfws;
    }

    public String getSxlvqksm() {
        return sxlvqksm;
    }

    public void setSxlvqksm(String sxlvqksm) {
        this.sxlvqksm = sxlvqksm;
    }

    public String getBzxrxlbm() {
        return bzxrxlbm;
    }

    public void setBzxrxlbm(String bzxrxlbm) {
        this.bzxrxlbm = bzxrxlbm;
    }

    public String getWlfz() {
        return wlfz;
    }

    public void setWlfz(String wlfz) {
        this.wlfz = wlfz;
    }

    public String getBhlcszl() {
        return bhlcszl;
    }

    public void setBhlcszl(String bhlcszl) {
        this.bhlcszl = bhlcszl;
    }

    public String getJabjth() {
        return jabjth;
    }

    public void setJabjth(String jabjth) {
        this.jabjth = jabjth;
    }

    public Double getSfjzje() {
        return sfjzje;
    }

    public void setSfjzje(Double sfjzje) {
        this.sfjzje = sfjzje;
    }

    public String getGcyy() {
        return gcyy;
    }

    public void setGcyy(String gcyy) {
        this.gcyy = gcyy;
    }

    public String getSfxspc() {
        return sfxspc;
    }

    public void setSfxspc(String sfxspc) {
        this.sfxspc = sfxspc;
    }

    public Long getZjcs() {
        return zjcs;
    }

    public void setZjcs(Long zjcs) {
        this.zjcs = zjcs;
    }

    public Long getFjcs() {
        return fjcs;
    }

    public void setFjcs(Long fjcs) {
        this.fjcs = fjcs;
    }

    public String getJafssm() {
        return jafssm;
    }

    public void setJafssm(String jafssm) {
        this.jafssm = jafssm;
    }

    public String getYbjdqzyl() {
        return ybjdqzyl;
    }

    public void setYbjdqzyl(String ybjdqzyl) {
        this.ybjdqzyl = ybjdqzyl;
    }

    public String getSdrq() {
        return sdrq;
    }

    public void setSdrq(String sdrq) {
        this.sdrq = sdrq;
    }

    public String getCbfy() {
        return cbfy;
    }

    public void setCbfy(String cbfy) {
        this.cbfy = cbfy;
    }

    public String getSfyszs() {
        return sfyszs;
    }

    public void setSfyszs(String sfyszs) {
        this.sfyszs = sfyszs;
    }

    public String getYszssslx() {
        return yszssslx;
    }

    public void setYszssslx(String yszssslx) {
        this.yszssslx = yszssslx;
    }

    public String getJaxzxwzl() {
        return jaxzxwzl;
    }

    public void setJaxzxwzl(String jaxzxwzl) {
        this.jaxzxwzl = jaxzxwzl;
    }

    public String getJaxzbzwzl() {
        return jaxzbzwzl;
    }

    public void setJaxzbzwzl(String jaxzbzwzl) {
        this.jaxzbzwzl = jaxzbzwzl;
    }

    public String getSfcqbjcs() {
        return sfcqbjcs;
    }

    public void setSfcqbjcs(String sfcqbjcs) {
        this.sfcqbjcs = sfcqbjcs;
    }

    public String getSfpjpcss() {
        return sfpjpcss;
    }

    public void setSfpjpcss(String sfpjpcss) {
        this.sfpjpcss = sfpjpcss;
    }

    public String getSfzlyjkghzl() {
        return sfzlyjkghzl;
    }

    public void setSfzlyjkghzl(String sfzlyjkghzl) {
        this.sfzlyjkghzl = sfzlyjkghzl;
    }

    public String getSfjtjzzpj() {
        return sfjtjzzpj;
    }

    public void setSfjtjzzpj(String sfjtjzzpj) {
        this.sfjtjzzpj = sfjtjzzpj;
    }

    public String getSfjzqk() {
        return sfjzqk;
    }

    public void setSfjzqk(String sfjzqk) {
        this.sfjzqk = sfjzqk;
    }

    public String getJasprq() {
        return jasprq;
    }

    public void setJasprq(String jasprq) {
        this.jasprq = jasprq;
    }

    public String getJaspr() {
        return jaspr;
    }

    public void setJaspr(String jaspr) {
        this.jaspr = jaspr;
    }

    public String getJaspyj() {
        return jaspyj;
    }

    public void setJaspyj(String jaspyj) {
        this.jaspyj = jaspyj;
    }

    public String getJaspjl() {
        return jaspjl;
    }

    public void setJaspjl(String jaspjl) {
        this.jaspjl = jaspjl;
    }

    public String getZdzxlaqk() {
        return zdzxlaqk;
    }

    public void setZdzxlaqk(String zdzxlaqk) {
        this.zdzxlaqk = zdzxlaqk;
    }

    public Double getSjdwje() {
        return sjdwje;
    }

    public void setSjdwje(Double sjdwje) {
        this.sjdwje = sjdwje;
    }

    public String getYjarq() {
        return yjarq;
    }

    public void setYjarq(String yjarq) {
        this.yjarq = yjarq;
    }

    public Long getHstjcs() {
        return hstjcs;
    }

    public void setHstjcs(Long hstjcs) {
        this.hstjcs = hstjcs;
    }

    public String getHstjdw() {
        return hstjdw;
    }

    public void setHstjdw(String hstjdw) {
        this.hstjdw = hstjdw;
    }

    public String getHstjrq() {
        return hstjrq;
    }

    public void setHstjrq(String hstjrq) {
        this.hstjrq = hstjrq;
    }

    public String getHsxxhtfs() {
        return hsxxhtfs;
    }

    public void setHsxxhtfs(String hsxxhtfs) {
        this.hsxxhtfs = hsxxhtfs;
    }

    public String getTjflqk() {
        return tjflqk;
    }

    public void setTjflqk(String tjflqk) {
        this.tjflqk = tjflqk;
    }

    public String getSfyxja() {
        return sfyxja;
    }

    public void setSfyxja(String sfyxja) {
        this.sfyxja = sfyxja;
    }

    public String getXzcpjg() {
        return xzcpjg;
    }

    public void setXzcpjg(String xzcpjg) {
        this.xzcpjg = xzcpjg;
    }

    public String getXzbsjg() {
        return xzbsjg;
    }

    public void setXzbsjg(String xzbsjg) {
        this.xzbsjg = xzbsjg;
    }

    public String getPcfs() {
        return pcfs;
    }

    public void setPcfs(String pcfs) {
        this.pcfs = pcfs;
    }

    public Double getPcje() {
        return pcje;
    }

    public void setPcje(Double pcje) {
        this.pcje = pcje;
    }

    public String getXjssqx() {
        return xjssqx;
    }

    public void setXjssqx(String xjssqx) {
        this.xjssqx = xjssqx;
    }

    @Override
    public String toString() {
        return "EajSjqk{" +
                "ahdm='" + ahdm + '\'' +
                ", ay=" + ay +
                ", cxyy='" + cxyy + '\'' +
                ", zcysygssqq='" + zcysygssqq + '\'' +
                ", bgbsyy='" + bgbsyy + '\'' +
                ", jabdje=" + jabdje +
                ", lastupdate=" + lastupdate +
                ", jgzz='" + jgzz + '\'' +
                ", dtcp='" + dtcp + '\'' +
                ", jasy1='" + jasy1 + '\'' +
                ", jasy2='" + jasy2 + '\'' +
                ", jabjrq='" + jabjrq + '\'' +
                ", zsahdm='" + zsahdm + '\'' +
                ", sfyzccjyz='" + sfyzccjyz + '\'' +
                ", xzjgwczxrq='" + xzjgwczxrq + '\'' +
                ", cgdqxwfk='" + cgdqxwfk + '\'' +
                ", xzjgssqkbeiz='" + xzjgssqkbeiz + '\'' +
                ", dsrsmxsbf='" + dsrsmxsbf + '\'' +
                ", xsbfws='" + xsbfws + '\'' +
                ", sxlvqksm='" + sxlvqksm + '\'' +
                ", bzxrxlbm='" + bzxrxlbm + '\'' +
                ", wlfz='" + wlfz + '\'' +
                ", bhlcszl='" + bhlcszl + '\'' +
                ", jabjth='" + jabjth + '\'' +
                ", sfjzje=" + sfjzje +
                ", gcyy='" + gcyy + '\'' +
                ", sfxspc='" + sfxspc + '\'' +
                ", zjcs=" + zjcs +
                ", fjcs=" + fjcs +
                ", jafssm='" + jafssm + '\'' +
                ", ybjdqzyl='" + ybjdqzyl + '\'' +
                ", sdrq='" + sdrq + '\'' +
                ", cbfy='" + cbfy + '\'' +
                ", sfyszs='" + sfyszs + '\'' +
                ", yszssslx='" + yszssslx + '\'' +
                ", jaxzxwzl='" + jaxzxwzl + '\'' +
                ", jaxzbzwzl='" + jaxzbzwzl + '\'' +
                ", sfcqbjcs='" + sfcqbjcs + '\'' +
                ", sfpjpcss='" + sfpjpcss + '\'' +
                ", sfzlyjkghzl='" + sfzlyjkghzl + '\'' +
                ", sfjtjzzpj='" + sfjtjzzpj + '\'' +
                ", sfjzqk='" + sfjzqk + '\'' +
                ", jasprq='" + jasprq + '\'' +
                ", jaspr='" + jaspr + '\'' +
                ", jaspyj='" + jaspyj + '\'' +
                ", jaspjl='" + jaspjl + '\'' +
                ", zdzxlaqk='" + zdzxlaqk + '\'' +
                ", sjdwje=" + sjdwje +
                ", yjarq='" + yjarq + '\'' +
                ", hstjcs=" + hstjcs +
                ", hstjdw='" + hstjdw + '\'' +
                ", hstjrq='" + hstjrq + '\'' +
                ", hsxxhtfs='" + hsxxhtfs + '\'' +
                ", tjflqk='" + tjflqk + '\'' +
                ", sfyxja='" + sfyxja + '\'' +
                ", xzcpjg='" + xzcpjg + '\'' +
                ", xzbsjg='" + xzbsjg + '\'' +
                '}';
    }
}
