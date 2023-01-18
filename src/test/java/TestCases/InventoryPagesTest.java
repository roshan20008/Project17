package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPages;
import Pages.LoginPages;

public class InventoryPagesTest extends TestBase {
	
	LoginPages Login;
	InventoryPages inv;
	
	@BeforeMethod (alwaysRun = true)
	public void setup1() throws Exception
	{
		initalization();
		Login = new LoginPages();
		Login.VerifyLoginPassword();
		inv = new InventoryPages();
		
		
	}
//	@Test
//	public void login() throws Exception
//	{
//		Login.VerifyLoginPassword();
//		
//	}
//	@Test
//	public void verifyAddCart() throws Exception
//	{
//		Login.VerifyLoginPassword();
//		inv.verifyAddCart();
//	}
//	
	@Test (groups = "Sanity")
	public void verifyPeekLogoTest() throws Exception
	{
		String result = inv.verifyPeekLogo();
        String exp ="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(result, exp);
        Thread.sleep(2000);
		
}
	@Test (enabled = true)
	public void verifySwagBotlogoTest()
	{
		boolean result = inv.verifySwagBotlogo();
		Assert.assertEquals(result, true);
		Reporter.log("verify swagBot =" + result);
		
	}
	
	@Test (enabled = true)
	public void addProductTest() throws Exception
	{
		//inv.addProduct();
		String result = inv.addProduct();
		Assert.assertEquals(result, "4");
		Reporter.log("total product add =" + result);
		
	}
		

	@AfterMethod (alwaysRun = true)
	public void closeBrowser1()
	{
	   driver.close();
	}
	

}
