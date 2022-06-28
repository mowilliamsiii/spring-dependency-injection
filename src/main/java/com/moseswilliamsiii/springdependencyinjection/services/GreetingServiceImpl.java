package com.moseswilliamsiii.springdependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World";
    }
}
