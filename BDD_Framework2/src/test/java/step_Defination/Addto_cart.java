package step_Defination;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addto_cart 
{
	public WebDriver driver;
	@Given("user opens the testUrl")
	public void user_opens_the_test_url() 
	{
		System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com");
	}

	@When("user search for the product {string}")
	public void user_search_for_the_product(String serch) 
	{
		driver.findElement(By.xpath("//button[@title='Search for products, brands and more']")).sendKeys(serch);
	}

	@When("user scroll down for perticular product")
	public void user_scroll_down_for_perticular_product() 
	{
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Woven Kanjivaram Silk Blend Saree'])[1]"));
		Point loc = ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		ele.click();
	}

	@When("user click on the product")
	public void user_click_on_the_product() 
	{
	 Set<String> allwh = driver.getWindowHandles();
	 ArrayList<String>A=new ArrayList(allwh);
	 String v = A.get(1);
	 driver.switchTo().window(v); 
	}

	@When("user click on cart button")
	public void user_click_on_cart_button()
	{
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	}

	@When("user go to the electronics dropdown")
	public void user_go_to_the_electronics_dropdown() 
	{
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	}

	@When("user scroll down to color")
	public void user_scroll_down_to_color()
	{
		WebElement col = driver.findElement(By.xpath("//div[text()='Color']"));
		Point loc = col.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		col.click();
	}

//	@When("user click on color")
//	public void user_click_on_color() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user choose multicolor option")
	public void user_choose_multicolor_option() 
	{
		driver.findElement(By.xpath("(//div[text()='Multicolor'])[1]")).click();
	}

	@When("user go back to page")
	public void user_go_back_to_page() throws AWTException
	{
	   Robot r= new Robot();
	   r.keyPress(KeyEvent.VK_LEFT);
	   r.keyRelease(KeyEvent.VK_LEFT);		   
	}

	@Then("user close the application")
	public void user_close_the_application() 
	{
	  driver.close();
	}
}
