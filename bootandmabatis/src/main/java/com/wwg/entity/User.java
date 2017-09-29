package com.wwg.entity;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-09-29
 */
public class User implements java.io.Serializable {

    // Fields

    private Long userId;
    private Integer age;
    private String username;

    // Constructors

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * full constructor
     */
    public User(Integer age, String username) {
        this.age = age;
        this.username = username;
    }

    // Property accessors

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}