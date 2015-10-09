package com.test.one;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner myScan = new Scanner(System.in);
		System.out.println("Hello Welcome and what is your name?: ");
		String custmerName = myScan.nextLine();
		Food rest = new Food(custmerName);
		
		String message = rest.greetCustomerAndShowMenu();
		System.out.println(message);
		System.out.println("Enter a word from the food list");
		String foodName = myScan.nextLine();
		String names = rest.orderFood(foodName);
		System.out.println(names);
	}

}
