package com.Games.SpringFrameworkgameapp.game;

public class GameRunner {

	GamingConsole game; //Instance

	public GameRunner (GamingConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("Running game: "+ game);
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
