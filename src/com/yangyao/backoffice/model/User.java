package com.yangyao.backoffice.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Arrays;
import java.util.Date;

public class User {
    private String username;
    private String password;
    private String gender;
    private String age;
    private int[] hobbyIds;
    private String birthday;
    private Date date;
    private Integer id;

    public User(String username, String gender, String age, Integer id) {
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int[] getHobbyIds() {
        return hobbyIds;
    }

    public void setHobbyIds(int[] hobbyIds) {
        this.hobbyIds = hobbyIds;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", hobbyIds=" + Arrays.toString(hobbyIds) +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
