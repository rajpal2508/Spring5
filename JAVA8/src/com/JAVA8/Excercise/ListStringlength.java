package com.JAVA8.Excercise;

import java.util.List;

public class ListStringlength {

	public static void main(String[] args) {
		List<String> name= List.of("Rajpal","Amit","Pawan","Nitesh","Sai","DIPAK","Palesh","Kushal");
		
		name.stream()
			.filter(Fname -> Fname.length()>=5)// Lambda Expression
			.forEach(System.out::println);
		name.stream()
			.map(stdName -> stdName +" "+stdName.length()) // Lambda Expression
			.forEach(System.out::println);
	}
	
}
