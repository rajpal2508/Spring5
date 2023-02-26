package com.spring.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.spring.interfaces.Car;
import com.spring.interfaces.Engine;


public class Swift implements Car {
	
	@Autowired
	@Qualifier("V6ENgine")
	Engine engine;

	
	public String specs() {
		String specs="hatchback from suzuki with engine details "+engine.type();
		return specs;
	}

}
