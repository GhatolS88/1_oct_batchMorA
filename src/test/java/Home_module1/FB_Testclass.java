package Home_module1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.FB_UtilityClass;
import Library_Files.baseclass_FB1;
import Module1_home.POM_1;
import Module1_home.POM_2;


public class FB_Testclass extends  baseclass_FB1
{
	  POM_1  Log;
	  POM_2  Bro;
	  
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		InitializedBrowser();
		
	  Log=new  POM_1(driver);
	  
	  Bro=new  POM_2(driver);
	}
	
	@BeforeMethod
	public void LogineApp() throws IOException
	{
		Log.EnterEmail(FB_UtilityClass.getdatafromPF("EM"));
		Log.EnterPassword(FB_UtilityClass.getdatafromPF("PSW"));
		Log.ClickLoginbt();
	}
    
    @Test
    public void VerifyEmail() throws EncryptedDocumentException, IOException
    {
    	String ActualEmail=Bro.getEmail();
    	String ExpectedEmail=FB_UtilityClass. getDataFromExcelsheet(2,0);
    	Assert.assertEquals(ActualEmail,ExpectedEmail);
    	
    }

	
	
	@AfterMethod
	public void LogoutfromApp(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			FB_UtilityClass.CaptureScreenshot(driver);  
		}
		Bro.ClickLogoutbt();
		
		
	}
	@AfterClass
	public void Closebrowser()
	{
		driver.close();
	}
	

}
