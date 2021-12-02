package test.pacakage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.pacakage.base;
import pom.pacakge.GrowAppLogin;

public class test extends base{
    //private static final pom.pacakge.GrowAppLogin Null = null;
	WebDriver driver;
    GrowAppLogin GrowAppLogin;
	@BeforeTest()
	@Parameters("browser")
	public void LaunchBrowse(String browser)
	{
		
		if(browser.equals("Chrome"))
		{
			driver = openChromeBrowser();
		}
		if(browser.equals("Firefox"))
		{
			driver = openChromeBrowser();
		}
	}
	@BeforeClass
	public void openGrowAppHomePage()
	{
		driver.get("https://groww.in/");
	}
	@BeforeMethod
	public void ObjectCreation()
	{
		 GrowAppLogin= new GrowAppLogin(driver);
	}
	@Test
	public void verifyLogin() throws InterruptedException
	{
		GrowAppLogin.LoginActivity();
	}
	@AfterMethod
	public void CleanObject()
	{
		//GrowAppLogin= "Null";
	}
	@AfterClass
	public void closeApp()
	{
		
	}
	@AfterTest
	public void closeBrowser()
	{
		
	}
	
	
	
}
