package com.live.test.log4jxmlversion;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLog4JXmlVersion {
//	
//	public static Logger logger = LogManager.getLogger(TestLog4JXmlVersion.class.getName());
//	static InputStream fis;
//	static Properties env;

	protected static WebDriver driver;
	
	
	public static void main(String[] args) {
//		DOMConfigurator.configure("C:\\TrainCentre\\TutorialCodes\\JavaCodes\\BatchC2015\\testLog4JXml\\log4jxmlversion\\src\\main\\resources\\log4j.xml");
//		env = new Properties();
//	
//		
//		String name = System.getProperty("user.dir");
//		System.out.println(name);
//		
//		try {
//			fis = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\object_repo.properties"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			env.load(fis);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		String url = env.getProperty("url");
//		System.out.println(url);
//		env.setProperty("name", "Hello");
//		
		driver = new FirefoxDriver();
//		logger.info("Browser has been instantiated and lunched successfully");
//		webProcessor(webAddress);
		driver.get("http://www.facebook.com");
//		logger.info("Web address has been loaded successfully");
		driver.manage().window().maximize();
//		
//		logger.error("Error occoured");
//		logger.warn("This is warning example");
//		logger.fatal("This is fatal Example");
//		logger.debug("This is Debug example");
//		
//
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		// Now you can do whatever you need to do with it, for example copy somewhere
//		System.out.println(FileUtils.getTempDirectory());
//		try {
//			FileUtils.copyFile(scrFile, new File("C:\\TrainCentre\\TutorialCodes\\JavaCodes\\BatchC2015\\testLog4JXml\\log4jxmlversion\\Screenshots\\learningLogger.jpeg"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		4/09/1991
//		Selecting day
		WebElement selectDayAddress = driver.findElement(By.id("day"));
		Select selectDay = new Select(selectDayAddress);
		selectDay.selectByIndex(1);
//		Selecting Month
		WebElement selectMonthAddress = driver.findElement(By.id("month"));
		Select selectMonth = new Select(selectMonthAddress);
		selectMonth.selectByValue("9");
//		Selecting Year
		WebElement selectYearAddress = driver.findElement(By.id("year"));
		Select selectYear = new Select(selectYearAddress);
		selectYear.selectByVisibleText("1991");
		
//		Selecting Female word
		driver.findElement(By.id("u_0_d")).click();
		
//		driver.close();
//
	}

}
