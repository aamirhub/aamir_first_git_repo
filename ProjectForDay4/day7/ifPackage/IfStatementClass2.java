package ifPackage;

import java.util.Scanner;

public class IfStatementClass2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your answer please: Did you eat Today?");
		String didYouEatToday = scan.nextLine();
		
		if(didYouEatToday.equals("Yes")){
			System.out.println("Please no more food for you!!!");
			
		}

	}

}
