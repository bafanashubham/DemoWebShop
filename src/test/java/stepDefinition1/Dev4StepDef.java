package stepDefinition1;

import PageObject.Dev4POM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dev4StepDef extends BaseTest{
	
	Dev4POM dev4;

	@When("user mouse over on computers")
	public void user_mouse_over_on_computers() {
		dev4 =new Dev4POM(driver);
		dev4.overOnComputer();
	}
	@Then("user clicks on Desktop")
	public void user_clicks_on_desktop() {
	dev4.clickOnDesktop();
	}
	@Then("User sorts the desktop by name A to Z")
	public void user_sorts_the_desktop_by_name_a_to_z() {
	 dev4.sortProduct();
	}
	@When("User clicks on expensive computer")
	public void user_clicks_on_expensive_computer() {
	   dev4.selectProduct();
	}
	@Then("User clicks on add to compare list")
	public void user_clicks_on_add_to_compare_list() {
	  dev4.clkOnCompareList();
	}
	@Then("User clicks on logout button")
	public void user_clicks_on_logout_button() {
	dev4.clkOnLogOut();
	}
}
