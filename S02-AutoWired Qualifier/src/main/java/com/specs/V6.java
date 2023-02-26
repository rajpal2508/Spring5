package com.specs;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Engine;
@Component("V6ENgine")
public class V6 implements Engine{
	@Bean
	@Override
	public String type() {
	
		return "V6 Engine";
	}

}
