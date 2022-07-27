package com.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		
		//Step1 : Set Drivers Properties
	     System.setProperty("webdriver.gecko.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
				
		  //step2 : Create WebDriver Object
		 WebDriver driver=new FirefoxDriver();
		 
		 //Step3 : open the url under test
		 driver.get("https://www.google.com/");
		 
		 //Step4 : Get the Title of the Web Page
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 //Step5 : Close Browser
		 driver.quit();
		

	}

}
