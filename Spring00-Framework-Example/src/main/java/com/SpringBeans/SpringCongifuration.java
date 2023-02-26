package com.SpringBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor,equals,
//hashcode and tostring are automatically created.
//Released in JDK 16.

record Person (String name, int age, Address address) {};
//Address- firstLine and City
record Address (String firstline, String city) {};
@Configuration
public class SpringCongifuration {
	
	@Bean
	public String name() {
		return "Rajpal";
	}
	@Bean
	public int age() {
		return 19;
	}
	
	@Bean
	@Primary
	public Person person() {
		Person person= new Person("Amit", 30, new Address("dadar", "Mumbai"));
		return person; //or
		//return new Person("Amit", 20);
	}
	@Bean(name="address1")
	@Primary
	public Address address() {
		return new Address("Shivji nagar Line", "Pune");
	}
	@Bean(name="address2")
	@Qualifier("address2qualifier")
	public Address address2() {
		return new Address("Cidco", "Nanded");
	}
	@Bean
	public Person person2methodwithoutpara() {
		return new Person(name(),age(),address());//use exingting data
	}
	@Bean
	public Person person3methodwithpara(String name, int age, @Qualifier("address2qualifier") Address address2) {
		//name,age,address1
		return new Person(name,age,address2);//use exingting data
	}
	
}
