package com.yangyao.backoffice.model;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @XmlRootElement(name="student")请求返回xml类型要加这个
 */
@XmlRootElement(name="student")
public class Student {
    private String name;
    private String gender;

    public Student() {
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
