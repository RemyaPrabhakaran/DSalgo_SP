package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class TimecomplexityPage_Page  extends TestBase{

	@FindBy(xpath="//div[@class='col-sm']/a")
    WebElement tryHereBtn;
	
	public TimecomplexityPage_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String verifyTimecomplexity() throws InterruptedException
	{
		Thread.sleep(3000);  
		String  timecomplexityTitle =driver.getTitle();
		  return timecomplexityTitle;
	}
	
	public TryHerePage_Page clickTryHere() throws IOException {
		tryHereBtn.click();
		return new TryHerePage_Page();
	}

}
