package com.tdh.light.spxt.bp.po.system;

/**
 * Created by 熊伟 on 2019/12/17.
 */
public class TuFylj {
    private String fydm;
    private String fymc;
    private String yzdz;
    private String dbip;
    private String dbport;
    private String dbfname;
    private String dbuser;
    private String dbpass;
    private String cwurl;
    private String spxt;
    private String frame;
    private String jzglurl;
    private String spjkurl;
    private String jzjkurl;
    private String zxajzs;
    private String spjkgwurl;
    private String zxjkurl;

    public String getZxjkurl() {
        return zxjkurl;
    }

    public void setZxjkurl(String zxjkurl) {
        this.zxjkurl = zxjkurl;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public String getFymc() {
        return fymc;
    }

    public void setFymc(String fymc) {
        this.fymc = fymc;
    }

    public String getYzdz() {
        return yzdz;
    }

    public void setYzdz(String yzdz) {
        this.yzdz = yzdz;
    }

    public String getDbip() {
        return dbip;
    }

    public void setDbip(String dbip) {
        this.dbip = dbip;
    }

    public String getDbport() {
        return dbport;
    }

    public void setDbport(String dbport) {
        this.dbport = dbport;
    }

    public String getDbfname() {
        return dbfname;
    }

    public void setDbfname(String dbfname) {
        this.dbfname = dbfname;
    }

    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public String getDbpass() {
        return dbpass;
    }

    public void setDbpass(String dbpass) {
        this.dbpass = dbpass;
    }

    public String getCwurl() {
        return cwurl;
    }

    public void setCwurl(String cwurl) {
        this.cwurl = cwurl;
    }

    public String getSpxt() {
        return spxt;
    }

    public void setSpxt(String spxt) {
        this.spxt = spxt;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getJzglurl() {
        return jzglurl;
    }

    public void setJzglurl(String jzglurl) {
        this.jzglurl = jzglurl;
    }

    public String getSpjkurl() {
        return spjkurl;
    }

    public void setSpjkurl(String spjkurl) {
        this.spjkurl = spjkurl;
    }

    public String getJzjkurl() {
        return jzjkurl;
    }

    public void setJzjkurl(String jzjkurl) {
        this.jzjkurl = jzjkurl;
    }

    public String getZxajzs() {
        return zxajzs;
    }

    public void setZxajzs(String zxajzs) {
        this.zxajzs = zxajzs;
    }

    public String getSpjkgwurl() {
        return spjkgwurl;
    }

    public void setSpjkgwurl(String spjkgwurl) {
        this.spjkgwurl = spjkgwurl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TuFylj tuFylj = (TuFylj) o;

        if (fydm != null ? !fydm.equals(tuFylj.fydm) : tuFylj.fydm != null) {
            return false;
        }
        if (fymc != null ? !fymc.equals(tuFylj.fymc) : tuFylj.fymc != null) {
            return false;
        }
        if (yzdz != null ? !yzdz.equals(tuFylj.yzdz) : tuFylj.yzdz != null) {
            return false;
        }
        if (dbip != null ? !dbip.equals(tuFylj.dbip) : tuFylj.dbip != null) {
            return false;
        }
        if (dbport != null ? !dbport.equals(tuFylj.dbport) : tuFylj.dbport != null) {
            return false;
        }
        if (dbfname != null ? !dbfname.equals(tuFylj.dbfname) : tuFylj.dbfname != null) {
            return false;
        }
        if (dbuser != null ? !dbuser.equals(tuFylj.dbuser) : tuFylj.dbuser != null) {
            return false;
        }
        if (dbpass != null ? !dbpass.equals(tuFylj.dbpass) : tuFylj.dbpass != null) {
            return false;
        }
        if (cwurl != null ? !cwurl.equals(tuFylj.cwurl) : tuFylj.cwurl != null) {
            return false;
        }
        if (spxt != null ? !spxt.equals(tuFylj.spxt) : tuFylj.spxt != null) {
            return false;
        }
        if (frame != null ? !frame.equals(tuFylj.frame) : tuFylj.frame != null) {
            return false;
        }
        if (jzglurl != null ? !jzglurl.equals(tuFylj.jzglurl) : tuFylj.jzglurl != null) {
            return false;
        }
        if (spjkurl != null ? !spjkurl.equals(tuFylj.spjkurl) : tuFylj.spjkurl != null) {
            return false;
        }
        if (jzjkurl != null ? !jzjkurl.equals(tuFylj.jzjkurl) : tuFylj.jzjkurl != null) {
            return false;
        }
        if (zxajzs != null ? !zxajzs.equals(tuFylj.zxajzs) : tuFylj.zxajzs != null) {
            return false;
        }
        if (spjkgwurl != null ? !spjkgwurl.equals(tuFylj.spjkgwurl) : tuFylj.spjkgwurl != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = fydm != null ? fydm.hashCode() : 0;
        result = 31 * result + (fymc != null ? fymc.hashCode() : 0);
        result = 31 * result + (yzdz != null ? yzdz.hashCode() : 0);
        result = 31 * result + (dbip != null ? dbip.hashCode() : 0);
        result = 31 * result + (dbport != null ? dbport.hashCode() : 0);
        result = 31 * result + (dbfname != null ? dbfname.hashCode() : 0);
        result = 31 * result + (dbuser != null ? dbuser.hashCode() : 0);
        result = 31 * result + (dbpass != null ? dbpass.hashCode() : 0);
        result = 31 * result + (cwurl != null ? cwurl.hashCode() : 0);
        result = 31 * result + (spxt != null ? spxt.hashCode() : 0);
        result = 31 * result + (frame != null ? frame.hashCode() : 0);
        result = 31 * result + (jzglurl != null ? jzglurl.hashCode() : 0);
        result = 31 * result + (spjkurl != null ? spjkurl.hashCode() : 0);
        result = 31 * result + (jzjkurl != null ? jzjkurl.hashCode() : 0);
        result = 31 * result + (zxajzs != null ? zxajzs.hashCode() : 0);
        result = 31 * result + (spjkgwurl != null ? spjkgwurl.hashCode() : 0);
        return result;
    }
}
