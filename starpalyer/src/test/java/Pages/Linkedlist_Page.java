package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class Linkedlist_Page extends TestBase {
	
	@FindBy(xpath=("//*[text()='Linked List']/..//*[text()='Get Started']"))
	public WebElement linkedList_GetStartedBtn;
	@FindBy(xpath=("//h4[text()='Linked List']"))
	public WebElement linkedlistTitile;
	@FindBy(xpath=("//a[text()='Introduction']"))
    public WebElement introduction;
	@FindBy(xpath=("//p[text()='Introduction']"))
	public WebElement introductionTitle;
	@FindBy(linkText="Creating Linked LIst")
	public WebElement creatingLinkedTest;
	@FindBy(linkText="Types of Linked List")
	public WebElement typesOfLinkedlist;
	@FindBy(xpath="//*[text()='Try here>>>']")
    public WebElement tryHereBtn;
	@FindBy(linkText="Implement Linked List in Python")
	public WebElement implementedLinkedTestInPyton;
	@FindBy(linkText="Traversal")
	public WebElement traversal;
	@FindBy(linkText="Insertion")
	public WebElement insertion;
	@FindBy(linkText="Deletion")
	public WebElement deletion;
	
	
	
	public Linkedlist_Page() throws IOException {
		super();
		//This initElements method will create all WebElements
		PageFactory.initElements(driver,this);
	}
	
	public String verifyLinkedlistPageTitle() throws InterruptedException {
		//Thread.sleep(3000);
		 String linkedlistPageTitle= driver.getTitle();
		 LoggerLoad.info("Page title is : "+linkedlistPageTitle);
		 return linkedlistPageTitle;
	}
   	
	public Linkedlist_Page clickInterductionBtn() throws IOException, InterruptedException{
		//Thread.sleep(3000);
		introduction.click();
		LoggerLoad.info("Introduction link is clicked");
		return new Linkedlist_Page();		
	}
	public String verifyintroductionPageTitle() throws IOException, InterruptedException  {
		//Thread.sleep(3000);
		String introductionPageTitle= driver.getTitle();
		LoggerLoad.info("Page title is : "+introductionPageTitle);
		 return introductionPageTitle;
		 	
	}
	
	public Linkedlist_Page clickCreatingLinkedlist() throws IOException {
		creatingLinkedTest.click();
		LoggerLoad.info("Creating Linked List link is clicked");
		return new Linkedlist_Page();
	}
	public String verifyCreatingLinkedlistPageTitle() throws InterruptedException {
		//Thread.sleep(3000);
		 String creatingLinkedlistPageTitle= driver.getTitle();
		 LoggerLoad.info("Page title is : "+creatingLinkedlistPageTitle);
		 return creatingLinkedlistPageTitle;	
	}
	public Linkedlist_Page ClickTypesOfLinkedlist() throws IOException {
		typesOfLinkedlist.click();
		LoggerLoad.info("Types of Linked List link is clicked");
		return new Linkedlist_Page();
	}
	public String verifyTypesOfLinkedlistTitle() throws InterruptedException {
		//Thread.sleep(3000);
		 String typesOfLinkedlistPageTitle= driver.getTitle();
		 LoggerLoad.info("Page title is : "+typesOfLinkedlistPageTitle);
		 return typesOfLinkedlistPageTitle;	
	}
	public Linkedlist_Page ClickimplementedLinkedTestInPyton() throws IOException {
		implementedLinkedTestInPyton.click();
		LoggerLoad.info("Implemented Linked list link is clicked");
		return new Linkedlist_Page();
	}
	public String verifyImplementLinkedListinPythonTitle() throws InterruptedException {
		//Thread.sleep(3000);
		 String ImplementLinkedListinPythontPageTitle= driver.getTitle();
		 LoggerLoad.info("Page title is : "+ImplementLinkedListinPythontPageTitle);
		 return ImplementLinkedListinPythontPageTitle;	
	}
	public Linkedlist_Page ClicktraversalLinkedlist() throws IOException {
		traversal.click();
		LoggerLoad.info("Traversal link is clicked");
		return new Linkedlist_Page();
	}
	public String verifytraversalLinkedlistTitle() throws InterruptedException {
		//Thread.sleep(3000);
		 String traversalLinkedlistPageTitle= driver.getTitle();
		 LoggerLoad.info("Page title is : "+traversalLinkedlistPageTitle);
		 return traversalLinkedlistPageTitle;	
	}
	public Linkedlist_Page ClickinsertionLinkedlist() throws IOException {
		insertion.click();
		LoggerLoad.info("Insertion link is clicked");
		return new Linkedlist_Page();
	}
	public String verifyinsertionLinkedlistTitle() throws InterruptedException {
		//Thread.sleep(3000);
		 String insertionLinkedlistPageTitle= driver.getTitle();
		 LoggerLoad.info("Page title is : "+insertionLinkedlistPageTitle);
		 return insertionLinkedlistPageTitle;	
	}
	public Linkedlist_Page ClickDeletionLinkedlist() throws IOException {
		deletion.click();
		LoggerLoad.info("Deletion link is clicked");
		return new Linkedlist_Page();
	}
	public String verifyDeletionLinkedlistTitle() throws InterruptedException {
		//Thread.sleep(3000);
		 String deletionLinkedlistPageTitle= driver.getTitle();
		 LoggerLoad.info("Page title is : "+deletionLinkedlistPageTitle);
		 return deletionLinkedlistPageTitle;	
	}
//	public Linkedlist_Page ClickTryHereLinkedlist() throws IOException {
//		tryHereBtn.click();
//		return new Linkedlist_Page();
//	}
	public TryHerePage_Page clickTryHere() throws IOException {
		tryHereBtn.click();
		LoggerLoad.info("Try Here button is clicked");
		return new TryHerePage_Page();
	}
	
//	public Linkedlist_Page clickLink(WebElement link) throws IOException, InterruptedException{
//		Thread.sleep(3000);
//		link.click();
//		return new Linkedlist_Page();
//		
//	}
//	public void verifyPageTitle(WebElement link, String expectedTitle) throws IOException, InterruptedException  {
//		Thread.sleep(3000);
//		clickLink(link);
//		 Assert.assertEquals(expectedTitle, driver.getTitle());
//		 	
//	}

}
