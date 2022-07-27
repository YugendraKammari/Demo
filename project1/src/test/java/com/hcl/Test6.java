package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 //To open Url
		 driver.get("file:///C:\\Users\\YUGENDRA KAMMARI\\Desktop\\program/student.html");
		 driver.findElement(By.id("id")).sendKeys("100");
		 driver.findElement(By.name("name")).sendKeys("vishnu");
		 driver.findElement(By.className("age")).sendKeys("10");
		 driver.findElement(By.name("radio1")).click();
		 driver.findElement(By.id("chk1")).click();
		 driver.findElement(By.tagName("textarea")).sendKeys("Bangalore");
		 
		 WebElement countryDropDown=driver.findElement(By.id("countryDropDown"));
		 Select sel=new Select(countryDropDown);
		 sel.selectByVisibleText("India");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.id("submit")).click();
		 driver.findElement(By.partialLinkText("Student")).click();
		 
		 //close Browser
		 driver.quit();
		 

	}

}
