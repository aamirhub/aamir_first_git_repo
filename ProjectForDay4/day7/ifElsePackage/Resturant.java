package ifElsePackage;

import java.util.Scanner;

public class Resturant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your answer please: Did you eat Today?");
		String haveYouEaten = scan.nextLine();
		
		
		if(haveYouEaten.equals("Yes")){
			System.out.println("Please go home and Rest");
		}else{
			System.out.println("Please give him/her food to eat");
		}
		
		
		}

	}
