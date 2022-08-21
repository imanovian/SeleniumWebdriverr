package test;

import java.util.List;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		//to login//
		
		WebElement LoginLink = driver.findElement(By.linkText("Sign in"));
		LoginLink.click();
		
		//Enter mail//
		
		WebElement UserName = driver.findElement(By.id("ap_email"));
		UserName.sendKeys("9527408337");
		
		//click continue//
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		//Enter password//
		
		WebElement PWord = driver.findElement(By.name("password"));
		PWord.sendKeys("imkhan97");
		
		//Click Signin//
		
		WebElement SignInBtn = driver.findElement(By.id("signInSubmit"));
		SignInBtn.click();
		
		Thread.sleep(3000);
		
		//Re-password//
		WebElement PWord1 = driver.findElement(By.name("password"));
		PWord1.sendKeys("imkhan97");
		
		Thread.sleep(15000);
	}
	}
	

