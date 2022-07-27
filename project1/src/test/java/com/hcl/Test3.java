package com.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test3 {

	public static void main(String[] args) {
		
		//Step1 : Set Drivers Properties
	     System.setProperty("webdriver.edge.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
				
		  //step2 : Create WebDriver Object
		 WebDriver driver=new EdgeDriver();
		 
		 //Step3 : open the url under test
		 driver.get("https://www.google.com/");
		 
		 //Step4 : Get the Title of the Web Page
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 //Step5 : Close Browser
		 driver.quit();

	}

}
