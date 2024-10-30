package day32AutoDropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssigmentDay32 {
//static String text1;
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@name='fromPort']"));	
		WebElement value = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select opt =new Select(value);
		opt.selectByVisibleText("Boston");
		driver.findElement(By.xpath("//select[@name='toPort']"));	
		WebElement value2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select opt2 =new Select(value2);
		opt2.selectByVisibleText("Rome");
		driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
		
		int count =driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println(count);
		int countlink =driver.findElements(By.xpath("//table[@class='table']//tr//td[6]")).size();
		System.out.println(countlink);
		List<Double> prices = new ArrayList<>();
		
		for (int i=1; i<=countlink;i++) {
		String text1=driver.findElement(By.xpath("(//table[@class='table']//tr//td[6])["+i+"]")).getText();

		text1=text1.replace("$", "");
		double price = Double.parseDouble(text1);
		System.out.println(price);
		prices.add(price);
}
	
	System.out.println(prices);
	
	double lowestprice = Double.MAX_VALUE;
	for(int v=0;v<prices.size();v++) {
		if(prices.get(v)<lowestprice) {
			lowestprice=prices.get(v);
			System.out.println(lowestprice);
			}	
		}
		System.out.println(lowestprice);
		String strvalue= String.valueOf(lowestprice);
		System.out.println(strvalue);
		int countlink1 =driver.findElements(By.xpath("//table[@class='table']//tr//td[6]")).size();
		System.out.println(countlink1);
		for (int l=1; l<=countlink1;l++) {
			String text2=driver.findElement(By.xpath("(//table[@class='table']//tr//td[6])["+l+"]")).getText();
		//	text2 = text2.replace("$", "");
			System.out.println(text2);
	
		if(text2.contains(strvalue)) {
			driver.findElement(By.xpath("(//input[@value='Choose This Flight'])["+l+"]")).click();
			break;
	}
	}
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("2351 kennedy rd");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Scarborough");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//select[@id='cardType']")).click();
		WebElement select=	driver.findElement(By.xpath("//select[@id='cardType']"));
	Select find =new Select(select);
	find.selectByVisibleText("American Express");
	
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		String	text=	driver.findElement(By.cssSelector("div[class='container hero-unit'] h1")).getText();
		System.out.println(text);
		driver.quit();
}
	
	
}


	
