package calc;

public class Calculator {

	protected String accountName ;
	private double amount;
	private String daughterName;
	
	
	public Calculator(String accountName, double amount, String daughterName){
		this.accountName = accountName;
		this.amount = amount;
		this.daughterName = daughterName;
	}
		
	
		
	public void seeTheDetails(){
		System.out.println(accountName);
		System.out.println(amount);
		System.out.println(daughterName);
	}
	
		
		
	public void withdraw(){

		System.out.println(accountName);
		System.out.println(amount);
		System.out.println(daughterName);	
				
	}
		
	
	
}
