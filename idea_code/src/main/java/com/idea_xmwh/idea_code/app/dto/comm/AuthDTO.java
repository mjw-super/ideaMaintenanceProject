package com.idea_xmwh.idea_code.app.dto.comm;

import java.io.Serializable;

/**
 * 认证对象
 * Created by mengjw on 2020/9/5
 */
public class AuthDTO implements Serializable {
    private static final long serialVersionUID = -7151541777884241923L;
    private String name ;

    private String username;

    private String password;

    private String remark;

    private String ip;

    public AuthDTO(){

    }
    public AuthDTO(String name,String username,String password,String remark,String ip){
        this.name = name;
        this.username = username;
        this.password = password;
        this.remark = remark;
        this.ip = ip;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
