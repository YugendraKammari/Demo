package com.hcl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 driver.get("http://demo.guru99.com/test/yahoo.html");
		 
		 String downloadUrl=driver.findElement(By.linkText("Download Now")).getAttribute("href");
		 String wdget_command="cmd /c C:\\Downloads\\wget.exe -P C: --no-check-certificate "+downloadUrl;

		 Process proc=Runtime.getRuntime().exec(wdget_command);
		 int time=proc.waitFor();
		 System.out.println("File Downloaded with time:"+time);
	}

}
