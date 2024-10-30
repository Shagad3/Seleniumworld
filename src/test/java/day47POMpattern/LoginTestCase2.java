package day47POMpattern;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginTestCase2 {
	
	

		
		WebDriver driver;
		
		LoginTestCase2(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Locaters

		@FindBy(xpath="//input[@placeholder='Username']")
		WebElement user1;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement passsword1;
		
		@FindBy(xpath="//button[normalize-space()='Login']")
		WebElement click1;
		
		@FindBy(xpath="//img[@alt='client brand banner']")
		WebElement banner1;

	public void loginUser1(String username) {
	user1.sendKeys(username);
		
	}

	public void loginPassword1(String Password) {
		passsword1.sendKeys(Password);
		
	}

	public void LoginClick1() throws InterruptedException {
		click1.click();
		Thread.sleep(3000);
	 Boolean result =banner1.isDisplayed();
	 Assert.assertTrue(result);
	 
	}


	}



