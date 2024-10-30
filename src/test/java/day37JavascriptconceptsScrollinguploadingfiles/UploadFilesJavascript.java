package day37JavascriptconceptsScrollinguploadingfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilesJavascript {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		///single file upload
		
	//	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\User\\Downloads\\new4.txt");
		
		//String filename=driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();		
		//1st stratergy
	/*	if(!filename.isEmpty()) {
			System.out.println("file uploaded"+filename);
		}
		else {
			System.out.println("file did not  uploaded ");
		}
		//2nd stratergy
		if(filename.equals("new4.txt")) {
			System.out.println("file uploaded"+filename);
		}
		else {
			System.out.println("file did not  uploaded ");
		}*/
		
		//handling multiple file upload 
		
		String file1 ="C:\\Users\\User\\Downloads\\new4.txt";
		String file2 ="C:\\Users\\User\\Downloads\\newfile.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int filename=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();		
		if(filename==2) {
			System.out.println("2 file uploaded");
			}
			else {
				System.out.println("file did not  uploaded ");
			}
		String firstfile=driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText();
		String Secondfile=driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText();
		if(firstfile.equals("new4.txt") && Secondfile.equals("newfile.txt")) {
			System.out.println("both File uploaded successfully");
		}
		else {
			System.out.println("file did not  uploaded ");
		
		}
	}

}
