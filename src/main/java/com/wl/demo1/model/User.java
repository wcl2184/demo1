package com.wl.demo1.model;

import java.util.Date;

public class User {
    private String name;
    private String password;
    private Date createTime;
    //添加了一个注释12333123123eeeee
    //添加了第二个注释123123123
    //加一条v 212
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
}
