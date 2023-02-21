package Module1_home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1 
{
	@FindBy(xpath="//input[@id='email']")                                   private WebElement  Email;
	@FindBy(xpath="//input[@id='password']")                                private WebElement  Passw;
	@FindBy(xpath="//input[@name='submit']")                                private WebElement  Login;
    
	public POM_1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void EnterEmail(String EmailAddress) 
	{
		Email.sendKeys( EmailAddress);
	}
	public void EnterPassword(String Password)
	{
		Passw.sendKeys(Password);
	}
	public void ClickLoginbt()
	{
	  Login.click();
	}
	
}
