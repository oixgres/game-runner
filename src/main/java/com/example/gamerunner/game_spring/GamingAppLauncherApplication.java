package com.example.gamerunner.game_spring;

import com.example.gamerunner.game.GameRunner;
import com.example.gamerunner.game.GamingConsole;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.example.gamerunner.game") // In which package find the components
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try(
            var context = new AnnotationConfigApplicationContext(
                GamingAppLauncherApplication.class)
        ){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
