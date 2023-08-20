package com.example.gamerunner.advance_features;

import java.util.Arrays;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("Dependency ready");
    }
    
    // Run after bean is ready
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    // Before bean is remove from context
    // Good to close active connections
    @PreDestroy
    public void cleanUp(){
        System.out.println("Removing the bean from context");
    }
}

@Component
class  SomeDependency {

    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        try (
            var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)
        ) {
            Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);

        }
    }
}
