package com.AppGame2_loose;

import com.AppGame2_loose.game.Contra;
import com.AppGame2_loose.game.Game2Controller;
import com.AppGame2_loose.game.Mario;
import com.AppGame2_loose.game.Pacman;

public class AppGameBase {

	public static void main(String[] args) {
		//Mario game=new Mario();
		//Contra game= new Contra();
		Pacman game=new Pacman();
		Game2Controller controller=new Game2Controller(game);
		controller.run();

	}

}
