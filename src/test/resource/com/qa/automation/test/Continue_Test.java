package com.qa.automation.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.automtion.pages.Continue;
import com.qa.automtion.pages.registrationClass_page;
import com.qa.automtion.pages.signUpClass_page;
import com.qa.test.BaseTest;

public class Continue_Test extends BaseTest {
	
	public registrationClass_page registrationClass_page;
	public Continue Continue;

	
	@BeforeClass
	public void initialsetup_Continue() {
		
		registrationClass_page = signUpClass_page.doLogin(prop.getProperty("username"),
														  prop.getProperty("email"));
		
		Continue = registrationClass_page.doEnter (prop.getProperty("password"),prop.getProperty("FName"),
													prop.getProperty("LName"),prop.getProperty("Company"),
													prop.getProperty("Address1"),prop.getProperty("Address2"),
													prop.getProperty("State"),prop.getProperty("City"),
													prop.getProperty("Zipcode"),prop.getProperty("Phone"));
		
		
	}
		@Test
		public void Continue_doContinue() {
			
			Continue.doContinue();
			
		}


}