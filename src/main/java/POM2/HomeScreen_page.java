package POM2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class HomeScreen_page extends Base_Class_Page {
	
	public HomeScreen_page() {
		
		this.driver = driver;
		
	}
	
	public HomeScreen_page screenShot1() {
		
		WebElement one = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		File Temp = one.getScreenshotAs(OutputType.FILE);
		File Per = new File("./ScreenShot/sec.png");
		try {
			FileUtils.copyFile(Temp, Per);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	public HomeScreen_page screenShot2() {
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		File Temp = tks.getScreenshotAs(OutputType.FILE);
		File Per = new File("./ScreenShot/first.png");
		try {
			FileUtils.copyFile(Temp, Per);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
		
	}

}
