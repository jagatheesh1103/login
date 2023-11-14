package com.reusable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class Reusable extends Base_Class {
	
	
public JavascriptExecutor js;
	
	
	
	
	public  void toclick(WebElement Element ) {

		Element.click();
	}



	

	public  void windowhandaling() {
		String windowHandle = driver.getWindowHandle();

		Set<String> ch = driver.getWindowHandles();

		for (String neww : ch) {

			driver.switchTo().window(neww);

		}	

	}

	public void screenshot() throws IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File target=new File("src\\test\\resources\\screenshot\\new.png");
		FileUtils.copyFile(source, target);

	}

	public void enterkey() throws Exception {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void downkey() throws AWTException {
		Robot rob1 = new Robot();

		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);

	}
	
	
	public void tosendkey(WebElement element, String text) {
		element.sendKeys(text);
		

	}
	public  void backtonavigate(WebElement element) {
		driver.navigate().back();

	}
	
	public void scrolldown(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		

	}
	
	public void scrollup(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		

	}



	
	
	
	

}
