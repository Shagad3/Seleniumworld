package day31BootStrapDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownSelenium {

	public static void main(String[] args) throws InterruptedException {
		//Select drop don, Bootstrap drop down, Hidden drop down
		
		WebDriver driver =new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//select[@id='country-list']")).click();
		
		WebElement op =driver.findElement(By.xpath("//select[@id='country-list']"));
		//mywait.until(ExpectedConditions.elementToBeClickable(op));
		//Thread.sleep(3000);
			Select select =new Select(op);
			select.selectByValue("1");
			select.selectByVisibleText("China");
			
			
			
			//Assignment 2 : 
			
			
			
			
	/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	URL url = new  URL("https://testautomationpractice.blogspot.com/");
			driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				
	WebElement	checkbox=	driver.findElement(By.xpath("input[@class='form-check-input' and @type='checkbox']"));
	Select check = new Select(checkbox);
	//selectByVisibleText(), selectByValue(), selectByIndex().
	check.selectByVisibleText("text");
	check.selectByValue("value of attrible");//only value attribute is present we can select.
	check.selectByIndex(0); //can select by index by counting manually.
	//capture options from dropdown and return all the options
	
	
    List<WebElement> options = check.getOptions();
	options.size();
	
	for(int i=0; i>options.size();i++) {
		String hello =options.get(i).getText();
		System.out.println(hello);
		}
	
	for(WebElement op:options) {
	String he=	op.getText();
	System.out.println(he);
	}*/
	
	
	}

}
