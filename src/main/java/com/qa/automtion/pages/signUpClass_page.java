package com.qa.automtion.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Utils.ElementUtils;

public class signUpClass_page {
	private By click = By.xpath("//li[4]/a[@href='/login']");
	private By username = By.xpath("//input[@data-qa='signup-name']");
	private By email = By.xpath("//input[@data-qa='signup-email']");
	private By Login = By.xpath("//button[@data-qa='signup-button']");
	
	private WebDriver driver;
	private ElementUtils elementutils;
	
	public signUpClass_page(WebDriver driver) {
		this.driver=driver;
		elementutils = new ElementUtils(this.driver);
	}
	
	public registrationClass_page doLogin(String uname, String emal) {
		elementutils.doClick(click);
		elementutils.doSendKeys(username, uname);
		elementutils.doSendKeys(email, emal);
		elementutils.doClick(Login);
	
		return new registrationClass_page(driver);
		
	}
}