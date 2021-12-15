package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTask {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Successfull");
		driver.findElement(By.xpath("//a[@href='/login']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("kamatchi.kumaran23@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("dhanalakshmi");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).sendKeys(Keys.ENTER);
		WebElement one = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		File Temp = one.getScreenshotAs(OutputType.FILE);
		File Per = new File("./ScreenShot/sec.png");
		try {
			FileUtils.copyFile(Temp, Per);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		TakesScreenshot tks = (TakesScreenshot) driver;
//		File Temp = tks.getScreenshotAs(OutputType.FILE);
//		File Per = new File("./ScreenShot/first.png");
//		try {
//			FileUtils.copyFile(Temp, Per);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
	}

}
