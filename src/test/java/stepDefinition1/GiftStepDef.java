package stepDefinition1;

import PageObject.GiftCardPOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftStepDef extends BaseTest{
 
	GiftCardPOM gft;

	@When("user navigates to Gift cards")
	public void user_navigates_to_gift_cards() {
		 gft =new GiftCardPOM(driver);
		 gft.clickOngiftCard();

		
	}
	@Then("user clicks on any one physical gift card")
	public void user_clicks_on_any_one_physical_gift_card() {
		gft.Phycard();
	}
	@Then("user enters Recepients name {string} and Message {string}")
	public void user_enters_recepients_name_and_message(String rname, String rmsg) {
		gft.Recepname(rname);
		gft.Mssg(rmsg);
	}
	@Then("user clicks on Email a friend button")
	public void user_clicks_on_email_a_friend_button() {
		gft.Emailbut();
	}
	@Then("user enters Friend's email {string}")
	public void user_enters_friend_s_email(String mail) {
		gft.Emailadd(mail);
	}
	@Then("user clicks on send email button")
	public void user_clicks_on_send_email_button() {
	 gft.Sendemailbut();
	}
	@Then("user verifys message obtain")
	public void user_verifys_message_obtain() {
		gft.Vmsg();
	}
}
