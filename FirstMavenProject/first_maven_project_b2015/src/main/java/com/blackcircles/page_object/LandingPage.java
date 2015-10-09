package com.blackcircles.page_object;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	private WebDriver driver;
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void verifyPresenceOf(String message, String welcomeMessage) {
		boolean result = driver.getPageSource().contains(welcomeMessage);
		Assert.assertTrue("The page does not contain "+welcomeMessage, result);
		boolean urlAnswer = driver.getCurrentUrl().contains(message);
		Assert.assertTrue("The Url does not contain myAccount", urlAnswer);
	}

}
