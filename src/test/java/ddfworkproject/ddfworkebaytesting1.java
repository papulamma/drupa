package ddfworkproject;

import org.testng.annotations.Test;

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

public class ddfworkebaytesting1 {
	int i =0;
	WebDriver driver;
  @Test(dataProvider ="ebaydata")
  public void prodsearch(String cat,String prod ) 
  {
	if(i==0) {
	  driver=new EdgeDriver();
	  driver.get("http://www.ebay.com");
	  driver.manage().window().maximize();
	}
	i++;
	
		     WebElement dd= driver.findElement(By.id("gh-cat"));
		     Select s=new Select(dd);
		     s.selectByVisibleText(cat);
		     
		   	WebElement txt = driver.findElement(By.id("gh-ac"));
		   	txt.clear();
		   	 txt.sendKeys(prod);
		   	 driver.findElement(By.id("gh-btn")).click();
		Reporter.log("Ebay product Search test is sucessful....", true);
	  
	  
	 
  }
  @DataProvider
  public Object[][] ebaydata() throws IOException
  {
     Object[][] mydata=null;
  
     XSSFWorkbook wb=new XSSFWorkbook("E:\\bhagya-work\\datadrivenframeworkexelsheet.xlsx");
     XSSFSheet ws=wb.getSheet("sheet1");
     int rows=ws.getPhysicalNumberOfRows();
     mydata =new Object[rows][2];
     
     for (int i=0;i<rows;i++)
     {
     mydata[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
     mydata[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
     
	
     }
  return mydata;
  
  }

} 
  

