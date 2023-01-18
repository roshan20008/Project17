package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPages;

public class PriorityTest extends TestBase {
	
	LoginPages login;
	
	@BeforeMethod 
	public void setup()
	{
		initalization();
		login = new LoginPages();
	}
	@Test (priority = 3)
	public void verifyTitleTest1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web Application :-" + actTitle);
	 
	}
	@Test (priority = 2)
	public void AddProductTest() throws Exception
	{
		 String exp ="https://www.saucedemo.com/";
			String act = login.verifyUrl();
	        Assert.assertEquals(act, exp);
	        Reporter.log("Url of web Application :-" + act);
	}

}
