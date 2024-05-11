package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class HomePage_Page extends TestBase{
	 @FindBy(xpath="//button[@class='btn']")
	 WebElement btnText;
	 
	 @FindBy(xpath="//div[@class='content']//p")
	 WebElement rightMessage;
	 @FindBy(xpath="//a[text()=' Register ']") 
	 WebElement registerInHome;
	 @FindBy(xpath="//*[@id=\"navbarCollapse\"]//a[text()='Sign in']")
	 WebElement signIn;
	 
	 
	    public HomePage_Page() throws IOException {
	        super();

	        PageFactory.initElements(driver,this);
	    }
	    
	    
	    public String verifyMessage() {
	    	LoggerLoad.info("Message is verified");
	    	return rightMessage.getText();
	    	
	    	//Assert.assertEquals("You are at the right place",rightMessage.getText() );
	    }
	    
	    public IntroductionPage_Page clickGetStartButton() throws InterruptedException, IOException {

	        btnText.click();
	        LoggerLoad.info("Introduction Page");
	        return new IntroductionPage_Page();
	        
	    }
	    
		public void registerLinkClick() throws IOException {
			registerInHome.click();
			LoggerLoad.info("Register link is clicked");
		}
	    
	   

}
