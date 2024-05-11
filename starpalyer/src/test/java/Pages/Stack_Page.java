package Pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Stack_Page extends TestBase {

	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(linkText="Sign out")
	WebElement signOutLink;
	@FindBy(linkText="Operations in Stack")
	WebElement operationsLink;
	@FindBy(linkText="Implementation")
	WebElement impletmentationLink;
	@FindBy(linkText="Applications")
	WebElement applicationsLink;
	String currentURL;
	
	
	public Stack_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String verifyStackPageTitle() throws InterruptedException
	{
		String stackPageTitle = driver.getTitle();
		return stackPageTitle;	
		
	}
	
	public operationsInStack_Page verifyOperationsInStackBtn() throws IOException
    {
    	operationsLink.click();
    	return  new operationsInStack_Page();
    }
	
	public Implementation_Page verifyImplementationBtn() throws IOException
    {
		impletmentationLink.click();
    	return  new Implementation_Page();
    }
	
	public Applications_Page verifyApplicationsBtn() throws IOException
    {
		applicationsLink.click();
    	return  new Applications_Page();
    }
	
	public void clickPraticeQuestionsInStack(WebElement e) throws IOException {
		e.click();
	}
	
	public void verifyURL() {
		currentURL = driver.getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/stack/practice", currentURL);
	}

}
