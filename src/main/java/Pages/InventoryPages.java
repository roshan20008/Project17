package Pages;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.UtilityMethod1;
import net.bytebuddy.implementation.bytecode.Throw;

public class InventoryPages extends TestBase {
	
       LoginPages login = new LoginPages();
       
       @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement AddToCart;
       @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement AddToCart1;
       @FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement CartLink;
       
       @FindBy(xpath = "//div[@class='peek']") private WebElement peekLogo; 
       @FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement swagBot; 
       @FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement bagpack; 
       @FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight; 
       @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement boltTshirt; 
       @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement fleesJacket; 
       @FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortProductDropdown; 
       @FindBy(xpath = "//div[@id='shopping_cart_container']") private WebElement productCount;
       
        
       public  InventoryPages()
       {
    	   PageFactory.initElements(driver, this);
       }
       
       public String verifyPeekLogo()
       {
    	return driver.getCurrentUrl();
       }
       
       public boolean verifySwagBotlogo()
       {
    	   boolean logo = swagBot.isDisplayed();
    	   return logo;
       }
       
       public  String addProduct() throws Exception
       {
//    	   UtilityMethod1.selectClass(sortProductDropdown, "Name (Z to A)");
    	   Select s = new Select(sortProductDropdown);
   	       s.selectByVisibleText("Name (Z to A)");
    	   Thread.sleep(2000);
    	   bagpack.click();
    	   bikeLight.click();
    	   fleesJacket.click();
    	   boltTshirt.click();
    	   CartLink.click();
    	   Thread.sleep(2000);
    	   
		return productCount.getText();
			
       }
         
       public String verifyInventoryUrl()
       {
    	   return driver.getCurrentUrl();
       }
       
//       public void verifyAddCart() throws Exception
//       {
//    	 Thread.sleep(5000);
//    	 System.out.println("Searching for Add to Cart : ");
//    	 WebElement AddToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
//		 AddToCart.click();
//		 System.out.println("Clicked on Add to Cart : ");
//		 Thread.sleep(2000);
//		 WebElement AddToCart1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
//		 AddToCart1.click();
//		 Thread.sleep(2000);
//		 WebElement CartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//		 CartLink.click();
//		 Thread.sleep(2000);
		 
       }
//       public void verifyCartPurchase() throws Exception
//       {
//    	   Thread.sleep(2000);
//    	  CartLink.click(); 
//    	  Thread.sleep(2000);
//       }
      


