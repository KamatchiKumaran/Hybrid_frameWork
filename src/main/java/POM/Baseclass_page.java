package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_page {
	public static ChromeDriver driver;
	public static JavascriptExecutor js;

	
	@BeforeMethod
	public void pre_Condition() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("//li[4]/a[@href='/login']"));
		login.click();
		js = (JavascriptExecutor) driver;
	}

	 @AfterMethod
	 public void post_Condition()
	 {
	 driver.close();
	
	 }
}
