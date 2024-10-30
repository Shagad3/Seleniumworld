package day46ListernersExtentReport;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListernerclassDemo {

	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test( priority =1)
	 void testlogo() {
		boolean status=  driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  Assert.assertEquals(status, true);
	  }
	  @Test( priority =2)
	 void testappurl() {
		  
		  Assert.assertEquals(driver.getCurrentUrl(), "htpps://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
	  }
	  @Test( priority =3, dependsOnMethods= {"testappurl"})
	  void search() {
		  
		  
		  Assert.assertTrue(false);
		  System.out.println("hello3");
	  }
	 
	 @AfterClass 
	  void shutdown() {
		  driver.quit();
	  }
	  
}
