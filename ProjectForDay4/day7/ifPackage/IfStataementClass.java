package ifPackage;

import java.util.Scanner;

public class IfStataementClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Blood Pressure please");
		String bloodPressure = scan.nextLine();
		int convertedIntegerBloodPressure = Integer.parseInt(bloodPressure);

		
		if(convertedIntegerBloodPressure == 80 ){
			System.out.println("Please see the GP");
		}
		
		

	}

}
