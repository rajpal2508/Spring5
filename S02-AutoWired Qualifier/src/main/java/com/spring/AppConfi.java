 package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.specs.V6;
import com.spring.Cars.Swift;


@Configuration
@ComponentScan("com.spring")
public class AppConfi {
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	@Bean("V6ENgine")
	public V6 v6() {
		return new V6();
	}
	
}
