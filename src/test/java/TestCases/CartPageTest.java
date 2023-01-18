package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPages;
import Pages.LoginPages;

public class CartPageTest extends TestBase {
	
	CartPage cartPage;//global Variable
	LoginPages login;
	InventoryPages inv;
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPages();
		login.VerifyLoginPassword();
		Thread.sleep(2000);
		inv = new InventoryPages();
		inv.addProduct();
		cartPage = new CartPage();
		
	}
	@Test (enabled = false) //(groups = "Sanity") 
	public void  verifyCartUrlTest() 
	{
		String expTitle = "https://www.saucedemo.com/cart.html";
		String actTitle = cartPage.verifyCartUrl();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web Application :-" + actTitle);
	}
	@Test (enabled = false)
	public void verifyYourCartTextTest()
	{
		String actual = cartPage.verifyYourCartText();
		Assert.assertEquals("YOUR CART", actual);
	}
	@Test (enabled = false)
	public void verifyaddItemInCartTest()
	{
		cartPage.addItemInCart();
		boolean actual = cartPage.bagpack.isDisplayed();
		
		Assert.assertEquals(actual, true);
	}
	@Test (enabled = false)
	public void verifyCountOfCartTest()
	{
	    String actual = cartPage.verifyCountOfCart();
	    Assert.assertEquals(actual, "4");
	}
	@Test
	public void checkoutTest()
	{
		cartPage.checkout();
	}
	
	
	
	
	
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	

}
