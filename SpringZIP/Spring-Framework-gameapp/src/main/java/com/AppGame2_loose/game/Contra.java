package com.AppGame2_loose.game;

public class Contra implements GamingConsole{
	public void up() {
		System.out.println("Jump");		
	}

	public void down() {
		System.out.println("Sit down");
	}

	public void right() {
		System.out.println("Shoot");
	}

	public void left() {
		System.out.println("Go Back");
	}
}
