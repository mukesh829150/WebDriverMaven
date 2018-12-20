package com.fb.TestSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.fb.TestBase.Browser;
import com.sun.glass.events.KeyEvent;

public class RobotFileUpload extends Browser{
	
	Robot robot;
	
	@Test
	public void uploadFile() throws AWTException{
		
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		robot = new Robot();
		
		driver.findElement(By.id("imagesrc")).click();
		
		StringSelection selection = new StringSelection("C:\\Users\\user\\Desktop\\CC\\New folder\\IIM Calcutta PGPex Class of 2017-e-Brochure.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
