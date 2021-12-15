package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpClass_page extends Baseclass_page {

	public signUpClass_page() {
		this.driver = driver;
	}
	public signUpClass_page display() {
		Boolean display = driver.findElement(By.xpath("//div[@class='signup-form']")).isDisplayed();
		System.out.println("Element displayed is:" + display);
		return this;
	}

	public signUpClass_page name() {
		WebElement name = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		name.click();
		name.sendKeys("Kamatchi kumaran");
		return this;
	}

	public signUpClass_page email() {
		WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email.sendKeys("Kamatchi.kumaran23@gmail.com");
		return this;
	}

	public registrationClass_page button1() {

		WebElement button1 = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		button1.click();
		return new registrationClass_page();
	}

}
