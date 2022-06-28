package com.moseswilliamsiii.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    /**
     * This method is used to return a string greeting
     * @return
     */
    public String hello(){
        System.out.println("Hello, World");
        return "Hello";
    }
}
