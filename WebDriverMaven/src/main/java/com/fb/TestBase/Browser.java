package com.fb.TestBase;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fb.GenericReusable.XlsReader;
import com.fb.ReportingAndListeners.Reporting;
import com.fb.ReportingAndListeners.WebDriverListner;

public class Browser {
	
	public static WebDriver dr;
	public static EventFiringWebDriver driver; // This is an instance of driver which will listen to the events in selenium with the help of method called register
	public WebDriverListner eventListner;//=new WebDriverListner();//It's a Selenium Class where the events are listed
	public static String driverPath = System.getProperty("user.dir") + "//src//main//resources//drivers";
	//public static List<String> executionList;
	

	public static List<String> getExecutionLst(){
		
		XlsReader xls = new XlsReader(System.getProperty("user.dir")+"//src//test//resources//Data//excelWork.xlsx");
		String sheetName = "PrintStatus";
		int RowNum = xls.getRowCount(sheetName);
		List<String> executionList=new LinkedList<String>();
		
		 for(int i=1; i<=RowNum; i++){
			 String toBeExecuted = xls.getCellData(sheetName, i, "To be Executed");
			// System.out.println(toBeExecuted);
			 
			 if(toBeExecuted.equalsIgnoreCase("Yes")){
				 String methodName = xls.getCellData(sheetName, i, "TestMethods");
				 executionList.add(methodName);
			 }
		 }
		 return executionList;
		
	}
	
	@BeforeTest
	public void report(){
		Reporting.startReport();
	}
	
	@BeforeMethod
	public void OpenChromeBrowser(String Url) {	
		String chromePath = driverPath + "//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		dr = new ChromeDriver();
		driver=new EventFiringWebDriver(dr);
		eventListner=new WebDriverListner();
		driver.register(eventListner);
		driver.navigate().to(Url);
		driver.manage().window().maximize();
	}
//	@BeforeMethod
	public void OpenFirefoxBrowser() {
		String firefoxPath= driverPath + "//geckodriver.exe";
		//firefoxPath="D://Project//SeleniumClass//WebDriver//Drivers//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxPath);
		dr = new FirefoxDriver();
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
	
	@AfterTest
		public void CloseTest() {
			Reporting.report.flush();
		}

}
