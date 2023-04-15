package utilities;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Base {
  public WebDriver driver;
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation_Selenium_OZ\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver(); 
	  driver.get("http://www.opesmount.in/grocerystore1/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
