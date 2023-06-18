package com.example.gamerunner.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Introduced in JDK 16
// Setter and getter are automatically created for us
record Person (String name, int age) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Sergio";
    };

    @Bean
    public int age(){ return 24; }

    @Bean(name = "person2") // changes the name of the bean
    @Primary // defines Person as the main class
    @Qualifier // Works as a tag for the beans
    public Person person(String name, int age){
        /*var person = new Person("Sergio", 24);
        return person;*/
        /*return new Person(name(), age());*/ // using other beans
        return new Person(name, age);
    }
}
