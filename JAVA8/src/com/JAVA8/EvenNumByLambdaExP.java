package com.JAVA8;

import java.util.List;

public class EvenNumByLambdaExP {
	public static void main(String[] args) {
		//Step1: list of numbers
		List<Integer> numbers = List.of(1,2,44,121,121,44,2,46,88);
		PrintEvenNum(numbers);
		
		}
	
		//Even Number method
		private static void PrintEvenNum(List<Integer> numbers) {
			
			numbers.stream()
				//.filter(EvenNumByLambdaExP::isEven)// Filter -only allow even number
				.filter(num -> num%2==0) // Lambda Expression
				.forEach(System.out::println);// method reference
			
		}
	
}
