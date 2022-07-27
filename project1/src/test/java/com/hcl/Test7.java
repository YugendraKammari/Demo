package com.hcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
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

}
