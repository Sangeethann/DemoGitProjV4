package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement ob1;
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement ob2;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement ob3;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement ob4;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement ob5;
	@FindBy(xpath="//input[@id='input-fax']")
	WebElement ob6;
	@FindBy(xpath="//input[@id='input-company']")
	WebElement ob7;
	@FindBy(xpath="//input[@id='input-address-1']")
	WebElement ob8;
	@FindBy(xpath="//input[@id='input-address-12']")
	WebElement ob9;
	@FindBy(xpath="//input[@id='input-city']")
	WebElement ob10;
	@FindBy(xpath="//input[@id='input-postcode']")
	WebElement ob11;
	@FindBy(xpath="//select[@id='input-country']")
	WebElement ob12;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement ob13;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement ob14;
	@FindBy(xpath="//input[@name='newsletter']")
	List<WebElement> ob15;
	@FindBy(xpath="//input[@name='agree']")
	WebElement ob16;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement ob17;
	
	public void registerDetails() throws InterruptedException
	{
		ob1.click();
		Thread.sleep(5000);
	}
	public void registerFillFormFirstNameDetails() throws InterruptedException
	{
		ob2.sendKeys("Sangeetha");
		Thread.sleep(5000);
		
	}

	
	public void registerFillFormLastNameDetails() throws InterruptedException {
		ob3.sendKeys("Varghese");
		Thread.sleep(5000);
		
		
	}
	public void registerFillFormEmailDetails() throws InterruptedException {
		ob4.sendKeys("sangeetha.ann1995@gmail.com");
		Thread.sleep(5000);
		
	}
	public void registerFillFormTelephoneDetails() throws InterruptedException {
		ob5.sendKeys("67889854333");
		Thread.sleep(5000);
		
		
	}
	public void registerFillFormFaxDetails() throws InterruptedException {
		ob6.sendKeys("456788");
		Thread.sleep(5000);
		
	}
	public void registerFillFormCompanyDetails() throws InterruptedException {
		ob7.sendKeys("UST");
		Thread.sleep(5000);
		
	}
	public void registerFillFormAddress1Details() throws InterruptedException {
		ob8.sendKeys("Ushus");	
		Thread.sleep(5000);
	}
	public void registerFillFormAddress2Details() throws InterruptedException {
		ob9.sendKeys("Kozhuvallor");
		Thread.sleep(5000);
		
	}
	public void registerFillFormCityDetails() throws InterruptedException {
		ob10.sendKeys("Chengannur");
		Thread.sleep(5000);
		
	}
	public void registerFillFormPostalCodeDetails() throws InterruptedException {
		ob11.sendKeys("689521");
		Thread.sleep(5000);
		
	}
	public void registerFillFormCountryDetails() throws InterruptedException {
		Select country=new Select(ob12);
		country.selectByIndex(5);
		Thread.sleep(5000);
	}
	
	public void registerFillFormPasswordDetails() throws InterruptedException {
		ob13.sendKeys("mmar1234");
		Thread.sleep(5000);
	}
	public void registerFillFormConfirmPasswordDetails() throws InterruptedException {
		ob14.sendKeys("mmar1234");
		Thread.sleep(5000);
		
	}
	public void newsletterSubscribeDetails() throws InterruptedException {
		ob15.get(1).click();
		if(ob15.get(0).isSelected())
		{
			System.out.println("Bug");
		}

		Thread.sleep(5000);
		
	}
	public void agreeChkBoxDetails() throws InterruptedException {
		ob16.click();
		Thread.sleep(5000);
		
	}
	public void continueBtnDetails() throws InterruptedException {
		ob17.click();
		Thread.sleep(5000);
	}
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
