package com.Games.SpringFrameworkgameapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Games.SpringFrameworkgameapp.game.GameRunner;
import com.Games.SpringFrameworkgameapp.game.GamingConsole;
import com.Games.SpringFrameworkgameapp.game.MarioGame;
import com.Games.SpringFrameworkgameapp.game.PacmanGame;

public class App01GamingSpring {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(GamingConfiguration.class);){
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
		}

	}
}