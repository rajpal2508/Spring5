package com.JAVA8.Excercise;

import java.util.List;

public class SumOfNum {

	public static void main(String[] args) {
		List<Integer> numbers= List.of(11,22,33,44,55,66,77,88,99);
		
		int num=numbers.stream()
			.filter(numbers -> numbers%2==1)
			.reduce(0, (num1,num2) -> num1+num2);
			
		System.out.println(num);
		
	}
}
