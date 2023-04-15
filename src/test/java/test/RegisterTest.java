package test;

import org.testng.annotations.Test;

import pageobject.RegisterPage;
import utilities.Base;

public class RegisterTest extends Base {
  
  @Test(priority=0)
  public void register() throws InterruptedException {
	  RegisterPage obj1=new RegisterPage(driver);
	  obj1.registerDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=1)
  public void registerFillFormFirstName() throws InterruptedException
  {
	  RegisterPage obj2=new RegisterPage(driver);
	  obj2.registerFillFormFirstNameDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=2)
  public void registerFillFormLastName() throws InterruptedException
  {
	  RegisterPage obj3=new RegisterPage(driver);
	  obj3.registerFillFormLastNameDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=3)
  public void registerFillFormEmail() throws InterruptedException
  {
	  RegisterPage obj4=new RegisterPage(driver);
	  obj4.registerFillFormEmailDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=4)
  public void registerFillFormTelephone() throws InterruptedException
  {
	  RegisterPage obj5=new RegisterPage(driver);
	  obj5.registerFillFormTelephoneDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=5)
  public void registerFillFormFax() throws InterruptedException
  {
	  RegisterPage obj6=new RegisterPage(driver);
	  obj6.registerFillFormFaxDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=6)
  public void registerFillFormCompany() throws InterruptedException
  {
	  RegisterPage obj7=new RegisterPage(driver);
	  obj7.registerFillFormCompanyDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=7)
  public void registerFillFormAddress1() throws InterruptedException
  {
	  RegisterPage obj8=new RegisterPage(driver);
	  obj8.registerFillFormAddress1Details();
	  Thread.sleep(5000);
  }
  @Test(priority=8)
  public void registerFillFormAddress2() throws InterruptedException
  {
	  RegisterPage obj9=new RegisterPage(driver);
	  obj9.registerFillFormAddress2Details();
	  Thread.sleep(5000);
  }
  @Test(priority=9)
  public void registerFillFormCity() throws InterruptedException
  {
	  RegisterPage obj10=new RegisterPage(driver);
	  obj10.registerFillFormCityDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=10)
  public void registerFillFormPostalCode() throws InterruptedException
  {
	  RegisterPage obj11=new RegisterPage(driver);
	  obj11.registerFillFormPostalCodeDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=11)
  public void registerFillFormCountry() throws InterruptedException
  {
	  RegisterPage obj12=new RegisterPage(driver);
	  obj12.registerFillFormCountryDetails();
	  Thread.sleep(5000);
  }
//  @Test(priority=12)
//  public void registerFillFormState() throws InterruptedException
//  {
//	  RegisterPage obj13=new RegisterPage(driver);
//	  obj13.registerFillFormStateDetails();
//	  Thread.sleep(5000);
//  }
  @Test(priority=13)
  public void registerFillFormPassword() throws InterruptedException
  {
	  RegisterPage obj14=new RegisterPage(driver);
	  obj14.registerFillFormPasswordDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=14)
  public void registerFillFormConfirmPassword() throws InterruptedException
  {
	  RegisterPage obj15=new RegisterPage(driver);
	  obj15.registerFillFormConfirmPasswordDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=15)
  public void newsletterSubscribe() throws InterruptedException
  {
	  RegisterPage obj16=new RegisterPage(driver);
	  obj16.newsletterSubscribeDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=16)
  public void agreeChkBox() throws InterruptedException
  {
	  RegisterPage obj16=new RegisterPage(driver);
	  obj16.agreeChkBoxDetails();
	  Thread.sleep(5000);
  }
  @Test(priority=17)
  public void continueBtn() throws InterruptedException
  {
	  RegisterPage obj17=new RegisterPage(driver);
	  obj17.continueBtnDetails();
	  Thread.sleep(5000);
  }
  
}
