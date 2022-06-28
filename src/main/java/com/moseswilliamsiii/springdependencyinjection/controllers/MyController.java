package com.moseswilliamsiii.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello, World");
        return "Hello";
    }
}
