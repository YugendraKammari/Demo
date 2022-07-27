package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class ChromeLaunch {

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
	 
	 //Step5 : Close Browser
	 driver.quit();
	}

}
