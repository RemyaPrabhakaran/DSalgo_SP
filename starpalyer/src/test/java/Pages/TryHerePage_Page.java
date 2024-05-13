package Pages;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import junit.framework.Assert;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

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
		
	}
	public String validateTryHerePageTitle() throws InterruptedException  {
	
		String tryHerePageTitle = driver.getTitle();
		return tryHerePageTitle;
	}
	public void clickRunButton() {
		runBtn.click();
	}
	
	
	@SuppressWarnings("deprecation")
	public void verifyConsoleOutput() {
		String output = consoleOutput.getText();
		Assert.assertEquals("hello", output);
	}
	
	public void getAlertMessage() {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
	}
	
	public void clickOkOnAlert() {
		driver.switchTo().alert().accept();
		
	}
	

}
	

