package day31BootStrapDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		//Select drop don, Bootstrap drop down, Hidden drop down
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	URL url = new  URL("https://testautomationpractice.blogspot.com/");
			driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				
	List<WebElement>checkbox=	driver.findElements(By.xpath("input[@class='form-check-input' and @type='checkbox']"));
	
	for (WebElement op:checkbox) {
		
		String select = op.getText();		
		if(select.equals("value1") || select.equals("value12") ||select.equals("value13")) {
			op.click();
		}
	}
	
	
	
	}

}
