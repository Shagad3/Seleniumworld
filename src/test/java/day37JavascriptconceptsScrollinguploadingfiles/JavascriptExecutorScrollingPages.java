	package day37JavascriptconceptsScrollinguploadingfiles;
	
	import java.time.Duration;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class JavascriptExecutorScrollingPages {
	
		public static void main(String[] args) throws InterruptedException {
			
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
	
	WebElement dep=driver.findElement(By.xpath("//input[@id='name']"));
	WebElement click=driver.findElement(By.xpath("//h3[normalize-space()='GUI Elements']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement lastelement=driver.findElement(By.xpath("//div[@id='Attribution1']//div[@class='widget-content']"));
	
	
	//clicking using java script - pass the webelemt 
	js.executeScript("arguments[0].click()", click);
	//sending values using java script - pass the webelemt 
	js.executeScript("arguments[0].setAttribute('value','hello')",dep);
	
	//1:scroll the page by pixel number
	js.executeScript("window.scrollBy(0,1200)","");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	//2:scroll the page by visibility of text
	js.executeScript("arguments[0].scrollIntoView();", lastelement);
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	//3:scroll the page till end of page
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	//4:scroll back to the top of the intital position
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	//5set the zoom to 50% -zoom percentage can be adjusted
	js.executeScript("document.body.style.zoom='50%'");
	Thread.sleep(3000);
	js.executeScript("document.body.style.zoom='100%'");
		
		}
	
	}
