package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class third_task {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/login']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("kumaran23@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("kumaran@23");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).sendKeys(Keys.ENTER);
		String ele = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();
		System.out.println(ele + " Error Message is Visible");
	}

}
