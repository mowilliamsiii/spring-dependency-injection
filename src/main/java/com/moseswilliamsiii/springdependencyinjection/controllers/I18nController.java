package com.moseswilliamsiii.springdependencyinjection.controllers;

import com.moseswilliamsiii.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    @Qualifier("i18nService")
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting(){
        return greetingService.sayGreeting();
    }
}
