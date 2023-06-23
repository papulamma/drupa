package pomtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserfactory {

	public static WebDriver wd;
	
	 public static WebDriver StartBrowser(String bname,String url)
	 {
	 
	 if(bname.equalsIgnoreCase("chrome"))
	 {
		 
		 
		// WebDrivermanager.chromedriver.browserversion("111").setup();
	 wd =new ChromeDriver();
}
	 
   else if (bname.equalsIgnoreCase("Edge"))
   {
	   wd=new EdgeDriver();
   }
      wd.manage().window().maximize();
	 wd.get(url);
	 return wd;
	 
	 
	 
}	 
	
}
