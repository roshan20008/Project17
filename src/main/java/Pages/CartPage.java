package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement shopingCartLink; 
	@FindBy(xpath = "//span[@class='title']") private WebElement cartTitleCheck;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement removeBackPack;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement Checkout;
	//@FindBy(xpath = "//span[@class='title']") private WebElement cartTitle;
	//@FindBy(xpath = "//span[@class='title']") private WebElement cartTitle;

	@FindBy(id = "continue-shopping")public WebElement continueShopingBtn;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")private WebElement backPackAddToCartBtn;

	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")private WebElement jacketAddTOCArtBtn;

    @FindBy(xpath="//div[contains(text(),'Backpack')]")public WebElement backPack;

	@FindBy(xpath="//div[contains(text(),'Jacket')]") public WebElement jacket;

	@FindBy(id="remove-sauce-labs-backpack")public WebElement backPackRemoveToCartBtn; 
	
	@FindBy(id ="checkout") private WebElement checkoutBtn;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack") public WebElement bagpack; 
    @FindBy(id = "add-to-cart-sauce-labs-bike-light") public WebElement bikeLight; 
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") public WebElement boltTshirt; 
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") public WebElement fleesJacket; 

	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCartUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyYourCartText()
	{
		return cartTitleCheck.getText();
	}
	public void addItemInCart()
	{
		
		backPackAddToCartBtn.click();
		jacketAddTOCArtBtn.click();
		shopingCartLink.click();
		
	}
	public String verifyCountOfCart()
	{
		backPack.click();
		jacket.click();
		boltTshirt.click();
		fleesJacket.click();
		checkoutBtn.click();
//		continueShopingBtn.click();
//		
//		backPackAddToCartBtn.click();
//		jacketAddTOCArtBtn.click();
		return shopingCartLink.getText();
		}
	public void checkout()
	{
		checkoutBtn.click();
	}
	
}