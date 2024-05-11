package Pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class Queue_Page extends TestBase {

	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(linkText="Sign out")
	WebElement signOutLink;
	@FindBy(linkText="Implementation of Queue in Python")
	WebElement implementationQueueLink;
	@FindBy(linkText="Implementation using collections.deque")
	WebElement implementationCollectionsLink;
	@FindBy(linkText="Implementation using array")
	WebElement implementationArrayLink;
	@FindBy(linkText="Queue Operations")
	WebElement queueOperationsLink;
	@FindBy(xpath="//a[text()='Practice Questions']")
    WebElement practiceQuestionsLink;
	String currentURL;
	@FindBy(xpath="//a[@href='/tryEditor'][text()='Try here>>>']")
    WebElement tryHereBtn;
	
	
	public Queue_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String verifyQueuePageTitle() throws InterruptedException
	{
		String queuePageTitle = driver.getTitle();
		LoggerLoad.info("Page title is :"+queuePageTitle);
		return queuePageTitle;	
		
	}
	
	public Queue_Page clickimplementationQueueLink() throws IOException
    {
	    implementationQueueLink.click();
	    LoggerLoad.info("Implementation Queue link is clicked");
		return new Queue_Page();
    }
	
	public void verifyimplementationQueuePageTitle() throws InterruptedException
	{
		String implementationQueuePageTitle = driver.getTitle();
		LoggerLoad.info("Page title is :"+implementationQueuePageTitle);
		Assert.assertEquals("Implementation of Queue in Python", implementationQueuePageTitle);
		
	}

	public Queue_Page clickimplementationCollectionsLink() throws IOException
    {
		implementationCollectionsLink.click();
		LoggerLoad.info("Implementation Collections link is clicked");
		return new Queue_Page();
    }
	
	public void verifyimplementationCollectionsLinkPageTitle() throws InterruptedException
	{
		String implementationCollectionsLinkPageTitle = driver.getTitle();
		LoggerLoad.info("Page title is :"+implementationCollectionsLinkPageTitle);
		Assert.assertEquals("Implementation using collections.deque", implementationCollectionsLinkPageTitle);
		
	}
	
	public Queue_Page clickimplementationArrayLink() throws IOException
    {
		implementationArrayLink.click();
		LoggerLoad.info("Implementation Array link is clicked");
		return new Queue_Page();
    }
	
	public void verifyimplementationArrayLinkPageTitle() throws InterruptedException
	{
		String implementationArrayLinkPageTitle = driver.getTitle();
		LoggerLoad.info("Page title is :"+implementationArrayLinkPageTitle);
		Assert.assertEquals("Implementation using array", implementationArrayLinkPageTitle);
		
	}
	
	public Queue_Page clickqueueOperationsLink() throws IOException
    {
		queueOperationsLink.click();
		LoggerLoad.info("Operations link is clicked");
		return new Queue_Page();
    }
	
	public void verifyqueueOperationsLinkPageTitle() throws InterruptedException
	{
		String queueOperationsLinkPageTitle = driver.getTitle();
		LoggerLoad.info("Page title is :"+queueOperationsLinkPageTitle);
		Assert.assertEquals("Queue Operations", queueOperationsLinkPageTitle);
		
	}
	
	//click Try Here
	public TryHerePage_Page clickTryHere() throws IOException {
		tryHereBtn.click();
		LoggerLoad.info("Try Here button  is clicked");
		return new TryHerePage_Page();
	}
	
	public void clickPraticeQuestionsInQueue() throws IOException {
		practiceQuestionsLink.click();
		LoggerLoad.info("PracticeQuestions  is clicked");
	}
	
	public void verifyURL() {
		currentURL = driver.getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/queue/practice", currentURL);
		LoggerLoad.info("The curren url is :"+currentURL);
	}

	
}
