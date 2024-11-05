package groups_santhoshsir;

import org.testng.annotations.Test;
@Test(groups={"FT tc"})
public class Class1 
{
		@Test
		public void TC01()
		{
			System.out.println("This is TC01 of (Smoketc)");
		}
		@Test
		public void TC02()
		{
			System.out.println("This is TC02 of (FT tc)");
		}
	   @Test
		public void TC03()
		{
			System.out.println("This is TC03 of (ITtc)");
		}
		@Test
		public void TC04()
		{
			System.out.println("This is TC04 of (Smoketc)");
		}
	}

