package com.spring.Cars;

import org.springframework.beans.factory.annotation.Autowired;



import com.spring.interfaces.Car;


public class Swift implements Car {
	
	@Autowired
	Engine engine;

	@Override
	public String specs() {
		String specs="hatchback from suzuki with engine details "+engine.type;
		return specs;
	}

}
