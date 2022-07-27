package com.tcs.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {

	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();

	}
	
	@AfterMethod
	public void destroy()
	{
		driver.quit();
	}
	
	@Test
	public void checkForHardAssert()
	{
		driver.get("https://www.google.com/");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
