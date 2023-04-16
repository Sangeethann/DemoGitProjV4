package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.Base;

public class HomeTest2 extends RegisterTest {
  @Test(priority=24)
  public void login4() throws InterruptedException {
	  LoginPage obj1=new LoginPage(driver);
	  obj1.loginDetails();
  }
  
}
