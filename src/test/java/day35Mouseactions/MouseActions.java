package day35Mouseactions;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {

	public static void main(String[] args) {
		//utilize actions class
WebDriver driver =new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
	WebElement desktop=	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac=	driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().perform();
		//mousehover =moveToElement().build().perform();
		//right click = contextClick().perform();
		//double click = doubleClick().perform();
		//drag and drop =dragAndDrop(source element,target element).perform();
		
		//getText(); method will give us inner test of the tagname.
		//getAttribute(); gives us the value of attribute.
		
	}

}
