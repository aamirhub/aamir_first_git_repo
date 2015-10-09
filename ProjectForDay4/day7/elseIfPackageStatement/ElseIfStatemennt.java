package elseIfPackageStatement;

import java.util.Scanner;


//RYGBUV
public class ElseIfStatemennt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your favourite colour with the seven colours of Rainbow?");
		String sevenColoursOfRainbow = scan.nextLine();
		
		if(sevenColoursOfRainbow.equals("Red")){
			System.out.println("Thank you for choosing Red, it means that you are born on Sunday");
		}else if(sevenColoursOfRainbow.equals("Yellow")){
			System.out.println("Thank you for choosing Yellow, it means that you are born on Monday");
		}else if(sevenColoursOfRainbow.equals("Green")){
			System.out.println("Thank you for choosing Green, it means that you are born on Tuesday");
		}else if(sevenColoursOfRainbow.equals("Blue")){
			System.out.println("Thank you for choosing Blue, it means that you are born on Wednesday");
		}else if(sevenColoursOfRainbow.equals("Orange")){
			System.out.println("Thank you for choosing Orange, it means that you are born on Thursday");
		}else if(sevenColoursOfRainbow.equals("Indigo")){
			System.out.println("Thank you for choosing Indigo, it means that you are born on Friday");
		}else if(sevenColoursOfRainbow.equals("Violet")){
			System.out.println("Thank you for choosing Violet, it means that you are born on Saturday");
		}else{
			System.out.println("Please kindly double-check your colour as that does not exist on the Database!!!");
		}
		
		
		
	}

}
