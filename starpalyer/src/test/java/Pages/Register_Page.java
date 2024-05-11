package Pages;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Log.LoggerLoad;
import base.TestBase;

public class Register_Page extends TestBase{
	
	//Class Variables
	String newUserName;
	String pageTitle;
	String currentPageURL;
	
	//Page Factory	
	@FindBy(xpath="//input[@id='id_username']") 
	WebElement usernameText; 
	@FindBy(xpath="//input[@id='id_password1']") 
	WebElement passwordText1; 
	@FindBy(xpath="//input[@id='id_password2']") 
	WebElement passwordConfirmText; 
	@FindBy(xpath="//input[@value='Register']") 
	WebElement registerBtn;
	@FindBy(xpath="//button[@class='btn']") 
	WebElement btnText; 
	@FindBy(xpath="//div[@role='alert']") 
	WebElement passwordErrorMessage;
	@FindBy(xpath="//a[text()='Sign in']") 
	WebElement signInRegisterPage;
	@FindBy(xpath="//a[text()='Login ']") 
	WebElement logInRegisterPage;
	@FindBy(xpath="//div[contains(@class,'alert alert-primary')][contains(@role,'alert')]") 
	WebElement successMessage;
	WebElement activeElement;
		
	HomePage_Page hp; 
	Register_Page rp;
    
	//Constructor with initialization 
	public Register_Page() throws IOException {
	        super();//super class constructor
	        PageFactory.initElements(driver,this);
	    }
	
	//Actions
	public void validatePageTitle(String title) {
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, title);
		LoggerLoad.info("You are on "+pageTitle+" page");
	}
	

	
	public void register(String un, String pwd, String cfmPwd) throws IOException, InterruptedException {	
	 
		rp = new Register_Page();
		LoggerLoad.info("Entering username as: "+un+". Password as "+pwd+". Confirmation Password as:"+cfmPwd);
		rp.usernameText.sendKeys(un);
		newUserName = un;
		rp.passwordText1.sendKeys(pwd);
		rp.passwordConfirmText.sendKeys(cfmPwd);
		//Thread.sleep(2000);
		rp.registerBtn.click(); 
		//Thread.sleep(2000);
	}
	
	public void validateSuccess() {
		//pageTitle = driver.getTitle();
		//Assert.assertEquals(pageTitle, "NumpyNinja");
		//System.out.println(pageTitle);
		try {
		driver.navigate().refresh();
		String success = rp.successMessage.getText();
		System.out.println(success);
		Assert.assertEquals(success,("New Account Created. You are logged in as "+usernameText));
		
		}	
	
		catch(Exception e){
			System.out.println("NoSuchElement Exception has been handled");
			LoggerLoad.error("Exception handled");
		}
	}
	
	//Validate message for the blank textbox
	public String fieldValidation(WebElement e){
        String validationMessage= e.getAttribute("validationMessage");
        LoggerLoad.info("Validation Message is "+validationMessage);
        return validationMessage;
    }
	
	//Get the current active element
	public WebElement getactiveElement() {
		activeElement=driver.switchTo().activeElement();
		return activeElement;
	}
	
	//Compare
	public void focusValidation(WebElement e) {		
		rp.activeElement=driver.switchTo().activeElement();
		Assert.assertEquals(rp.activeElement, e);
		
	}
	public void validatePwdMismtachError() {		
		String pwdErrorMsg = rp.passwordErrorMessage.getText();
		Assert.assertEquals(pwdErrorMsg, "password_mismatch:The two password fields didn’t match.");
		LoggerLoad.info("Password Mismatch Error.");
		
	}
	
	public void clickLoginFromRegisterPage() throws IOException, InterruptedException {
		rp = new Register_Page();		
		rp.logInRegisterPage.click();
		LoggerLoad.info("Login button clicked.");
	}
	
	public void clickSignInFromRegisterPage() throws IOException, InterruptedException {
		rp = new Register_Page();		
		rp.signInRegisterPage.click();	
		LoggerLoad.info("Sign In button clicked.");
	}
	
	public String validateURL() {
		currentPageURL = driver.getCurrentUrl();
		LoggerLoad.info("Current Page URL is: "+currentPageURL);
		return currentPageURL;
	}
}