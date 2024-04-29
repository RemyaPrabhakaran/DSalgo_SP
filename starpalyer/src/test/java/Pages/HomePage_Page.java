package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import junit.framework.Assert;

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
	    	
	    	return rightMessage.getText();
	    	
	    	//Assert.assertEquals("You are at the right place",rightMessage.getText() );
	    }
	    
	    public IntroductionPage_Page clickGetStartButton() throws InterruptedException, IOException {

	        btnText.click();
	        return new IntroductionPage_Page();
	        
	    }
	    
		public void registerLinkClick() throws IOException {
			registerInHome.click();
		}
	    
	   

}
