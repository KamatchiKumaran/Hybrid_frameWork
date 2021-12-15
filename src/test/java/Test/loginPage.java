package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {
	

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//li[4]/a[@href='/login']"));
		login.click();
		Boolean Display = driver.findElement(By.xpath("//div[@class='signup-form']")).isDisplayed();
		System.out.println("Element displayed is:" +Display);
		WebElement name = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		name.sendKeys("Krithika");
		WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email.sendKeys("Krithika162@gmail.com");
		WebElement button1 = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		button1.click();
		Boolean Display2 = driver.findElement(By.xpath("//div[@class='login-form']/h2[@class='title text-center']")).isDisplayed();
		System.out.println("Element displayed is:" +Display2);
		WebElement Title = driver.findElement(By.xpath("//input[@value='Mrs']"));
		Title.click();
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("dhanalakshmi");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		days.click();
			Select sel= new Select (days);
			sel.selectByValue("16l");
		WebElement Month = driver.findElement(By.xpath("//select[@id='months']"));
		Month.click();
			Select sel1= new Select (Month);
			sel1.selectByValue("6");
		WebElement Year = driver.findElement(By.xpath("//select[@id='years']"));
		Year.click();
			Select sel2= new Select (Year);
			sel2.selectByValue("1999");
		WebElement newsletter = driver.findElement(By.xpath("//input[@name='newsletter']"));
		newsletter.click();
		WebElement optin = driver.findElement(By.xpath("//input[@name='optin']"));
		optin.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@data-qa='first_name']"));
		firstName.sendKeys("Kamatchi");
		WebElement LastName = driver.findElement(By.xpath("//input[@data-qa='last_name']"));
		LastName.sendKeys("Kumaran");
		WebElement company = driver.findElement(By.xpath("//input[@data-qa='company']"));
		company.sendKeys("Oranium-Tech");
		WebElement address1 = driver.findElement(By.xpath("//input[@data-qa='address']"));
		address1.sendKeys("57,santhiKoodam,Street");
		js.executeScript("window.scrollBy(0,600)");
		WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("chennai-600023");
		WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
		state.sendKeys("Tamil Nadu");
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Chennai");
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
		zipcode.sendKeys("600023");
		WebElement mobile_number = driver.findElement(By.xpath("//input[@id='mobile_number']"));
		mobile_number.sendKeys("8220536277");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		Boolean Display3 = driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();
		System.out.println("Element displayed is:" +Display3);
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		
	}

}

