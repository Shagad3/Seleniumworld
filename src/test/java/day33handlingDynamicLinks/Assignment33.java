package day33handlingDynamicLinks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment33 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int links=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		System.out.println(links);
		for(int i=1;i<=links;i++) {
			if(i>1) {
				driver.findElement(By.xpath("//ul[@id='pagination']//li["+i+"]")).click();
			}
			int name=driver.findElements(By.xpath("//table[@id='productTable']//tr//td[2]")).size();
			
			
			for(int r=1;r<=name;r++) {
				
				String names =driver.findElement(By.xpath("(//table[@id='productTable']//tr//td[2])["+r+"]")).getText();
				String price=driver.findElement(By.xpath("(//table[@id='productTable']//tr//td[3])["+r+"]")).getText();
				driver.findElement(By.xpath("(//table[@id='productTable']//input)["+r+"]")).click();
				System.out.println(names+" "+price);
				
			}
		
		}
		driver.quit();
		
	}

}
