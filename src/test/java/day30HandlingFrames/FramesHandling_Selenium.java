package day30HandlingFrames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling_Selenium {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	URL url = new  URL("https://testautomationpractice.blogspot.com/");
			driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				
	WebElement	checkbox=	driver.findElement(By.xpath("input[@class='form-check-input' and @type='checkbox']"));
	driver.switchTo().frame("input[@class='form-check-input' and @type='checkbox']");
	driver.switchTo().frame(checkbox);
	driver.switchTo().frame("name");
	driver.switchTo().frame("WebElement");
	driver.switchTo().frame(0);// switching to frame using index
	//when ever you switch to a frame and want to post any value in any other frame, try to get out of the first frame and post the value
	
	
	driver.switchTo().defaultContent();	
	
	
	
	}

}
