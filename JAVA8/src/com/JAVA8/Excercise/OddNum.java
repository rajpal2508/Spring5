package com.JAVA8.Excercise;

import java.util.List;

public class OddNum {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(12,11,20,19,25,5,8,11);
		PrintOddNum(numbers);
	}

	private static void PrintOddNum(List<Integer> numbers) {
		numbers.stream()// convert to stream
			.filter(num->num%2==1)// Lambda Expression
			.forEach(System.out::println);// Method reference
		
	}
}
