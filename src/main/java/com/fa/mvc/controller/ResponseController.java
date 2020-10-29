package com.fa.mvc.controller;

import com.fa.mvc.entity.Address;
import com.fa.mvc.entity.ResponseEntity;
import com.fa.mvc.entity.User;
import com.fa.mvc.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class ResponseController {
    @GetMapping("/hello/{id}")
    public ResponseEntity<User> hello(@PathVariable int id){
        System.out.println(id);
        ResponseEntity<User> responseEntity = new ResponseEntity<>();
        responseEntity.setStatus("200");
        responseEntity.setMessage("成功！");
        responseEntity.setData(new User("zs","20",new Address("admin","admin")));
        return responseEntity;
    }
    @GetMapping("/list/{page}/{size}")
    public ResponseEntity<User> list(@PathVariable int page,@PathVariable int size){
        System.out.println(page);
        System.out.println(size);
        ResponseEntity<User> userResponseEntity = new ResponseEntity<>();
        userResponseEntity.setStatus("200");
        userResponseEntity.setMessage("成功");
        userResponseEntity.setData(new User("ls","21",new Address("user","user")));
        return userResponseEntity;
    }
}

