package com.heartrozw.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user1")
public class User {
    private String name;
    private int age;
    private List<String> roles;
    private Map<String, String> resources;
    private String operationCount;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                ", resources=" + resources +
                ", operationCount='" + operationCount + '\'' +
                ", role=" + role +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Map<String, String> getResources() {
        return resources;
    }

    public void setResources(Map<String, String> resources) {
        this.resources = resources;
    }

    public String getOperationCount() {
        return operationCount;
    }

    public void setOperationCount(String operationCount) {
        this.operationCount = operationCount;
    }

    //    __________________________________________________________________________________________

//    这里将role对象自动装配到user对象中
//    @Autowired
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
