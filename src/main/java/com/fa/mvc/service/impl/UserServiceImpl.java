package com.fa.mvc.service.impl;

import com.fa.mvc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void show() {
        System.out.println("show");
    }
}
