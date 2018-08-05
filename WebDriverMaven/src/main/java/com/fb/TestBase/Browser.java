package com.fb.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeMethod;
import com.fb.ReportingAndListeners.WebDriverListner;

public class Browser {
	
	public static WebDriver dr;
	public EventFiringWebDriver driver; // This is an instance of driver which will listen to the events in selenium with the help of method called register
	public WebDriverListner eventListner;//=new WebDriverListner();//It's a Selenium Class where the events are listed
	public static String driverPath = System.getProperty("user.dir") + "//src//main//resources//drivers";
	
	@BeforeMethod
	public void OpenChromeBrowser() {	
		String chromePath = driverPath + "//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		dr = new ChromeDriver();
		driver=new EventFiringWebDriver(dr);
		eventListner=new WebDriverListner();
		driver.register(eventListner);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
//	@BeforeMethod
	public void OpenFirefoxBrowser() {
		String firefoxPath= driverPath + "//geckodriver.exe";
		//firefoxPath="D://Project//SeleniumClass//WebDriver//Drivers//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxPath);
		dr = new FirefoxDriver();
	}
	
	//@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}

}
