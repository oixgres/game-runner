package com.example.gamerunner.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass{
    @Autowired
    Dependency1 dependency1;
    @Autowired //Field injection
    Dependency2 dependency2;

    @Autowired // Constructor injection --> Recommended by the spring team
    public BusinessClass(Dependency1 dependency1, Dependency2 dependency2){
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using dependency1: "+dependency1+" and dependency2: "+dependency2;
    }

    // @Autowired // setter injection
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    // @Autowired // setter injection
    public void setDependency2(Dependency2 dependency2){
        this.dependency2 = dependency2;
    }

}

@Component
class Dependency1{ }

@Component
class Dependency2{ }

@Configuration
@ComponentScan
class DependencyInjectionLauncherApplication {
    public static void main(String[] args) {
        try(
            var context = new AnnotationConfigApplicationContext(
                DependencyInjectionLauncherApplication.class)
        ){
            Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

            System.out.println(context.getBean(BusinessClass.class));
        }
    }
}