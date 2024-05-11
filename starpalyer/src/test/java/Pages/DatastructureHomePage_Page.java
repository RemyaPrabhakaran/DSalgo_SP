package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class DatastructureHomePage_Page extends TestBase {
    @FindBy(xpath ="//h4[@class='bg-secondary text-white']")
    WebElement dsIntroduction;
    @FindBy(xpath="//a[@href='time-complexity']")
    WebElement timecomplexity;
    
	public DatastructureHomePage_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String verifydsIntropage() throws InterruptedException
	{
		//Thread.sleep(3000);
		String dsIntro = driver.getTitle();
		LoggerLoad.info("Page Title is :"+dsIntro);
		return dsIntro;
	
		
	}
    public TimecomplexityPage_Page verifytimecomplexityBtn() throws IOException
    {
    	timecomplexity.click();
    	LoggerLoad.info("Timecomplexity link is clicked");
    	return  new TimecomplexityPage_Page();
    }
}
