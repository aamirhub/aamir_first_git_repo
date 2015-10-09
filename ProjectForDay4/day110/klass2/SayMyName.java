package klass2;

import java.util.Scanner;

public class SayMyName {
	static Scanner scan = new Scanner(System.in);
	
	static String name = scan.nextLine();

	
	public static void main(String[] args) {

		
		sayMyName6Times();
		myTown();
		sayMyName6Times();
		
		
		

		
	}

	
	public static void sayMyName6Times(){
		System.out.println("My name is "+name);
		System.out.println("My name is "+name);
		System.out.println("My name is "+name);
		System.out.println("My name is "+name);
		System.out.println("My name is "+name);
		System.out.println("My name is "+name);
		System.out.println("My name is "+name);
	}
	
	public static void myTown(){
		System.out.println("I am from Ozubulu");
	}
}
