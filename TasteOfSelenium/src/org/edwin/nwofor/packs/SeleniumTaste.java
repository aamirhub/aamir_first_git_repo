package org.edwin.nwofor.packs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTaste {

	static WebDriver driver = new FirefoxDriver();
	
	
	
	public static void main(String args[]) {
		
		Codes automate = new Codes(driver);
		Basic b = new Basic(driver);
		CodeII classTwo = new CodeII(driver);

		//		Valid Login
		automate.maximizeBrowser();
		automate.enterWebAddress();
		automate.validLogin();

		//		Invalid Login
		automate.maximizeBrowser();
		automate.enterWebAddress();
		classTwo.inValidLogin();
		b.tearDownBrowser();
		
		
	}
	
	

	

}

