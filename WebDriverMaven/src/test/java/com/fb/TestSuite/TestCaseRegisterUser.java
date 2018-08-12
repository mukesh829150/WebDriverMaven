package com.fb.TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fb.DataHandler.LandingPageDataHandler;
import com.fb.DataObjects.LandingPageData;
import com.fb.GenericReusable.WebElementAction;
import com.fb.PageObjects.LandingPageElement;
import com.fb.ReportingAndListeners.Reporting;
import com.fb.TestBase.Browser;



public class TestCaseRegisterUser extends Browser{
	
	LandingPageElement Lpage;
	LandingPageData LandingPageData;
	LandingPageDataHandler landingPageHandler=new LandingPageDataHandler();
	public String methodStatus;
	public WebElementAction webElementAction=new WebElementAction();
	
	public TestCaseRegisterUser() {
		LandingPageData=landingPageHandler.getLandingPageData("NewUser2");
	}
	
	@Test(priority=1)
	public void TestRegister(){
		try {
		Reporting.logger=Reporting.report.createTest("RegisterUser");
		
		methodStatus=Step01ProvideRegistrationDetails();
		webElementAction.verifyMethodStatus(methodStatus,"Registration Successful","Registratioon Unsuccessful");
		

		methodStatus=Step02VerifyRegistrationDetails();
		webElementAction.verifyMethodStatus(methodStatus,"Registration Details Verified","Registration Details not Verified");
				
		
		}catch(Exception e) {
			Assert.assertEquals(false, true);
		}
	}


	private String Step02VerifyRegistrationDetails() {
		return "pass";
		// TODO Auto-generated method stub	
	}


private String Step01ProvideRegistrationDetails(){
	try {
	Lpage=new LandingPageElement(driver);
	/*String firstName=LandingPageData.firstName;
	String lastName=LandingPageData.lastName;
	String mobile=LandingPageData.mobile;
	String password=LandingPageData.loginPassword;
	String birthday=LandingPageData.birthday;
	String birthmonth=LandingPageData.birthmonth;
	String birthyear=LandingPageData.birthyear;*/
	
	//Lpage.Register(firstName, lastName, mobile, password, birthday, birthmonth, birthyear);
	boolean status=Lpage.Register(LandingPageData);
	if(status) {
	return "pass";
	}else {
		return "fail";
	}
	}catch(Exception e) {
		return "fail";
	}
}

	
	
	
	

}
