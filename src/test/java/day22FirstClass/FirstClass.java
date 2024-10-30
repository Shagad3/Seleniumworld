package day22FirstClass;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class FirstClass {

	public static void main(String[] args) {
	
		//ChromeDriver driver = new ChromeDriver(); it can be used
		
		WebDriver driver = new ChromeDriver(); //this can be used  as WEBDRIVER is parent of chromedriver
	    driver.get("https://demo.opencart.com/");
	   String title = driver.getTitle();
	   if(title.equals("Your Store")) {
		   System.out.println("Title of the store" + " is"+" " + title );
	   }
	   else {
		   System.out.println("Title not found");
	   }
	   driver.close();
	   
	}

}
