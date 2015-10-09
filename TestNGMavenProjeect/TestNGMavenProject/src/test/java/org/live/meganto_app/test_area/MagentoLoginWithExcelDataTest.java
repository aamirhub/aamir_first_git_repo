package org.live.meganto_app.test_area;

import org.live.meganto_app.pages.AbstractPage;
import org.live.meganto_app.pages.HomePage;
import org.live.meganto_app.pages.MyAccountPage;
import org.live.meganto_app.pages.WelcomePage;
import org.live.meganto_app.testData.LoginTestData;
import org.live.meganto_app.utils.Constant;
import org.live.meganto_app.utils.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoLoginWithExcelDataTest {
	
	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private WelcomePage welcomePage;
	

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		this.abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		welcomePage = new WelcomePage(driver);
		abstractPage.openAndMaximizePage();
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "login");
	}
	
	
	@Test
	public void loginTest1() throws Exception {
		try {
		String username  = ExcelUtils.getCellData(1, 1);
		String password = ExcelUtils.getCellData(1, 2);
		String name = ExcelUtils.getCellData(1, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Passed", 1, 4);
		}catch(Throwable t) {
			ExcelUtils.setCellData("Failed", 1, 4);	
		}
	}


	@Test
	public void loginTest2() throws Exception {
		try {
		String username  = ExcelUtils.getCellData(2, 1);
		String password = ExcelUtils.getCellData(2, 2);
		String name = ExcelUtils.getCellData(2, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Passed", 2, 4);
		}catch(Throwable t) {
			ExcelUtils.setCellData("Failed", 2, 4);	
		}
	}
	
	@Test
	public void loginTest3() throws Exception {
		try {
		String username  = ExcelUtils.getCellData(3, 1);
		String password = ExcelUtils.getCellData(3, 2);
		String name = ExcelUtils.getCellData(3, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Passed", 3, 4);
		}catch(Throwable t) {
			ExcelUtils.setCellData("Failed", 3, 4);	
		}
	}


	@Test
	public void loginTest4() throws Exception {
		try {
		String username  = ExcelUtils.getCellData(4, 1);
		String password = ExcelUtils.getCellData(4, 2);
		String name = ExcelUtils.getCellData(4, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Passed", 4, 4);
		}catch(Throwable t) {
			ExcelUtils.setCellData("Failed", 4, 4);	
		}
	}
	
	
	@Test
	public void loginTest5() throws Exception {
		try {
		String username  = ExcelUtils.getCellData(5, 1);
		String password = ExcelUtils.getCellData(5, 2);
		String name = ExcelUtils.getCellData(5, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Passed", 5, 4);
		}catch(Throwable t) {
			ExcelUtils.setCellData("Failed", 5, 4);	
		}
	}
	
	@Test
	public void loginTest6() throws Exception {
		try {
		String username  = ExcelUtils.getCellData(6, 1);
		String password = ExcelUtils.getCellData(6, 2);
		String name = ExcelUtils.getCellData(6, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Passed", 6, 4);
		}catch(Throwable t) {
			ExcelUtils.setCellData("Failed", 6, 4);	
		}
	}
	
	@Test
	public void loginTest7() throws Exception {
		try {
		String username  = ExcelUtils.getCellData(7, 1);
		String password = ExcelUtils.getCellData(7, 2);
		String name = ExcelUtils.getCellData(7, 3);
		
		homePage.openMyAccount();
		myAccountPage.loginWith(username, password);
		welcomePage.verifyLogin(name, username);
		ExcelUtils.setCellData("Passed", 7, 4);
		}catch(Throwable t) {
			ExcelUtils.setCellData("Failed", 7, 4);	
		}
	}
	
	
	
	@AfterMethod
	public void executePostCondition() {
		abstractPage.tearDown();
	}
	


}
