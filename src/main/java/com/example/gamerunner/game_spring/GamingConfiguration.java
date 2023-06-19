/*
package com.example.gamerunner.game_spring;

import com.example.gamerunner.game.GameRunner;
import com.example.gamerunner.game.GamingConsole;
import com.example.gamerunner.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
*/
