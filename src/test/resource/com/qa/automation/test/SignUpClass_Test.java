	package com.qa.automation.test;

	import org.testng.annotations.Test;

import com.qa.test.BaseTest;

	public class SignUpClass_Test extends BaseTest { 

		@Test
		public void loginTest() {
			
			signUpClass_page.doLogin(prop.getProperty("username"),prop.getProperty("email"));
		}
	}

