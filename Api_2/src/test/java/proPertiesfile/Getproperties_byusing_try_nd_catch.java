package proPertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Getproperties_byusing_try_nd_catch
{
	public FileInputStream fis;
	@Test
public String Getproperties_byusing_try_nd_catch(String x)
{
		try {
			fis = new FileInputStream("./Property file/data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p=new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = p.getProperty(x);
		return url;

}
}
