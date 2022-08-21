package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
		
		//select dob
		
		//Explicit Wait
				WebDriverWait wait = new WebDriverWait(driver,30);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));

			    
		WebElement DOB = driver.findElement(By.id("dob"));
		DOB.click();
		
		Select Month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		Month.selectByVisibleText("Aug");
		
		Select Year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		Year.selectByVisibleText("1997");
		
		WebElement Day = driver.findElement(By.xpath("//a[@data-date='1']"));
		Day.click();
		
		System.out.println("Pass");
		driver.close();
		
	}

}
