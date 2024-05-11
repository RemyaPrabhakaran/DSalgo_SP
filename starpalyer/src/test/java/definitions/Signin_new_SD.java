package definitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.SigninPage_Page;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;

public class Signin_new_SD  extends TestBase
{
	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;

	public Signin_new_SD() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	// User is on Sigin page


		@Given("The user is on signin page")

		public void the_user_is_on_signin_page() throws IOException, InterruptedException {
			initialization();
			homepage = new HomePage_Page();
			introPage = homepage.clickGetStartButton();
			introPage = new IntroductionPage_Page();
			signinPage=introPage.clickSignin();
			//Loggerload.info("User is on Sigin Page");

		}
		@When("The user enter sheet {string} and {int}")
		public void the_user_enter_sheet_sheet1_and(String sheetname,Integer rownumber) throws InvalidFormatException, IOException {
			ExcelReader reader = new ExcelReader();


			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/Excel_Login_Pythoncode.xlsx", sheetname);

			 String username = testdata.get(rownumber).get("username");

			 String password = testdata.get(rownumber).get("password");

			String message = testdata.get(rownumber).get("expectedmessage");
			signinPage = new SigninPage_Page();
			signinPage.dsalgoportalLogin(username,password);


		    
		}
		
		

		@When("The user enter sheet Sheet1 and {int}")
		public void the_user_enter_sheet_sheet1_and(Integer rownumber) throws InvalidFormatException, IOException {
			ExcelReader reader = new ExcelReader();


			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/Excel_Login_Pythoncode.xlsx", "sheet1");

			 String username = testdata.get(rownumber).get("username");

			 String password = testdata.get(rownumber).get("password");

			String message = testdata.get(rownumber).get("expectedmessage");
			signinPage = new SigninPage_Page();
			signinPage.dsalgoportalLogin(username,password);
		}




		@Then("click login button")
		public void click_login_button() {
		   System.out.println("User logged in");
		}
}