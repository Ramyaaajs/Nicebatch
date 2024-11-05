package runnerscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ruunerfoeLISTNER 
{
@Test
public void compose()
{
	System.out.println("messege composed");
}
@Test(dependsOnMethods="compose" )
public void sentItem()
{
	System.out.println("messege sent");
	Assert.fail();
}
@Test(dependsOnMethods="sentItem" )
public void trash()
{
	System.out.println("messege deleted"
			+ "");
}
}
