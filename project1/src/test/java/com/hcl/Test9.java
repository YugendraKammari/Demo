package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/V4/index.php");
		 driver.findElement(By.name("uid")).sendKeys("azsas");
		 driver.findElement(By.name("password")).sendKeys("fhgf");
		 driver.findElement(By.name("btnLogin")).click();
		 
		 Thread.sleep(2000);
		 String alertText=driver.switchTo().alert().getText();
		 System.out.println(alertText);
		 driver.switchTo().alert().accept();
		 
		 Thread.sleep(2000);
		 driver.quit();
		
	}

}
