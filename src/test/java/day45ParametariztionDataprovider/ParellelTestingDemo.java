package day45ParametariztionDataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellelTestingDemo {
 WebDriver driver;
 
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String br) {
		
		switch(br){
			case "chrome" : driver = new ChromeDriver(); break;
			case "firefox" :driver = new FirefoxDriver();  break;
			case "edge" :driver = new EdgeDriver(); break;
			default: System.out.println("Invalid Browser"); return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
	@Test
   void a() {
		


		driver.findElement(By.xpath("//select[@name='fromPort']"));	
		WebElement value = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select opt =new Select(value);
		opt.selectByVisibleText("Boston");
		driver.findElement(By.xpath("//select[@name='toPort']"));	
		WebElement value2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select opt2 =new Select(value2);
		opt2.selectByVisibleText("Rome");
		driver.findElement(By.cssSelector("input[value='Find Flights']")).click();

  }
/*	@Test(priority =0)
	  void z() {
			


			driver.findElement(By.xpath("//select[@name='toPort']"));	
			WebElement value2 = driver.findElement(By.xpath("//select[@name='toPort']"));
			Select opt2 =new Select(value2);
			opt2.selectByVisibleText("Rome");
			driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
	  }*/
	
	@AfterClass
  void close() {
		driver.close();
	}
}
