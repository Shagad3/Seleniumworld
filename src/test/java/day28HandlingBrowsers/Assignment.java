package day28HandlingBrowsers;

import java.time.Duration;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
			//String mainWindow =	driver.getTitle();				
				driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
				driver.findElement(By.cssSelector("input[type='submit']")).click();
				 String mainwindow = driver.getWindowHandle();				//List<WebElement> link = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
				 List<WebElement> links =driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
				 System.out.println(links.size());
				 for(int i=0;i<links.size();i++) {
					 links.get(i).click();
}
	/*	Set<String>	windows = driver.getWindowHandles();
		List<String> wind = new ArrayList(windows);
		 String ParentID = wind.get(0);
		 String ChildID1 = wind.get(1);
		 String ChildID2 = wind.get(2);
		 String ChildID3 = wind.get(3);
		 String ChildID4 = wind.get(4);
		 String ChildID5 = wind.get(5);
		 driver.switchTo().window(ParentID);	
		 System.out.println(driver.getTitle());
		 driver.close();
		 driver.switchTo().window(ChildID1);	
		 System.out.println(driver.getTitle());
		 driver.close();
		 driver.switchTo().window(ChildID2);	
		 System.out.println(driver.getTitle());
		 driver.close();
		 driver.switchTo().window(ChildID3);	
		 System.out.println(driver.getTitle());
		 driver.close();
		 driver.switchTo().window(ChildID4);	
		 System.out.println(driver.getTitle());
		 driver.close();
		 driver.switchTo().window(ChildID5);	
		 System.out.println(driver.getTitle());
		 driver.close();
		 
		*/
		 
		Set<String> windows = driver.getWindowHandles();
		for(String wind:windows) {
		String title= driver.switchTo().window(wind).getTitle();
		if(!title.equals("Automation Testing Practice")) {
				driver.switchTo().window(wind);
				System.out.println(driver.getTitle());	
				driver.close();
			}}	
//String s = driver.getTitle();
driver.switchTo().window(mainwindow);
String s = driver.getTitle();
System.out.print("closing final window "+ s);
driver.close();
	}
		}
	
	
	
		
	
	
	

