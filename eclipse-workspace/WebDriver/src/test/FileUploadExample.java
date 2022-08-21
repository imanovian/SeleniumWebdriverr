package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	driver.manage().window().maximize();
	
	WebElement FileUpload = driver.findElement(By.name("uploadfile_0"));
	FileUpload.sendKeys("C:\\Users\\imarc\\Desktop\\Github\\File1.txt");
	
	WebElement TnC = driver.findElement(By.id("terms"));
	TnC.click();
	
	WebElement Submit = driver.findElement(By.id("submitbutton"));
	Submit.click();


		

	
	}
}
