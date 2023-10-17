package stepDefinition1;

import PageObject.LoginPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseTest{

	 LoginPOM login;
	
	@Given("user navigate to {string}")
	public void user_navigate_to(String URL1) {
		openBrowser();
		navigateUrl(URL1);
	}
	@When("user click on login link")
	public void user_click_on_login_link() {
		 login =new LoginPOM(driver); 
		login.clickOnLogin();
	}
	@When("user enter email id {string}")
	public void user_enter_email_id(String Email1) {
		login.emailid(Email1);
	}
	@When("user enter password {string}")
	public void user_enter_password(String Pass1) {
	    login.pass(Pass1);
	}
	@When("user click on Login button")
	public void user_click_on_login_button() {
	    login.clickOnSubmit();
	}
	@Then("user should be successfully login")
	public void user_should_be_successfully_login() {
	   login.validateLogout();
	}
}
