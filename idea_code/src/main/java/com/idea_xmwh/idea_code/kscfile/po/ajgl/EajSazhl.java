package com.idea_xmwh.idea_code.kscfile.po.ajgl;



import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * <p>
 * 涉案专利
 * </p>
 *
 * @author cq
 * @since 2019-11-04
 */
@TableName("EAJ_SAZHL")
public class EajSazhl  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "AHDM",type = IdType.INPUT)
    private String ahdm;
    @TableField("XH")
    private Integer xh;
    @TableField("ZHLMC")
    private String zhlmc;
    @TableField("ZHLH")
    private String zhlh;
    @TableField("FYDM")
    private String fydm;
    @TableField(value = "ROWUUID", fill = FieldFill.INSERT)
    private String rowuuid;
    @TableField(value = "LASTUPDATE",fill = FieldFill.INSERT_UPDATE)
    private Date lastupdate;


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

    public String getZhlmc() {
        return zhlmc;
    }

    public void setZhlmc(String zhlmc) {
        this.zhlmc = zhlmc;
    }

    public String getZhlh() {
        return zhlh;
    }

    public void setZhlh(String zhlh) {
        this.zhlh = zhlh;
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

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }
}
