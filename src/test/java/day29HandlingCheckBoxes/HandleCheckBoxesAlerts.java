package day29HandlingCheckBoxes;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxesAlerts {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	URL url = new  URL("https://testautomationpractice.blogspot.com/");
			driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				
		List<WebElement>	checkbox=	driver.findElements(By.xpath("input[@class='form-check-input' and @type='checkbox']"));
	
	for(int i=0;i>checkbox.size();i++) {
		
		checkbox.get(i).click();
	}
	
	
	for ( WebElement x:checkbox) {
		x.click();
	
	}

	Alert alert = driver.switchTo().alert();	
	alert.accept();
	alert.dismiss();	
	alert.getText();
	alert.sendKeys("welcome");
	}

}
