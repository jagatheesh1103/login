package com.stepdefinition;

import com.pages.Login_pages;
import com.reusable.Reusable;

import groovy.time.Duration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Stepdefinition extends Reusable{
	
	public Login_pages pages;
	
	@Given("the user has launched the orangeHRM application URL")
	public void the_user_has_launched_the_orangeHRM_application_URL() throws Exception {
		luncher();
		pages = new Login_pages(driver);
	    
	}

	@When("the user  provide a valid username")
	public void the_user_provide_a_valid_username() throws InterruptedException {
		Thread.sleep(10000);
		toclick(pages.getUser_name());
		tosendkey(pages.getUser_name(), "Admin");
	
	}

	@When("the user provide a valid password")
	public void the_user_provide_a_valid_password() throws InterruptedException {
		Thread.sleep(5000);
		toclick(pages.getPassword());
		tosendkey(pages.getPassword(), "admin123");
	   
	}

	@When("the user click the login button")
	public void the_user_click_the_login_button() throws InterruptedException {
		Thread.sleep(5000);
		toclick(pages.getLogin());
	
	}

	@Then("the user should be loggin successfully")
	public void the_user_should_be_loggin_successfully() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	    
	}
	
	
	



}
