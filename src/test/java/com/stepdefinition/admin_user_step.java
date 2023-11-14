package com.stepdefinition;

import com.pages.Admin_pages;
import com.reusable.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class admin_user_step extends Reusable {
	
	public Admin_pages adminp;





	@Given("the user is logged into the OrangeHRM application")
	public void the_user_is_logged_into_the_OrangeHRM_application() throws Exception {
		luncher();
		adminp= new Admin_pages(driver);

		Thread.sleep(5000);
		tosendkey(adminp.getLogin_user_name(), "Admin");
		Thread.sleep(5000);
		tosendkey(adminp.getLogin_password(), "admin123");
		Thread.sleep(5000);
		toclick(adminp.getLogin_login());
	}

	@When("the user enter their username")
	public void the_user_enter_their_username() throws InterruptedException {
		Thread.sleep(5000);
		toclick(adminp.getAdmin_admin());
		Thread.sleep(5000);
		toclick(adminp.getAdmin_username());
		Thread.sleep(3000);
		tosendkey(adminp.getLogin_user_name(), "Anthony.Nolan");

	}

	@When("the user select their role")
	public void the_user_select_their_role() throws Exception {
		Thread.sleep(3000);
		toclick(adminp.getAdmin_role());
		Thread.sleep(3000);
		downkey();
		downkey();
		enterkey();			
	}

	@When("the user enter the employee name")
	public void the_user_enter_the_employee_name() throws Exception {
		Thread.sleep(3000);
		//toclick(adminp.getAdmin_name());
		tosendkey(adminp.getAdmin_name(), "Anthony Nolan");
		Thread.sleep(5000);
		downkey();
		enterkey();
	
	}

	@When("the user selects their status")
	public void the_user_selects_their_status() throws Exception {
		Thread.sleep(3000);
		toclick(adminp.getAdmin_status());
		downkey();
		enterkey();
	}

	@When("the user click the search icon")
	public void the_user_click_the_search_icon() throws InterruptedException {
		Thread.sleep(3000);
		toclick(adminp.getAdmin_search());
		
	}

	@Then("the user check the  employee records")
	public void the_user_check_the_employee_records() throws InterruptedException {
		Thread.sleep(10000);
	     driver.quit();

		
		
	}






}
