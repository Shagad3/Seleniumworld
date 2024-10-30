package day32AutoDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestedDropDown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("Number pf rows"+ row);
		int cols =driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number pf rows"+ cols);
		
		for(int r=2;r<=row;r++) {
			
			for(int t=1;t<=cols;t++) {
			String text=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+t+"]")).getText();
			System.out.println(text);
			
			
			}
			
			
			
		}
		
	}

}
