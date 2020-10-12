package com.tdh.light.spxt.bp.po.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 标准代码
 * </p>
 * @author XiongWei
 * @since 2019-10-14
 */
@TableName("TS_BZDM")
public class TsBzdm {
    @TableId(value = "KIND")
    private String kind;
    @TableField("BT")
    private String bt;
    @TableId(value = "CODE")
    private String code;
    @TableField("MC")
    private String mc;
    @TableField("FDM")
    private String fdm;
    @TableField("SFJY")
    private String sfjy;
    @TableField("PXH")
    private Long pxh;
    @TableField("CODENOW")
    private String codenow;
    @TableField("VER")
    private String ver;
    @TableField("KIN09")
    private String kin09;
    @TableField("V2014CODE")
    private String v2014code;
    @TableField("SFKZ")
    private String sfkz;
    @TableField("V2009CODE")
    private String v2009code;
    @TableField("JASYMC")
    private String jasymc;
    @TableField("JASY")
    private String jasy;
    @TableField("JASYKIND")
    private String jasykind;
    @TableField("V2015CODE")
    private String v2015code;
    @TableField("GLCODE")
    private String glcode;
    @TableField("EJKIND")
    private String ejkind;
    @TableField("JAEJSYMC")
    private String jaejsymc;
    @TableField("GPFHSY2")
    private String gpfhsy2;
    @TableField("SFQZLAJS")
    private String sfqzlajs;


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getFdm() {
        return fdm;
    }

    public void setFdm(String fdm) {
        this.fdm = fdm;
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy;
    }

    public Long getPxh() {
        return pxh;
    }

    public void setPxh(Long pxh) {
        this.pxh = pxh;
    }

    public String getCodenow() {
        return codenow;
    }

    public void setCodenow(String codenow) {
        this.codenow = codenow;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getKin09() {
        return kin09;
    }

    public void setKin09(String kin09) {
        this.kin09 = kin09;
    }

    public String getV2014code() {
        return v2014code;
    }

    public void setV2014code(String v2014code) {
        this.v2014code = v2014code;
    }

    public String getSfkz() {
        return sfkz;
    }

    public void setSfkz(String sfkz) {
        this.sfkz = sfkz;
    }

    public String getV2009code() {
        return v2009code;
    }

    public void setV2009code(String v2009code) {
        this.v2009code = v2009code;
    }

    public String getJasymc() {
        return jasymc;
    }

    public void setJasymc(String jasymc) {
        this.jasymc = jasymc;
    }

    public String getJasy() {
        return jasy;
    }

    public void setJasy(String jasy) {
        this.jasy = jasy;
    }

    public String getJasykind() {
        return jasykind;
    }

    public void setJasykind(String jasykind) {
        this.jasykind = jasykind;
    }

    public String getV2015code() {
        return v2015code;
    }

    public void setV2015code(String v2015code) {
        this.v2015code = v2015code;
    }

    public String getGlcode() {
        return glcode;
    }

    public void setGlcode(String glcode) {
        this.glcode = glcode;
    }

    public String getEjkind() {
        return ejkind;
    }

    public void setEjkind(String ejkind) {
        this.ejkind = ejkind;
    }

    public String getJaejsymc() {
        return jaejsymc;
    }

    public void setJaejsymc(String jaejsymc) {
        this.jaejsymc = jaejsymc;
    }

    public String getGpfhsy2() {
        return gpfhsy2;
    }

    public void setGpfhsy2(String gpfhsy2) {
        this.gpfhsy2 = gpfhsy2;
    }

    public String getSfqzlajs() {
        return sfqzlajs;
    }

    public void setSfqzlajs(String sfqzlajs) {
        this.sfqzlajs = sfqzlajs;
    }

    @Override
    public String toString() {
        return "TsBzdm{" +
                "kind=" + kind +
                ", bt=" + bt +
                ", code=" + code +
                ", mc=" + mc +
                ", fdm=" + fdm +
                ", sfjy=" + sfjy +
                ", pxh=" + pxh +
                ", codenow=" + codenow +
                ", ver=" + ver +
                ", kin09=" + kin09 +
                ", v2014code=" + v2014code +
                ", sfkz=" + sfkz +
                ", v2009code=" + v2009code +
                ", jasymc=" + jasymc +
                ", jasy=" + jasy +
                ", jasykind=" + jasykind +
                ", v2015code=" + v2015code +
                ", glcode=" + glcode +
                ", ejkind=" + ejkind +
                ", jaejsymc=" + jaejsymc +
                ", gpfhsy2=" + gpfhsy2 +
                ", sfqzlajs=" + sfqzlajs +
                "}";
    }
}
