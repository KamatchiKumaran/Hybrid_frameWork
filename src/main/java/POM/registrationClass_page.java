package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registrationClass_page extends Baseclass_page {
	public registrationClass_page() {
		this.driver = driver;
	}

	public registrationClass_page Title() {
		Boolean Display2 = driver.findElement(By.xpath("//div[@class='login-form']/h2[@class='title text-center']")).isDisplayed();
		System.out.println("Element displayed is:" + Display2);
		WebElement Title = driver.findElement(By.xpath("//input[@value='Mr']"));
		Title.click();
		return this;
	}

	public registrationClass_page password() {

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("dhanalakshmi");
		return this;
	}

	public registrationClass_page scroll() {
		js.executeScript("window.scrollBy(0,600)");
		return this;
	}

	public registrationClass_page days() {
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		days.click();
		Select sel = new Select(days);
		sel.selectByValue("23");
		return this;
	}

	public registrationClass_page Month() {
		WebElement Month = driver.findElement(By.xpath("//select[@id='months']"));
		Month.click();
		Select sel1 = new Select(Month);
		sel1.selectByValue("6");
		return this;
	}

	public registrationClass_page Year() {
		WebElement Year = driver.findElement(By.xpath("//select[@id='years']"));
		Year.click();
		Select sel2 = new Select(Year);
		sel2.selectByValue("1999");
		return this;
	}

	public registrationClass_page newsletter() {
		WebElement newsletter = driver.findElement(By.xpath("//input[@name='newsletter']"));
		newsletter.click();
		return this;
	}

	public registrationClass_page optin() {
		WebElement optin = driver.findElement(By.xpath("//input[@name='optin']"));
		optin.click();
		return this;
	}

	public registrationClass_page FName() {
		WebElement firstName = driver.findElement(By.xpath("//input[@data-qa='first_name']"));
		firstName.sendKeys("Kamatchi");
		return this;
	}

	public registrationClass_page LName() {
		WebElement LastName = driver.findElement(By.xpath("//input[@data-qa='last_name']"));
		LastName.sendKeys("Kumaran");
		return this;
	}

	public registrationClass_page company() {
		WebElement company = driver.findElement(By.xpath("//input[@data-qa='company']"));
		company.sendKeys("Oranium-Tech");
		return this;
	}

	public registrationClass_page address1() {
		WebElement address1 = driver.findElement(By.xpath("//input[@data-qa='address']"));
		address1.sendKeys("57,santhiKoodam,Street");
		return this;
	}

	public registrationClass_page scroll2() {
		js.executeScript("window.scrollBy(0,600)");
		return this;
	}

	public registrationClass_page address2() {
		WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("chennai-600023");
		return this;
	}

	public registrationClass_page state() {
		WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
		state.sendKeys("Tamil Nadu");
		return this;
	}

	public registrationClass_page city() {
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Chennai");
		return this;
	}

	public registrationClass_page zipcode() {
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
		zipcode.sendKeys("600023");
		return this;
	}

	public registrationClass_page mobile_number() {
		WebElement mobile_number = driver.findElement(By.xpath("//input[@id='mobile_number']"));
		mobile_number.sendKeys("8220536277");
		return this;
	}

	public continueClass_page create() {
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		return new continueClass_page();
	}
}
