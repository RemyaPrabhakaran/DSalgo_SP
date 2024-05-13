package definitions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import com.sun.tools.javac.code.Attribute.Array;

import Pages.ApplicationofArray_Page;
import Pages.ArrayPage_Page;
import Pages.ArraysUsingList_Page;
import Pages.ArraysinPython_Page;
import Pages.Basicoperationsinlists_Page;
import Pages.DatastructureHomePage_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.Practicequestions_Page;
import Pages.SigninPage_Page;
import Pages.TimecomplexityPage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
import io.cucumber.java.en.*;
import junit.framework.Assert;


public class ArrayPage_SD extends TestBase {
	
	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Datastructure_Page  datastructurePage;
	ArrayPage_Page arrayPage;
	ArraysinPython_Page arrayinpython;
	ArraysUsingList_Page arrayusinglist;
	TryHerePage_Page tryHerePage;
	Basicoperationsinlists_Page basicoperationinlist;
	ApplicationofArray_Page applicationofarray;
	Practicequestions_Page practicequestion;
	
	public ArrayPage_SD() throws IOException {
		super();
		
	}
	
	@Given("The user is on the Array homepage")
public void the_user_is_on_the_array_homepage() throws IOException, InterruptedException {
		
	
		initialization();
		homepage = new HomePage_Page();
	  introPage = homepage.clickGetStartButton();
	   introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		//datastructureHomePage  = new DatastructureHomePage_Page();
		arrayPage = new ArrayPage_Page();
		
		datastructurePage.verifySignedinUser();
		
	}

	@When("The user clicks Get Started button below the Array")
	public void the_user_clicks_get_started_button_below_the_array() throws IOException {
		datastructurePage.Arraygetclickstartbutton();
	}

	@Then("The user should land in Array- Introduction Page")
	public void the_user_should_land_in_array_introduction_page() throws InterruptedException {
		String arraypagetitle=arrayPage.verifyArraypage();
		Assert.assertEquals("Array", arraypagetitle);
	}

	//Scenario 2: Arrays in Python page
	
	@Given("The user is on the Array Introduction Page")
	public void the_user_is_on_the_array_introduction_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		//datastructureHomePage  = new DatastructureHomePage_Page();
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage= new ArrayPage_Page();
		String arrayhome1 = ArrayPage_Page.verifyArraypage();
		System.out.print(arrayhome1);
		
	   Assert.assertEquals(arrayhome1, "Array");
		   
	}

	@When("The user clicks Arrays in Python")
	public void the_user_clicks_arrays_in_python() throws InterruptedException, IOException {
		
		arrayPage  = new ArrayPage_Page();
		arrayinpython = arrayPage.verifyArraysinPythonbutton();   
	}

	@Then("The user clicks on Try here button below Arrays in Python")
	public void the_user_clicks_on_try_here_button_below_arrays_in_python() throws IOException {
	   tryHerePage=new TryHerePage_Page();
	   tryHerePage= arrayinpython.clickTryHere();
	}
	@Then("The User writes Valid python code and clicks Run button in array in python try editor page")
	public void the_user_writes_valid_python_code_and_clicks_run_button_in_array_in_python_try_editor_page() throws InterruptedException {
		String code = "print "+'"'+"hello"+'"';
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the output in console in array python try editor page")
	public void user_is_able_to_see_the_output_in_console_in_array_python_try_editor_page() {
		tryHerePage.verifyConsoleOutput();	
	}

	@When("The User writes invalid python code and clicks Run button in arrays in python page")
	public void the_user_writes_invalid_python_code_and_clicks_run_button_in_arrays_in_python_page() throws InterruptedException {
		String code = "hello";
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the error msg in pop up window in arrays in python Try Editor Page")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window_in_arrays_in_python_try_editor_page() {
		tryHerePage.getAlertMessage();
	}

	@Then("The user click the ok button in the alert window in arrays in python Try Editor Page")
	public void the_user_click_the_ok_button_in_the_alert_window_in_arrays_in_python_try_editor_page() throws InterruptedException {
		tryHerePage.clickOkOnAlert();
		Thread.sleep(2000);
	}

   @And("The user should be redirected to Arrays page")
	public void the_user_should_be_redirected_to_Arrays_page() throws IOException, InterruptedException {

		String apTitle= tryHerePage.validateTryHerePageTitle();
		Assert.assertEquals("Assessment", apTitle);
	}

//	Scenario 3 :Arrays Using List
	
	@Given("The user is on the Arrays page")
	public void the_user_is_on_the_Arrays_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		//datastructureHomePage  = new DatastructureHomePage_Page();
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage= new ArrayPage_Page();
		String arrayhome1 = ArrayPage_Page.verifyArraypage();
		System.out.print(arrayhome1);
	    Assert.assertEquals(arrayhome1, "Array");
	        	
	}

	@When("The user clicks on Arrays Using List")
	public void the_user_clicks_on_arrays_using_list() throws IOException, InterruptedException {
		Thread.sleep(2000);
		arrayusinglist = arrayPage.verifyArrayusinglist();
	}

	@Then("The user clicks on Try here button below Arrays Using list")
	public void the_user_clicks_on_try_here_button_below_arrays_using_list() throws IOException {
		 tryHerePage=new TryHerePage_Page();
		 tryHerePage= arrayusinglist.clickTryHere();
	}
	@Then("The User writes Valid python code and clicks Run button in arrays using list try editor page1")
	public void the_user_writes_valid_python_code_and_clicks_run_button_in_arrays_using_list_try_editor_page1() throws InterruptedException {
		String code = "print "+'"'+"hello"+'"';
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the output in console in arrays using list try editor page1")
	public void user_is_able_to_see_the_output_in_console_in_arrays_using_list_try_editor_page1() {
		tryHerePage.verifyConsoleOutput();	
	}

	@When("The User writes invalid python code and clicks Run button in arrays using list page1")
	public void the_user_writes_invalid_python_code_and_clicks_run_button_in_arrays_using_list_page1() throws InterruptedException {
		String code = "hello";
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the error msg in pop up window in arrays using list Try Editor Page1")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window_in_arrays_using_list_try_editor_page1() {
		tryHerePage.getAlertMessage();
	}

	@Then("The user click the ok button in the alert window in arrays using list Try Editor Page1")
	public void the_user_click_the_ok_button_in_the_alert_window_in_arrays_using_list_try_editor_page1() {
		tryHerePage.clickOkOnAlert();
  	
	}

	@Then("The user should be redirected to main Arrays page")
	public void The_user_should_be_redirected_to_main_Arrays_page() throws InterruptedException {
		String aulTitle= tryHerePage.validateTryHerePageTitle();
	    Assert.assertEquals("Assessment", aulTitle);
	}
	
	
	//Scenario 4: Basic Operations in Lists
	
	@Given("The user click on the Basic Operations in Lists page")
	public void the_user_click_on_the_basic_operations_in_lists_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		//datastructureHomePage  = new DatastructureHomePage_Page();
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage= new ArrayPage_Page();
		String arrayhome1 = ArrayPage_Page.verifyArraypage();
		System.out.print(arrayhome1);
		tryHerePage=new TryHerePage_Page();
		basicoperationinlist =new Basicoperationsinlists_Page();
	    Assert.assertEquals(arrayhome1, "Array");
	    Thread.sleep(1000);
	    arrayPage.verifyBasicoperationinlist();
	   

	}

	@When("The user clicks Try Here button of Operations in Lists")
	public void the_user_clicks_try_here_button_of_operations_in_lists() throws IOException, InterruptedException {
		
		 tryHerePage=new TryHerePage_Page();
		 tryHerePage= basicoperationinlist.clickTryHere();
		
	}
	@When("The User writes Valid python code and clicks Run button in arrays using list try editor page")
	public void the_user_writes_valid_python_code_and_clicks_run_button_in_arrays_using_list_try_editor_page() throws InterruptedException {
		String code = "print "+'"'+"hello"+'"';
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the output in console in arrays using list try editor page")
	public void user_is_able_to_see_the_output_in_console_in_arrays_using_list_try_editor_page() {
		tryHerePage.verifyConsoleOutput();
	}

	@When("The User writes invalid python code and clicks Run button in arrays using list page")
	public void the_user_writes_invalid_python_code_and_clicks_run_button_in_arrays_using_list_page() throws InterruptedException {
		String code = "hello";
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the error msg in pop up window in arrays using list Try Editor Page")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window_in_arrays_using_list_try_editor_page() {
		tryHerePage.getAlertMessage();
	}

	@Then("The user click the ok button in the alert window in arrays using list Try Editor Page")
	public void the_user_click_the_ok_button_in_the_alert_window_in_arrays_using_list_try_editor_page() {
		tryHerePage.clickOkOnAlert();
	}

	@Then("The user should be redirected to a main page")
	public void the_user_should_be_redirected_to_a_main_page() throws InterruptedException {
		  String oiltitle = tryHerePage.validateTryHerePageTitle();
		    Assert.assertEquals("Assessment", oiltitle);
	}

	
	//Scenario 5 :Applications of Array
	
	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() throws IOException, InterruptedException {
		
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		//datastructureHomePage  = new DatastructureHomePage_Page();
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage= new ArrayPage_Page();
		String arrayhome1 = ArrayPage_Page.verifyArraypage();
		System.out.print(arrayhome1);
		tryHerePage=new TryHerePage_Page();
		basicoperationinlist =new Basicoperationsinlists_Page();
		applicationofarray =new ApplicationofArray_Page();
	    Assert.assertEquals(arrayhome1, "Array");
	   
	    arrayPage.verifyApplicationofarray();
	   
	}

	@When("The user clicks Try Here button of Application of Array page")
	public void the_user_clicks_try_here_button_of_application_of_array_page() throws IOException, InterruptedException {
		 tryHerePage=new TryHerePage_Page();
		 tryHerePage= applicationofarray.clickTryHere();
		
	}

	@Then("The user is on the Python Editor Page")
	public void the_user_is_on_the_python_editor_page() throws InterruptedException {
		 String aoatitle = tryHerePage.validateTryHerePageTitle();
		    Assert.assertEquals("Assessment", aoatitle);
	} 
	
	@Then("The User writes Valid python code and clicks Run button")
	public void the_user_writes_valid_python_code_and_clicks_run_button() throws InterruptedException {
		Thread.sleep(1000);
		String code = "print "+'"'+"hello"+'"';
	    tryHerePage.executeCode(code);
	}
		

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() throws InterruptedException {
		tryHerePage.verifyConsoleOutput();		
	}
	
	@When("The User writes invalid python code and clicks Run button in Apllication of array page")
	public void the_user_writes_invalid_python_code_and_clicks_run_button_in_apllication_of_array_page() throws InterruptedException {
		String code = "hello";
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the error msg in pop up window in array Try Editor Page")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window_in_array_try_editor_page() throws InterruptedException {
		tryHerePage.getAlertMessage();
	}

	@Then("The user click the ok button in the alert window in array Try Editor Page")
	public void the_user_click_the_ok_button_in_the_alert_window_in_array_try_editor_page() throws InterruptedException {
		tryHerePage.clickOkOnAlert();
	}



	//Scenario 6 :Practice Questions

		    
	@Given("The user is on the Application of Array page")
	public void the_user_is_on_the_application_of_array_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		//datastructureHomePage  = new DatastructureHomePage_Page();
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage= new ArrayPage_Page();
		String arrayhome1 = ArrayPage_Page.verifyArraypage();
		System.out.print(arrayhome1);
		tryHerePage=new TryHerePage_Page();
		basicoperationinlist =new Basicoperationsinlists_Page();
		applicationofarray =new ApplicationofArray_Page();
	    Assert.assertEquals(arrayhome1, "Array");
	    practicequestion=new Practicequestions_Page();
	   
	    arrayPage.verifyApplicationofarray();
	   
	    
	}

	@When("The user clicks on Practice Questions of Application of Array page")
	public void the_user_clicks_on_practice_questions_of_application_of_array_page() throws InterruptedException {
		practicequestion.clickonpracticequestion();
		
	}

	@Then("user should be directed to Practice Questions page")
	public void user_should_be_directed_to_practice_questions_page() {
		practicequestion.verifyURL();
		}
	

   @And("click on Serch the Array page")
    public void click_on_serch_the_array_page() throws InterruptedException {
	   practicequestion.clickonsercharray();
	   driver. navigate(). back();
	   
	  
}
}


		 


	  








	
		
	
