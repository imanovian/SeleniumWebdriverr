package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
		
		 WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		 button1.click();
		 
		 Alert alert = driver.switchTo().alert();
		 System.out.println("the alert msg is "+ alert.getText());
		 alert.accept();
		 
		 WebElement button2= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		 button2.click();
		 Alert alert2 = driver.switchTo().alert();
		 alert2.dismiss();
		 
	    WebElement button3= driver.findElement(By.xpath("//button[@id='promtButton']"));
	    button3.click();
	    
	    Alert alert3 = driver.switchTo().alert();
	    alert3.sendKeys("Hello Imran");
	    alert3.accept();
	}

}
