package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pomtests.Browserfactory;

public class POMpageEbaysearchtest {
  @Test
  public void f() {
	  WebDriver driver=Browserfactory.StartBrowser("Edge","https://www.ebay.com/");
	  

	  driver.findElement(By.id("gh-ac")).sendKeys("Sony");
	  driver.findElement(By.id("gh-btn")).click();
	  
	Reporter.log("Ebay product Search test is sucessful....", true);
  
  
}
	  
	  
	  
	  
  }

