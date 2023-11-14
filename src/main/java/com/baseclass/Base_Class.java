package com.baseclass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public static  WebDriver driver;
	public Properties pro;


	public void luncher() throws Exception {

		FileInputStream fi = new FileInputStream("src/test/resources/Properties/orangeHrm.properties");

		pro = new Properties();
		pro.load(fi);

		pro.getProperty("Browser").equalsIgnoreCase("chrome");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get(pro.getProperty("Url"));


	}
	
	

}
