package com.xizhicheng.mybatis.dto.request;

import lombok.Data;


public class UserCreatReq {
    private String name;
    private Integer age;
    private String pwd;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
