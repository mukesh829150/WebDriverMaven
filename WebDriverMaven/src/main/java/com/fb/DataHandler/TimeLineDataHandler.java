package com.fb.DataHandler;

import com.fb.DataObjects.TimelineData;

public class TimeLineDataHandler extends DataHandler{
	
	public String sheetname = "TimeLine";
	
	public TimelineData getTimeLineData(String rowName){
		
		TimelineData TimeLData = new TimelineData();
		TimeLData.setPostData(xls.getCellData(sheetname, rowName, "PostText"));
		return TimeLData;
		
	}

}
