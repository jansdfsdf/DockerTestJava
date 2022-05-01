package com.example.dockertestjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BaseController {

    public BaseController(){
        System.out.println("hi");
    }

    @GetMapping("/main")
    public String getMain(){
        return "HelloSpring";
    }
}
