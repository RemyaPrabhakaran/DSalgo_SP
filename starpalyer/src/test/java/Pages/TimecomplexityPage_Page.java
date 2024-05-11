package Pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;

import org.openqa.selenium.Keys;

import base.TestBase;

public class TimecomplexityPage_Page  extends TestBase{

	@FindBy(xpath="//div[@class='col-sm']/a")
    WebElement tryHereBtn;
	//@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")
	@FindBy(linkText="Practice Questions")
	WebElement practiceQuestion;
	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(linkText="Sign out")
	WebElement Signout;
	public TimecomplexityPage_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String verifyTimecomplexity() throws InterruptedException
	{
		//Thread.sleep(3000);  
		String  timecomplexityTitle =driver.getTitle();
		LoggerLoad.info("Page title is : "+timecomplexityTitle);
		return timecomplexityTitle;
	}
	
	public TryHerePage_Page clickTryHere() throws IOException {
		Actions action = new Actions (driver);
		action.click(tryHereBtn).build().perform();
		//tryHereBtn.click();
		LoggerLoad.info("Try Here button is clicked");
		return new TryHerePage_Page();
	}
	
	public PracticePage_Page practiceLinkclick() throws IOException {
		  practiceQuestion.click(); 
		  LoggerLoad.info("Practice is clicked");
		  return new PracticePage_Page(); 
	}
		 
       
       
}