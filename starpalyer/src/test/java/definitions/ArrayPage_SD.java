package definitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Pages.ApplicationofArray_Page;
import Pages.ArrayPage_Page;
import Pages.ArraysUsingList_Page;
import Pages.ArraysinPython_Page;
import Pages.Basicoperationsinlists_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.Practicequestions_Page;
import Pages.SigninPage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.ExcelReader;


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
	String linkname;
	
	
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
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage= new ArrayPage_Page();
		String arrayhome1 = ArrayPage_Page.verifyArraypage();
		System.out.print(arrayhome1);		
		Assert.assertEquals(arrayhome1, "Array");
		practicequestion = new Practicequestions_Page();
		   
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
		//Thread.sleep(2000);
	}
	
	@And("The user should be redirected to Arrays page")
	public void the_user_should_be_redirected_to_Arrays_page() throws IOException, InterruptedException {

		String apTitle= tryHerePage.validateTryHerePageTitle();
		Assert.assertEquals("Assessment", apTitle);
	}

	
//	Scenario 3 :Arrays Using List
	
//	@Given("The user is on the Arrays in Python page")
//	public void the_user_is_on_the_arrays_in_python_page() throws IOException, InterruptedException {
//		initialization();
//		homepage = new HomePage_Page();
//		introPage = homepage.clickGetStartButton();
//		introPage = new IntroductionPage_Page();
//		signinPage=introPage.clickSignin();
//		signinPage = new SigninPage_Page();
//		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
//		datastructurePage = new Datastructure_Page();
//		//datastructureHomePage  = new DatastructureHomePage_Page();
//		datastructurePage.verifySignedinUser();
//		arrayPage = datastructurePage.Arraygetclickstartbutton();
//		arrayPage= new ArrayPage_Page();
//		String arrayhome1 = ArrayPage_Page.verifyArraypage();
//		System.out.print(arrayhome1);
//	    Assert.assertEquals(arrayhome1, "Array");
//	    arrayPage.verifyArraysinPythonbutton();
//	    practicequestion = new Practicequestions_Page();
//	    
//	    	
//	}
//
//	@When("The user clicks on Arrays Using List")
//	public void the_user_clicks_on_arrays_using_list() throws IOException {
//		
//		arrayusinglist = arrayPage.verifyArrayusinglist();
//	}
//
//	@Then("The user clicks on Try here button below Arrays Using list")
//	public void the_user_clicks_on_try_here_button_below_arrays_using_list() throws IOException {
//		 tryHerePage=new TryHerePage_Page();
//		 tryHerePage= arrayusinglist.clickTryHere();
//	}
//
//	@Then("The user should be redirected to Arrays Using list")
//	public void the_user_should_be_redirected_to_arrays_using_list() throws InterruptedException {
//		String aulTitle= tryHerePage.validateTryHerePageTitle();
//	    Assert.assertEquals("Assessment", aulTitle);
//	}
//	
//	
//	//Scenario 4
//	
//	@Given("The user is on the Basic Operations in Lists page")
//	public void the_user_is_on_the_basic_operations_in_lists_page() throws IOException, InterruptedException {
//		initialization();
//		homepage = new HomePage_Page();
//		introPage = homepage.clickGetStartButton();
//		introPage = new IntroductionPage_Page();
//		signinPage=introPage.clickSignin();
//		signinPage = new SigninPage_Page();
//		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
//		datastructurePage = new Datastructure_Page();
//		//datastructureHomePage  = new DatastructureHomePage_Page();
//		datastructurePage.verifySignedinUser();
//		arrayPage = datastructurePage.Arraygetclickstartbutton();
//		arrayPage= new ArrayPage_Page();
//		String arrayhome1 = ArrayPage_Page.verifyArraypage();
//		System.out.print(arrayhome1);
//		tryHerePage=new TryHerePage_Page();
//		basicoperationinlist =new Basicoperationsinlists_Page();
//	    Assert.assertEquals(arrayhome1, "Array");
//	    arrayPage.verifyBasicoperationinlist();
//	    practicequestion = new Practicequestions_Page();
//	   
//
//	}
//
//	@When("The user clicks Try Here button of Operations in Lists")
//	public void the_user_clicks_try_here_button_of_operations_in_lists() throws IOException, InterruptedException {
//		
//		 tryHerePage=new TryHerePage_Page();
//		 tryHerePage= basicoperationinlist.clickTryHere();
//		
//	}
//
//	@Then("The user should be redirected to a Python Editor page")
//	public void the_user_should_be_redirected_to_a_python_editor_page() throws InterruptedException {
//		  String oiltitle = tryHerePage.validateTryHerePageTitle();
//		    Assert.assertEquals("Assessment", oiltitle);
//	}
//
//	
//	//Scenario 5
//	
//	
//	@Given("The user is on the Applications of Array page")
//	public void the_user_is_on_the_applications_of_array_page() throws IOException, InterruptedException {
//		initialization();
//		homepage = new HomePage_Page();
//		introPage = homepage.clickGetStartButton();
//		introPage = new IntroductionPage_Page();
//		signinPage=introPage.clickSignin();
//		signinPage = new SigninPage_Page();
//		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
//		datastructurePage = new Datastructure_Page();
//		//datastructureHomePage  = new DatastructureHomePage_Page();
//		datastructurePage.verifySignedinUser();
//		arrayPage = datastructurePage.Arraygetclickstartbutton();
//		arrayPage= new ArrayPage_Page();
//		String arrayhome1 = ArrayPage_Page.verifyArraypage();
//		System.out.print(arrayhome1);
//		tryHerePage=new TryHerePage_Page();
//		basicoperationinlist =new Basicoperationsinlists_Page();
//		applicationofarray =new ApplicationofArray_Page();
//	    Assert.assertEquals(arrayhome1, "Array");	   
//	    arrayPage.verifyApplicationofarray();
//	    practicequestion = new Practicequestions_Page();
//	   
//	}
//
//	@When("The user clicks Try Here button of Application of Array page")
//	public void the_user_clicks_try_here_button_of_application_of_array_page() throws IOException, InterruptedException {
//		 tryHerePage=new TryHerePage_Page();
//		 tryHerePage= applicationofarray.clickTryHere();
//		
//	}
//
//	@Then("The user is on the Python Editor Page")
//	public void the_user_is_on_the_python_editor_page() throws InterruptedException {
//		 String aoatitle = tryHerePage.validateTryHerePageTitle();
//		    Assert.assertEquals("Assessment", aoatitle);
//	}    
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
		//Thread.sleep(2000);
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
	    //Thread.sleep(1000);
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
	
	@Then("The User writes Valid python code and clicks Run button in Array")
	public void the_user_writes_valid_python_code_and_clicks_run_button_in_array() throws InterruptedException {
	//	Thread.sleep(1000);
		String code = "print "+'"'+"hello"+'"';
	    tryHerePage.executeCode(code);
	}
		

	@Then("User is able to see the output in console in Array")
	public void user_is_able_to_see_the_output_in_console_in_array() throws InterruptedException {
		tryHerePage.verifyConsoleOutput();		
	}
	
	@When("The User writes invalid python code and clicks Run button in Application of array page")
	public void the_user_writes_invalid_python_code_and_clicks_run_button_in_application_of_array_page() throws InterruptedException {
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
		    
	//Scenario 6
		    
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
	

   @And("click on Search the Array page")
    public void click_on_search_the_array_page() throws InterruptedException {
	   practicequestion.clickonsearcharray();
	   
	  
}
   
   @When("The user clicks Practice Questions in Arrays in Python Page in Array")
   public void the_user_clicks_practice_questions_in_arrays_in_python_page_in_array() throws IOException {
	   ArraysinPython_Page arrayinpython = new ArraysinPython_Page();
       arrayPage.clickPraticeQuestionsInArray(arrayinpython.getPracticeQuestionsLink());
   }

   @Then("The user should be directed to Practice Questions page in Array")
   public void the_user_should_be_directed_to_practice_questions_page_in_array() {
       arrayPage.verifyURL();
   }

   @Given("The user is on the Arrays Using List page")
   public void the_user_is_on_the_arrays_using_list_page() throws IOException, InterruptedException {
	   initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage.verifyArrayusinglist();
		practicequestion = new Practicequestions_Page();
		
   }

   @When("The user clicks Practice Questions in Arrays Using List Page in Array")
   public void the_user_clicks_practice_questions_in_arrays_using_list_page_in_array() throws IOException {
	   ArraysUsingList_Page arrayusinglist = new ArraysUsingList_Page();
	   arrayPage.clickPraticeQuestionsInArray(arrayusinglist.getPracticeQuestionsLink());
   }

   @When("The user clicks Practice Questions in Basic Operations in Lists Page in Array")
   public void the_user_clicks_practice_questions_in_basic_operations_in_lists_page_in_array() throws IOException {
	   arrayPage.clickPraticeQuestionsInArray(basicoperationinlist.getPracticeQuestionsLink());
   }

   @When("The user clicks Practice Questions in Applications of Array Page in Array")
   public void the_user_clicks_practice_questions_in_applications_of_array_page_in_array() throws IOException {
	   arrayPage.clickPraticeQuestionsInArray(applicationofarray.getPracticeQuestionsLink());
   }
   
   @When("user clicks Search the array in Practice Questions page")
   public void user_clicks_search_the_array_in_practice_questions_page() throws IOException {
	   
	   practicequestion.clickonsearcharray();
	   linkname = "SearchTheArray";
	   
   }

   @Then("user should be redirected to {string}")
   public void user_should_be_redirected_to(String string) {
	   practicequestion.verifypracticequestionlinkURL(string);
   }

   @When("user clicks Max Consecutive Ones in Practice Questions page")
   public void user_clicks_max_consecutive_ones_in_practice_questions_page() {
	   practicequestion.clickonmaxConsecutiveones();
	   linkname = "MaxconsecutiveOnes";
	   
   }

   @When("user clicks Find Numbers with Even Number of Digits in Practice Questions page")
   public void user_clicks_find_numbers_with_even_number_of_digits_in_practice_questions_page() {
	   practicequestion.clickonevenNoOfDigit();
	   linkname = "EvenNumberOfDigits";
	   
   }

   @When("user clicks Squares of  a Sorted Array in Practice Questions page")
   public void user_clicks_squares_of_a_sorted_array_in_practice_questions_page() throws IOException {	 
	   practicequestion = new Practicequestions_Page();
	   practicequestion.clickonsquareSortedArray();
	   linkname = "SquareSortedArray";
	  
   }
   
   @When("user reads codes from Sheetname {string} and RowNumber {int} from excel")
   public void user_reads_codes_from_sheetname_and_row_number_from_excel(String sheetName, int rowNumber) throws InvalidFormatException, IOException, InterruptedException {
       ExcelReader reader = new ExcelReader();
       List<Map<String,String>> testData = reader.getData("./src/test/resources/Exceldata/Excel_Login_Pythoncode.xlsx",sheetName);
       String code = testData.get(rowNumber).get("pCode");
       String res = testData.get(rowNumber).get("Result");
       Practicequestions_Page pQ = new Practicequestions_Page();
      // pQ.executePythonCode(code);
       pQ.executePythonCode(code);
   }

   
   @Given("The user is on the Arrays in Python page")
   public void the_user_is_on_the_arrays_in_python_page() throws IOException, InterruptedException {
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
	    arrayPage.verifyArraysinPythonbutton();
	    practicequestion = new Practicequestions_Page();
   }

   @Given("The user is on the Basic Operations in Lists page")
   public void the_user_is_on_the_basic_operations_in_lists_page() throws IOException, InterruptedException {
	   initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		arrayPage = datastructurePage.Arraygetclickstartbutton();
		arrayPage= new ArrayPage_Page();		
		tryHerePage=new TryHerePage_Page();
		basicoperationinlist =new Basicoperationsinlists_Page();	    
	    arrayPage.verifyBasicoperationinlist();
	    practicequestion = new Practicequestions_Page();
   }

   @When("Clicks Run button")
   public void clicks_run_button() {
	   practicequestion.clickRunButton();
   }

   @Then("Output should be shown")
   public void output_should_be_shown() {
       practicequestion.getAlertMessage();
       practicequestion.clickOkOnAlert();
   }
   
   @And("Clicks Submit button")
   public void clicks_submit_button() {
	   practicequestion.clickSubmitButton();
   }
   
   @Then("Output should be shown as Error")
   public void output_should_be_shown_as_error() {
	   practicequestion.getAlertMessage();
       practicequestion.clickOkOnAlert();
	   practicequestion.getOutput();
      
   }


   
   
}

		 


	  








	
		
	
