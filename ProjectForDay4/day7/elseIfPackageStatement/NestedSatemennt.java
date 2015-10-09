package elseIfPackageStatement;
import java.util.Scanner;

public class NestedSatemennt {

	
//	Control Statement/Decision making statement
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your favourite colour with the seven colours of Rainbow?");
		String examScore = scan.nextLine();
		
		int convertedToIntegerOfExamResult = Integer.parseInt(examScore);
		
		
		if(convertedToIntegerOfExamResult == 70){
			System.out.println("You made a Distinction!!!");
			if(convertedToIntegerOfExamResult >= 90){
				System.out.println("You have won a scholarship");
				if(convertedToIntegerOfExamResult == 100){
					System.out.println("You are a Genius");
				}else{
					System.out.println("");
				}
			}
		}else if(convertedToIntegerOfExamResult == 60){
			System.out.println("Yu have just passed");
		}else if (convertedToIntegerOfExamResult == 50){
			System.out.println("You have narrow escape");
		}else if(convertedToIntegerOfExamResult == 49){
			System.out.println("He is a Cow BOY");
		}else{
			System.out.println("There is no such score in this school");
		}
		
		
		
	}

}
