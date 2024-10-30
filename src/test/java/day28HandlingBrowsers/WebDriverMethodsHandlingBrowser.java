package day28HandlingBrowsers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsHandlingBrowser {

	public static void main(String[] args) {
		//WebDriver navigational commands
		
WebDriver driver =new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.get("2ndlink");
	Set<String>	windows = driver.getWindowHandles();
	
	//converting the set into list collection - set collection does not have get method.
	
	List<String> wind = new ArrayList(windows);
	 String ParentID = wind.get(0);
	 String ChildID = wind.get(1);
	 driver.switchTo().window(ParentID);	
	 driver.getTitle();
	 driver.switchTo().window(ChildID); 
//looping statement  
	 for(String winid:windows) {
		 
		String title= driver.switchTo().window(winid).getTitle();
		 
	if(title.equals("Value")) {
		System.out.println(driver.getCurrentUrl());
	}
	else {
		System.out.println(driver.getCurrentUrl());
	}
	 
	 
	 }
	 
	 
	 
	 

	
	
	
	}

}
