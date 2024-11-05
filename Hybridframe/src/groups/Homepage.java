package groups;

import org.testng.annotations.Test;
@Test(groups= {"All"})
public class Homepage 
{
	@Test(groups = {"smoke Tc","Regression TC"})
	public void TC01()
	{
		System.out.println("This is TC01 of (Smoketc)");
	}
	@Test(groups = {"FT Tc"})
	public void TC02()
	{
		System.out.println("This is TC02 of (FTtc)");
	}
	@Test(groups = {"smoke Tc","Regression TC"})
	public void TC03()
	{
		System.out.println("This is TC03 of (ITtc)");
	}
	@Test(groups = {"smoke Tc"})
	public void TC04()
	{
		System.out.println("This is TC04 of (Smoketc)");
	}
}
