package Pages;

import java.io.IOException;

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
	 
	 
	    public HomePage_Page() throws IOException {
	        super();

	        PageFactory.initElements(driver,this);
	    }
	    
	    
	    public void verifyMessage() {
	    	Assert.assertEquals("You are at the right place",rightMessage.getText() );
	    }
	    
	    
	    

	    public void clickGetStartButton() throws InterruptedException {

	        btnText.click();
	        
	    }

}
