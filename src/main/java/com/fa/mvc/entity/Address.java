package com.fa.mvc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Address implements Serializable {
    private String username;
    private String password;

    public Address(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
