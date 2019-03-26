package baidu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.baidu.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",".//Tools//ChromeDriver.exe");
	  driver = new ChromeDriver();
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

}
