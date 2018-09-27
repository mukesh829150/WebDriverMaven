package com.fb.ReportingAndListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportingRevised extends ExtentReports{
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	public static void startReport(){
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//test-output//NewExtentReport.html");
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		
	}

}
