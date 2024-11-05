
package runnerscrptforDEMO;

import org.testng.annotations.Test;

import genericscriptDEMO.demogenericRahul;
import pomScriptforDEMOapp.Pomfor_Homepage;
import pomScriptforDEMOapp.Pomfor_Loginpage;
import pomScriptforDEMOapp.Pomfor_logout;

public class Runnerscrptr_rahul extends  demogenericRahul
{
@Test
public void login() throws InterruptedException
{
	Pomfor_Loginpage p=new Pomfor_Loginpage(driver);
	p.userid("Admin");
	Thread.sleep(2000);
	p.userpwd("admin123");
	Thread.sleep(2000);
	p.loginbtn();
	Thread.sleep(2000);
	Pomfor_Homepage p1=new Pomfor_Homepage(driver);
	p1.pimbtn();
	Thread.sleep(2000);
	p1.Addempl();
	Thread.sleep(2000);
	p1.firstnme("Ramyajs");
	Thread.sleep(2000);
	p1.lastnme("jsrr");
	Thread.sleep(2000);
	p1.savebtn();
	Thread.sleep(2000);
	Pomfor_logout p3=new Pomfor_logout(driver);
	p3.dropdown();
	//p3.logoutbtn();
}
}




