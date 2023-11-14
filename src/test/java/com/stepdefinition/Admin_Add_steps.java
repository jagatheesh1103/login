package com.stepdefinition;

import com.pages.Add_pages;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Admin_Add_steps extends Reusable{
	
	
	public  Add_pages addpages;

	
	
	@When("the user clcik the admin option")
	public void the_user_clcik_the_admin_option() throws InterruptedException {
		 Add_pages addpages = new Add_pages(driver);
		 Thread.sleep(5000);
		 toclick(addpages.getAdmin_adminadd());

	}

	@When("the user click the add fucntion")
	public void the_user_click_the_add_fucntion() throws InterruptedException {
		 Thread.sleep(3000);
		 toclick(addpages.getADD_admin_add_add5());


	}

	@Then("the user validate the add page")
	public void the_user_validate_the_add_page() {
	    
	}

	@When("the user select the user role")
	public void the_user_select_the_user_role() throws Exception {
		 Thread.sleep(3000);
		 toclick(addpages.getAdd_user_role());
		 Thread.sleep(3000);
		 downkey();
		 Thread.sleep(3000);
		 enterkey();


	}

	@When("the user input the employee name")
	public void the_user_input_the_employee_name() throws InterruptedException {
		 Thread.sleep(3000);
		 tosendkey(addpages.getAdd_employee_name(), "jagatheesh");

	}

	@When("the user choose the status")
	public void the_user_choose_the_status() throws Exception{
		 Thread.sleep(3000);
		 toclick(addpages.getAdd_status());
		 Thread.sleep(3000);
		 downkey();
		 Thread.sleep(3000);
		 enterkey();



	}

	@When("the user input the username")
	public void the_user_input_the_username() throws Exception {
		 Thread.sleep(3000);
		 tosendkey(addpages.getAdd_username(), "jaga");
	}

	@When("the user enter the password")
	public void the_user_enter_the_password() throws InterruptedException {
		 Thread.sleep(3000);
		 tosendkey(addpages.getAdd_pasword(), "jaga123");

	}

	@When("the user  reenter the comfirm password")
	public void the_user_reenter_the_comfirm_password() throws InterruptedException {
		 Thread.sleep(3000);
		 tosendkey(addpages.getAdd_comfirm_password(), "jaga123");
	}

	@When("the user click the save button")
	public void the_user_click_the_save_button() throws InterruptedException {
		 Thread.sleep(3000);
		 toclick(addpages.getAdmin_save());

	    
	}

	
	
	
	
}
