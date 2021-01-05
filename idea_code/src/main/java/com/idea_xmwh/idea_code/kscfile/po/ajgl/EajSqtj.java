package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @Description 案件诉前调解数据项
 * @author 邱萌
 * @Date 2020-7-2 10:52
 * @Version 1.0
 **/
@TableName("EAJ_SQTJ")
public class EajSqtj {
    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("TJRLB")
    private String tjrlb;
    @TableField("TJDW")
    private String tjdw;
    @TableField("TJR")
    private String tjr;
    @TableField("SFYQ")
    private String sfyq;
    @TableField("SFLX")
    private String sflx;
    @TableField("LXQK")
    private String lxqk;
    @TableField("SFZFL")
    private String sfzfl;
    @TableField("LAAHDM")
    private String laahdm;
    @TableField("LAAH")
    private String laah;
    @TableField("FYDM")
    private String fydm;
    @TableField("ZLA")
    private String zla;
    @TableField("IS_DELETED")
    private Integer is_deleted;
    @TableField("CREATE_BY")
    private String create_by;
    @TableField("UPDATE_BY")
    private String update_by;
    @TableField("GMT_CREAT")
    private Date gmt_creat;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAhdm() {
        return ahdm;
    }

    public void setAhdm(String ahdm) {
        this.ahdm = ahdm;
    }

    public String getTjrlb() {
        return tjrlb;
    }

    public void setTjrlb(String tjrlb) {
        this.tjrlb = tjrlb;
    }

    public String getTjdw() {
        return tjdw;
    }

    public void setTjdw(String tjdw) {
        this.tjdw = tjdw;
    }

    public String getTjr() {
        return tjr;
    }

    public void setTjr(String tjr) {
        this.tjr = tjr;
    }

    public String getSfyq() {
        return sfyq;
    }

    public void setSfyq(String sfyq) {
        this.sfyq = sfyq;
    }

    public String getSflx() {
        return sflx;
    }

    public void setSflx(String sflx) {
        this.sflx = sflx;
    }

    public String getLxqk() {
        return lxqk;
    }

    public void setLxqk(String lxqk) {
        this.lxqk = lxqk;
    }

    public String getSfzfl() {
        return sfzfl;
    }

    public void setSfzfl(String sfzfl) {
        this.sfzfl = sfzfl;
    }

    public String getLaahdm() {
        return laahdm;
    }

    public void setLaahdm(String laahdm) {
        this.laahdm = laahdm;
    }

    public String getLaah() {
        return laah;
    }

    public void setLaah(String laah) {
        this.laah = laah;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getZla() {
        return zla;
    }

    public void setZla(String zla) {
        this.zla = zla;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(Date gmt_creat) {
        this.gmt_creat = gmt_creat;
    }

    @Override
    public String toString() {
        return "EajSqtj{" +
                "ahdm='" + ahdm + '\'' +
                ", tjrlb='" + tjrlb + '\'' +
                ", tjdw='" + tjdw + '\'' +
                ", tjr='" + tjr + '\'' +
                ", sfyq='" + sfyq + '\'' +
                ", sflx='" + sflx + '\'' +
                ", lxqk='" + lxqk + '\'' +
                ", sfzfl='" + sfzfl + '\'' +
                ", laahdm='" + laahdm + '\'' +
                ", laah='" + laah + '\'' +
                ", fydm='" + fydm + '\'' +
                ", zla='" + zla + '\'' +
                ", is_deleted=" + is_deleted +
                ", create_by='" + create_by + '\'' +
                ", update_by='" + update_by + '\'' +
                ", gmt_creat=" + gmt_creat +
                '}';
    }
}
