package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test11 {

	private static final WebElement terms = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://demo.guru99.com/test/upload/");
		 
		 driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Pictures\\image.jpg");
		 
		 WebDriverWait wait=new  WebDriverWait(driver, null);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("terms")));
		 
		 terms.click();
		 driver.findElement(By.id("submitbutton")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.quit();

	}

}
