package MyHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import manager.driver.DriverManager;

public class dsalgoHooks {
	public static WebDriver driver;

	/*
	 * @Before public void setup() { driver = DriverManager.getDriver();
	 * System.out.println("Hello"); }
	 */
	@After
	public void tearDown() {
		if(driver == null) {
			driver = DriverManager.getDriver();
		}
		
		driver.quit();
		
	}
}
