package org.live.meganto_app.testData;

import org.testng.annotations.DataProvider;

public class LoginTestData {
	
	

	
	@DataProvider(name = "loginData")
	public static Object[][] dataForMagentoLogin(){
		return new Object[][] {
			{"234dotus@gmail.com", "password123	", 	"Donald Jonathan"},	
			{"fgfdsgfk@gmail.com", "password123	", 	"Invalid login or password"},
			{"234dotus@gmail.com", "tfuflufuft	", 	"Invalid login or password"},
			{"234dotus@gmail.com", "password123	", 	"Donald Jonathan"},	
			{"fgfdsgfk@gmail.com", "password123	", 	"Invalid login or password"},
			{"234dotus@gmail.com", "tfuflufuft	", 	"Invalid login or password"}
		};
	}
	
	
	
	
	@DataProvider(name = "logoutData")
	public static Object[][] dataForLogout(){
		return new Object[][] {
			{"234dotus@gmail.com", "password123	", 	"Donald Jonathan"},	
			{"fgfdsgfk@gmail.com", "password123	", 	"Invalid login or password"},
			{"234dotus@gmail.com", "tfuflufuft	", 	"Invalid login or password"},
			{"234dotus@gmail.com", "password123	", 	"Donald Jonathan"},	
			{"fgfdsgfk@gmail.com", "password123	", 	"Invalid login or password"},
			{"234dotus@gmail.com", "tfuflufuft	", 	"Invalid login or password"}
		};
	}
	
	
}
