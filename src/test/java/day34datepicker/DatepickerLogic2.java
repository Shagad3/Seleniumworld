package day34datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatepickerLogic2 {

	
static	String fromcity="Hyderabad";
	static String tocity="London";
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
	driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
driver.findElement(By.xpath("//input[@value='roundtripfh']")).click();
Thread.sleep(4000);
/*driver.findElement(By.xpath("//form[@id='both_round']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='source[]']")).sendKeys("Hyderabad");
Thread.sleep(2000);
List<WebElement> fromcountry =driver.findElements(By.xpath("//div[@id='roundtripfh']//li//div[@class='city']"));
	
for(WebElement fromplace:fromcountry) {
	if(fromplace.getText().equals(fromcity)) {
		fromplace.click();		}
}



driver.findElement(By.xpath("//form[@id='both_round']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='destination[]']")).sendKeys("United Kingdom");
Thread.sleep(3000);
List<WebElement> tocountry =driver.findElements(By.xpath("//div[@id='roundtripfh']//li//div[@class='city']"));

for(WebElement toplace:tocountry) {
	System.out.println(toplace.getText());
if(toplace.getText().equals(tocity)) {
	toplace.click();	
	System.out.println(" city clicked");
	}
}*/





WebElement dep=driver.findElement(By.xpath("//form[@id='flight_round']//following-sibling::div[@class='col-sm-6 p-0 pe-2']//input[@name='departure[]']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);", dep);
js.executeScript("arguments[0].click()", dep);
if(dep.isEnabled()) {
	dep.click();
}else {
	System.out.println("element is not enabled");
}
	}
	
	
	
	
	}


