package day38Screenshotsheadlessadblockextensionssl;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableSelectorHubExtension {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		File file =new File ("C:\\Users\\User\\Downloads\\SelectorsHub.crx");
				options.addExtensions(file);
		WebDriver driver =new ChromeDriver(options);
	driver.get("https://google.com/");
	driver.manage().window().maximize();
System.out.println(driver.getTitle());
	


	}

}
