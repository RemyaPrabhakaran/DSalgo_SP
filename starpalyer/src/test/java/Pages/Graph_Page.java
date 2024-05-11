package Pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class Graph_Page extends TestBase{
	
	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(linkText="Sign out")
	WebElement signOutLink;
	@FindBy(linkText="Graph")
	WebElement graphLink;
	@FindBy(linkText="Graph Representations")
	WebElement graphRepresentationsLink;
	@FindBy(xpath="//a[text()='Practice Questions']")
    WebElement practiceQuestionsLink;
	String currentURL;
	@FindBy(xpath="//a[@href='/tryEditor'][text()='Try here>>>']")
    WebElement tryHereBtn;

	public Graph_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String verifyMainGraphPageTitle() throws InterruptedException
	{
		String mainGraphPageTitle = driver.getTitle();
		LoggerLoad.info("Page Title is :"+mainGraphPageTitle);
		return mainGraphPageTitle;	
		
	}
	
	public Graph_Page clickGraphLink() throws IOException
    {
		graphLink.click();
		LoggerLoad.info("GraphLink clicked");
		return new Graph_Page();
    }
	
	public void verifyGraphPageTitle() throws InterruptedException
	{
		String graphPageTitle = driver.getTitle();
		LoggerLoad.info("Page Title is :"+graphPageTitle);
		Assert.assertEquals("Graph", graphPageTitle);
		
	}

	public Graph_Page clickGraphRepresentationsLink() throws IOException
    {
		graphRepresentationsLink.click();
		LoggerLoad.info("Graph Representation Link clicked");
		return new Graph_Page();
    }
	
	public void verifyGraphRepresentationsPageTitle() throws InterruptedException
	{
		String graphRepresentationsLinkPageTitle = driver.getTitle();
		LoggerLoad.info("Page Title is :"+graphRepresentationsLinkPageTitle);
		Assert.assertEquals("Graph Representations", graphRepresentationsLinkPageTitle);
		
	}	
		
	//click Try Here
	public TryHerePage_Page clickTryHere() throws IOException {
		tryHereBtn.click();
		LoggerLoad.info("Try Here button clicked.");
		return new TryHerePage_Page();
	}
	
	public void clickPraticeQuestionsInGraph() throws IOException {
		practiceQuestionsLink.click();
		LoggerLoad.info("Practice Questions Link clicked.");
		
	}
	
	public void verifyURL() {
		currentURL = driver.getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/practice", currentURL);
		LoggerLoad.info("You are on Page : "+currentURL);
	}

	
}
