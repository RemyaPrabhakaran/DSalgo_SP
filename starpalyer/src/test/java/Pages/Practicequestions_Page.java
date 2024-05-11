package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;
import junit.framework.Assert;

public class Practicequestions_Page extends TestBase {

	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")
	WebElement practiceQuestions;
	@FindBy(xpath="//a[contains (text(),'Search the array')]") 
	WebElement searchArray;
	@FindBy(xpath="//a[contains (text(),'Max Consecutive Ones')]") 
	WebElement maxConsecutiveones;
	@FindBy(xpath="//a[contains (text(),'Find Numbers with Even Number of Digits')]") 
	WebElement evenNoOfDigit;
	@FindBy(xpath="//a[contains (text(),'Squares of  a Sorted Array')]") 
	WebElement squareSortedArray;
	@FindBy(xpath="//div[contains(@class,'CodeMirror')]//textarea")
	WebElement codeEditor;
	@FindBy(xpath="//button[text()='Run']")
	WebElement runBtn;
	@FindBy(xpath="//button[text()='Run']")
	WebElement submitBtn;
	@FindBy(id="output") WebElement output;
	
	public Practicequestions_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);	
		
	}

	public void clickonpracticequestion(){
		 
		practiceQuestions.click();
		
	}
	@SuppressWarnings("deprecation")
	public void verifyURL() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/array/practice", currentURL);
		LoggerLoad.info("Current url is : "+currentURL);
	
}
	@SuppressWarnings("deprecation")
	public void verifypracticequestionlinkURL(String string) {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(string, currentURL);
		LoggerLoad.info("Current url is : "+currentURL);
}
	
	public void clickonmaxConsecutiveones() {
		maxConsecutiveones.click();	
		LoggerLoad.info("Max consecutive ones link is clicked");
				
	}
	public void clickonsearcharray() {
		searchArray.click();	
		LoggerLoad.info("Search Array link is clicked");
				
	}
	public void clickonevenNoOfDigit() {
		evenNoOfDigit.click();
		LoggerLoad.info("Even no of digit link is clicked");
				
	}
	public void clickonsquareSortedArray() {
		squareSortedArray.click();
		LoggerLoad.info("Square sorted Array link is clicked");
				
	}
	
	public void verifyPracticeQuestionTitle(WebElement e) {
		e.click();
		LoggerLoad.info("Practice Question lins is clicked");
	}
	
	public void executePythonCode(String codeFromSheet/*, String resultFromSheet*/) throws InterruptedException  {
		
		//driver.navigate().refresh();
		
		//Thread.sleep(2000);
		//codeEditor.clear();
		codeEditor.sendKeys(codeFromSheet);
		//Thread.sleep(3000);
	//	runBtn.click();
	//	String msgFromPage = output.getText();
		//Assert.assertEquals(resultFromSheet, msgFromPage);
		//System.out.print("code executed");
		
	}
	
	public void clickRunButton() {
		runBtn.click();
		LoggerLoad.info("Run Button is clicked");
	}
	
	public void clickSubmitButton() {
		submitBtn.click();
		LoggerLoad.info("Submit Button is clicked");
	}
	
	public void getAlertMessage() {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
	}
	
	public void clickOkOnAlert() {
		driver.switchTo().alert().accept();
		
	}
	
	@SuppressWarnings("deprecation")
	public void getOutput() {
		try {
			String result = output.getText();
	//		Assert.assertEquals("Error occurred during submission", result);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
