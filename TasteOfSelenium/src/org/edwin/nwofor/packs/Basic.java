package org.edwin.nwofor.packs;

import org.openqa.selenium.WebDriver;

public class Basic {
	
	
	private WebDriver driver;

	public Basic(WebDriver driver) {
		this.driver = driver;
	}
	
	public void tearDownBrowser() {
		driver.close();
	}

}
