package com.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

		
	     //Step1 : Set Drivers Properties
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		  //step2 : Create WebDriver Object
		 WebDriver driver=new ChromeDriver();
		 
		 //Step3 : open the url under test
		 driver.get("https://www.google.com/");
		 
		 //Step4 : Get the Title of the Web Page
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 //Navigate To
		 driver.navigate().to("https://www.google.com/search?q=youtube&sxsrf=ALiCzsYXaVWOj0KsdSgD4HqG9Vz5p08UYA%3A1653565786266&source=hp&ei=WmmPYrDZDfSIr7wPht6-oA4&iflsig=AJiK0e8AAAAAYo93aiuJ_PIJbCstv6JkauIn6uRuXsM7&gs_ssp=eJzj4tTP1TewzEouK1ZgNGB0YPBir8wvLSlNSgUAUQAG7g&oq=y&gs_lcp=Cgdnd3Mtd2l6EAEYADIRCC4QgAQQsQMQgwEQxwEQ0QMyCwguEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIRCC4QgAQQsQMQgwEQxwEQ0QMyCwguEIAEELEDENQCMgsILhCABBCxAxCDATIECAAQAzoHCCMQ6gIQJzoNCC4QxwEQ0QMQ6gIQJ1CGCFiGCGDCI2gBcAB4AIABmwGIAZsBkgEDMC4xmAEAoAEBsAEK&sclient=gws-wiz");
		 
		 //Navigate refresh
		 driver.navigate().refresh();
		 
		 //Navigate Back
		 driver.navigate().back();
		 
		 //Navigate Forword
		 driver.navigate().forward();
		 
		 //Step5 : Close Browser
		 driver.quit();
		
	}

}
