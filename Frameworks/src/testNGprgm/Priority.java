package testNGprgm;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority=1)
	public void test1()
	{
		System.out.println("hello");
	}
    @Test
    public void test2()
    {
    	System.out.println("world");
    }
    
}
