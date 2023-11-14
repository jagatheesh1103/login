package com.stepdefinition;

import com.pages.Login_pages;
import com.reusable.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class blank_login_step extends Reusable {

	public Login_pages pages2;

	
	
	
	@Given("the user is on the OrangeHRm login page")
	public void the_user_is_on_the_OrangeHRm_login_page() throws Exception {
		luncher();
		Thread.sleep(5000);
		pages2 = new Login_pages(driver);
	 
	}

	@When("the user leaves both the username and password fields 	blank")
	public void the_user_leaves_both_the_username_and_password_fields_blank() throws InterruptedException {
		Thread.sleep(5000);
	   
	}
	
	@When("the user click on the login button")
	public void the_user_click_on_the_login_button() {
		toclick(pages2.getLogin());
	   
	}

	@Then("the user should look an error massage")
	public void the_user_should_look_an_error_massage() {
		driver.quit();
	    
	}

}
