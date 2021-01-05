package com.idea_xmwh.idea_code.kscfile.po.ajgl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 *
 * </p>
 * @author XiongWei
 * @since 2019-11-04
 */
@TableName("TS_LASPJL")
public class TsLaspjl {


    @TableField("AJBM")
    private String ajbm;
    @TableField("SPJL")
    private String spjl;
    @TableField("WSID")
    private Long wsid;
    @TableField("JAFS")
    private String jafs;
    @TableField("JASY")
    private String jasy;
    @TableField("JAFSN")
    private String jafsn;


    public String getAjbm() {
        return ajbm;
    }

    public void setAjbm(String ajbm) {
        this.ajbm = ajbm;
    }

    public String getSpjl() {
        return spjl;
    }

    public void setSpjl(String spjl) {
        this.spjl = spjl;
    }

    public Long getWsid() {
        return wsid;
    }

    public void setWsid(Long wsid) {
        this.wsid = wsid;
    }

    public String getJafs() {
        return jafs;
    }

    public void setJafs(String jafs) {
        this.jafs = jafs;
    }

    public String getJasy() {
        return jasy;
    }

    public void setJasy(String jasy) {
        this.jasy = jasy;
    }

    public String getJafsn() {
        return jafsn;
    }

    public void setJafsn(String jafsn) {
        this.jafsn = jafsn;
    }

    @Override
    public String toString() {
        return "TsLaspjl{" +
                "ajbm=" + ajbm +
                ", spjl=" + spjl +
                ", wsid=" + wsid +
                ", jafs=" + jafs +
                ", jasy=" + jasy +
                ", jafsn=" + jafsn +
                "}";
    }
}
