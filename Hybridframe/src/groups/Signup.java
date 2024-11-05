package groups;

import org.testng.annotations.Test;
@Test(groups= {"All"})
public class Signup 
{
	@Test(groups = {"smoke Tc"})
	public void TC01()
	{
		System.out.println("This is TC01 of (Smoketc)");
	}
	@Test(groups = {"IT Tc"})
	public void TC02()
	{
		System.out.println("This is TC02 of (ITtc)");
	}
	@Test(groups = {"IT Tc"})
	public void TC03()
	{
		System.out.println("This is TC030 of (ITtc)");
	}
	@Test(groups = {"smoke Tc"})
	public void TC04()
	{
		System.out.println("This is TC01 of (Smoketc)");
	}
}
