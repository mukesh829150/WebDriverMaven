package com.fb.ReportingAndListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports report;//performs report generation
	public static ExtentTest  logger;//log
	
	public static void startReport(){	
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
		htmlReporter.config().setDocumentTitle("Selenium ExtentReport");
		
		report= new ExtentReports();
		report.attachReporter(htmlReporter);
		
//		report.setSystemInfo("Application", "Facebook");
//		report.setSystemInfo("OS", "Windows");
		
	}
}
