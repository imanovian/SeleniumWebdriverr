package test;

import java.util.List;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
		// Step1. Click  on the Login Link
		
				WebElement LoginLink = driver.findElement(By.linkText("Log in"));
				LoginLink.click();
				
				WebElement UserName = driver.findElement(By.name("user_login"));
				UserName.sendKeys("abc@xyz.com");
				
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("Test@1234");
				
				WebElement CheckBox = driver.findElement(By.className("rememberMe"));
				CheckBox.click();
				
				WebElement LoginBtn = driver.findElement(By.name("btn_login"));
				LoginBtn.click();
				
				Thread.sleep(5000);
				WebElement Error = driver.findElement(By.id("msg_box"));
				
				String ActError = Error.getText();
				String ExpError = "The email or password you have entered is invalid." ;
				
				if (ActError.equals(ExpError)) {
					System.out.println("TC PASSED");
				}
				else {
						System.out.println("TC Failed");
					}
				
				List<WebElement> Links = driver.findElements(By.tagName("a"));
				System.out.println("Total num of links are " + Links.size());
				
				for(int index=0;index<Links.size();index++) {
					
					System.out.println(Links.get(index).getAttribute("href"));

				
				driver.close();
				}
				
				
						
				
				 
	}
		
		
	
	}

		



