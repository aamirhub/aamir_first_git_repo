/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facebook;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
/**
 *
 * @author Edwin
 */
public class TestClass {
    
    private WebDriver driver;
    
    @Test 
    public void test(){
        driver = new FirefoxDriver();
        driver.get("http://facebook.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.quit();
    }
    
}
