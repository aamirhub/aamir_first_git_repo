package com.live.magento.test_area;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.live.magento.pages.AbstractPage;
import com.live.magento.pages.HomePage;
import com.live.magento.pages.MyAccountPage;
import com.live.magento.pages.SearchResultPage;
import com.live.magento.pages.WelcomePage;
import com.live.magento.utilities.Screenshot;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;




@RunWith(DataProviderRunner.class)
public class MagentoTest {
	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private WelcomePage welcomePage;
	private Screenshot screenshot;
	private SearchResultPage searchResultPage;
	

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		
		abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		welcomePage = new WelcomePage(driver);
		searchResultPage = new SearchResultPage(driver);
		
		abstractPage.openAndMaximizePage();
	}
	
	
	@Test @UseDataProvider("testDataForSearchProduct")
	public void searchingForProducts(String productName) {
		abstractPage.searchForProduct(productName);
		searchResultPage.verifyTheProduct(productName);
	}
	
	
	
	@Test 
	public void loginTest() {
		homePage.openMyAccount();
		myAccountPage.loginWith();
		welcomePage.verifyLogin();
	}


	
	@After
	public void executePostCondition() {
		abstractPage.tearDown();
	}
	
	
	@DataProvider
	public static Object[][] testDataForSearchProduct() {
		 return new Object[][] {
             { "LG LCD"},
             { "Samsung Galaxy"},
     };
	}
	
	

}
