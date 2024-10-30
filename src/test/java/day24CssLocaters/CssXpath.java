package day24CssLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tag#id
		//tag.classname
		//tag[attribute="value"]
		//tag.classname[attribute="value"]
		
WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//tag#ID
		
	driver.findElement(By.cssSelector("input#small-seachterms")).sendKeys("T-shirts");
	driver.findElement(By.cssSelector("#small-seachterms")).sendKeys("T-shirts");
		// tag .classname 
	
	driver.findElement(By.cssSelector("input.small-seachterms")).sendKeys("T-shirts");
	driver.findElement(By.cssSelector(".small-seachterms")).sendKeys("T-shirts");
	
	//Tag attribute 
	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
	driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
	
	//tag class attribute
	driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
	driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");
	}

}
