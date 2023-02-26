package com.Games.SpringFrameworkgameapp.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{

	public void up() {
		System.out.println("jump");
	}
	
	public void down() {
		System.out.println("Stop");
	}
	
	public  void left() {
		System.out.println("Shoot");
	}
	
	public void right() {
		System.out.println("Power up");
	}
	
}
