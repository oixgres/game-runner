package com.example.gamerunner.advance_features;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{ }

@Component
@Lazy // It happens until class is used
class ClassB{
    private  ClassA classA;

//    @Autowired
    public ClassB(ClassA classA){
        super();
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Something is done");
    }
}

@Configuration
@ComponentScan
public class LazyInitialization {
    public static void main(String[] args) {
        try(
            var context = new AnnotationConfigApplicationContext(LazyInitialization.class)
        ){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Initialization of context is completed");
            context.getBean(ClassB.class).doSomething();
        }

    }
}
