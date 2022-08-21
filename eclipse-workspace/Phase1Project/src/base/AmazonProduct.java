package base;

import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.MediaSize.NA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty(
		            "webdriver.chrome.driver",
		            "C:\\Users\\imarc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		  
		        // Maximize the browser
		        driver.manage().window().maximize();
		  
		        // Launch Amazon
		        driver.get("https://www.amazon.in/");
		        
		        //Search product
		        WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		        Search.sendKeys("Samsung");
		        
		        WebElement SearchBtn = driver.findElement(By.id("nav-search-submit-button"));
		        SearchBtn.click();
		        
		     
		      //div[@data-component-type='s-search-result']//h2
		      //div[@data-component-type='s-search-result']//span[@class='a-price']//span[@class='a-price-whole']
		        
		        //List out product & prices
		        List<WebElement> Product =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//h2"));
		        List<WebElement> Price =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//span[@class='a-price']//span[@class='a-price-whole']"));

		        for(int i=0; i< Product.size();i++) {
		        	System.out.println("Product "+Product.get(i).getText()+ " "+ Price.get(i).getText());
		        }
		        
		        
		        String ParentWin = driver.getWindowHandle();
		        String Expected = Product.get(0).getText();
		        
		        //Open first product 
		        WebElement OpenLink = driver.findElement(By.xpath("//div[@data-component-type='s-search-result']//h2/a[1]"));
		        OpenLink.click();
		        
		        //Product.get(0).click();
		        
		        Set <String> Allwindows = driver.getWindowHandles();
		        for (String win: Allwindows) {
		        	System.out.println(win);
		        	if (!win.equals(ParentWin)) {
		        		driver.switchTo().window(win);
		        	}
		        }
		        //validate title
		        WebElement title = driver.findElement(By.id("productTitle"));
		        String Actual = title.getText();
		        System.out.println("First product is " + Actual);
		        if (Actual.equals(Expected)){
		        	System.out.println("Title Validated");
		        }else
		        {
		        		System.out.println("Test Failed");
		        	}
		        driver.quit();
		        }
		        
		        
		    }
		
	


