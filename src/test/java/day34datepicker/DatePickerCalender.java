package day34datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DatePickerCalender {
	
	static void futuredate(WebDriver driver, String month, String year,String date) {
		
		
	while(true) {
		String monthtext=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yeartext=	driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();	
		if(monthtext.equals(month) && yeartext.equals(year)){
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
	
	
	List<WebElement> datetext =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
	
	for(WebElement datet:datetext) {
		if(datet.getText().equals(date)) {
			datet.click();		}
	}
	}
	

	public static void main(String[] args) {

WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String  Year="2026";
		String  Month="May";
		String  Date="19";
		
		futuredate(driver,Month,Year,Date);
		
	}

}
