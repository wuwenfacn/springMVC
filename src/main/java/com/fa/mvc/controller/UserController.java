package com.fa.mvc.controller;

import com.fa.mvc.entity.Address;
import com.fa.mvc.entity.User;
import com.fa.mvc.service.UserService;
import com.fa.mvc.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    @ResponseBody
    /*
    public User address(){
        return new User();
    }*/
    /*基本数据类型*/
    /*public String hello(String username, String password){
        System.out.println(username);
        System.out.println(password);
        return username+","+password;
    }*/
    /*接收对象参数*/
    /*public Address hello(Address address){
        System.out.println(address);
        return new Address();
    }*/
    /*接收复杂的对象*/
    /*public User hello(User user){
        System.out.println(user);
        System.out.println(user.getAddress().getUsername());
        System.out.println(user.getAddress().getPassword());
        return new User();
    }*/
    /*接收数组元素*/
    /*public String hello(int[] arr){
        System.out.println(arr);
        return "hello";
    }*/
    /*接收内置对象*/
    public String hello(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request.toString());
        System.out.println(response.toString());
        System.out.println(session.toString());
        return "hello";
    }
}
