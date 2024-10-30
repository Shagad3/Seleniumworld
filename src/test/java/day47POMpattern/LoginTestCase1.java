package day47POMpattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTestCase1 {
	
	WebDriver driver;
	
	LoginTestCase1(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locaters
	

By user = By.xpath("//input[@placeholder='Username']");
By pass = By.xpath("	//input[@placeholder='Password']");
By click = By.xpath("//button[normalize-space()='Login']");
By banner = By.xpath("//img[@alt='client brand banner']");

public void loginUser(String username) {
	driver.findElement(user).sendKeys(username);
	
}

public void loginPassword(String Password) throws InterruptedException {
	driver.findElement(pass).sendKeys(Password);

}

public void LoginClick() throws InterruptedException {
	driver.findElement(click).click();
	Thread.sleep(2000);
 Boolean result = driver.findElement(banner).isDisplayed();
 Assert.assertTrue(result);
 
}


}
