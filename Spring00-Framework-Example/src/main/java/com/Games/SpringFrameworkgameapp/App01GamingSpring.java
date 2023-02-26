package com.Games.SpringFrameworkgameapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Games.SpringFrameworkgameapp.game.GameRunner;
import com.Games.SpringFrameworkgameapp.game.GamingConsole;
import com.Games.SpringFrameworkgameapp.game.MarioGame;
import com.Games.SpringFrameworkgameapp.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Games.SpringFrameworkgameapp.game.GameRunner;
import com.Games.SpringFrameworkgameapp.game.GamingConsole;
import com.Games.SpringFrameworkgameapp.game.PacmanGame;

@Configuration
@ComponentScan("com.Games.SpringFrameworkgameapp.game")
public class App01GamingSpring {
	
		
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(App01GamingSpring.class);){
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
		}

	}
}