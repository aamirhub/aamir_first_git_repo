package com.blackcircles.test_env;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.blackcircles.page_object.GarageSearchPage;
import com.blackcircles.page_object.HomePage;
import com.blackcircles.page_object.LandingPage;
import com.blackcircles.page_object.MyAccountPage;

public class BlackCircleTest {

	public WebDriver driver;
	private String baseUrl = "http://www.blackcircles.com";
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private LandingPage landinPage;
	private GarageSearchPage garageSearchPage;
	
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		landinPage = new LandingPage(driver);
		garageSearchPage = new GarageSearchPage(driver);
	}
	
//	@BeforeClass
//	public static void startDatabase() {
//		System.out.println("Opening Database connection...");
//	}
//	
//	@AfterClass
//	public static void stopDatabase() {
//		System.out.println("Closing database ...");
//	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testToSearchForGarageInMyLocality() {
		String postCode = "EH12 9EP";
		String miles = "10 Miles";
		
		homePage.openGarageSearch();
		garageSearchPage.populateGarageInformationForm(postCode, miles);
	}
	
	
	
	
		

//	Test with valid username and valid password
	@Test 
	public void testwithValidUsernameAndValidPassword() {
		String username = "234dotus@gmail.com";
		String password = "password123";
		String message = "myaccount";
		String welcomeMessage = "Welcome . Dotcom  to your";
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		landinPage.verifyPresenceOf(message, welcomeMessage);
	}
	
	
	
//	Test with valid username and invalid password
	@Test
	public void testWIthValidUsernameAndInvalidPassword() {
		String username = "234dotus@gmail.com";
		String password = "lfdhufiai";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Incorrect login details.";
		
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		landinPage.verifyPresenceOf(message, welcomeMessage);
	}

	
//	Test with invalid username and valid password
	@Test
	public void testWithInValidUsernameAndValidPassword() {
		String username = "ifhaisfgs@sldfjdfh.com";
		String password = "password123";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Incorrect login details.";
		
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		landinPage.verifyPresenceOf(message, welcomeMessage);
	}
	
//	Test with invalid username and valid password
	@Test
	public void testWithInValidUsernameAndInValidPassword() {
		String username = "ifhaisfgs@sldfjdfh.com";
		String password = "dfkjhgsjd";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Incorrect login details.";
		
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		landinPage.verifyPresenceOf(message, welcomeMessage);
	}
	
//	Test with no username and no password
	@Test
	public void testWithNoUsernameAndNoPassword() {
		String username = "";
		String password = "";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Email";
		
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		landinPage.verifyPresenceOf(message, welcomeMessage);
	}
	
//	Test with no username and no password
	@Test
	public void testWithNoUsernameAndValidPassword() {
		String username = "";
		String password = "password123";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Email";
		
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		landinPage.verifyPresenceOf(message, welcomeMessage);
	}
}
