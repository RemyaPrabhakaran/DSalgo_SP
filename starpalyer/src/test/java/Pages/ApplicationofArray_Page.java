package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class ApplicationofArray_Page extends TestBase {
	
	@FindBy(xpath="//a[contains (text(),'Try here')]")
    WebElement tryHereBtn;
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQuestionsLink;
	
	public ApplicationofArray_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}

	public String VerifyApplicationofArray() throws InterruptedException {
		
			String  VerifyApplicationofArrayTitle =driver.getTitle();
			LoggerLoad.info("Page title is : "+VerifyApplicationofArrayTitle);
			 return VerifyApplicationofArrayTitle; 
	 }
	
	 public TryHerePage_Page clickTryHere() throws IOException {
			tryHereBtn.click();
			LoggerLoad.info("Try Here button is clicked");
			return new TryHerePage_Page();

}
	 public WebElement getPracticeQuestionsLink() {
		 LoggerLoad.info("Returning Element link: "+practiceQuestionsLink);	
		 return practiceQuestionsLink;
		}
}


