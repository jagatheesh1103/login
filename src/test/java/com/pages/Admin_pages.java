package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class Admin_pages extends Base_Class{
	
	public Admin_pages(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[1]")
	WebElement admin_admin;
	

	

	public WebElement getAdmin_admin() {
		return admin_admin;
	}


	@FindAll({
	@FindBy(xpath="//input[@placeholder='Username']"),
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	})

	WebElement login_user_name;
	
	
	
	@FindAll({
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']"),
	@FindBy(xpath="//input[@name='password']")
	})
	WebElement login_password;
	
	
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement Login_login;
	
	
	public WebElement getLogin_user_name() {
		return login_user_name;
	}





	





	public WebElement getLogin_password() {
		return login_password;
	}





	




	public WebElement getLogin_login() {
		return Login_login;
	}





	




	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	WebElement Admin_username;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement Admin_role;

	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement Admin_name;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement Admin_status;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement Admin_search;

	
	
	public WebElement getAdmin_search() {
		return Admin_search;
	}


	


	public WebElement getAdmin_username() {
		return Admin_username;
	}

	
	public WebElement getAdmin_role() {
		return Admin_role;
	}

	

	public WebElement getAdmin_name() {
		return Admin_name;
	}

	
	public WebElement getAdmin_status() {
		return Admin_status;
	}

	


}
