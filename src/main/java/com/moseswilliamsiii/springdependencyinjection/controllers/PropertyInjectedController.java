package com.moseswilliamsiii.springdependencyinjection.controllers;

import com.moseswilliamsiii.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
