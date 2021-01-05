package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * Description:关联案件持久化对象
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
@TableName("EAJ_GLAJ")
public class EajGlaj {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM", type = IdType.INPUT)
    private String ahdm;
    @TableField("SAAH")
    private String saah;
    @TableField("YSAH")
    private String ysah;
    @TableField("BJDAJAH")
    private String bjdajah;
    @TableField("MSWFSDAJAH")
    private String mswfsdajah;
    @TableField("SJFYAJAH")
    private String sjfyajah;
    @TableField("GXAJAH")
    private String gxajah;
    @TableField("YSAJAH")
    private String ysajah;
    @TableField("FHAJAH")
    private String fhajah;
    @TableField("SXCPAH")
    private String sxcpah;
    @TableField("ESAJAH")
    private String esajah;
    @TableField("ZSSCAJAH")
    private String zsscajah;
    @TableField("QYZSAJAH")
    private String qyzsajah;
    @TableField("BQFHAH")
    private String bqfhah;
    @TableField("FYAJAH")
    private String fyajah;
    @TableField("QCSQAH")
    private String qcsqah;
    @TableField("YJDAH")
    private String yjdah;
    @TableField("SXFHAJAH")
    private String sxfhajah;
    @TableField("TZZXSXCDAH")
    private String tzzxsxcdah;
    @TableField("DCAJAH")
    private String dcajah;
    @TableField("SASXCPAH")
    private String sasxcpah;
    @TableField("CDYSBYGXAJAH")
    private String cdysbygxajah;
    @TableField("DCCXAJAH")
    private String dccxajah;
    @TableField("GSCGAJAH")
    private String gscgajah;
    @TableField("HSZQDJYSCAH")
    private String hszqdjyscah;
    @TableField("ZXAJAH")
    private String zxajah;
    @TableField("XZSSAJAH")
    private String xzssajah;
    @TableField("DSRCXZSAH")
    private String dsrcxzsah;
    @TableField("TBCXAJAH")
    private String tbcxajah;
    @TableField("DWSCSSAJAH")
    private String dwscssajah;
    @TableField("QJSFXZAJAH")
    private String qjsfxzajah;
    @TableField("SQZSSCAH")
    private String sqzsscah;
    @TableField("BSCXAH")
    private String bscxah;
    @TableField("YXGAJAH")
    private String yxgajah;
    @TableField("XGSZAJAH")
    private String xgszajah;
    @TableField("YRDAJAH")
    private String yrdajah;
    @TableField("CBPMAJAH")
    private String cbpmajah;
    @TableField("SLHSPCZRXZJJ")
    private String slhspczrxzjj;
    @TableField("YCPAH")
    private String ycpah;
    @TableField("SQSCAH")
    private String sqscah;
    @TableField("CDYSAJAH")
    private String cdysajah;
    @TableField("HBSLXZPCAH")
    private String hbslxzpcah;
    @TableField("YBJJMSZYAH")
    private String ybjjmszyah;
    @TableField("BHBSSAH")
    private String bhbssah;
    @TableField("XZYSAH")
    private String xzysah;
    @TableField("MSYSAH")
    private String msysah;
    @TableField("FSSCAJAH")
    private String fsscajah;
    @TableField("BHBSLAJAH")
    private String bhbslajah;
    @TableField("XZPCYSAH")
    private String xzpcysah;
    @TableField("SPAJAH")
    private String spajah;
    @TableField("SXJDAH")
    private String sxjdah;
    @TableField("PCJDAJAH")
    private String pcjdajah;
    @TableField("SFZCSCAH")
    private String sfzcscah;
    @TableField("SJWFSDJDAH")
    private String sjwfsdjdah;
    @TableField("QZQSSQSCAH")
    private String qzqssqscah;
    @TableField("PCSQSCAH")
    private String pcsqscah;
    @TableField("QZQSSSAH")
    private String qzqsssah;
    @TableField("PCSSAJAH")
    private String pcssajah;
    @TableField("SBQSGSSSAH")
    private String sbqsgsssah;
    @TableField("SBQSGSZCAH")
    private String sbqsgszcah;
    @TableField("ZWRCCBBQAH")
    private String zwrccbbqah;
    @TableField("ZWRBZXAH")
    private String zwrbzxah;
    @TableField("SZWRSSAH")
    private String szwrssah;
    @TableField("SZWRZCAH")
    private String szwrzcah;
    @TableField("CXZWRXWAH")
    private String cxzwrxwah;
    @TableField("ZHZWRCCAH")
    private String zhzwrccah;
    @TableField("QHDBWAH")
    private String qhdbwah;
    @TableField("QQQHCCAH")
    private String qqqhccah;
    @TableField("CJCZAH")
    private String cjczah;
    @TableField("QQZWDXAH")
    private String qqzwdxah;
    @TableField("JCJXHTAH")
    private String jcjxhtah;
    @TableField("BBSBZQAH")
    private String bbsbzqah;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE", fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;
    @TableField("FYDM")
    private String fydm;
    @TableField("YAAH")
    private String yaah;
    @TableField("XFYZXBGAH")
    private String xfyzxbgah;
    @TableField("JDZYJWZXAH")
    private String jdzyjwzxah;
    @TableField("QCBGSCAH")
    private String qcbgscah;
    @TableField("LDZCAH")
    private String ldzcah;
    @TableField("SQBQAH")
    private String sqbqah;
    @TableField("QZQSAJAH")
    private String qzqsajah;
    @TableField("JCYJDAJAH")
    private String jcyjdajah;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getSaah() {
        return saah;
    }

    public void setSaah(String saah) {
        this.saah = saah;
    }

    public String getYsah() {
        return ysah;
    }

    public void setYsah(String ysah) {
        this.ysah = ysah;
    }

    public String getBjdajah() {
        return bjdajah;
    }

    public void setBjdajah(String bjdajah) {
        this.bjdajah = bjdajah;
    }

    public String getMswfsdajah() {
        return mswfsdajah;
    }

    public void setMswfsdajah(String mswfsdajah) {
        this.mswfsdajah = mswfsdajah;
    }

    public String getSjfyajah() {
        return sjfyajah;
    }

    public void setSjfyajah(String sjfyajah) {
        this.sjfyajah = sjfyajah;
    }

    public String getGxajah() {
        return gxajah;
    }

    public void setGxajah(String gxajah) {
        this.gxajah = gxajah;
    }

    public String getYsajah() {
        return ysajah;
    }

    public void setYsajah(String ysajah) {
        this.ysajah = ysajah;
    }

    public String getFhajah() {
        return fhajah;
    }

    public void setFhajah(String fhajah) {
        this.fhajah = fhajah;
    }

    public String getSxcpah() {
        return sxcpah;
    }

    public void setSxcpah(String sxcpah) {
        this.sxcpah = sxcpah;
    }

    public String getEsajah() {
        return esajah;
    }

    public void setEsajah(String esajah) {
        this.esajah = esajah;
    }

    public String getZsscajah() {
        return zsscajah;
    }

    public void setZsscajah(String zsscajah) {
        this.zsscajah = zsscajah;
    }

    public String getQyzsajah() {
        return qyzsajah;
    }

    public void setQyzsajah(String qyzsajah) {
        this.qyzsajah = qyzsajah;
    }

    public String getBqfhah() {
        return bqfhah;
    }

    public void setBqfhah(String bqfhah) {
        this.bqfhah = bqfhah;
    }

    public String getFyajah() {
        return fyajah;
    }

    public void setFyajah(String fyajah) {
        this.fyajah = fyajah;
    }

    public String getQcsqah() {
        return qcsqah;
    }

    public void setQcsqah(String qcsqah) {
        this.qcsqah = qcsqah;
    }

    public String getYjdah() {
        return yjdah;
    }

    public void setYjdah(String yjdah) {
        this.yjdah = yjdah;
    }

    public String getSxfhajah() {
        return sxfhajah;
    }

    public void setSxfhajah(String sxfhajah) {
        this.sxfhajah = sxfhajah;
    }

    public String getTzzxsxcdah() {
        return tzzxsxcdah;
    }

    public void setTzzxsxcdah(String tzzxsxcdah) {
        this.tzzxsxcdah = tzzxsxcdah;
    }

    public String getDcajah() {
        return dcajah;
    }

    public void setDcajah(String dcajah) {
        this.dcajah = dcajah;
    }

    public String getSasxcpah() {
        return sasxcpah;
    }

    public void setSasxcpah(String sasxcpah) {
        this.sasxcpah = sasxcpah;
    }

    public String getCdysbygxajah() {
        return cdysbygxajah;
    }

    public void setCdysbygxajah(String cdysbygxajah) {
        this.cdysbygxajah = cdysbygxajah;
    }

    public String getDccxajah() {
        return dccxajah;
    }

    public void setDccxajah(String dccxajah) {
        this.dccxajah = dccxajah;
    }

    public String getGscgajah() {
        return gscgajah;
    }

    public void setGscgajah(String gscgajah) {
        this.gscgajah = gscgajah;
    }

    public String getHszqdjyscah() {
        return hszqdjyscah;
    }

    public void setHszqdjyscah(String hszqdjyscah) {
        this.hszqdjyscah = hszqdjyscah;
    }

    public String getZxajah() {
        return zxajah;
    }

    public void setZxajah(String zxajah) {
        this.zxajah = zxajah;
    }

    public String getXzssajah() {
        return xzssajah;
    }

    public void setXzssajah(String xzssajah) {
        this.xzssajah = xzssajah;
    }

    public String getDsrcxzsah() {
        return dsrcxzsah;
    }

    public void setDsrcxzsah(String dsrcxzsah) {
        this.dsrcxzsah = dsrcxzsah;
    }

    public String getTbcxajah() {
        return tbcxajah;
    }

    public void setTbcxajah(String tbcxajah) {
        this.tbcxajah = tbcxajah;
    }

    public String getDwscssajah() {
        return dwscssajah;
    }

    public void setDwscssajah(String dwscssajah) {
        this.dwscssajah = dwscssajah;
    }

    public String getQjsfxzajah() {
        return qjsfxzajah;
    }

    public void setQjsfxzajah(String qjsfxzajah) {
        this.qjsfxzajah = qjsfxzajah;
    }

    public String getSqzsscah() {
        return sqzsscah;
    }

    public void setSqzsscah(String sqzsscah) {
        this.sqzsscah = sqzsscah;
    }

    public String getBscxah() {
        return bscxah;
    }

    public void setBscxah(String bscxah) {
        this.bscxah = bscxah;
    }

    public String getYxgajah() {
        return yxgajah;
    }

    public void setYxgajah(String yxgajah) {
        this.yxgajah = yxgajah;
    }

    public String getXgszajah() {
        return xgszajah;
    }

    public void setXgszajah(String xgszajah) {
        this.xgszajah = xgszajah;
    }

    public String getYrdajah() {
        return yrdajah;
    }

    public void setYrdajah(String yrdajah) {
        this.yrdajah = yrdajah;
    }

    public String getCbpmajah() {
        return cbpmajah;
    }

    public void setCbpmajah(String cbpmajah) {
        this.cbpmajah = cbpmajah;
    }

    public String getSlhspczrxzjj() {
        return slhspczrxzjj;
    }

    public void setSlhspczrxzjj(String slhspczrxzjj) {
        this.slhspczrxzjj = slhspczrxzjj;
    }

    public String getYcpah() {
        return ycpah;
    }

    public void setYcpah(String ycpah) {
        this.ycpah = ycpah;
    }

    public String getSqscah() {
        return sqscah;
    }

    public void setSqscah(String sqscah) {
        this.sqscah = sqscah;
    }

    public String getCdysajah() {
        return cdysajah;
    }

    public void setCdysajah(String cdysajah) {
        this.cdysajah = cdysajah;
    }

    public String getHbslxzpcah() {
        return hbslxzpcah;
    }

    public void setHbslxzpcah(String hbslxzpcah) {
        this.hbslxzpcah = hbslxzpcah;
    }

    public String getYbjjmszyah() {
        return ybjjmszyah;
    }

    public void setYbjjmszyah(String ybjjmszyah) {
        this.ybjjmszyah = ybjjmszyah;
    }

    public String getBhbssah() {
        return bhbssah;
    }

    public void setBhbssah(String bhbssah) {
        this.bhbssah = bhbssah;
    }

    public String getXzysah() {
        return xzysah;
    }

    public void setXzysah(String xzysah) {
        this.xzysah = xzysah;
    }

    public String getMsysah() {
        return msysah;
    }

    public void setMsysah(String msysah) {
        this.msysah = msysah;
    }

    public String getFsscajah() {
        return fsscajah;
    }

    public void setFsscajah(String fsscajah) {
        this.fsscajah = fsscajah;
    }

    public String getBhbslajah() {
        return bhbslajah;
    }

    public void setBhbslajah(String bhbslajah) {
        this.bhbslajah = bhbslajah;
    }

    public String getXzpcysah() {
        return xzpcysah;
    }

    public void setXzpcysah(String xzpcysah) {
        this.xzpcysah = xzpcysah;
    }

    public String getSpajah() {
        return spajah;
    }

    public void setSpajah(String spajah) {
        this.spajah = spajah;
    }

    public String getSxjdah() {
        return sxjdah;
    }

    public void setSxjdah(String sxjdah) {
        this.sxjdah = sxjdah;
    }

    public String getPcjdajah() {
        return pcjdajah;
    }

    public void setPcjdajah(String pcjdajah) {
        this.pcjdajah = pcjdajah;
    }

    public String getSfzcscah() {
        return sfzcscah;
    }

    public void setSfzcscah(String sfzcscah) {
        this.sfzcscah = sfzcscah;
    }

    public String getSjwfsdjdah() {
        return sjwfsdjdah;
    }

    public void setSjwfsdjdah(String sjwfsdjdah) {
        this.sjwfsdjdah = sjwfsdjdah;
    }

    public String getQzqssqscah() {
        return qzqssqscah;
    }

    public void setQzqssqscah(String qzqssqscah) {
        this.qzqssqscah = qzqssqscah;
    }

    public String getPcsqscah() {
        return pcsqscah;
    }

    public void setPcsqscah(String pcsqscah) {
        this.pcsqscah = pcsqscah;
    }

    public String getQzqsssah() {
        return qzqsssah;
    }

    public void setQzqsssah(String qzqsssah) {
        this.qzqsssah = qzqsssah;
    }

    public String getPcssajah() {
        return pcssajah;
    }

    public void setPcssajah(String pcssajah) {
        this.pcssajah = pcssajah;
    }

    public String getSbqsgsssah() {
        return sbqsgsssah;
    }

    public void setSbqsgsssah(String sbqsgsssah) {
        this.sbqsgsssah = sbqsgsssah;
    }

    public String getSbqsgszcah() {
        return sbqsgszcah;
    }

    public void setSbqsgszcah(String sbqsgszcah) {
        this.sbqsgszcah = sbqsgszcah;
    }

    public String getZwrccbbqah() {
        return zwrccbbqah;
    }

    public void setZwrccbbqah(String zwrccbbqah) {
        this.zwrccbbqah = zwrccbbqah;
    }

    public String getZwrbzxah() {
        return zwrbzxah;
    }

    public void setZwrbzxah(String zwrbzxah) {
        this.zwrbzxah = zwrbzxah;
    }

    public String getSzwrssah() {
        return szwrssah;
    }

    public void setSzwrssah(String szwrssah) {
        this.szwrssah = szwrssah;
    }

    public String getSzwrzcah() {
        return szwrzcah;
    }

    public void setSzwrzcah(String szwrzcah) {
        this.szwrzcah = szwrzcah;
    }

    public String getCxzwrxwah() {
        return cxzwrxwah;
    }

    public void setCxzwrxwah(String cxzwrxwah) {
        this.cxzwrxwah = cxzwrxwah;
    }

    public String getZhzwrccah() {
        return zhzwrccah;
    }

    public void setZhzwrccah(String zhzwrccah) {
        this.zhzwrccah = zhzwrccah;
    }

    public String getQhdbwah() {
        return qhdbwah;
    }

    public void setQhdbwah(String qhdbwah) {
        this.qhdbwah = qhdbwah;
    }

    public String getQqqhccah() {
        return qqqhccah;
    }

    public void setQqqhccah(String qqqhccah) {
        this.qqqhccah = qqqhccah;
    }

    public String getCjczah() {
        return cjczah;
    }

    public void setCjczah(String cjczah) {
        this.cjczah = cjczah;
    }

    public String getQqzwdxah() {
        return qqzwdxah;
    }

    public void setQqzwdxah(String qqzwdxah) {
        this.qqzwdxah = qqzwdxah;
    }

    public String getJcjxhtah() {
        return jcjxhtah;
    }

    public void setJcjxhtah(String jcjxhtah) {
        this.jcjxhtah = jcjxhtah;
    }

    public String getBbsbzqah() {
        return bbsbzqah;
    }

    public void setBbsbzqah(String bbsbzqah) {
        this.bbsbzqah = bbsbzqah;
    }

    public String getRowuuid() {
        return rowuuid;
    }

    public void setRowuuid(String rowuuid) {
        this.rowuuid = rowuuid;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getYaah() {
        return yaah;
    }

    public void setYaah(String yaah) {
        this.yaah = yaah;
    }

    public String getXfyzxbgah() {
        return xfyzxbgah;
    }

    public void setXfyzxbgah(String xfyzxbgah) {
        this.xfyzxbgah = xfyzxbgah;
    }

    public String getJdzyjwzxah() {
        return jdzyjwzxah;
    }

    public void setJdzyjwzxah(String jdzyjwzxah) {
        this.jdzyjwzxah = jdzyjwzxah;
    }

    public String getQcbgscah() {
        return qcbgscah;
    }

    public void setQcbgscah(String qcbgscah) {
        this.qcbgscah = qcbgscah;
    }

    public String getLdzcah() {
        return ldzcah;
    }

    public void setLdzcah(String ldzcah) {
        this.ldzcah = ldzcah;
    }

    public String getSqbqah() {
        return sqbqah;
    }

    public void setSqbqah(String sqbqah) {
        this.sqbqah = sqbqah;
    }

    public String getQzqsajah() {
        return qzqsajah;
    }

    public void setQzqsajah(String qzqsajah) {
        this.qzqsajah = qzqsajah;
    }

    public String getJcyjdajah() {
        return jcyjdajah;
    }

    public void setJcyjdajah(String jcyjdajah) {
        this.jcyjdajah = jcyjdajah;
    }

    @Override
    public String toString() {
        return "EajGlaj{" +
                "ahdm='" + ahdm + '\'' +
                ", saah='" + saah + '\'' +
                ", ysah='" + ysah + '\'' +
                ", bjdajah='" + bjdajah + '\'' +
                ", mswfsdajah='" + mswfsdajah + '\'' +
                ", sjfyajah='" + sjfyajah + '\'' +
                ", gxajah='" + gxajah + '\'' +
                ", ysajah='" + ysajah + '\'' +
                ", fhajah='" + fhajah + '\'' +
                ", sxcpah='" + sxcpah + '\'' +
                ", esajah='" + esajah + '\'' +
                ", zsscajah='" + zsscajah + '\'' +
                ", qyzsajah='" + qyzsajah + '\'' +
                ", bqfhah='" + bqfhah + '\'' +
                ", fyajah='" + fyajah + '\'' +
                ", qcsqah='" + qcsqah + '\'' +
                ", yjdah='" + yjdah + '\'' +
                ", sxfhajah='" + sxfhajah + '\'' +
                ", tzzxsxcdah='" + tzzxsxcdah + '\'' +
                ", dcajah='" + dcajah + '\'' +
                ", sasxcpah='" + sasxcpah + '\'' +
                ", cdysbygxajah='" + cdysbygxajah + '\'' +
                ", dccxajah='" + dccxajah + '\'' +
                ", gscgajah='" + gscgajah + '\'' +
                ", hszqdjyscah='" + hszqdjyscah + '\'' +
                ", zxajah='" + zxajah + '\'' +
                ", xzssajah='" + xzssajah + '\'' +
                ", dsrcxzsah='" + dsrcxzsah + '\'' +
                ", tbcxajah='" + tbcxajah + '\'' +
                ", dwscssajah='" + dwscssajah + '\'' +
                ", qjsfxzajah='" + qjsfxzajah + '\'' +
                ", sqzsscah='" + sqzsscah + '\'' +
                ", bscxah='" + bscxah + '\'' +
                ", yxgajah='" + yxgajah + '\'' +
                ", xgszajah='" + xgszajah + '\'' +
                ", yrdajah='" + yrdajah + '\'' +
                ", cbpmajah='" + cbpmajah + '\'' +
                ", slhspczrxzjj='" + slhspczrxzjj + '\'' +
                ", ycpah='" + ycpah + '\'' +
                ", sqscah='" + sqscah + '\'' +
                ", cdysajah='" + cdysajah + '\'' +
                ", hbslxzpcah='" + hbslxzpcah + '\'' +
                ", ybjjmszyah='" + ybjjmszyah + '\'' +
                ", bhbssah='" + bhbssah + '\'' +
                ", xzysah='" + xzysah + '\'' +
                ", msysah='" + msysah + '\'' +
                ", fsscajah='" + fsscajah + '\'' +
                ", bhbslajah='" + bhbslajah + '\'' +
                ", xzpcysah='" + xzpcysah + '\'' +
                ", spajah='" + spajah + '\'' +
                ", sxjdah='" + sxjdah + '\'' +
                ", pcjdajah='" + pcjdajah + '\'' +
                ", sfzcscah='" + sfzcscah + '\'' +
                ", sjwfsdjdah='" + sjwfsdjdah + '\'' +
                ", qzqssqscah='" + qzqssqscah + '\'' +
                ", pcsqscah='" + pcsqscah + '\'' +
                ", qzqsssah='" + qzqsssah + '\'' +
                ", pcssajah='" + pcssajah + '\'' +
                ", sbqsgsssah='" + sbqsgsssah + '\'' +
                ", sbqsgszcah='" + sbqsgszcah + '\'' +
                ", zwrccbbqah='" + zwrccbbqah + '\'' +
                ", zwrbzxah='" + zwrbzxah + '\'' +
                ", szwrssah='" + szwrssah + '\'' +
                ", szwrzcah='" + szwrzcah + '\'' +
                ", cxzwrxwah='" + cxzwrxwah + '\'' +
                ", zhzwrccah='" + zhzwrccah + '\'' +
                ", qhdbwah='" + qhdbwah + '\'' +
                ", qqqhccah='" + qqqhccah + '\'' +
                ", cjczah='" + cjczah + '\'' +
                ", qqzwdxah='" + qqzwdxah + '\'' +
                ", jcjxhtah='" + jcjxhtah + '\'' +
                ", bbsbzqah='" + bbsbzqah + '\'' +
                ", rowuuid='" + rowuuid + '\'' +
                ", lastupdate=" + lastupdate +
                ", fydm='" + fydm + '\'' +
                ", yaah='" + yaah + '\'' +
                ", xfyzxbgah='" + xfyzxbgah + '\'' +
                ", jdzyjwzxah='" + jdzyjwzxah + '\'' +
                ", qcbgscah='" + qcbgscah + '\'' +
                ", ldzcah='" + ldzcah + '\'' +
                ", sqbqah='" + sqbqah + '\'' +
                ", qzqsajah='" + qzqsajah + '\'' +
                ", jcyjdajah='" + jcyjdajah + '\'' +
                '}';
    }
}
