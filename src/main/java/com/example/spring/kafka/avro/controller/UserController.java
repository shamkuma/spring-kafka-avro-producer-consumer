package com.example.spring.kafka.avro.controller;

import com.example.spring.kafka.avro.producer.Producer;
import com.example.spring.kafka.avro.schema.User;
import com.example.spring.kafka.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Producer producer;
    @PostMapping("/sendUserDetails")
    public void sendUser(@RequestBody UserModel model){
        User user =  User.newBuilder().build();
        user.setUserId(model.getUserId());
        user.setUserName(model.getUserName());
        user.setUserAddress(model.getUserAddress());
        user.setCompanyName(model.getCompanyName());
        user.setSalary(model.getSalary());
        producer.publishUser(user);
    }
}
