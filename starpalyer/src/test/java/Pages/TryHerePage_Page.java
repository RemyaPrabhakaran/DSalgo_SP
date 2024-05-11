package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;
import junit.framework.Assert;

public class TryHerePage_Page extends TestBase{
	
//	@FindBy(xpath="//div[@class='CodeMirror-lines' and @role='presentation']")
//	WebElement codeEditor;
	@FindBy(xpath="//div[contains(@class,'CodeMirror')]//textarea")
	WebElement codeEditor;
	@FindBy(xpath="//button[@type='button']")
	WebElement runBtn;
	@FindBy(xpath="//pre[@id='output']")
	WebElement consoleOutput;
	
	

	public TryHerePage_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void executeCode(String code) throws InterruptedException  {
		
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", codeEditor);
		codeEditor.sendKeys(code);
		runBtn.click();
		System.out.print("code executed");
		LoggerLoad.info("Code is executed and Run button is clicked");
		
	}
	public String validateTryHerePageTitle() throws InterruptedException  {
	
		String tryHerePageTitle = driver.getTitle();
		LoggerLoad.info("Page title is : "+tryHerePageTitle);
		return tryHerePageTitle;
	}
	
	public void clickRunButton() {
		runBtn.click();
		LoggerLoad.info("Run button is clicked");
	}
	
	
	@SuppressWarnings("deprecation")
	public void verifyConsoleOutput() {
		String output = consoleOutput.getText();
		Assert.assertEquals("hello", output);
		LoggerLoad.info("Console output is "+output);
	}
	
	public void getAlertMessage() {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		LoggerLoad.warn(alertMessage);
	}
	
	public void clickOkOnAlert() {
		driver.switchTo().alert().accept();
		
	}
	public void executecodewithoutdata(String code) throws InterruptedException
	   {
		   
			
		   driver.navigate().refresh();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", codeEditor);
			codeEditor.sendKeys("");
			runBtn.click();
			System.out.print("code executed");
			LoggerLoad.info("Execute without code");
	   }
	   
	   public void executeinvalidcode(String code) throws InterruptedException {
		   driver.navigate().refresh();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", codeEditor);
			codeEditor.sendKeys("hello");
			//Thread.sleep(5000);
			LoggerLoad.info("Executing Invalid code....");
			runBtn.click();
			
	   }
	   

	   public void validateErrorMessage()
	   {
		   String alertMsg= driver.switchTo().alert().getText();
		   System.out.println(alertMsg);
		   driver.switchTo().alert().accept();
	   }
	   

}
