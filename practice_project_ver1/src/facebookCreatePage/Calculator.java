package facebookCreatePage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner getNumbers = new Scanner(System.in);
		System.out.println("Enter your first number");
		int x = getNumbers.nextInt();
		System.out.println("Enter your second number");
		int y = getNumbers.nextInt();
		
		int answer = x-y;
		
		String message = "The result is ";
		System.out.println(message+ answer);
		
		
	}

}
