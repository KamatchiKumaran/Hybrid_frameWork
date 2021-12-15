package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class continueClass_page extends Baseclass_page {
	public continueClass_page ()
	{
		this.driver = driver;
	}
	public  homeClass_page continueBtn() {
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		return new homeClass_page();
	}

}

