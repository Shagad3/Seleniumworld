package day25XpathAxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		//Xpath axes  - options 
		//Xpath works on DOM - 1:ancestor/desendent 2:parent 3:child 4:preceding sibling 5:following sibling 6:
				//6"preceding7:following
		
		//*[@id='value']/parent::tagname
		//*[@id='value']/parent::*
		//*[@id='value']/following-sibling::span
		//*[@id='value']/following-sibling::*
		//*[@id='value']/ancestor::*
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		
		
	}

}
