package dataPROVIDER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Classs {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	}
}
