package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPages;

public class DemoTest extends TestBase{
	
LoginPages login;
	
	@BeforeMethod 
	public void setup()
	{
		initalization();
		login = new LoginPages();
	}
	@Test  (invocationCount = 3)
	public void verifyTitleTest1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web Application :-" + actTitle);
     }
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}
