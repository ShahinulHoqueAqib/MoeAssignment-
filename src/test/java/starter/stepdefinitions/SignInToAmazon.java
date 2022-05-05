package starter.stepdefinitions;

import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignInToAmazon {
	
	@Steps
	Page home;

	@Given("user is on home page of the amazon website")
	public void user_is_on_home_page_of_the_amazon_website() {
		home.goToAmazonWebsite();
	}

	@When("user clicks on the signup button")
	public void user_clicks_on_the_signup_button() {
		home.clickOnSignUpButton();
	}

	@When("inputs an tteesstt112233@gmail.com wrong email address")
	public void inputs_an_test_gmail_com_wrong_email_address() {
	    home.enterWrongEmailAddress();
	}

	@When("clicks on the continue button after entering the email address")
	public void clicks_on_the_continue_button_after_entering_the_email_address() {
		home.continueWithEmail();
	}

	@Then("the user will be able to see an error message contains Your password is incorrect.")
	public void the_user_will_be_able_to_see_an_error_message_contains_your_password_is_incorrect() {
		home.errorMessage();
	}
}
