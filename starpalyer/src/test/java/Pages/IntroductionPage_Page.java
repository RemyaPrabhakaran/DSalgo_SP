package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class IntroductionPage_Page extends TestBase
{  
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement signin;
	@FindBy(xpath="//div[@class='navbar-nav']/div/a]") 
	WebElement datastructuredropdown;
	public IntroductionPage_Page() throws IOException {
		super();
		 PageFactory.initElements(driver,this);
	}
	 public SigninPage_Page clickSignin() throws IOException
	   {
		   signin.click();
		   LoggerLoad.info("Sign in is clicked");
		   return new SigninPage_Page();
		   //return new SigninPage_Page();
	   }
	 
	 public void dropdownselection()
	 {
		 datastructuredropdown.click();
		  String[] Expectedoptions = {"Array","datastructure","linkedlist","stack","Queue","Tree","Graph"};
	        List<WebElement> option = datastructuredropdown.findElements(By.xpath("//div[@class='navbar-nav']//div//div"));
	        for (WebElement options : option ){
	            String optionsText= options.getText();
	            System.out.println(optionsText);

	            if(options.getText().contains("Arrays")){

	               System.out.println("Array is in list");

}
	        }
	 }
}

	              