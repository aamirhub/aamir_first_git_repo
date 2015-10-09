package org.edwin.nwofor.packs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodeII {

	
	private WebDriver driver;

	public CodeII(WebDriver driver) {
		this.driver = driver;
	}
	
//	valid username and Invalid password
	
	public void inValidLogin() {
		driver.findElement(By.id("email")).sendKeys("234dotus@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("blueberrymhrgstydfuigogfjt1");
		driver.findElement(By.id("u_0_v")).click();
	}
	
}
