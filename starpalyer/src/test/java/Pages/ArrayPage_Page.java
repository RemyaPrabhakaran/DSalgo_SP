package Pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;

public class ArrayPage_Page  extends TestBase{

	
	@FindBy(xpath="//a[text()='Arrays in Python']") WebElement arrayinpython;
	@FindBy(xpath="//a[text()='Arrays Using List']") WebElement arrayusinglist;
	@FindBy(xpath="//a[text()='Basic Operations in Lists']") WebElement basicoperationinlists;
	@FindBy(xpath="//a[text()='Applications of Array']") WebElement appplicationofarray;

	
	public ArrayPage_Page() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public static String verifyArraypage() throws InterruptedException
	{
		String ArrayIntro = driver.getTitle();
		LoggerLoad.info("Page title is: "+ArrayIntro);
		return ArrayIntro;
		
	}
	
	public ArraysinPython_Page verifyArraysinPythonbutton() throws IOException
    {
		arrayinpython.click();
		LoggerLoad.info("Arrays in Python link is clicked");
    	return  new ArraysinPython_Page();
    }
	
	public ArraysUsingList_Page verifyArrayusinglist() throws IOException {
		
		arrayusinglist.click();
		LoggerLoad.info("Arrays Using List link is clicked");
		return new ArraysUsingList_Page();
	}
	
	public Basicoperationsinlists_Page verifyBasicoperationinlist() throws IOException {
		basicoperationinlists.click();
		LoggerLoad.info("Basic Operations in Lists link is clicked");
		return new Basicoperationsinlists_Page();
	}
	
	public ApplicationofArray_Page verifyApplicationofarray() throws IOException {
		
		appplicationofarray.click();
		LoggerLoad.info("Application of Array is clicked");
		return new ApplicationofArray_Page();
	}
	public void clickPraticeQuestionsInArray(WebElement e) throws IOException {
		e.click();
		LoggerLoad.info("Practice Questions is clicked for webelement : "+e);
	}
	
	public void verifyURL() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/array/practice", currentURL);
		LoggerLoad.info("You are in page: "+currentURL);
	}
	
	}
	
