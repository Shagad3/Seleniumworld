package day35Mouseactions;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActionsAssignment {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement 	source =driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement 	target =driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act =new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	String msg=	driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")).getText();
	System.out.println("actions did "+msg );
	}

}
