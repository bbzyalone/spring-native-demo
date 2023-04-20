package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/one")
    public Object test(){
        System.out.println("哈哈哈哈");
        return "ahhahaha";
    }
}
