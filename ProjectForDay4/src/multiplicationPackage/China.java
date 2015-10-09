package multiplicationPackage;

import java.util.Scanner;

public class China {
	
	public void greetChinese(){
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Chinese name");
		String name = scan.nextLine();
		System.out.println("Hi "+name+ " welcome to Java World and since you are from China. I am going to ask you about Chinese politics");
		System.out.println("Who is Chinese President?");
	}

}