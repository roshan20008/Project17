package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPages extends TestBase{
	
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UsernameLogin;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement LoginSubmitButton;
	
	public LoginPages()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();
	}
	public boolean verifyLoginbotLogo()
	{
		return botLogo.isDisplayed();
	}
	public void VerifyUsername() throws Exception
	{
		Thread.sleep(2000);
		UsernameLogin.click();
		Thread.sleep(2000);
		UsernameLogin.sendKeys("standard_user");
		Thread.sleep(2000);
		UsernameLogin.click();
	}
	public void VerifyPassword() throws Exception
	{
		Thread.sleep(2000);
		Password.click();
		Thread.sleep(2000);
		Password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		Password.click();
	}
	
	public void VerifyLoginPassword() throws Exception
	{
		
		Password.click();
		
		UsernameLogin.sendKeys("standard_user");
		
		Password.sendKeys("secret_sauce");
		
		Password.click();
		
		LoginSubmitButton.click();
		Thread.sleep(2000);
	}
	
	
	
	public String verifyTitle() throws Exception 
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public String verifyUrl() throws Exception
	{
		Thread.sleep(2000);
		return driver.getCurrentUrl();
		
	}

}
