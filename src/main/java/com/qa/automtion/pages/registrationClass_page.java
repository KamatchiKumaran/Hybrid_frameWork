package com.qa.automtion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.Utils.ElementUtils;
public class registrationClass_page  {
//	private By Display2 = By.xpath("//div[@class='login-form']/h2[@class='title text-center']");
	private By password = By.xpath("//input[@type='password']");
	private By days = By.xpath("//select[@id='days']");
	private By Month = By.xpath("//select[@id='months']");
	private By Year = By.xpath("//select[@id='years']");
	private By newsletter = By.xpath("//input[@name='newsletter']");
	private By optin = By.xpath("//input[@name='optin']");
	private By FName = By.xpath("//input[@data-qa='first_name']");
	private By LName = By.xpath("//input[@data-qa='last_name']");
	private By Company = By.xpath("//input[@data-qa='company']");
	private By Address1 = By.xpath("//input[@data-qa='address']");
	private By Address2 = By.xpath("//input[@data-qa='address2']");
	private By State = By.xpath("//input[@id='state']");
	private By City = By.xpath("//input[@id='city']");
	private By Zipcode = By.xpath("//input[@id='zipcode']");
	private By Phone = By.xpath("//input[@id='mobile_number']");
	private By Create = By.xpath("//button[@data-qa='create-account']");
	
	private WebDriver driver;
	private ElementUtils elementutils;
	private JavascriptExecutor js;
	
	public registrationClass_page(WebDriver driver) {
		this.driver=driver;
		elementutils = new ElementUtils(this.driver);
	}

		public Continue doEnter(String pwd, String Fname, 
											  String Lname, String Cmpny, 
											  String addr1, String addr2,
											  String state, String city,
											  String zipcode, String phone) {
//			elementutils.isElementDisplayed(Display2);
//			System.out.println("Element displayed");
			elementutils.doSendKeys(password, pwd);
//     		js.executeScript("window.scrollBy(0,600)");
			elementutils.doClick(days);
			Select sel= new Select (driver.findElement(days));
			sel.selectByValue("23");
			elementutils.doClick(Month);
			Select sel1= new Select (driver.findElement(Month));
			sel1.selectByValue("6");
			elementutils.doClick(Year);
			Select sel2= new Select (driver.findElement(Year));
			sel2.selectByValue("1999");
			elementutils.doClick(newsletter);
			elementutils.doClick(optin);
			elementutils.doSendKeys(FName, Fname);
			elementutils.doSendKeys(LName, Lname);
//			js.executeScript("window.scrollBy(0,600)");
			elementutils.doSendKeys(Company, Cmpny);
			elementutils.doSendKeys(Address1, addr1);
			elementutils.doSendKeys(Address2, addr2);
			elementutils.doSendKeys(State, state);
			elementutils.doSendKeys(City, city);
			elementutils.doSendKeys(Zipcode, zipcode);
			elementutils.doSendKeys(Phone, phone);
			elementutils.doClick(Create);
			return new Continue(driver);
		}
}
