package facebookCreatePage;

import java.util.Scanner;

public class WelcomeStaff {
	
	
	public static void main(String [] args){
		
		Scanner getName = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String staffName = getName.nextLine();
		
		String message = "Welcome to work today dear ";
		String message1 = " How was your night?";
		
		System.out.println(message+ staffName+message1);
		
	}
	


	
	
	
	
	
	
	
	
	
}
