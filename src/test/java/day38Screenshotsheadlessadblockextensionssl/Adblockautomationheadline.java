package day38Screenshotsheadlessadblockextensionssl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adblockautomationheadline {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//this comman will remove the message "Chrome is being automated by testing software"
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver =new ChromeDriver(options);
	driver.get("https://google.com/");
	driver.manage().window().maximize();
System.out.println(driver.getTitle());
	driver.quit();

	}

}
