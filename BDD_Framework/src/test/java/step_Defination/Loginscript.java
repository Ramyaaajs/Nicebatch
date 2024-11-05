package step_Defination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginscript 
{
	public WebDriver driver;
	@Given("user opens the testUrl")
	public void user_opens_the_test_url() 
	{
		System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com");
	 
	}

	@When("user enters valid email address {string}")
	public void user_enters_valid_email_address(String validUN) 
	{
		driver.findElement(By.name("email")).sendKeys(validUN); 
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String validPWD) 
	{
		driver.findElement(By.name("pass")).sendKeys(validPWD);   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.name("login")).click(); 
	}

	@Then("user should login sucessfully")
	public void user_should_login_sucessfully() 
	{
		System.out.println("user sucessfully login");     
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidUN) 
	{
		driver.findElement(By.name("email")).sendKeys(invalidUN); 
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPWD) 
	{
		driver.findElement(By.name("pass")).sendKeys(invalidPWD); 
	}

	@Then("user should get  warning message")
	public void user_should_get_warning_message()
	{
		System.out.println("user get warning msg"); 
	}

	@When("user enters no credentials")
	public void user_enters_no_credentials()
	{
		 System.out.println("user not entered credential");
	     driver.close();
	}
}
