package com.tcs.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test6 {

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
		System.out.println("checkForHardAssert Started");
		driver.get("https://www.google.com/");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("checkForHardAssert completed");
	}
	
	@Test
	public void checkForSoftAssert()
	{
		SoftAssert softAssert=new SoftAssert();
		System.out.println("checkForHardAssert Started");
		driver.get("https://www.google.com/");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		//softAssert.assertEquals(actualTitle, expectedTitle);
		if(expectedTitle.equals(actualTitle))
		{
			softAssert.assertFalse(false);
		}else
		{
			softAssert.assertFalse(true);
		}
		System.out.println("checkForHardAssert completed");
		softAssert.assertAll();
	}
}
