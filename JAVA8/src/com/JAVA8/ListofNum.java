package com.JAVA8;

import java.util.List;

public class ListofNum {
	public static void main(String[] args) {
		
		PrintListofNumTrad(List.of(1,2,44,121,121,44,2,46,88));
		 
	}

	private static void PrintListofNumTrad(List<Integer> numbers) {
	//How to loop the numbers?
		for(int num:numbers) {
			System.out.println(num);
		}
		
	}
	
}
