package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		Thread.sleep(3000);
		String ArrayIntro = driver.getTitle();
		return ArrayIntro;
		
	}
	
	public ArraysinPython_Page verifyArraysinPythonbutton() throws IOException
    {
		arrayinpython.click();
    	return  new ArraysinPython_Page();
    }
	
	public ArraysUsingList_Page verifyArrayusinglist() throws IOException {
		
		arrayusinglist.click();
		return new ArraysUsingList_Page();
	}
	
	public Basicoperationsinlists_Page verifyBasicoperationinlist() throws IOException {
		basicoperationinlists.click();
		return new Basicoperationsinlists_Page();
	}
	
	public ApplicationofArray_Page verifyApplicationofarray() throws IOException {
		
		appplicationofarray.click();
		return new ApplicationofArray_Page();
	}
	
	}
	
