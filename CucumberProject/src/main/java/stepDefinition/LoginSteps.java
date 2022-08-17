package stepDefinition;

import io.cucumber.java.en.*;

public class LoginSteps {

	
	
	@Given("I am the user of this application")
	public void i_am_the_user_of_this_application() {
	    System.out.println("I am user of ap");
	}
	@When("I enter my valid username")
	public void i_enter_my_valid_username() {
	   
	}
	@And("I enter my valid password")
	public void i_enter_my_valid_password() {
	    
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
	    
	}
	@Then("I should get login successfully.")
	public void i_should_get_login_successfully() {
	    
	}
	
	
	
	@When("I enter my invalid username")
	public void i_enter_my_invalid_username() {
	    
	}
	@When("I enter my invalid password")
	public void i_enter_my_invalid_password() {
	   
	}
	@Then("I should not login successfully")
	public void i_should_not_login_successfully() {
	   
	}
	@Then("Error message should display")
	public void error_message_should_display() {
	    
	}

}
