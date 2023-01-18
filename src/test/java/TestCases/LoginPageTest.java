package TestCases;

import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPages;

public class LoginPageTest extends TestBase {
	
	LoginPages login;
	
	@BeforeMethod (alwaysRun = true)
	public void setup()
	{
		initalization();
		login = new LoginPages();
	}
	
	@Test (groups = "Sanity")
	public void verifyLoginLogoTest()
	{
		boolean testResult = login.verifyLoginLogo();
		Assert.assertEquals(testResult, true);
	}
	
	@Test 
	public void verifyLoginbotLogo()
	{
		boolean testResult = login.verifyLoginbotLogo();
		Assert.assertEquals(testResult, true);
	}
	
	@Test
	public void VerifyUsername() throws Exception
	{
		login.VerifyUsername();
	}
	
	@Test
	public void VerifyPassword() throws Exception
	{
		login.VerifyPassword();
	}
	@Test
    public void VerifyLoginPassword() throws Exception
    {
	   login.VerifyLoginPassword();
    }
	
	
	@Test
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		
	}
	
	@Test
	public void verifyUrlTest() throws Exception
	{
		String expUrl = "https://www.saucedemo.com/";
		String actUrl = login.verifyUrl();
		Assert.assertEquals(expUrl, actUrl);
	}
	

    		

	@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{
	   driver.close();
	}
	
	
	

}
