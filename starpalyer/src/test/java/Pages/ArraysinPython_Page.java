package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ArraysinPython_Page extends TestBase{
	
	@FindBy(xpath="//a[contains (text(),'Try here')]")
    WebElement tryHereBtn;

	public ArraysinPython_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		
	}
	 public String VerifyArrayinPython() throws InterruptedException {
		 Thread.sleep(3000);  
			String  VerifyarrayinpythonTitle =driver.getTitle();
			  return VerifyarrayinpythonTitle; 
	 }
	
	 public TryHerePage_Page clickTryHere() throws IOException {
			tryHereBtn.click();
			return new TryHerePage_Page();

}
}
