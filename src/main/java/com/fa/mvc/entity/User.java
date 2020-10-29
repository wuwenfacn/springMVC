package com.fa.mvc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {
    private String name;
    private String age;
    private Address address;

    public User(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
