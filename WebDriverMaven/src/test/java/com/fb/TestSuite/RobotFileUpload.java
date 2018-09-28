package com.fb.TestSuite;

import java.awt.AWTException;
import java.awt.Robot;

import com.fb.TestBase.Browser;

public class RobotFileUpload extends Browser{
	
	Robot robot;
	
	public void uploadFile() throws AWTException{
		
		driver.navigate().to("http://automationtesting.in/file-upload-using-robot-class-in-selenium/");
		driver.manage().window().maximize();
		
		robot = new Robot();
		
	}

}
