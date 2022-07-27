package com.tcs.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
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
	
	@Test(description = "demo.guru99.com")
	public void test1()
	{
		//Step1: To open the url
		 driver.get("https://demo.guru99.com/V4/index.php");
		 
		 //Step2: Enter user name
		 driver.findElement(By.name("uid")).sendKeys("mngr412134");
		 
		 //Step3: Enter password
		 driver.findElement(By.name("password")).sendKeys("betarYz");
		 
		 //Step4: Click on Login button
		 driver.findElement(By.name("btnLogin")).click();
		 
		 //Step5: Verify the Title
		 String actualTitle=driver.getTitle();
		 System.out.println(actualTitle);
		 
		 String pageSource=driver.getPageSource();
		 System.out.println(pageSource);
		 
		 
		 String currentURL=driver.getCurrentUrl();
		 System.out.println(currentURL);
	}
	
	@Test(description = "Student Test",dependsOnMethods = "test1")
	public void test2() throws InterruptedException 
	{
		//To open Url
		 driver.get("file:///C:\\Users\\YUGENDRA KAMMARI\\Desktop\\program/student.html");
		 driver.findElement(By.id("id")).sendKeys("100");
		 driver.findElement(By.name("name")).sendKeys("vishnu");
		 driver.findElement(By.className("age")).sendKeys("10");
		 driver.findElement(By.name("radio1")).click();
		 driver.findElement(By.id("chk1")).click();
		 driver.findElement(By.tagName("textarea")).sendKeys("Bangalore");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.id("submit")).click();
		 driver.findElement(By.partialLinkText("Student")).click();
	}
	
	@Test(description = "Student List",priority = 3,enabled = false)
	public void test3() 
	{
		 //Step1: To Open the URL
		 driver.get("file///file:///C:/Users/YUGENDRA%20KAMMARI/Desktop/program/studentreport.html");;
        List<WebElement> rows=driver.findElements(By.tagName("tr"));
        for(int i=0;i<rows.size();i++)
        {
       	 List<WebElement> cols=driver.findElements(By.tagName("td"));
       	 for(int j=0;j<cols.size();j++)
       	 {
       		 System.out.println(cols.get(j).getText()+" ");
       	 }
       	 System.out.println("");
        }
         
	}
	



     @BeforeSuite
     public void beforeSuite()
     {
    	 System.out.println("Before Suite");
     }
     
     
     @AfterSuite
     public void afterSuit()
     {
    	 System.out.println("After Suite");
     }
 

     @BeforeTest
     public void beforeTest()
     {
    	 System.out.println("Before Test");
     }
     
     @AfterTest
     public void afterTest()
     {
    	 System.out.println("After Test");
     }
  
     @BeforeClass
     public void beforeClass()
     {
    	 System.out.println("Before Test1 Class");
     }

     @AfterClass
     public void afterClass()
     {
    	 System.out.println("After Test1 Class");
     }
}