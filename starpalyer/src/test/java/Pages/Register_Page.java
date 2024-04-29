package Pages;

import base.TestBase;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	@FindBy(xpath="//div[@role='alert'][contains(text(),'New Account Created.You are logged in as '+newUserName+']") 
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
	public void validatePageTitle() {
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "NumpyNinja");
	}
	
	public void register(String un, String pwd, String cfmPwd) throws IOException, InterruptedException {
		hp = new HomePage_Page();
		hp.clickGetStartButton();
		hp.registerInHome.click(); 
		rp = new Register_Page();
		rp.usernameText.sendKeys(un);
		newUserName = un;
		rp.passwordText1.sendKeys(pwd);
		rp.passwordConfirmText.sendKeys(cfmPwd);
		rp.registerBtn.click(); 
	}
	
	public void validateSuccess() {
		pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "NumpyNinja");
		System.out.println(pageTitle);
		String success = successMessage.getText();
		System.out.println(success);
		
	}
	
//	public void validateBlankMsg() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;", rp.usernameText);
//		if (isRequired)
//		{
//			System.out.println("Validation message");
//		}
//	}
	
	//Validate message for the blank textbox
	public String fieldValidation(WebElement e){
        String validationMessage= e.getAttribute("validationMessage");
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
		
	}
	
	public void clickLoginFromRegisterPage() throws IOException, InterruptedException {
		hp = new HomePage_Page();
		hp.clickGetStartButton();
		hp.registerInHome.click(); 
		rp = new Register_Page();
		rp.logInRegisterPage.click();		
	}
	
	public void clickSignInFromRegisterPage() throws IOException, InterruptedException {
		hp = new HomePage_Page();
		hp.clickGetStartButton();
		hp.registerInHome.click(); 
		rp = new Register_Page();
		rp.signInRegisterPage.click();		
	}
	
	public String validateURL() {
		currentPageURL = driver.getCurrentUrl();
		return currentPageURL;
	}
}
