package day38Screenshotsheadlessadblockextensionssl;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver =new ChromeDriver(options);
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//1:taking wholepage screenshot and saving it in screen shot folder
		
		/*TakesScreenshot td =(TakesScreenshot) driver;
		File sourcefile =td.getScreenshotAs(OutputType.FILE);
	//	File targetfile = new File("C:\\Workspace\\seleniumworld\\screenshots\\fullpage.png");
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage1.png");
		sourcefile.renameTo(targetfile);*/
		
		//2:taking  screenshot of multiple webelement and saving it in screen shot folder
		
		/*WebElement pageelement = driver.findElement(By.xpath("//div[@id='sidebar-right-1']"));
		
		File sourcefile =pageelement.getScreenshotAs(OutputType.FILE);
	//	File targetfile = new File("C:\\Workspace\\seleniumworld\\screenshots\\fullpage.png");
		File targetfile = new File("C:\\Workspace\\seleniumworld\\screenshots\\fullpage3.png");
		sourcefile.renameTo(targetfile);*/
		
		//2:taking screenshot of single webelement and saving it in screen shot folder
		WebElement pageelement = driver.findElement(By.cssSelector("button[name='start']"));
		File sourcefile =pageelement.getScreenshotAs(OutputType.FILE);
	//	File targetfile = new File("C:\\Workspace\\seleniumworld\\screenshots\\fullpage.png");
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage4.png");
		sourcefile.renameTo(targetfile);
	}

}
