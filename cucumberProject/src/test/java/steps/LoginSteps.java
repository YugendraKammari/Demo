package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class LoginSteps {
  WebDriver driver;
  LoginPage loginPage;
  @Given("launch the chrome browser")
  public void launch_the_chrome_browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\YUGENDRA KAMMARI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  loginPage=new LoginPage(driver);
  }
  
  @When("open url {string}")
  public void open_url(String url)
  {
	  driver.get(url);
  }
  
  @When("enter user name {string}")
  public void enter_user_name(String userName) 
  {
	  loginPage.enterUserId(userName);
  }
  
  @When("enter password {string}")
  public void open_password(String password) 
  {
	  loginPage.enterPassword(password);
  }
  
  @When("click login button")
  public void click_login_button() 
  {
	  loginPage.clickLogin();
  }
  
  
  @Then("verify the Title {string}")
  public void verify_the_Title(String expectedTitle)
  {
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  
}
