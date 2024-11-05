package groups;

import org.testng.annotations.Test;

public class Login
{
@Test(groups = {"smoke Tc"})
public void TC01()
{
	System.out.println("This is TC01 of (Smoketc)");
}
@Test(groups = {"IT Tc"})
public void TC02()
{
	System.out.println("This is TC01 of (ITtc)");
}
@Test(groups = {"FT Tc"})
public void TC03()
{
	System.out.println("This is TC01 of (FTtc)");
}
@Test(groups = {"smoke Tc"})
public void TC04()
{
	System.out.println("This is TC01 of (Smoketc)");
}
}
