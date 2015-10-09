package multiplicationPackage;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		
		Nigeria ng = new Nigeria(); 
		China ch = new China();
		Uk uk = new Uk();	
		Scanner now = new Scanner(System.in);
		
		
		System.out.println("Where are you from?");
		String qxtn = now.nextLine();
	

		
		if(qxtn.equalsIgnoreCase("Nigeria")){
			ng.greetNigerians();
		}else if(qxtn.equalsIgnoreCase("China")){
			ch.greetChinese();
		}else if(qxtn.equalsIgnoreCase("Uk")){
			uk.greetBritish();
		}else{
			System.out.println("There is no such country in mentioned in the assignment!!!");
		}
		
		
		
		

	}

}
