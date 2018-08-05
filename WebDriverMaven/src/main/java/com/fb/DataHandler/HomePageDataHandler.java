package com.fb.DataHandler;

import com.fb.DataObjects.HomePageData;

public class HomePageDataHandler extends DataHandler {

	public String sheetName="HomePage";
	
	public HomePageData getHomePageData(String rowName) {
		HomePageData HomePData=new HomePageData();
		HomePData.setSearchBox(xls.getCellData(sheetName,rowName,"SearchText"));
		return HomePData;
	}
}
