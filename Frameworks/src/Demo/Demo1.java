package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1
{
@Test
public void test1()
{
	Reporter.log("hello everyone",true);
}
@Test
public void test2()
{
	Reporter.log("hi every",true);
}

}
