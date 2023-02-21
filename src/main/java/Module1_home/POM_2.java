package Module1_home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_2
{	
	@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")            private WebElement signinAs;
	@FindBy(xpath="//input[@class='btn btn-danger']")              private WebElement Logout;
	
	public POM_2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public String getEmail()
	{
		String ActualEmailAddress=signinAs.getText();
		return ActualEmailAddress;
		
	}
	public void ClickLogoutbt()
	{
		Logout.click();
	}

}
