package testNGprgm;

import org.testng.annotations.Test;

public class Invocation_count
{
	@Test(invocationCount=3,priority=1)
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
