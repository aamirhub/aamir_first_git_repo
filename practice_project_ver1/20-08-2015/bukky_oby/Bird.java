package bukky_oby;

public class Bird {
	
//	class eg. Bird = group
//	variables eg. colour, height, beak, eyes, etc = attributes
//	methods eg. fly(), sing(), soar(), dive(), jump)(), catch(), etc = actions
//	object eg. eagle, parrot, dove, etc

	
	String beak = "white beak";
	int eyes = 2;
	String eagleColour = "White";
	double eagleHeight = 23.2;
	
	
	public void fly(){
		System.out.println("Yes Eagel can fly");
		System.out.println("Yes Eagel can fly");
		System.out.println("Yes Eagel can fly");
		System.out.println("Yes Eagel can fly");
		System.out.println("Yes Eagel can fly");
	}
	
	public String sing(String songType){
		String music = "Hello, I am a bird and I can sing "+songType+ "song";
		return music;
	}
	
	public void soar(){
		System.out.println("Yes Eagel can soar");
	}

	public void dive(){
		System.out.println("Yes Eagel can dive");
	}
	public void jump(){
		System.out.println("Yes eagle can jump");
	}

	
}

