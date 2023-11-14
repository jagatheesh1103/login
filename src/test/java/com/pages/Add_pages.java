package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class Add_pages extends Base_Class {
	public Add_pages(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[1]")
	WebElement admin_adminadd;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement ADD_admin_add_add5;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement add_user_role;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement add_employee_name;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement add_status;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement add_username;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement add_pasword;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement add_comfirm_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement admin_save;

	public WebElement getAdmin_save() {
		return admin_save;
	}


	


	public WebElement getAdmin_adminadd() {
		return admin_adminadd;
	}

	
	





	public WebElement getADD_admin_add_add5() {
		return ADD_admin_add_add5;
	}









	public WebElement getAdd_user_role() {
		return add_user_role;
	}

	

	public WebElement getAdd_employee_name() {
		return add_employee_name;
	}

	

	public WebElement getAdd_status() {
		return add_status;
	}

	

	public WebElement getAdd_username() {
		return add_username;
	}

	
	public WebElement getAdd_pasword() {
		return add_pasword;
	}

	

	public WebElement getAdd_comfirm_password() {
		return add_comfirm_password;
	}

	
	

}
