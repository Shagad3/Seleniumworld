package day36keyboardactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardActions {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://jqueryui.com/datepicker/");
			driver.manage().window().maximize();
			//slider actions
		WebElement desktop=	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=	driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		System.out.println(desktop.getLocation());
		System.out.println(mac.getLocation());
			Actions act =new Actions(driver);
		act.dragAndDropBy(mac, 100, 567);
		act.dragAndDropBy(desktop, -100, 567);
		//After inputting the value performing the actions from keybord
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();		
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		//enter
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		//
		
		
	}

}
