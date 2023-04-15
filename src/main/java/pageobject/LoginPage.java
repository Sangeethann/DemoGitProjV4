package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="(//a[text()='Login'])[1]")
	WebElement ob1;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement ob2;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement ob3;
	@FindBy(xpath="//input[@value='Login']")
	WebElement ob4;
	
	
	public void loginDetails() throws InterruptedException
	{
		ob1.click();
		ob2.sendKeys("sangeetha.ann1995@gmail.com");
		Thread.sleep(5000);
		ob3.sendKeys("mmar1234");
		Thread.sleep(5000);
		ob4.click();
		Thread.sleep(5000);
	}
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
