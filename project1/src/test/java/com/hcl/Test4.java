package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();

		 //Step1: To open the url
		 driver.get("https://demo.guru99.com/V4/index.php");
		 
		 //Step2: Enter user name
		 driver.findElement(By.name("uid")).sendKeys("mngr404794");
		 
		 //Step3: Enter password
		 driver.findElement(By.name("password")).sendKeys("gEsYpUt");
		 
		 //Step4: Click on Login button
		 driver.findElement(By.name("btnLogin")).click();
		 
		 //Step5: Verify the Title
		 String actualTitle=driver.getTitle();
		 System.out.println(actualTitle);
		 
		 String pageSource=driver.getPageSource();
		 System.out.println(pageSource);
		 
		 
		 String currentURL=driver.getCurrentUrl();
		 System.out.println(currentURL);
		 //close Browser
		 driver.quit();
		 
	}

}
