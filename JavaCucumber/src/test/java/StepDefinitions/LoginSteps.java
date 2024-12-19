package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside step-user is on login page");
	}

	
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside Step-User enter username and password");

	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside step-click on login button");
	}

	@Then("User is navigate to homepage")
	public void user_is_navigate_to_homepage() {
		System.out.println("Inside step-user is navigate to homepage");
	}



}

