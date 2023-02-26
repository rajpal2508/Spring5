package com.Example.SpringFrameworkgameapp;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.DepInjection.SpringFrameworkgameapp")
public class DInjectionLauncher01 {
	
		
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(DInjectionLauncher01.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}
}