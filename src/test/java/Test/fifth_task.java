package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fifth_task {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/login']")).sendKeys(Keys.ENTER);
		String ele = driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText();
		System.out.println(ele+ " Verified it's Visible" );
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("kumaran");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("kamatchi.kumaran23@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).sendKeys(Keys.ENTER);
		String ele1 = driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).getText();
		System.out.println(ele1 + " Error message is Visible");
	}

}
