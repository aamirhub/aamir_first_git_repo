package com.blackcircles.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GarageSearchPage {

	private WebDriver driver;

	public GarageSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void populateGarageInformationForm(String postCode, String miles) {
		driver.findElement(By.id("finder-postcode")).sendKeys(postCode);
		
		WebElement mileRadius = driver.findElement(By.id("finder-distance"));
		Select selectMileRadius = new Select(mileRadius);
		selectMileRadius.selectByVisibleText(miles);
		
	}
	

	
	

}
