package com.AppGame2_loose.game;

public class Pacman implements GamingConsole{

	@Override
	public void up() {
		System.out.println("RUN");
		
	}

	@Override
	public void down() {
		System.out.println("STOP");
	}

	@Override
	public void left() {
		System.out.println("Go left");
	}

	@Override
	public void right() {
		System.out.println("Go right");
	}

}
