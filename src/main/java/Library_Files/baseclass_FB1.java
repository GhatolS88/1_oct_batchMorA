package Library_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass_FB1

{	
	public WebDriver driver;
	public void InitializedBrowser() throws InterruptedException
	{
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Maven\\Browser\\chromedriver.exe");
	
     driver=new   ChromeDriver();
     
     driver.get("https://demo.guru99.com/insurance/v1/index.php");
     
     driver.manage().window().maximize();
     
     //wait
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
	}
	

}
