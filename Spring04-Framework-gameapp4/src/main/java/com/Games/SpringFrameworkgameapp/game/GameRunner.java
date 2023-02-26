package com.Games.SpringFrameworkgameapp.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	GamingConsole game; //Instance

	public GameRunner (@Qualifier("SuperContraGameQualifier") GamingConsole game) {
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
