package com.fb.TestSuite;

import org.testng.annotations.Test;

import com.fb.DataHandler.LandingPageDataHandler;
import com.fb.DataObjects.LandingPageData;
import com.fb.PageObjects.LandingPageElement;
import com.fb.ReportingAndListeners.Reporting;
import com.fb.TestBase.Browser;



public class TestCaseRegisterUser extends Browser{
	
	LandingPageElement Lpage;
	LandingPageData LandingPageData;
	LandingPageDataHandler landingPageHandler=new LandingPageDataHandler();
	
	public TestCaseRegisterUser() {
		LandingPageData=landingPageHandler.getLandingPageData("NewUser2");
	}
	
	@Test(priority=1)
	public void TestRegister(){
		Reporting.logger=Reporting.report.createTest("RegisterUser");
		Step01ProvideFirstNameAndBday();
		Step02ClickOnSignUP();
	}


	private void Step02ClickOnSignUP() {
		// TODO Auto-generated method stub
		
	}


private void Step01ProvideFirstNameAndBday(){
	Lpage=new LandingPageElement(driver);
	/*String firstName=LandingPageData.firstName;
	String lastName=LandingPageData.lastName;
	String mobile=LandingPageData.mobile;
	String password=LandingPageData.loginPassword;
	String birthday=LandingPageData.birthday;
	String birthmonth=LandingPageData.birthmonth;
	String birthyear=LandingPageData.birthyear;*/
	
	//Lpage.Register(firstName, lastName, mobile, password, birthday, birthmonth, birthyear);
	Lpage.Register(LandingPageData);	
	}

	
	
	
	

}
