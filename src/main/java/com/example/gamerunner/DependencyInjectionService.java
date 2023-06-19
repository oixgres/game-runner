package com.example.gamerunner;

import com.example.gamerunner.service.BussinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.example.gamerunner.service")
public class DependencyInjectionService {
    public static void main(String[] args) {
        try(
                var context = new AnnotationConfigApplicationContext(
                        DependencyInjectionService.class
                )
        ){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BussinessCalculationService.class).findMax());
        }
    }
}
