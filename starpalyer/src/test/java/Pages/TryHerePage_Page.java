package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class TryHerePage_Page extends TestBase{
	
	@FindBy(xpath="//div[@class='CodeMirror-lines' and @role='presentation']")
	WebElement codeEditor;
	@FindBy(xpath="//button[@type='button']")
	WebElement runBtn;
	

	public TryHerePage_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void executeCode() throws InterruptedException {
		codeEditor.click();
		//codeEditor.sendKeys("print hello");
		runBtn.click();
		Thread.sleep(5000);
		System.out.print("code executed");
		
	}

}
