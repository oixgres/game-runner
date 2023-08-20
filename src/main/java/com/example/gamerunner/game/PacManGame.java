package com.example.gamerunner.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Helps to create a bean automatically
@Qualifier("PacManGameQualifier")
public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("Up");
    }

    public void down(){
        System.out.println("Down");
    }

    public void left(){
        System.out.println("Left");
    }

    public void right(){
        System.out.println("Right");
    }
}
