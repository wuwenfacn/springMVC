package com.fa.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/request")
public class RequestParamController {
    @PostMapping("/hello")
    @ResponseBody
    /*public String hello(@RequestParam("user_name") String username){
        System.out.println(username);
        return "我在这里！";
    }*/
    /*public String hello(@RequestParam("user_name") String username,
                        @RequestParam(value = "user_age",required = false)String userAge,
                        @RequestParam(value = "user_sex",required = false,defaultValue = "男")String userSex){
        System.out.println(username);
        System.out.println(userAge);
        System.out.println(userSex);
        return "我在这里！";
    }*/
    public String hello(@RequestHeader String username){
        System.out.println(username);
        return "我在这里！";
    }
}
