package groups_santhoshsir;

import org.testng.annotations.Test;
      @Test(groups = {"FT tc"})
       public class Class2 
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
				System.out.println("This is TC03 of (RegressionTc)");
			}
			@Test
			public void TC04()
			{
				System.out.println("This is TC04 of (RegressionTc)");
			}
		}

