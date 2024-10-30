package day26WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodClasses {

	public static void main(String[] args) throws InterruptedException {
		//1: get methods 
		//2: conditional methods 
		//3: browser methods 
		//4:navigational methods 
		//5: wait methods
		
		// --getWindowHandle()-returns ID of the single Browser window
		// --getWindowHandles()-returns ID of the multiple Browser window
	WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		
	String	hello = driver.getWindowHandle();
System.out.println(hello);
Set<String> hel = driver.getWindowHandles();
System.out.println(hel);

//2: conditional methods 
WebElement displayed = driver.findElement(By.xpath("//img[@title='Your Store']"));
System.out.println(displayed.isDisplayed());
boolean is = driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();
System.out.println(is);
System.out.println(displayed.isSelected());
	
	}

}
