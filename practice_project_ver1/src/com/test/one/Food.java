package com.test.one;

import java.util.ArrayList;
import java.util.List;

public class Food {
	
	private List<String> foodMenu ;
	private String customerName;

	public Food( String customerName){
		foodMenu = new ArrayList<>();
		this.customerName = customerName;
		foodMenu.add("Rice and Beans ");
		foodMenu.add("Corn and Beef ");
		foodMenu.add("Akpu and Onugbu ");
		foodMenu.add("Rice and Nsara Soup ");
		foodMenu.add("Chiken and Pizza ");
	}
	
	
	
	public String greetCustomerAndShowMenu(){
		return ("Hello "+customerName+" Welcome to our gorgous resturant and here is our menu "+foodMenu);
	}
	
	public String orderFood(String foodName){
		if(foodName.contains("Rice")){
			return ("Here is all our Rice menu " + foodMenu.get(0) +" and "+ foodMenu.get(0));
		}else if(foodName.contains("Beans")){
			return ("Here is all our Beans menu " + foodMenu.get(0) );
		}else if(foodName.contains("Corn")){
			return ("Here is all our Corn menu " + foodMenu.get(1) );
		}
		return ("There is no " +foodName + " please try something else");
	}

}
