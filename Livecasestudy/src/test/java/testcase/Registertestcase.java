package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Reddifregister;

public class Registertestcase  extends Testbase{
 public Reddifregister obj;
@BeforeClass
public void objinit() {
	 obj=new Reddifregister(driver);
}
@Test
public void postest()
{
	
obj.setUsername("Neha");
obj.setPassword("Test");
obj.confPassword("Test");
obj.dropdown();
}






}
