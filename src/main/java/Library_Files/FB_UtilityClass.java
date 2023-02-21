package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FB_UtilityClass
{	
	
	public static String getdatafromPF(String key) throws IOException
	{
		//to reach upto propertyfile
		FileInputStream   File=new  FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Maven\\PropFile.properties");
		//create the object of pf
		Properties  prop=new  Properties();
		//to open prop file
		prop.load(File);
		//to fetch data from prop file
		
		String Var=prop.getProperty(key);
		return Var;
				
	}
	 @Test
	 public static String getDataFromExcelsheet(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	 {
		 //to reach upto excelsheet
		 FileInputStream   File=new  FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Maven\\TestData\\1-oct-MOR.xlsx");
		 
		 //to open sheet
		 Sheet    Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		                          //3               //0
		 String   Value2=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();  //Insurance_broker_signout
		 
		 return Value2 ;//Insurance_broker_signout
					 
	 }
	 @Test
	 public static void CaptureScreenshot(WebDriver Driver) throws IOException
	 {	
	   File 	Source=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	   
	   System.out.println(Source);
	   File   Destination=new   File("C:\\Users\\Shree\\eclipse-workspace\\Maven\\sonali.jpg");
	   
	   FileHandler.copy(Source,Destination);
		 
	 }

	

}
