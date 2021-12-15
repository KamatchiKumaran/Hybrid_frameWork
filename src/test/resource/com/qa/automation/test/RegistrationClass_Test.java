package com.qa.automation.test;

	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.automtion.pages.registrationClass_page;
import com.qa.test.BaseTest;

	public class RegistrationClass_Test extends BaseTest { 
		
		public registrationClass_page registrationClass_page;
		
		@BeforeClass
		public void initialsetup_registrationClass_Test() {
			
			registrationClass_page = signUpClass_page.doLogin(prop.getProperty("username"),
																prop.getProperty("email"));
			
		}
		@Test
		public void registrationClass_page_doEnter() {
		registrationClass_page.doEnter (prop.getProperty("password"),prop.getProperty("FName"),
										prop.getProperty("LName"),prop.getProperty("Company"),
										prop.getProperty("Address1"),prop.getProperty("Address2"),
										prop.getProperty("State"),prop.getProperty("City"),
										prop.getProperty("Zipcode"),prop.getProperty("Phone"));
//		registrationClass_page.doEnter1(prop.getProperty("Month"),prop.getProperty("Year"));
		}
	}