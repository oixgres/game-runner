package com.example.gamerunner.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch a Spring Context
        try (var context =
             new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2. Configure the things that we want Spring to manage - @Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            /*System.out.println(context.getBean("person2"));
            System.out.println(context.getBean(Person.class)); // you can get a bean by its class*/
            System.out.println(context.getBean("person2"));

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}