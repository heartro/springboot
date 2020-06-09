package com.heartrozw.entity;

import java.util.Date;

public class User {

    public static int incrementId = 1000;

    private int id;
    private String name;
    private int sex;
    private Date hireDate;

    public User() {
    }
    public User(String name, int sex, Date hireDate) {
        this.id = incrementId++;
        this.name = name;
        this.sex = sex;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
