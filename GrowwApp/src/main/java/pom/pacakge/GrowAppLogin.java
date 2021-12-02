package pom.pacakge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowAppLogin {

	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="//span[text()='Login/Register']")
	private WebElement Login;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement Emailtext;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement Continuee;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="//span[text()='Submit']")
	private WebElement submit;

	@FindBy(xpath="(//input[@maxlength='1'])[1]")
	private WebElement maxlenth1;

	@FindBy(xpath="(//input[@maxlength='1'])[2]")
	private WebElement maxlenth2;

	@FindBy(xpath="(//input[@maxlength='1'])[3]")
	private WebElement maxlenth3;
	
	@FindBy(xpath="(//input[@maxlength='1'])[4]")
	private WebElement maxlenth4;
	
	@FindBy (xpath="//div[@id=\"otpinput88parent\"]//div//input")
	private List<WebElement> allGrowPin;
	
	public GrowAppLogin(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		//act = new Actions(driver);
	}
	
	
	public void LoginActivity() throws InterruptedException
	{
		Login.click();
		Emailtext.sendKeys("supriya.madane@gmail.com");
		Continuee.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		password.sendKeys("Harshgargi*1");
		submit.click();
		Thread.sleep(5000);
	//	maxlenth1=	driver.switchTo().activeElement();
		maxlenth1.sendKeys("7");
	//	maxlenth2=	driver.switchTo().activeElement();
		maxlenth2.sendKeys("8");
	//	maxlenth3=	driver.switchTo().activeElement();
		maxlenth3.sendKeys("9");
	//	maxlenth4=	driver.switchTo().activeElement();
		maxlenth4.sendKeys("6");
    }
	
	
}
