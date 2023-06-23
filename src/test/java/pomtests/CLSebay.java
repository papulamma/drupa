package pomtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public  class CLSebay {
	  
	 public WebDriver wd;
	  public  CLSebay(WebDriver d) {
	
	      wd=d;
	  }
	  By txtsearch=By.id("gh-ac");
	  By txtbutton=By.id("gh-btn");
	  By ddcat=By.id("gh-cat");
	  
	  public void fnsearch (String pname) {
    	wd.findElement(txtsearch).sendKeys(pname);
    	 wd.findElement(txtbutton).click();
	}
     public void fncatsearch (String cat,String prodname) {

      WebElement dd=wd.findElement(ddcat);
       Select s=new Select( dd);
       s.selectByVisibleText(cat);
       fnsearch(prodname);
}
}