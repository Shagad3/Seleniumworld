package day41ExelDataDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDrivenExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://dominionlending.ca/calculators/payment-amount.php?utm_source=bing&utm_medium=sem&utm_campaign=DLC2024&utm_id=mortgagecalculator&gclid=fb0599b8f38a19cc406ffead8fa573a5&gclsrc=3p.ds");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		String filepath = "C:\\Workspace\\seleniumworld\\src\\testdata\\Assignment.xlsx";
		int rows = ExcelUtils.getRowCount(filepath, "Sheet1");
		
		for(int i=1;i<=rows;i++) {
			
			String price = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String rateofinterest = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String term = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String frequency = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String value = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			
			driver.findElement(By.xpath("//input[@id='FormattedMTGAmount']")).clear();
			driver.findElement(By.xpath("//input[@id='FormattedMTGAmount']")).sendKeys(price);
			
			Select freq= new Select(driver.findElement(By.xpath("//select[@ng-model='PaymentFrequency']")));
			freq.selectByVisibleText(frequency);
			driver.findElement(By.xpath("//select[@id='MortgageTerm']")).click();
			//Select mortgageterm= new Select(driver.findElement(By.xpath("//select[@id='MortgageTerm']")));
			//freq.selectByVisibleText(term);
			driver.findElement(By.xpath("//input[@id='InterestRate']")).clear();
			driver.findElement(By.xpath("//input[@id='InterestRate']")).sendKeys(rateofinterest);
			Thread.sleep(1500);
	String	actualvalue = driver.findElement(By.xpath("//div[@id='payment-amount']")).getText();

	System.out.println(actualvalue);
	 String actual =actualvalue.replace("$", "").replace(",","").trim();
	System.out.println(actual);
		if(Double.parseDouble(actual)==Double.parseDouble(value)) {
			System.out.println("passed");
			ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "Passed");
			ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 6);
		}
		else {
			System.out.println("Failed");
			ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "test Failed");
			ExcelUtils.fillRedColor(filepath, "Sheet1", i, 6);
		}
		
		
		
		}
	}

}
