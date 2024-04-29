package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
	}
	
	public static void browserLaunch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchUrl() {
		driver.get(prop.getProperty("URL"));
	}

 
}
