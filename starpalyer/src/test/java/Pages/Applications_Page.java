package Pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class Applications_Page extends TestBase {

	//Webelements in Applications
		@FindBy(xpath="//a[text()='Operations in Stack']")
		WebElement operationsInStackLink;
		@FindBy(xpath="///a[text()='Implementation']")
		WebElement implementationLink;
		@FindBy(xpath="//a[text()='Applications']")
		WebElement applicationsLink;
		@FindBy(xpath="//a[text()=' Starplayers ']")
		WebElement userSignedIn;
		@FindBy(xpath="//a[text()='Sign out']")
		WebElement signOutLink;
		@FindBy(xpath="//a[text()='Practice Questions']")
		WebElement practiceQuestionsLink;
		@FindBy(xpath="//a[@href='/tryEditor'][text()='Try here>>>']")
		WebElement tryHereBtn;
		
		
		public Applications_Page() throws IOException {
			super();
			PageFactory.initElements(driver,this);
		}
		
		//get page title
		public String verifyApplicationsPageTitle() throws InterruptedException
		{ 
			String  applicationsPageTitle = driver.getTitle();
			LoggerLoad.info("Page title is: "+applicationsPageTitle);
			return applicationsPageTitle;
		}
		
		//click try here button
		public TryHerePage_Page clickTryHere() throws IOException {
			tryHereBtn.click();
			LoggerLoad.info("Try Here button is clicked");
			return new TryHerePage_Page();
		}
		
		//method to get Practice Questions Element
		public WebElement getPracticeQuestionsLink() {
			return practiceQuestionsLink;
		}
	
}
