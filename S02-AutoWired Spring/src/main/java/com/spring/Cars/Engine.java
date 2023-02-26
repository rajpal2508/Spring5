package com.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	String type;

	public Engine() {
		type="v8 Engine";
	}

	public String getType() {
		return "V8 Engine";
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
		
}
