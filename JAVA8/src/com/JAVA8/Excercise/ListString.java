package com.JAVA8.Excercise;

import java.util.List;

public class ListString {
	
	public static void main(String[] args) {
		List<String> course= List.of("Java", "SAP", ".Net", "AWS", "Testing", "SaleForce");
		course.stream()
			.forEach(System.out::println);
	}

	
}
