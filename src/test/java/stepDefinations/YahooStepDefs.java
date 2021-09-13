package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject_OR.YahooMail;
import utilities.TestBase;

public class YahooStepDefs extends TestBase {
	
	YahooMail yMail;
	
	@Given("I click on sign in link")
	public void i_click_on_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	   yMail = new YahooMail();
	   yMail.clickYahooLink();
	}

	@Then("I enter my yahoo user id in the log in field")
	public void i_enter_my_yahoo_user_id_in_the_log_in_field() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 yMail = new YahooMail();
		   yMail.userNameField();
	}

	@And("I click on next button")
	public void i_click_on_next_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 yMail = new YahooMail();
		   yMail.clickNext_Button();
	}

}
