package com.spring.Cars;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Car;
@Component("honda")
public class Honda implements Car {

	@Override
	public String specs() {

		return "Sedan from Toyata";
	}

}
