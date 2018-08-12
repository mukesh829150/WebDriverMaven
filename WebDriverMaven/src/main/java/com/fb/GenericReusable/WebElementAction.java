package com.fb.GenericReusable;


import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.fb.ReportingAndListeners.Reporting;
import com.fb.TestBase.Browser;



public class WebElementAction extends Browser{
	
	public boolean selectElementByVisibleText(WebElement element, String text){
		try{
			Select select=new Select(element);
			select.selectByVisibleText(text);	
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean selectElementByValue(WebElement element, String value){
		try{
			Select select=new Select(element);
			select.selectByValue(value);	
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean selectElementByIndex(WebElement element, int index){
		try{
			Select select=new Select(element);
			select.selectByIndex(index);	
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean alertAccept(){
		WebDriverWait wait=new WebDriverWait(driver,2);
		try{
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean switchFramebyIdorName(String name){
		WebDriverWait wait=new WebDriverWait(driver,2);
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(name)));
			driver.switchTo().frame(name);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean switchWindowByTitle(String requiredTile){
		try{
			String flag = null;
			Set<String> handles = driver.getWindowHandles();
			
			for (String presenthandle : handles) {
				if(driver.switchTo().window(presenthandle).getTitle().equalsIgnoreCase(requiredTile)){
					flag="success";
					break;
					}
				
			}
			if(flag.equalsIgnoreCase("success")){
				return true;
			}else{
			return false;
			}
		}catch(Exception e){
			return false;
		}
	}
	
	public WebElement waitForVisibility(WebElement element) throws Error{
	       return new WebDriverWait(driver, 30)
	            .until(ExpectedConditions.visibilityOf(element));
	}

	/*Author: Abhishek
	 * Method Function:
	 * Last modified Date:
	 */
	public String takeScreenshot(){
		try{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		String ParentFilePath=System.getProperty("user.dir")+"/test-output/Screens/"+java.lang.System.currentTimeMillis();
		File destFile=new File(ParentFilePath+"screen.png");
		FileUtils.copyFile(srcFile, destFile);
		return ParentFilePath+"screen.png";
		}catch(Exception e){
			System.out.println("File not found");
			return "fail";
		}
	}

	public void verifyMethodStatus(String methodStatus, String passMessaage, String failMessage) {
		try {
			if(methodStatus.equalsIgnoreCase("pass")){
				Reporting.logger.log(Status.PASS, passMessaage);
			}else{
				Reporting.logger.log(Status.FAIL, failMessage);
				Assert.assertEquals(false, true);
			}
			
		}catch(Exception e) {
			Assert.assertEquals(false, true);
		}
		
	}
}
