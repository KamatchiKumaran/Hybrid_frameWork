package POM2;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.registrationClass_page;

public class RunnerClass_page extends Base_Class_Page {
	
	@Test
	public void RunnerClass_page() throws IOException {
		
		signUpClass_page sp = new signUpClass_page();
		sp.name();
		sp.password();
		sp.click();
		
		HomeScreen_page hp = new HomeScreen_page();
		hp.screenShot1();
		hp.screenShot2();
		
		
	}
	

}
