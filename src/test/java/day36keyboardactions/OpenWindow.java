package day36keyboardactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenWindow {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://demo.nopcommerce.com/");
	//	String	parentwindow = driver.getWindowHandle();
			driver.manage().window().maximize();
			
			String	parentwindow = driver.getWindowHandle();
			WebElement  opt=	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Register']")));
			Actions act= new Actions(driver);
	act.keyDown(Keys.CONTROL).click(opt).keyUp(Keys.CONTROL).perform();
	
	Set<String> ids = driver.getWindowHandles();
	List<String>id= new ArrayList(ids);
	String childwindow=id.get(1);
	if(id.equals(parentwindow)) {
		driver.switchTo().window(childwindow);
		
	
	}
	}

}
