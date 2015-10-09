package uk.co.testlab.automate;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tuesday08092015 {
	private WebDriver driver;
	
	
	@Before
	public void steUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("www.facebook.com"); 
	}
	
	@Test
	public void testGettingTeextFromWebApp() {
//		boolean answer = driver.getPageSource().contains("Ozubulu");
//		System.out.println(answer);
//		String res = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[1]/label")).getText();
//		System.out.println(res);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
		driver.navigate().forward();
	}
	
	
	@Test @Ignore
	public void testButton() {
		driver.findElement(By.id("u_0_v")).click();
		driver.findElement(By.id("u_0_v")).submit();
		driver.findElement(By.id("u_0_v")).isEnabled();
	}
	
	
	
	
	
	@Test @Ignore
	public void testCheckBox() throws InterruptedException {
		driver.findElement(By.id("persist_box")).click();
		
		driver.findElement(By.id("persist_box")).click();
		driver.findElement(By.id("persist_box")).isDisplayed();
	}
	
	
	
	@Test @Ignore
	public void testRadioButton() {
		boolean result = driver.findElement(By.id("u_0_d")).isDisplayed();
		System.out.println(result);
//		driver.findElement(By.id("u_0_d")).click();
//		boolean ans = driver.findElement(By.id("u_0_d")).isSelected();
//		System.out.println(ans);
//		driver.findElement(By.id("u_0_d")).isDisplayed();
//		driver.findElement(By.id("u_0_d")).isEnabled();
	}

	@Test @Ignore
	public void testTextField() throws InterruptedException {
//		driver.findElement(By.id("email")).sendKeys("Emilia");
//		Thread.sleep(5000);
//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.id("email")).sendKeys("Bukky");
		
		boolean ch = driver.findElement(By.id("email")).isEnabled();
		System.out.println(ch);
	}
	
	
	
	
	@After
	public void tearDown() {
		
	}


}
