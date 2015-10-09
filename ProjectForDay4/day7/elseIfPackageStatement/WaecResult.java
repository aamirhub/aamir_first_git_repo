package elseIfPackageStatement;

import java.util.Scanner;

public class WaecResult {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("What is your result in Physics?");
//		String physicsGrade = scan.nextLine();
		
		char phyicsResult = 'I';
		
		if(phyicsResult == 'A'){
			System.out.println("You have an Excellent");
		}else if(phyicsResult == 'B'){
			System.out.println("You have made Very Good");
		}else if(phyicsResult == 'C'){
			System.out.println("You have achieved Good");
		}else if(phyicsResult == 'D'){
			System.out.println("You have waste your time");
		}else if(phyicsResult == 'E'){
			System.out.println("You have to repeat the class");
		}else if(phyicsResult == 'F'){
			System.out.println("You have Failed");
		}else{
			System.out.println("There is no such a Grade in Physics");
		}
		
		//Nested If, If else, else if
		
	}

}
