package keyworddrivenframeworks;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class keywordexelwork {
	public WebDriver driver;
  @Test    
  
  public void f() throws IOException, InterruptedException {
	  
	  XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\chand\\Downloads\\bhagya-work.zip\\amazonkeywordworksheet.xlsx");
			  
	  
	  XSSFSheet ws=wb.getSheet("Sheet1");
	  int rows=ws.getPhysicalNumberOfRows();
	  
	  for(int i=1;i<rows;i++)
	  {
	     String ctestcase=ws.getRow(i).getCell(0).getStringCellValue();
	      String cloctype=ws.getRow(i).getCell(1).getStringCellValue();
	      String clocvalue=ws.getRow(i).getCell(2).getStringCellValue();
	      String ctestdata=ws.getRow(i).getCell(3).getStringCellValue();
		 switch(ctestcase) 
		 {  
		 case "Open-browser":
			 if(ctestdata.equalsIgnoreCase("Chrome"))
			 {	    driver=new ChromeDriver();
			 
			 }
			 else if(ctestdata.equalsIgnoreCase("Edge")) 
			 { driver=new EdgeDriver();
				 
			 } driver.manage().window().maximize();
	       break;
	       
		 case"Enter-url":
		 driver.get(ctestdata);
			break;
		 case"Select-dropdown":
			 //WebElement dd=driver.findElement(By.className(clocvalue));
			 WebElement dd=driver.findElement(locaterinfo(cloctype,clocvalue));
			 Select s=new Select(dd);
			 s.selectByVisibleText(ctestdata);
			// Thread.sleep(3000);
			 
			 break;
		 case"Enter-text":
			 WebElement txt=driver.findElement(locaterinfo(cloctype,clocvalue));
			 //txt.clear();
			  txt.sendKeys(ctestdata);
			  txt.clear();
			 // Thread.sleep(3000);
			 // txt.clear();
		 case"click-button":
			 WebElement btn=driver.findElement(locaterinfo(cloctype,clocvalue));
			 btn.click();
		 break;
		 }
		 
		 } 
	  }
	@Test 
	
	 public By locaterinfo(String ltype,String lvalue) 
	 {   By b=null;
	      
	  switch(ltype)
	  {   case "id":
	       b=By.id(lvalue);
	        break;
	       case "name":
	       b=By.name(lvalue);
	        break;
	       case "class":
		    b=By.className(lvalue);
		     break; 
	        case "tag":
			    b=By.tagName(lvalue);
			     break; 
	       case "css":
		    b=By.cssSelector(lvalue);
		     break;
	       case "xpath":
		    b=By.xpath(lvalue);
		      break;
		        
	         case "lt":
			    b=By.linkText(lvalue);
			      break;
			          
	          case "pl":
		    b=By.partialLinkText(lvalue);
		      break;
	           
		      
	  }        
	 return b;
}
}