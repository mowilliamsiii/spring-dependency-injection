package com.moseswilliamsiii.springdependencyinjection;

import com.moseswilliamsiii.springdependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        PrimaryController primaryController = (PrimaryController) context.getBean("primaryController");

        String greeting = primaryController.getGreeting();

        System.out.println(greeting);

        System.out.println("===============18N ENGLISH/SPANISH=======================");

        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.greeting());

        System.out.println("==========Property=========================");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("==========Setter=========================");

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("==========Constructor=========================");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
