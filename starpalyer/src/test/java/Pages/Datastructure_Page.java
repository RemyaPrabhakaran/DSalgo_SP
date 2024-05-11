package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class Datastructure_Page  extends TestBase{
	
	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(linkText="Sign out")
	WebElement Signout;
	@FindBy(xpath="//div[3]/div[1]/div/div/a")
	WebElement dsgetstartbtn;
	@FindBy(xpath="//a[@href='stack'][text()='Get Started']")
	WebElement stackgetstartbtn;
	@FindBy(xpath="//a[@href='queue'][text()='Get Started']")
	WebElement queuegetstartbtn;
	@FindBy(xpath="//a[@href='graph'][text()='Get Started']")
	WebElement graphgetstartbtn;
	@FindBy(xpath ="//*[text()='Array']/..//*[text()='Get Started']") 
	WebElement ArrayGetstarted;
	@FindBy(xpath ="//a[@href='linked-list'][text()='Get Started']") 
	WebElement LinkedListGetstarted;
	@FindBy(xpath="//div[6][@class='col']/div/div/a")
	WebElement treeStartbtn;
	
	public Datastructure_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
   
	public boolean verifySignedinUser()
	{
		return signeduser.isDisplayed();
	
	}
	
	public DatastructureHomePage_Page dataStructuregetclickstartbutton() throws IOException
	{
		dsgetstartbtn.click();
		LoggerLoad.info("Get Started button clicked for Data Structures");
		return new DatastructureHomePage_Page();
	}
	
	public Stack_Page stackgetclickstartbutton() throws IOException
	{
		stackgetstartbtn.click();
		LoggerLoad.info("Get Started button clicked for Stack");
		return new Stack_Page();
	}
	public Queue_Page queuegetclickstartbutton() throws IOException
	{
		queuegetstartbtn.click();
		return new Queue_Page();
	}
	
	public Graph_Page graphgetclickstartbutton() throws IOException
	{
		graphgetstartbtn.click();
		LoggerLoad.info("Get Started button clicked for Graph");
		return new Graph_Page();
	}
	public ArrayPage_Page Arraygetclickstartbutton() throws IOException
	{
		ArrayGetstarted.click();
		LoggerLoad.info("Get Started button clicked for Array");
		return new ArrayPage_Page();
	}
	public Linkedlist_Page linkedlistgetstartedBtn() throws IOException
	{
		LinkedListGetstarted.click();
		LoggerLoad.info("Get Started button clicked for LinkedList");
		return new Linkedlist_Page();
	}
	public TreeHomePage_Page treeGetStartBtn() throws IOException
	{
		treeStartbtn.click();
		LoggerLoad.info("Get Started button clicked for Tree");
		return new TreeHomePage_Page();
	}
}
