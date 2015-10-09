package practice_project_ver1;

public class IFelseStatement {
	
	
	// 0 - 39 = F
	//40 - 49 = E
	//50 - 59 = C
	//60 - 69 = B
	//70 -100 = A

	public static void main(String[] args) {

		
		int doesiTRain = 1;

		
		
		if(doesiTRain >= 0 && doesiTRain <= 39 ){
			System.out.println("You score is F");
		}else if(doesiTRain >= 40 && doesiTRain <= 49){
			System.out.println("You score is E");
		}else if(doesiTRain >= 50 && doesiTRain <= 59){
			System.out.println("You score is C");
		}else if(doesiTRain >= 60 && doesiTRain <= 69){
			System.out.println("You score is B");
		}else if(doesiTRain >= 70 && doesiTRain <= 100){
			System.out.println("You score is A");
		}else{
			System.out.println("This is not a Grade point average number");
		}

	}

}
