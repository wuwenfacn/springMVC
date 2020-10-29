package com.fa.mvc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseEntity<T> implements Serializable {
    private String status;
    private String message;
    private T data;
}
