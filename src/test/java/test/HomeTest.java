package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.Base;

public class HomeTest extends RegisterTest {
  @Test(priority=20)
  public void login() throws InterruptedException {
	  LoginPage obj1=new LoginPage(driver);
	  obj1.loginDetails();
  }
  @Test(priority=21)
  public void login1() throws InterruptedException {
	  LoginPage obj1=new LoginPage(driver);
	  obj1.loginDetails();
  }
}
