package day36keyboardactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsAndWindow {

	public static void main(String[] args) {
		
	WebDriver driver =new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://jqueryui.com/datepicker/");
			
			driver.manage().window().maximize();
			//to get new tab
		//	driver.switchTo().newWindow(WindowType.TAB);
			
		//to get new browser
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://testautomationpractice.blogspot.com/");
			
			Set<String> ids = driver.getWindowHandles();
			List<String> id = new ArrayList(ids);
			String child=	id.get(1);
			String parent=	id.get(0);
			driver.switchTo().window(parent);	
			String parentwindow = driver.getTitle();
		// driver.switchTo().window(child); 
			System.out.println(parentwindow);
		
			for(String winid:id) {
			 
				String title= driver.switchTo().window(winid).getTitle();
				 
			if(title.equals("Datepicker | jQuery UI")) {
				System.out.println(driver.getCurrentUrl());
			}
			else {
				System.out.println(driver.getCurrentUrl());
				String childwindows = driver.getTitle();
				System.out.println(childwindows);
			}
		
		
	}}}
