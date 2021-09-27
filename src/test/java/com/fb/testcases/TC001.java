package com.fb.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.BrowserCode;

public class TC001 {
	
	WebDriver driver;
	BrowserCode bc = new BrowserCode();
	
	@Parameters("browserName")
	@BeforeMethod
	public void browserCode(String browsername) throws Exception {
		/*
		 * if(browsername.equalsIgnoreCase("chrome")) {
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }else
		 * if(browsername.equalsIgnoreCase("edge")) {
		 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver(); }else {
		 * System.out.println(browsername + " is invalid"); throw new
		 * Exception(browsername + " is invalid"); }
		 */	 
		driver=bc.browserOpen(driver, browsername);
		
	}
	
	@Test
	public void tc001()
	{
		driver.manage().window().maximize();
		
		driver.get("http://www.fb.com");
	}
	
	
	
	
	@AfterMethod
	public void browserClose()
	{
		try {
		driver.quit();
		}catch(Exception e)
		{
			System.out.println("Browser is closed");
		}
	}
	
	

}
