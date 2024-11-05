package groups_santhoshsir;

import org.testng.annotations.Test;
@Test(groups = {"Regression TC"})
public class Class4 
{
	//@Test(groups = {"smoke Tc"})
	public void TC01()
	{
		System.out.println("This is TC01 of (Smoketc)");
	}
	//@Test(groups = {"FT Tc"})
	public void TC02()
	{
		System.out.println("This is TC02 of (FTtc)");
	}
	//@Test(groups = {"Regression TC"})
	public void TC03()
	{
		System.out.println("This is TC03 of (Regression TC)");
	}
	//@Test(groups = {"IT Tc"})
	public void TC04()
	{
		System.out.println("This is TC04 of (Regression TC)");
	}
}
