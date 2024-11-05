package runnerscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericscript.GenericDataProvideNaukari;
import pomscript.PomforDataProvider;

public class Runnerfornaukari_Dataprovider extends GenericDataProvideNaukari 
{
	@Test(dataProvider="createdata")
	public void test1(String u,String e,String ph,String m) throws InterruptedException 
    {
	PomforDataProvider p=new PomforDataProvider(driver);
	p.username(u);
	Thread.sleep(2000);
	p.email(e);
	Thread.sleep(2000);
	p.password(ph);
	Thread.sleep(2000);
	p.mobile(m);
}
	@DataProvider(name = "createdata")
	public Object[][] createData1() 
	{
	 return new Object[][] {
	   { "poorna", "poorna@gmail.com","poorna123","9865231470"},
	   { "roorna", "roorna@gmail.com","roorna123","9775231470"},
	   { "hoorna", "hoorna@gmail.com","hoorna123","9665231470"},
	   {"aoorna", "aoorna@gmail.com","aoorna123","9555231470"}
	 };
	}

}

