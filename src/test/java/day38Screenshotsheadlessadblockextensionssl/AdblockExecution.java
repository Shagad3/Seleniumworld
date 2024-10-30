package day38Screenshotsheadlessadblockextensionssl;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdblockExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//add the crx by downloading the add block or ublock origin and save it in a path
		File file =new File ("C:\\Users\\User\\Downloads\\SelectorsHub.crx");
				options.addExtensions(file);
		WebDriver driver =new ChromeDriver(options);
	driver.get("https://google.com/");
	driver.manage().window().maximize();
System.out.println(driver.getTitle());
	}

}
