package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



	@Given("user is on login page in chrome")
	public void user_is_on_login_page_in_chrome() {
		System.out.println("Inside step - user is on logn page");
	}

	@When("user enters username password in chrome")
	public void user_enters_username_password_in_chrome() {
		System.out.println("Inside step - user enters user name and password");
	}

	@And("clicks on loginbutton in chrome")
	public void clicks_on_loginbutton_in_chrome() {
		System.out.println("Inside step - user click on login page");
	}

	@Then("user is navigated to the home page in chrome")
	public void user_is_navigated_to_the_home_page_in_chrome() {
		System.out.println("Inside step - user navigated to home page");
	}




}
