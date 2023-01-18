package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPages;

public class DependsonTest extends TestBase{
	
	LoginPages login;
	
	@BeforeMethod
	public void setup()
	{
		initalization();
		login = new LoginPages();
	}
	@Test
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web Application :-" + actTitle);
	}
	
	@Test(dependsOnMethods = "verifyTitleTest")
	public void LoginToAppTest() throws Exception
	{
        String exp ="https://www.saucedemo.com/";
		String act = login.verifyUrl();
        Assert.assertEquals(act, exp);
        Reporter.log("Url of web Application :-" + act);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
