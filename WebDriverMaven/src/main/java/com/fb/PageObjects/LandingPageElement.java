package com.fb.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.fb.DataObjects.LandingPageData;
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
	public boolean Register(LandingPageData LPageData) {
		try {
			try{
				txtFirstName.sendKeys(LPageData.firstName);
				//Reporting.logger.pass("Enter <b>First Name</b> :"+LPageData.firstName, MediaBuilder.createScreenCaptureFromPath("screenshot.png").build());
				
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Enter First Name");
			}
			
			try{
				txtLasttName.sendKeys(LPageData.lastName);
				Reporting.logger.log(Status.PASS,"Enter <b>Last Name</b> :"+LPageData.lastName);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Enter Last Name");
			}
			
			try{
				txtMobile.sendKeys(LPageData.mobile);
				Reporting.logger.log(Status.PASS,"Enter <b>Mobile</b> :"+LPageData.mobile);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Enter Mobile");
			}
			
			try{
				txtRegPassword.sendKeys(LPageData.loginPassword);
				Reporting.logger.log(Status.PASS,"Enter <b>Password</b> :"+LPageData.loginPassword);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Enter Password");
			}
			
			try{
				elementAction.selectElementByVisibleText(drpRegBirthday, LPageData.birthday);
				Reporting.logger.log(Status.PASS,"Enter <b>BirthDay</b> :"+LPageData.birthday);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Select BirthDay");
			}
			
			try{
				elementAction.selectElementByVisibleText(drpRegBirthmonth, LPageData.birthmonth);
				Reporting.logger.log(Status.PASS,"Enter <b>BirthMonth</b> :"+LPageData.birthmonth);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Select BirthMonth");
			}
			
			try{
				elementAction.selectElementByVisibleText(drpRegBirthyear, LPageData.birthyear);
				Reporting.logger.log(Status.PASS,"Enter <b>BirthYear</b> :"+LPageData.birthyear);
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Select BirthYear");
			}
			
			/*try{
				radMale.click();
				Reporting.logger.log(Status.PASS,"Click on Gender Button");
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Click Gender");
			}*/
			
			try{
				if(LPageData.gender.equalsIgnoreCase("Male"))
				{
					radMale.click();
					Reporting.logger.log(Status.PASS,"Gender is Male");
				}
				else{
					radFemale.click();
				Reporting.logger.log(Status.PASS,"Gender is Female");
				}
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Genderisnot given proper");	
			}
			
			
			
			try{
				SignUp.click();
				Reporting.logger.log(Status.PASS,"Click on Sign Up Button");
			}catch(Exception e){
				Reporting.logger.log(Status.FAIL,"Not able to Click Sign Up");
			}
			
			return true;
			}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	

}
