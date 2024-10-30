package day47POMpattern;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class LoginPage1 {
 
  WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  	driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

  }
  
  
  @Test (priority =0)
  public void testlogin1() throws InterruptedException {


	  
	  LoginTestCase2 lg1 =new LoginTestCase2(driver);
	  lg1.loginUser1("Admin");
	  lg1.loginPassword1("admin123");
	  lg1.LoginClick1();
	  
  }
  
  @Test (priority =1)
  public void testlogin() throws InterruptedException {
	  LoginTestCase1 lg =new LoginTestCase1(driver);
	  lg.loginUser("Admin");
	  lg.loginPassword("admin123");
	  lg.LoginClick();
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  
  }

}
