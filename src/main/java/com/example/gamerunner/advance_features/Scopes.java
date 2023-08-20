package com.example.gamerunner.advance_features;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Everytime you ask for the bean a new intance will be created
/*
* There are some scopes that are only web-aware
* Request -> One object instance per single HTTP Request
* Session -> One object instance per user HTTP Session
* Application -> One object instance per web application runtime
* Websocket -> One object instance per WebSocket instance
* */
@Component
class PrototypeClass{

}

@Configuration
@ComponentScan
public class Scopes {
    public static void main(String[] args) {
        try(
            var context = new AnnotationConfigApplicationContext(Scopes.class)
        ){
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
