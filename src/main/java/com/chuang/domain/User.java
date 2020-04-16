package com.chuang.domain;

/**
 * @author chuang
 * @date 2020/04/16 - 20:38
 */
public class User {
    private String name;

    private String password;

    Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
