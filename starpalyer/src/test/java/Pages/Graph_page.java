package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import junit.framework.Assert;

public class Graph_page extends TestBase {
	
	@FindBy(linkText="Starplayers")WebElement signeduser;
	@FindBy(linkText="Sign out")WebElement signOutLink;
	@FindBy(linkText="Graph")WebElement graphLink;
	@FindBy(linkText="Graph Representations")WebElement graphRepresentationsLink;
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement practiceQuestionsLink;
	String currentURL;
	@FindBy(xpath="//a[@href='/tryEditor'][text()='Try here>>>']")WebElement tryHereBtn;

	public Graph_page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
  public String verifymaingraphpagetitle() {
	String maingraphpagepage= driver.getTitle();
	return maingraphpagepage;
 
    }
  
  public Graph_page clickongraph() throws IOException {
	graphLink.click();
	return new Graph_page();
  }
  
	public void verifygraphtitle() {
		String graphtitle= driver.getTitle();
		Assert.assertEquals("Graph", graphtitle);	
	}
	public Graph_page clickGraphRepresentationsLink() throws IOException
    {
		graphRepresentationsLink.click();
		return new Graph_page();
    }
	
	public void verifyGraphRepresentationsPageTitle() throws InterruptedException
	{
		String graphRepresentationsLinkPageTitle = driver.getTitle();
		Assert.assertEquals("Graph Representations", graphRepresentationsLinkPageTitle);
		
	}
	//click Try Here
		public TryHerePage_Page clickTryHere() throws IOException {
			tryHereBtn.click();
			return new TryHerePage_Page();
		}
		
		public void clickPraticeQuestionsInGraph() throws IOException {
			practiceQuestionsLink.click();
		}
		
		public void verifyURL() {
			currentURL = driver.getCurrentUrl();
			Assert.assertEquals("https://dsportalapp.herokuapp.com/graph/practice", currentURL);
		}

		
	}

	
	

