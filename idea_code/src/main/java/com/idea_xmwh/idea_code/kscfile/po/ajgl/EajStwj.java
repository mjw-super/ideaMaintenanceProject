package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import java.util.Date;

/**
 * 案件实体文件
 * Created by 熊伟 on 2019/12/6.
 */
public class EajStwj {
    private String ahdm;
    private Integer xh;
    private Integer hdid;
    private String fydm;
    private String clbt;
    private String sfkz;
    private String ysid;
    private String jzxh;
    private String ywxh;
    private Date lastupdate;
    private Integer wjys;
    private Integer wjfs;
    private Integer wjjs;
    private Integer wjcs;
    private Integer clid;
    private String yjfyj;
    private Integer wjsl;
    private String clxs;
    private String sfsb;
    private String ocrtext;

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }


    public Integer getHdid() {
        return hdid;
    }

    public void setHdid(Integer hdid) {
        this.hdid = hdid;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getClbt() {
        return clbt;
    }

    public void setClbt(String clbt) {
        this.clbt = clbt;
    }

    public String getSfkz() {
        return sfkz;
    }

    public void setSfkz(String sfkz) {
        this.sfkz = sfkz;
    }

    public String getYsid() {
        return ysid;
    }

    public void setYsid(String ysid) {
        this.ysid = ysid;
    }

    public String getJzxh() {
        return jzxh;
    }

    public void setJzxh(String jzxh) {
        this.jzxh = jzxh;
    }

    public String getYwxh() {
        return ywxh;
    }

    public void setYwxh(String ywxh) {
        this.ywxh = ywxh;
    }

    public Integer getWjys() {
        return wjys;
    }

    public void setWjys(Integer wjys) {
        this.wjys = wjys;
    }

    public Integer getWjfs() {
        return wjfs;
    }

    public void setWjfs(Integer wjfs) {
        this.wjfs = wjfs;
    }

    public Integer getWjjs() {
        return wjjs;
    }

    public void setWjjs(Integer wjjs) {
        this.wjjs = wjjs;
    }

    public Integer getWjcs() {
        return wjcs;
    }

    public void setWjcs(Integer wjcs) {
        this.wjcs = wjcs;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getYjfyj() {
        return yjfyj;
    }

    public void setYjfyj(String yjfyj) {
        this.yjfyj = yjfyj;
    }

    public Integer getWjsl() {
        return wjsl;
    }

    public void setWjsl(Integer wjsl) {
        this.wjsl = wjsl;
    }

    public String getClxs() {
        return clxs;
    }

    public void setClxs(String clxs) {
        this.clxs = clxs;
    }

    public String getSfsb() {
        return sfsb;
    }

    public void setSfsb(String sfsb) {
        this.sfsb = sfsb;
    }

    public String getOcrtext() {
        return ocrtext;
    }

    public void setOcrtext(String ocrtext) {
        this.ocrtext = ocrtext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EajStwj eajStwj = (EajStwj) o;

        if (ahdm != null ? !ahdm.equals(eajStwj.ahdm) : eajStwj.ahdm != null) {
            return false;
        }
        if (xh != null ? !xh.equals(eajStwj.xh) : eajStwj.xh != null) {
            return false;
        }
        if (hdid != null ? !hdid.equals(eajStwj.hdid) : eajStwj.hdid != null) {
            return false;
        }
        if (fydm != null ? !fydm.equals(eajStwj.fydm) : eajStwj.fydm != null) {
            return false;
        }
        if (clbt != null ? !clbt.equals(eajStwj.clbt) : eajStwj.clbt != null) {
            return false;
        }
        if (sfkz != null ? !sfkz.equals(eajStwj.sfkz) : eajStwj.sfkz != null) {
            return false;
        }
        if (ysid != null ? !ysid.equals(eajStwj.ysid) : eajStwj.ysid != null) {
            return false;
        }
        if (jzxh != null ? !jzxh.equals(eajStwj.jzxh) : eajStwj.jzxh != null) {
            return false;
        }
        if (ywxh != null ? !ywxh.equals(eajStwj.ywxh) : eajStwj.ywxh != null) {
            return false;
        }
        if (lastupdate != null ? !lastupdate.equals(eajStwj.lastupdate) : eajStwj.lastupdate != null) {
            return false;
        }
        if (wjys != null ? !wjys.equals(eajStwj.wjys) : eajStwj.wjys != null) {
            return false;
        }
        if (wjfs != null ? !wjfs.equals(eajStwj.wjfs) : eajStwj.wjfs != null) {
            return false;
        }
        if (wjjs != null ? !wjjs.equals(eajStwj.wjjs) : eajStwj.wjjs != null) {
            return false;
        }
        if (wjcs != null ? !wjcs.equals(eajStwj.wjcs) : eajStwj.wjcs != null) {
            return false;
        }
        if (clid != null ? !clid.equals(eajStwj.clid) : eajStwj.clid != null) {
            return false;
        }
        if (yjfyj != null ? !yjfyj.equals(eajStwj.yjfyj) : eajStwj.yjfyj != null) {
            return false;
        }
        if (wjsl != null ? !wjsl.equals(eajStwj.wjsl) : eajStwj.wjsl != null) {
            return false;
        }
        if (clxs != null ? !clxs.equals(eajStwj.clxs) : eajStwj.clxs != null) {
            return false;
        }
        if (sfsb != null ? !sfsb.equals(eajStwj.sfsb) : eajStwj.sfsb != null) {
            return false;
        }
        if (ocrtext != null ? !ocrtext.equals(eajStwj.ocrtext) : eajStwj.ocrtext != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = ahdm != null ? ahdm.hashCode() : 0;
        result = 31 * result + (xh != null ? xh.hashCode() : 0);
        result = 31 * result + (hdid != null ? hdid.hashCode() : 0);
        result = 31 * result + (fydm != null ? fydm.hashCode() : 0);
        result = 31 * result + (clbt != null ? clbt.hashCode() : 0);
        result = 31 * result + (sfkz != null ? sfkz.hashCode() : 0);
        result = 31 * result + (ysid != null ? ysid.hashCode() : 0);
        result = 31 * result + (jzxh != null ? jzxh.hashCode() : 0);
        result = 31 * result + (ywxh != null ? ywxh.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (wjys != null ? wjys.hashCode() : 0);
        result = 31 * result + (wjfs != null ? wjfs.hashCode() : 0);
        result = 31 * result + (wjjs != null ? wjjs.hashCode() : 0);
        result = 31 * result + (wjcs != null ? wjcs.hashCode() : 0);
        result = 31 * result + (clid != null ? clid.hashCode() : 0);
        result = 31 * result + (yjfyj != null ? yjfyj.hashCode() : 0);
        result = 31 * result + (wjsl != null ? wjsl.hashCode() : 0);
        result = 31 * result + (clxs != null ? clxs.hashCode() : 0);
        result = 31 * result + (sfsb != null ? sfsb.hashCode() : 0);
        result = 31 * result + (ocrtext != null ? ocrtext.hashCode() : 0);
        return result;
    }
}
