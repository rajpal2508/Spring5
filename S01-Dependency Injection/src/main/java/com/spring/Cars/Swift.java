package com.spring.Cars;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Car;
@Component("swift")
public class Swift implements Car {

	@Override
	public String specs() {
	
		return "hatchback from suzuki";
	}

}
