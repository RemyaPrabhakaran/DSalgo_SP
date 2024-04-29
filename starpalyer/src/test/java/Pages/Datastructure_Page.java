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
}
