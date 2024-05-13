package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import junit.framework.Assert;

public class Practicequestions_Page extends TestBase {

	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")WebElement practicequestions;
	@FindBy(xpath="//a[contains (text(),'Search the array')]") WebElement sercharray;
	@FindBy(xpath="//a[contains (text(),'Max Consecutive Ones')]") WebElement maxconsecutiveones;
	@FindBy(xpath="//a[contains (text(),'Find Numbers with Even Number of Digits')]") WebElement evennoofdigit;
	@FindBy(xpath="//a[contains (text(),'Squares of  a Sorted Array')]") WebElement squaresortedarray;
;
	
	public Practicequestions_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);	
		
	}

	public void clickonpracticequestion(){
		 
		practicequestions.click();
		
	}
	public void verifyURL() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/array/practice", currentURL);
	
}
	public void clickonsercharray() {
		sercharray.click();
		
		
		
	}
}
