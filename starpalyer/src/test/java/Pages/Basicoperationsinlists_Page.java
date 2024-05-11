package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class Basicoperationsinlists_Page extends TestBase {
	
	@FindBy(xpath="//a[contains (text(),'Try here')]")
    WebElement tryHereBtn;
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQuestionsLink;

	public Basicoperationsinlists_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);	
	}
	
	 public String VerifyBasicoperationsinlists() throws InterruptedException {
		  
			String  VerifyBasicoperationsinlistsTitle =driver.getTitle();
			LoggerLoad.info("Page title is: "+VerifyBasicoperationsinlistsTitle);
			  return VerifyBasicoperationsinlistsTitle; 
	 }
	
	 public TryHerePage_Page clickTryHere() throws IOException {
			tryHereBtn.click();
			LoggerLoad.info("Try Here button is clicked");
			return new TryHerePage_Page();


}
	 public WebElement getPracticeQuestionsLink() {
			return practiceQuestionsLink;
		}
}
