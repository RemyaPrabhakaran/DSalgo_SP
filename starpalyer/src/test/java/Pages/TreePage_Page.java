package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class TreePage_Page  extends TestBase
{
	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(xpath="//div[6][@class='col']/div/div/a")
	WebElement treeStartbtn;
	
	public TreePage_Page() throws IOException {
		super();
	
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifySignedinUser()
	{
		return signeduser.isDisplayed();
	
	}
	
}

 
 


