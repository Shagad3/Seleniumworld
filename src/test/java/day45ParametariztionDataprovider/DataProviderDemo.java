package day45ParametariztionDataprovider;







import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	 @BeforeClass
	  void setupbefore() throws InterruptedException {
		 driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  @Test(dataProvider="jet")
	   void testlogin(String Eml, String pwd) throws InterruptedException {
		  
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Eml);
		  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  Thread.sleep(2000);
		  boolean status= driver.findElement(By.xpath("//h2[normalize-space()='My Accunt']")).isDisplayed();
		  if(status == true) {
			  driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  
		  
		  
	  }
	  
	  @AfterClass
	   void logoutafter() {
		  driver.close();
		  System.out.println("three printing");
	  }
	  

		
	  
	  @DataProvider(name="jet", indices= {0,1,2,3}) //indices is basically how many values do you want to repeat
		Object[][]  logindata1(){
			Object data[][] = {
					{"abc@gmail.com","test123"},
					{"xyz@gmail.com", "test012"},
					{"jhon@gmail.com", "test012"},
					{"pavanol123@gmail.com", "test@123"}
					
			};
			return data;
			}
			
	  
}
