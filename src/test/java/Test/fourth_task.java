package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fourth_task {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/login']")).sendKeys(Keys.ENTER);
		String ele = driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText();
		System.out.println(ele+ " Verified it's Visible" );
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("kamatchi.kumaran23@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("dhanalakshmi");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).sendKeys(Keys.ENTER);
		String ele2 = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
		System.out.println(ele2 + " is been Verified");
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		System.out.println("Successfully Navigated to login page ");
		
	}

}
