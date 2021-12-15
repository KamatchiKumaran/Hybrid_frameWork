package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homeClass_page extends Baseclass_page {
	
	public homeClass_page ()
	{
		this.driver = driver;
	}
	public  homeClass_page Check() {
		Boolean Display3 = driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();
		System.out.println("Element displayed is:" +Display3);
		return this;
	}
	public  Baseclass_page Delete() {
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		return new Baseclass_page();
	}
}

