package com.idea_xmwh.idea_code.app.po;

import java.io.Serializable;

/**
 * @Description
 * @ClassName User
 * @Author Mengjw
 * @date 2020.09.10 15:58
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
