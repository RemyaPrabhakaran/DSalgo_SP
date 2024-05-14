package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream input=new FileInputStream("src//main//java//config//config.properties");
		//FileInputStream input=new FileInputStream("C://Users//remya//git//DSalgo_SP//starpalyer//src//main//java//config//config.properties");
		prop.load(input);
	}
	
	public static void initialization() {
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver= new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
		}
		else if(browserName.equals("firefox") ){
			driver= new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
		}
		
		
	}
	
	public static void browserLaunch() {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
			String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver= new ChromeDriver();
	
		}
		else if(browserName.equals("firefox") ){
			driver= new FirefoxDriver();
		}
		
	}
	
	
	public static void launchUrl() {
		driver.get(prop.getProperty("URL"));
	}

 
}
