package com.Games.SpringFrameworkgameapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Games.SpringFrameworkgameapp.game.GameRunner;
import com.Games.SpringFrameworkgameapp.game.GamingConsole;
import com.Games.SpringFrameworkgameapp.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		PacmanGame game= new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gamerunner(GamingConsole game) {
		return new GameRunner(game);
	}
	
}
