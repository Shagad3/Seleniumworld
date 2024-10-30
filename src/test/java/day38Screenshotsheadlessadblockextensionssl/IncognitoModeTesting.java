package day38Screenshotsheadlessadblockextensionssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoModeTesting {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver =new ChromeDriver(options);
	driver.get("https://google.com/");
	driver.manage().window().maximize();
System.out.println(driver.getTitle());
	driver.quit();
		
		
	}

}
