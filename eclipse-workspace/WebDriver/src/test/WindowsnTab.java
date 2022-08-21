package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsnTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);
		
		String ParentWin = driver.getWindowHandle();
		System.out.println("Before Clicking Tab button the win is " + ParentWin);

		
		WebElement button1 = driver.findElement(By.id("tabButton"));
		 button1.click();
		 
		 System.out.println("After clicking the tab button");
			
		 Set<String> allWins = driver.getWindowHandles();
			
			for (String win : allWins) {
			    
				System.out.println(win);
				
				if(!win.equals(ParentWin)) {
					driver.switchTo().window(win);
					
					WebElement childHeader = driver.findElement(By.id("sampleHeading"));
					System.out.println(childHeader.getText());
					driver.close();


					
			driver.switchTo().window(ParentWin);
			
			WebElement window= driver.findElement(By.id("windowButton"));
			window.click();
			
	for (String winnew : allWins) {
			    
				System.out.println(winnew);
				
				if(!win.equals(ParentWin)) {
					driver.switchTo().window(winnew);
				
					WebElement childHeaderNew = driver.findElement(By.id("sampleHeading"));
					System.out.println(childHeaderNew.getText());
					driver.close();



	}
			}
}
			}}}
