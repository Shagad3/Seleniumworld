package day27WaitMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitMethods {

	public static void main(String[] args) {
		//explicit wait  
		
WebDriver driver =new ChromeDriver();
//implicit wait

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//explicit wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
//WebElement displayed = driver.findElement(By.xpath("//img[@title='Your Store']"));
WebElement gt= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Your Store']")));
	gt.sendKeys("hello");
	mywait.until(ExpectedConditions.elementToBeClickable(gt));
	mywait.until(ExpectedConditions.visibilityOfAllElements(gt));
Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
	alert.dismiss();
	
	}

}
