package com.fb.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.fb.GenericReusable.WebElementAction;
import com.fb.ReportingAndListeners.Reporting;

public class LandingPageElement{
	
	WebDriver driver;
	
	
	public LandingPageElement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//page object model using Page Factory
	
	//constructor creates objects
	
	@FindBy(name="email")
	public WebElement txtLoginEmail;
	
	@FindBy(name="pass")
	public WebElement txtLoginPassword;
	
	@FindBy(id="loginbutton")
	public WebElement btnLogin;
	
	@FindBy(id="u_0_j")
	WebElement txtFirstName;
	
	@FindBy(id="u_0_l")
	WebElement txtLasttName;
	
	@FindBy(id="u_0_o")
	WebElement txtMobile;
	
	@FindBy(id="u_0_v")
	WebElement txtRegPassword;
	
	@FindBy(id="day")
	WebElement drpRegBirthday;
	
	@FindBy(id="month")
	WebElement drpRegBirthmonth;
	
	@FindBy(id="year")
	WebElement drpRegBirthyear;
	
	@FindBy(xpath="//input[@type='radio' and @value=1]")
	WebElement radFemale;
	
	@FindBy(xpath="//input[@type='radio' and @value=2]")
	WebElement radMale;
	
	@FindBy(xpath="//button[@name='websubmit']")
	WebElement SignUp;
	
	WebElementAction elementAction = new WebElementAction();
	TimelinePageElement Timelineelement;
	
	
	public boolean Login(String UserName, String Password) {
		try {
			try{
			txtLoginEmail.sendKeys(UserName);
			Reporting.logger.log(Status.PASS,"Enter <b>UserName</b> :"+UserName);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Enter UserName");
			}
			
			try{
			txtLoginPassword.sendKeys(Password);
			Reporting.logger.log(Status.PASS,"Enter <b>Password</b> :"+Password);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Enter Password");
			}
			
			
			try{
			btnLogin.click();
			Reporting.logger.log(Status.PASS,"Click on Login Button");
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Click UserName");
			}
			
			Timelineelement = new TimelinePageElement(driver);
			
			try{
				if(Timelineelement.homeNameButton != null){
					Reporting.logger.log(Status.PASS,"Login Successful");
				}else{
					Reporting.logger.log(Status.FAIL,"Unable to Login");
				}
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Unable to Login");
			}
			
			
			return true;
			}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean Register(String FirstName, String LastName, String Mobile, String Password,  String BirthDay,  String BirthMonth, String BirthYear) {
		try {
			txtFirstName.sendKeys(FirstName);
			txtLasttName.sendKeys(LastName);
			txtMobile.sendKeys(Mobile);
			txtRegPassword.sendKeys(Password);
			elementAction.selectElementByVisibleText(drpRegBirthday, BirthDay);
			elementAction.selectElementByVisibleText(drpRegBirthmonth, BirthMonth);
			elementAction.selectElementByVisibleText(drpRegBirthyear, BirthYear);
			radMale.click();
			SignUp.click();
			
			return true;
			}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	

}
