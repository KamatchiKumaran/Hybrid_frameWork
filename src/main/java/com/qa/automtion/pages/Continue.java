package com.qa.automtion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.qa.Utils.ElementUtils;

public class Continue {
	private By continuebtn = By.xpath("//a[@data-qa='continue-button']");
	private By deletebtn = By.xpath("//a[@href='/delete_account']");
	private By confirm = By.xpath("//a[@class='btn btn-primary']");
	private WebDriver driver;
	private ElementUtils elementutils;
	private JavascriptExecutor js;
	
	
	public Continue(WebDriver driver) {
		this.driver=driver;
		elementutils = new ElementUtils(this.driver);
	}
	public Continue doContinue(){
		elementutils.doClick(continuebtn);
		elementutils.doClick(deletebtn);
		elementutils.doClick(confirm);
		return this;
		
		
	}

}
