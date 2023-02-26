package com.Games.SpringFrameworkgameapp;

import com.Games.SpringFrameworkgameapp.game.GameRunner;
import com.Games.SpringFrameworkgameapp.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		MarioGame marioGame= new MarioGame();
		GameRunner gameRuuner = new GameRunner(marioGame);
		gameRuuner.run(); 

	}

}
