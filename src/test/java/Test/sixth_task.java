package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sixth_task {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Verified home page is visible successfully");
		driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
		String ele = driver.findElement(By.xpath("//h2[text()='Get In Touch']")).getText();
		System.out.println(ele + " Verified it's present");
	}

}
