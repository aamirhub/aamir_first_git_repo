package uk.co.nwofor.edwin;

import org.edwin.nwofor.packs.Basic;
import org.edwin.nwofor.packs.CodeII;
import org.edwin.nwofor.packs.Codes;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOfSeleniumWithJUnit {
	
	public static WebDriver driver;
	public CodeII classTwo;
	public Codes automate;
	public Basic b;
	
	
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		classTwo = new CodeII(driver);
		automate = new Codes(driver);
		b = new Basic(driver);
		automate.maximizeBrowser();
		automate.enterWebAddress();
	}
	
	@After
	public void tearDown() {
		b.tearDownBrowser();
	}
	
	
//  Test for login with valid username and valid password
	@Test 
	public void atestValidLogin() {
		automate.validLogin();
		automate.verifyValidLogin();
	}
	
// Testing for Login with valid username and Invalid password
	@Test @Ignore
	public void btestLoginWithValodUsernameAndInValidPassword() {
		classTwo.inValidLogin();
	}
	

	

	

		
		
}
