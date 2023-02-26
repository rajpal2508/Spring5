package com.SpringBeans;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App02HelloSpring {

	public static void main(String[] args) {
		//1: launch a spring context
		try(AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(SpringCongifuration.class);)
		{
		//2: Configure the thing that we want spring to manage - @configuration
		//SpringConfiguration - @Configuration
		//name-@Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address1"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2methodwithoutpara"));
		System.out.println(context.getBean("person3methodwithpara"));
		System.out.println(context.getBean(Person.class));
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
