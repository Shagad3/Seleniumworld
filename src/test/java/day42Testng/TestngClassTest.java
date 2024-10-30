package day42Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestngClassTest {
	
	WebDriver driver;
	
	
  @Test(priority =1 )
  public void login() {
	driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();

		
  }
  @Test(priority =2 )
  public void action() {
	  driver.findElement(By.xpath("//select[@name='fromPort']"));	
		WebElement value = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select opt =new Select(value);
		opt.selectByVisibleText("Boston");
		driver.findElement(By.xpath("//select[@name='toPort']"));	
		WebElement value2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select opt2 =new Select(value2);
		opt2.selectByVisibleText("Rome");
		driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
		  driver.close();
  }
  @Test(priority =3 )
  public void logout() {
	  System.out.println("log out");
  }
}
