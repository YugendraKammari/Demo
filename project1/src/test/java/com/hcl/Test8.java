package com.hcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		//Step1: To Open the URL
		 driver.get("http://demo.guru99.com/test/drag_drop.html");
		 
		 WebElement source=driver.findElement(By.linkText("5000"));
		 
		 WebElement destination=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		 
		 Actions act=new Actions(driver);
         act.dragAndDrop(source, destination).build().perform();
         
         driver.close();
	}

}

