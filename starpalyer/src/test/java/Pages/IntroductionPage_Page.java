package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class IntroductionPage_Page extends TestBase
{
	@FindBy(linkText= "Sign in")
	WebElement signin;
	public IntroductionPage_Page() throws IOException {
		super();
		 PageFactory.initElements(driver,this);
	}
	 public SigninPage_Page clickSignin() throws IOException
	   {
		   signin.click();
		   return new SigninPage_Page();
		   //return new SigninPage_Page();
	   }
}
