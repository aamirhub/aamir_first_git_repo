package org.edwin.nwofor.packs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Codes {
	
	private String webAdress = "http://www.facebook.com";
//	private String username = "234dotus@gmail.com";
//	private String password = "blueberry1";
	private WebDriver driver ;

	public Codes(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	
	public void enterWebAddress() {
		driver.navigate().to(webAdress);
	}
	
	
	public void check() {
		System.out.println("Hello folks");
	}
	
	
	public void validLogin() {
		driver.findElement(By.id("email")).sendKeys("234dotus@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("blueberry1");
		driver.findElement(By.id("u_0_v")).click();
	}
	
	public void verifyValidLogin() {
		
		boolean landingPageTitle = driver.getTitle().contains("Edwin");
//		Assert.assertEquals("Facebook", landingPageTitle);
//		Assert.assertTrue("The page title is wrong", landingPageTitle);
		Assert.assertFalse("The page tile is not right", !landingPageTitle);
		
	}
	


}
