package com.petproject.mono.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class User {

    private long id;
    private String fullName;
    private int age;


    public User() {

    }

    public User(long id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    @Bean
    User newUser(){
        return new User();
    }


    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }
}

