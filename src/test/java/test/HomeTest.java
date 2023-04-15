package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.Base;

public class HomeTest extends RegisterTest {
  @Test(priority=23)
  public void login3() throws InterruptedException {
	  LoginPage obj1=new LoginPage(driver);
	  obj1.loginDetails();
  }
  
}
