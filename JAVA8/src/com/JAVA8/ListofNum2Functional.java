package com.JAVA8;

import java.util.List;

public class ListofNum2Functional {
	public static void main(String[] args) {
		//Step1: list of numbers
		PrintListofNumFunctional(List.of(1,2,44,121,121,44,2,46,88));
		}
		
		//create method for method reference
		private static void print(int number) {
			System.out.println(number);
		}
	
		//Step2: Method of numbers
		private static void PrintListofNumFunctional(List<Integer> numbers) {
		//Step3: Printing logic(Functional)
		numbers.stream().forEach(ListofNum2Functional::print);// method reference
		
		}
	
}
