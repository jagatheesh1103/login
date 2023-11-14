package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class Login_pages extends Base_Class {
	public Login_pages(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

	/*public WebElement getUser_name1() {
		return user_name1;
	}*/



	

	@FindAll({
	@FindBy(xpath="//input[@placeholder='Username']"),
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	})

	WebElement user_name;
	
	
	
	@FindAll({
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']"),
	@FindBy(xpath="//input[@name='password']")
	})
	WebElement password;
	
	
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement login;
	

	public WebElement getUser_name() {
		return user_name;
	}

	

	public WebElement getPassword() {
		return password;
	}

	

	public WebElement getLogin() {
		return login;
	}

	
	
	
	
	
	
	
	

}
