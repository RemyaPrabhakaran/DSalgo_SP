package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ArraysUsingList_Page extends TestBase {
	
	@FindBy(xpath="//a[contains (text(),'Try here')]")
    WebElement tryHereBtn;
	

	public ArraysUsingList_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);	
	}
	 
	public String VerifyArraysusinglist() throws InterruptedException {
		 Thread.sleep(3000);  
		 String  VerifyarraysusinglistTitle =driver.getTitle();
		 return VerifyarraysusinglistTitle; 
	}
	 public TryHerePage_Page clickTryHere() throws IOException {
			tryHereBtn.click();
			return new TryHerePage_Page();

}
}
