package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfi.class);
		
		Car myCar=context.getBean("swift",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}
}
