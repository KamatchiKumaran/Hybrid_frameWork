package POM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class signUpClass_page extends Base_Class_Page {
	
	public signUpClass_page() {
		
		this.driver = driver;
		
	}
	
	public signUpClass_page name() {
		WebElement name = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		name.click();
		name.sendKeys("kamatchi.kumaran23@gmail.com");
		return this;
	}
		
	public signUpClass_page password() {
		WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
		password.click();
		password.sendKeys("dhanalakshmi");
		return this;
	}
	
	public HomeScreen_page click() {
		WebElement Click = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
		Click.click();
		return new HomeScreen_page();
		
	}
	

}
