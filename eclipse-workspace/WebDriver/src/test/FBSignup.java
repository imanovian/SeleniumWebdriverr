package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7000,TimeUnit.MILLISECONDS);

		WebElement CreateBtn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		CreateBtn.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		WebElement SurName = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		WebElement EmailConfirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		//WebElement SignUp = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		FirstName.sendKeys("Kira");
		SurName.sendKeys("yagami");
		Email.sendKeys("xyz@abc.com");
		EmailConfirm.sendKeys("xyz@abc.com");
		Password.sendKeys("Test@123");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("20");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		
		Select ddMonth= new Select(Month);
		ddMonth.selectByVisibleText("Aug");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("1997");
		

		String Gender = "Male";
		
		WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement Other = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		
	/*if(Gender.equals("Female")) {
			Female.click();
		}else if(Gender.equals("Male")) {
			Male.click();
		}else {
			Other.click();
		}
		*/
		WebElement RadioBtn = driver.findElement(By.xpath("//label[text()='"+ Gender +"']/following-sibling::input"));
		RadioBtn.click();
		
		if (Gender.equals("Custom")) {
			WebElement SelectPronouns = driver.findElement(By.name("preferred_pronoun"));
			
			Select ddSelectPro = new Select(SelectPronouns);
			ddSelectPro.selectByVisibleText("They: \"Wish them a happy birthday!\"");
		}else {
			RadioBtn.click();
		}

		
		/*List<WebElement> Months = ddMonth.getOptions();
		
		for(WebElement elm: Months) {
			System.out.println(elm.getText());*/
			
		/*List<WebElement> Months1 = driver.findElements(By.xpath("//select[@name='birthday_month']/options"));
		
		for(WebElement elm1: Months1) {
			System.out.println(elm1.getText());
			driver.close();*/
		List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for(WebElement elm: AllMonths) {
			System.out.println(elm.getText());	
	
		
		}
	}
	}


