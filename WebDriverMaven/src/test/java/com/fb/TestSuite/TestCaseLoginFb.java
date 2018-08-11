package com.fb.TestSuite;

import org.testng.annotations.Test;

import com.fb.DataHandler.HomePageDataHandler;
import com.fb.DataHandler.LandingPageDataHandler;
import com.fb.DataObjects.HomePageData;
import com.fb.DataObjects.LandingPageData;
import com.fb.GenericReusable.WebElementAction;
import com.fb.PageObjects.HomePageElement;
import com.fb.PageObjects.LandingPageElement;
import com.fb.ReportingAndListeners.Reporting;
import com.fb.TestBase.Browser;


public class TestCaseLoginFb extends Browser{
	
	
	WebElementAction actions;
	
	LandingPageElement Lpage;
	LandingPageData LpageData;
	LandingPageDataHandler LDataHandler=new LandingPageDataHandler();
	
	HomePageElement Hpage;
	HomePageData HpageData;
	HomePageDataHandler HDataHandler=new HomePageDataHandler();
	public String  rowname;
	
	
	public TestCaseLoginFb() {
		rowname="TestCaseRegisterUser1";
		LpageData=LDataHandler.getLandingPageData(rowname);
		HpageData=HDataHandler.getHomePageData(rowname);
		
	}
	
	@Test(priority=2)
	public void TestLogin() throws InterruptedException {
		Reporting.logger=Reporting.report.createTest(rowname);
		
		Step01ProvideEmailandPass();
		Step02ClickSearchBox();//individually handle through try catch
		
		//Reporting.report.flush();
	}

	public void Step01ProvideEmailandPass() {
		Lpage = new LandingPageElement(driver);
		Lpage.Login(LpageData.loginEmail, LpageData.loginPassword);
		
		
	}
	
    /*private void Step02ClickLogin() {
			Lpage.btnLogin.click();
	}*/
	
	private void Step02ClickSearchBox() throws InterruptedException {
		Hpage= new HomePageElement(driver);
		
		Thread.sleep(6000);
		Hpage.txtSearchBox.click();
		Hpage.txtSearchBox.sendKeys(HpageData.SearchBox);
		Hpage.searchButton.click();
		Thread.sleep(6000);
		Hpage.myFriendId.click();
	}

}
