package com.live.test_environment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.live.pages.AbstractPage;
import com.live.pages.HomePage;
import com.live.pages.MyAccountPage;
import com.live.pages.WelcomePage;
import com.live.utils.Constant;
import com.live.utils.ExcelUtils;




public class DataDrivenExcelTest {
	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private WelcomePage welcomePage;
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		this.abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		welcomePage = new WelcomePage(driver);
		abstractPage.openAndMaximizePage();
	}
	
	
	@Test 
	public void loginTest() throws Exception {
		String username = ExcelUtils.getCellData(1, 1);
		System.out.println("Username is " + username);
		String password = ExcelUtils.getCellData(1, 2);
		System.out.println("Password is "+ password);
		String name = ExcelUtils.getCellData(1, 3);
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Pass", 1, 3);
	}

	
	@Test 
	public void loginTest2() throws Exception {
		String username = ExcelUtils.getCellData(2, 1);
		 System.out.println("Username is " + username);
		String password = ExcelUtils.getCellData(2, 2);
		System.out.println("Password is "+ password);
		String name = ExcelUtils.getCellData(2, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Pass", 2, 3);
	}
	

	@Test 
	public void loginTest3() throws Exception {
		String username = ExcelUtils.getCellData(3, 1);
		 System.out.println("Username is " + username);
		String password = ExcelUtils.getCellData(3, 2);
		System.out.println("Password is "+ password);
		String name = ExcelUtils.getCellData(3, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Pass", 3, 3);
	}
	
	@After
	public void executePostCondition() throws Exception {
		abstractPage.tearDown();
	}
	
	
	
}
