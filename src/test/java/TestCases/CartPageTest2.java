package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CartPage2;
import Pages.InventoryPages;
import Pages.LoginPages;


public class CartPageTest2 extends TestBase{
	CartPage2 cartPage2;
	LoginPages login;
	InventoryPages inv;
	CartPage cartPage;
	
	
	@BeforeMethod 
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPages();
		login.VerifyLoginPassword();
		cartPage2 = new CartPage2();
		Thread.sleep(2000);
		inv = new InventoryPages();
		inv.addProduct();
		cartPage = new CartPage();
		cartPage.checkout();
//		cartPage2 = new CartPage2();
	}
	@Test
	public void verifyCheckOutTitleTest()
	{
		String act = cartPage2.verifyCheckOutTitle();
		String ecp = "CHECKOUT: YOUR INFORMATION";
		Assert.assertEquals(act, ecp);
	}
	
	@AfterMethod 
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
