package com.Games.SpringFrameworkgameapp.game;

public class PacmanGame implements GamingConsole{

	public void up() {
		System.out.println("jump");
	}
	
	public void down() {
		System.out.println("sit");
	}
	
	public  void left() {
		System.out.println("go left");
	}
	
	public void right() {
		System.out.println("go right");
	}
	
}
