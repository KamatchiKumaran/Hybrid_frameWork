package POM2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class_Page {
	
	public static ChromeDriver driver;
	public static JavascriptExecutor js;
	
	@BeforeClass
	public void pre_Condition() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/login']")).sendKeys(Keys.ENTER);
		js=(JavascriptExecutor)driver;
	}
	
//	 @AfterClass
//	 public void post_Condition()
//	 {
//	 driver.close();
//	
//	 }

}
