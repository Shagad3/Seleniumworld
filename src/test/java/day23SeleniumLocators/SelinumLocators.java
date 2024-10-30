package day23SeleniumLocators;
import org.openqa.selenium.chrome.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelinumLocators {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("search")).sendKeys("hello");//name
	
	boolean logodisplayed =driver.findElement(By.id("logo")).isDisplayed(); // id 
	System.out.print(logodisplayed);
	
	//Link Text and partial Link text 
	//driver.findElement(By.linkText("Tablets")).click();
	//driver.findElement(By.partialLinkText("Tabl")).click();
	
	
	//class name and tag name is used to specifically bring the multiple webelements and links imsg we can get the size.
	
	
	//classname
//List<WebElement> header=driver.findElements(By.className("list-inline-item"));
//System.out.println(header.size());

	//tagname
	
List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(int i=links.size()-1; i>=0;i--) {
		
		System.out.println(links.get(i).getText());
		if(links.get(i).getText().equals("My Account")) {
			System.out.println(links.get(i).isDisplayed());
			System.out.println(i);
		}
	}
	
	//images 
	//List<WebElement> images = driver.findElements(By.tagName("img"));
//	System.out.println(images.size());
	
	
	
	
	
	
	}
	
	
	
	

}
