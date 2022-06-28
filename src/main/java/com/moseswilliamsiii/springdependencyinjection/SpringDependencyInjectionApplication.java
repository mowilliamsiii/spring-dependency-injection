package com.moseswilliamsiii.springdependencyinjection;

import com.moseswilliamsiii.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.hello();

        System.out.println(greeting);
    }

}
