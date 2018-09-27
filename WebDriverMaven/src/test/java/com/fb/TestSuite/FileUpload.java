package com.fb.TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fb.TestBase.Browser;

public class FileUpload extends Browser{
	
	@Test
	public void upload(){
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\user\\Desktop\\cc.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
	}
