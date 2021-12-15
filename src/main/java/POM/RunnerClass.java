package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RunnerClass extends Baseclass_page
{

	@Test
	public void runnerClass() throws IOException {
		signUpClass_page sp = new signUpClass_page();
		sp.display();
		sp.name();
		sp.email();
		sp.button1();

		registrationClass_page rk = new registrationClass_page();
		rk.Title();
		rk.password();
		rk.scroll();
		rk.days();
		rk.Month();
		rk.Year();
		rk.newsletter();
		rk.optin();
		rk.FName();
		rk.LName();
		rk.company();
		rk.address1();
		rk.scroll2();
		rk.address2();
		rk.state();
		rk.city();
		rk.zipcode();
		rk.mobile_number();
		rk.create();

		continueClass_page cp = new continueClass_page();
		cp.continueBtn();

		homeClass_page hp = new homeClass_page();
		hp.Check();
		hp.Delete();

	}

}
