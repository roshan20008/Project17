package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage2 extends TestBase{
	
	CartPage cartPage;
	InventoryPages inventoryPages;
	
	@FindBy(className = "title") private WebElement CheckOutTitle;
	@FindBy(id="cancel") private WebElement CancelButton;
	@FindBy(id="continue") private WebElement COntinueButton;
	@FindBy(id="first-name") private WebElement FirstnameTextBox;
	@FindBy(id="last-name") private WebElement LastnameTextBox;
	@FindBy(id="postal-code") private WebElement PostalCodeTextBox;
	
	
	public CartPage2() //constructor to initialize driver with instance variable
	{
		PageFactory.initElements(driver, this);
		inventoryPages = new InventoryPages();
		cartPage = new CartPage();
	}
	
	public String verifyCheckOutTitle()
	{
		return CheckOutTitle.getText();
	}
	
	public String verifyEnterdFirstName() throws Exception
	{
		Thread.sleep(2000);
		FirstnameTextBox.sendKeys("Rosha");
		return FirstnameTextBox.getAttribute("value");	
		Thread.sleep(2000);
	}
	

}
