package com.fb.TestSuite;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.fb.DataHandler.LandingPageDataHandler;
import com.fb.DataHandler.TimeLineDataHandler;
import com.fb.DataObjects.LandingPageData;
import com.fb.DataObjects.TimelineData;
import com.fb.PageObjects.LandingPageElement;
import com.fb.PageObjects.TimelinePageElement;
import com.fb.TestBase.Browser;

public class TestCaseTimeLine extends Browser{
	
	TestCaseLoginFb LoginTest = new TestCaseLoginFb();
	
	LandingPageElement Lpage;
	LandingPageData LpageData;
	LandingPageDataHandler LDataHandler=new LandingPageDataHandler();
	
	TimelinePageElement Tpage;
	TimelineData TpageData;
	TimeLineDataHandler TDataHandler =new TimeLineDataHandler();
	
	
	
	public TestCaseTimeLine(){
		LpageData = LDataHandler.getLandingPageData("TestCaseRegisterUser1");
		TpageData = TDataHandler.getTimeLineData("TestCaseRegisterUser1");
	}
	
	@Test
	public void TestTimeLine() throws InterruptedException{
		
		Step01Login();
		Step02PostinTimeline();
	}

	private void Step01Login() {
		//LoginTest.Step01ProvideEmailandPass();
		Lpage = new LandingPageElement(driver);
		Lpage.Login(LpageData.loginEmail, LpageData.loginPassword);
	}
	
	private void Step02PostinTimeline() throws InterruptedException {
		Tpage = new TimelinePageElement(driver);
		Actions insertKey = new Actions(driver);
		Thread.sleep(2000);
		Tpage.homeNameButton.click();
		Thread.sleep(2000);
		Tpage.txtPost.click();
		Tpage.txtPost.click();
		insertKey.sendKeys(TpageData.postData).build().perform();
		Tpage.btnPost.click();
	}

}
