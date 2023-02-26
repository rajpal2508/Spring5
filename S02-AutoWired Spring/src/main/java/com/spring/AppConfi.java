package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.Cars.Swift;

@Configuration
@ComponentScan("com.spring")
public class AppConfi {
	@Bean
	public Swift swift() {
		return new Swift();
	}
}
