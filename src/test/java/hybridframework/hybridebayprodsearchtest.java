package hybridframework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomtests.Browserfactory;
import pomtests.CLSebay;

public class hybridebayprodsearchtest {
            int i=0;
            	WebDriver driver;	
		  @Test(dataProvider ="ebaydata")
		  public void prodsearch(String cat,String prod ) 
		  {   
			  if(i==0)
			  {	  
			 WebDriver driver=Browserfactory.StartBrowser("Edge","https://www.ebay.com/") ;
			  }i++;
		      
		  	  CLSebay obj=new CLSebay(driver) ;
		  	  obj.fnsearch(prod);
	   	WebElement txt = driver.findElement(By.id("gh-ac"));
	  	txt.clear();
		 txt.sendKeys(prod);
	 	 driver.findElement(By.id("gh-btn")).click();
		Reporter.log("Ebay product Search test is sucessful....", true);
			  
			  
			 
		  }
		  @DataProvider
		  public Object[][] ebaydata() throws IOException
		  {
		     Object[][] mydata=ebayhybrid1.getexeldata("E:\\bhagya-work\\datadrivenframeworkexelsheet.xlsx");
		  
		     
			
		     
		  return mydata;
		  
		  }

	  
	  
	  
  }

