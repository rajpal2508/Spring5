package com.AppGame2_loose.game;

public class Game2Controller {

	GamingConsole game;

	public Game2Controller(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game in loose coupling"+ game);
		game.up();
		game.down();
		game.right();
		game.left();
	}


}
