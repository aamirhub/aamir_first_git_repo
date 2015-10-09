package ifPackage;

import java.util.Scanner;

public class EdwinNwofor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your favourite colour with the seven colours of Rainbow?");
		String examScore = scan.nextLine();
		
		int convertedToIntegerOfExamResult = Integer.parseInt(examScore);
		
		switch(convertedToIntegerOfExamResult){
		case 70: 
			System.out.println("You have made a distinction my son");
			System.out.println("You have made a distinction my son");
			System.out.println("You have made a distinction my son");
			break;	
		case 60:
			System.out.println("You have made a very Good score");
			break;
		case 50: 
			System.out.println("You have made a pass ");
		default:
			System.out.println("There is no such score");
			break;
		}
	}

}
