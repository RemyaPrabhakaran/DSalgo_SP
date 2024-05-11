  package Pages;
  
  import java.io.IOException;
  
  import org.openqa.selenium.By; 
  import org.openqa.selenium.WebElement; 
  import org.openqa.selenium.support.FindBy; 
  import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;

import java.util.concurrent.TimeUnit;
  import base.TestBase;
  
  public class SigninPage_Page extends TestBase{
  
 
	  @FindBy(xpath ="//input[@name='username']")
	  WebElement username_Text;
	  @FindBy(xpath="//input[@name='password']")
	  WebElement password_Text;
	  @FindBy(xpath="//input[@type='submit']")
	  WebElement Login_btn;
	  @FindBy(linkText= "Sign out")
	  WebElement signout;
	  @FindBy(xpath="//div[@role='alert']")
	  WebElement invalidcredMsg; ;
  
  public SigninPage_Page() throws IOException { 
	  super();
	  PageFactory.initElements(driver,this); 
  }
  
 
  
  public String verifyPageTitle()
  {
	  LoggerLoad.info("Verifying the PageTitle");
	  return driver.getTitle();
  
  }
	
  
  public  void dsalgoportalLogin(String uname, String pwd) {
	  
	  username_Text.sendKeys(uname);
	  password_Text.sendKeys(pwd);
	  Login_btn.click();
	  LoggerLoad.info("Logged in with username: "+uname+" and password : "+pwd);
	  LoggerLoad.info("Login button is clicked");
	 
  }
  public String fieldValidation(){
      String validationMessage= username_Text.getAttribute("validationMessage");
      LoggerLoad.info("field Validation Message : "+validationMessage);
      return validationMessage;
  }
  
  public boolean validateSignedInIntroPage() {
	  signout.isDisplayed();
	  return true;
  }
  public String invalidCredentialValidation()
  {
	  String invalidMsg= invalidcredMsg.getText();
	  LoggerLoad.error("Invalid Login : "+invalidMsg);
	  return invalidMsg;
  }
  
  public String tooltipValidation()
  {
	  String tooltipMsg= username_Text.getAttribute("validationMessage");
	  LoggerLoad.info("Tooltip is displayed as: "+tooltipMsg);
	  return tooltipMsg;
			  
  }
  public String tooltippasswordValidation()
  {
	  String tooltippwdMsg= password_Text.getAttribute("validationMessage");
	  LoggerLoad.info("Password Validation tooltip message "+tooltippwdMsg);
	  return tooltippwdMsg;
  }
  
  }