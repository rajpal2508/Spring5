package com.Games.SpringFrameworkgameapp;

import com.Games.SpringFrameworkgameapp.game.GameRunner;
import com.Games.SpringFrameworkgameapp.game.MarioGame;
import com.Games.SpringFrameworkgameapp.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//MarioGame game= new MarioGame();
		PacmanGame game= new PacmanGame();//1: object Creation
		GameRunner gameRuuner = new GameRunner(game);
		//2: object creation + wiring of Dependencies
		// Game is a Dependency of GameRunner
		gameRuuner.run(); 

	}

}
