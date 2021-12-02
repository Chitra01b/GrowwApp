package base.pacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {


	public WebDriver openChromeBrowser()
	{
             
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip Bedis\\Downloads\\chromedriver_win32 (1)\\\\Chromedriver.exe");
	
	       WebDriver driver= new ChromeDriver();
	      // driver.manage().window().maximize();
	       return driver;
	      
	}
}
