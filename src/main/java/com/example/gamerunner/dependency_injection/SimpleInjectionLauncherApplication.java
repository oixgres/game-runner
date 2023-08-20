package com.example.gamerunner.game_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


// Example of simple injection
@Configuration
@ComponentScan(value = "com.example.gamerunner.game")
public class SimpleInjectionLauncherApplication {
    public static void main(String[] args) {
        try(
                var context = new AnnotationConfigApplicationContext(
                        SimpleInjectionLauncherApplication.class)
        ){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}