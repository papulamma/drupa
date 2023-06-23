package newmvnpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Newmvnclass {
  @Test
  public void search() {
	  
	  WebDriver driver=new EdgeDriver();
	    driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		
		
		//s.selectByVisibleText("Books");
		
		//s.selectByIndex(6);
	//	s. selectByValue("625");
		s.selectByVisibleText("Cameras & Photo");
		
		  driver.findElement(By.id("gh-ac")).sendKeys("Sony");
		  driver.findElement(By.id("gh-btn")).click();
		  
		
	  
	  
  }
}
