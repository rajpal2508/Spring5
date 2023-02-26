package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Cars.Honda;
import com.spring.Cars.Swift;
import com.spring.interfaces.Car;

public class App {

	public static void main(String[] args) {
		Car swift= new Swift();
		Car honda=new Honda();
		
		//System.out.println(swift.specs());
		//System.out.println(honda.specs());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfi.class);
		
		Car myCar=context.getBean("honda",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}
}
