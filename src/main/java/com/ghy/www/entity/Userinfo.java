package com.ghy.www.entity;

import java.util.Date;
import java.util.Objects;

public class Userinfo {

    private Integer id;


    private String username;


    private String password;


    private Integer age;


    private Date insertdate;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public Date getInsertdate() {
        return insertdate;
    }


    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", insertdate=" + insertdate +
                '}';
    }

    public Userinfo() {
    }

    public Userinfo(Integer id, String username, String password, Integer age, Date insertdate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.insertdate = insertdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Userinfo)) return false;
        Userinfo userinfo = (Userinfo) o;
        return Objects.equals(id, userinfo.id) && Objects.equals(username, userinfo.username) && Objects.equals(password, userinfo.password) && Objects.equals(age, userinfo.age) && Objects.equals(insertdate, userinfo.insertdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, age, insertdate);
    }
}