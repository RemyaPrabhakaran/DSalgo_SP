package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Datastructure_Page  extends TestBase{
	
	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(xpath="//div[3]/div[1]/div/div/a")
	WebElement dsgetstartbtn;
	@FindBy(xpath ="//*[text()='Array']/..//*[text()='Get Started']") 
	WebElement ArrayGetstarted;
	@FindBy(xpath="//a[@href='graph'] [text()='Get Started']") WebElement graphGetstarted;
	
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
		return new DatastructureHomePage_Page();
	}
	
	
	public ArrayPage_Page Arraygetclickstartbutton() throws IOException
	{
		ArrayGetstarted.click();
		return new ArrayPage_Page();
	}
	
	public Graph_page graphgetclickstartbutton() throws IOException {
		graphGetstarted.click();
		return new Graph_page();
	}
}
