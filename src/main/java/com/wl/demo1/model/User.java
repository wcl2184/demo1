package com.wl.demo1.model;

import java.util.Date;

public class User {
    //qqq
    private String id;
    private String name;
    private String password;
    private Date createTime;

    private String nename;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNename() {
        return nename;
    }

    public void setNename(String nename) {
        this.nename = nename;
    }
}
