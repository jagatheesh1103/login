package com.stepdefinition;

import com.pages.Login_pages;
import com.reusable.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalide_login_step extends Reusable{
	
	
	public Login_pages pages1;

	
	@Given("the user is on the OrangeHRM login page")
	public void the_user_is_on_the_OrangeHRM_login_page() throws Exception {
		luncher();
		pages1= new Login_pages(driver);
	}

	@When("the user provide a invalid username")
	public void the_user_provide_a_invalid_username() throws InterruptedException {
		Thread.sleep(10000);
		toclick(pages1.getUser_name());
		tosendkey(pages1.getUser_name(), "admin1234");
	}

	@When("the user provide a invalid password")
	public void the_user_provide_a_invalid_password() throws InterruptedException {
		Thread.sleep(5000);
		toclick(pages1.getPassword());
		tosendkey(pages1.getPassword(), "Admin");
		
		
	    
	}
	
	@When("the user click the an login button")
	public void the_user_click_the_an_login_button() throws InterruptedException {
		Thread.sleep(5000);
		toclick(pages1.getLogin());

	}

	@Then("the user should see an error massage")
	public void the_user_should_see_an_error_massage() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

}
}