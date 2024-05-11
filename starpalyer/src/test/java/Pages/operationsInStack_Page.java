package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class operationsInStack_Page extends TestBase{

	//Webelements in Operations in Stack Page
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
	//String currentURL;
	
	//pagefactory
	public operationsInStack_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	//Verify and return page title
	public String verifyOperationsInStackTitle() throws InterruptedException
	{ 
		String  operationsInStackTitle =driver.getTitle();
		LoggerLoad.info("Page title is : "+operationsInStackTitle);
		return operationsInStackTitle;
	}
	
	//click Try Here
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
