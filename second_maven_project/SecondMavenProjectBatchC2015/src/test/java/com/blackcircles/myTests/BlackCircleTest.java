package com.blackcircles.myTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.blackcircles.myPages.GarageSearchPage;
import com.blackcircles.myPages.HomePage;
import com.blackcircles.myPages.LandingPage;
import com.blackcircles.myPages.MyAccountPage;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;


 
public class BlackCircleTest {

	public WebDriver driver;
	private String baseUrl = "http://www.blackcircles.com";
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private LandingPage landinPage;
	private GarageSearchPage garageSearchPage;
	
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		landinPage = new LandingPage(driver);
		garageSearchPage = new GarageSearchPage(driver);
	}
	
	@BeforeClass
	public static void startDatabase() {
		System.out.println("Opening Database connection...");
	}
	
	@AfterClass
	public static void stopDatabase() {
		System.out.println("Closing database ...");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test @Ignore
	public void testToSearchForGarageInMyLocality() {
		String postCode = "EH12 9EP";
		String miles = "10 Miles";
		
		homePage.openGarageSearch();
		garageSearchPage.populateGarageInformationForm(postCode, miles);
	}
	
	


	@Test @UseDataProvider("dataForLoginTest")
	public void testForLoginFunctionality(String username, String password, String message, String welcomeMessage) {
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		landinPage.verifyPresenceOf(message, welcomeMessage);
	}
	
	
	@DataProvider
	public static Object[][] dataForLoginTest(){
		return new Object[][] {
			{"234dotus@gmail.com", "password123	", 	"Edwin`					  ",	"Welcome . Dotcom  to your"	},
			{"234dotus@gmail.com", "lfdhufiai	", 	"myaccount/minilogin/login", 	"Incorrect login details."	},
			{"ifhaisfgd@jdfh.com", "password123	", 	"myaccount/minilogin/login", 	"Incorrect login details."	},
			{"fdfgsdfg@gmail.com", "dfkjhgsjd	", 	"myaccount/minilogin/login", 	"Incorrect login details."	},
			{" 					", "			", 	"myaccount/minilogin/login", 	"Email"						},
			{"					", "password123	", 	"myaccount/minilogin/login", 	"Email"						}
		};
	}
	
	
	
	
	
}
