package com.fb.DataHandler;

import com.fb.DataObjects.LandingPageData;

public class LandingPageDataHandler extends DataHandler {

	public String sheetName="LandingPage";
	
	public LandingPageData getLandingPageData(String rowName) {
		LandingPageData LandingPData=new LandingPageData();
		LandingPData.setFirstName(xls.getCellData(sheetName,rowName,"FirstName"));
		LandingPData.setLastName(xls.getCellData(sheetName,rowName,"LastName"));
		LandingPData.setLoginEmail(xls.getCellData(sheetName,rowName,"EmailId"));
		LandingPData.setLoginPassword(xls.getCellData(sheetName,rowName,"Password"));
		LandingPData.setMobile(xls.getCellData(sheetName,rowName,"Mobile"));
		LandingPData.setbirthday(xls.getCellData(sheetName,rowName,"Birthday"));
		LandingPData.setbirthmonth(xls.getCellData(sheetName,rowName,"BirthMonth"));
		LandingPData.setbirthyear(xls.getCellData(sheetName,rowName,"BirthYear"));
		return LandingPData;
	}
}
