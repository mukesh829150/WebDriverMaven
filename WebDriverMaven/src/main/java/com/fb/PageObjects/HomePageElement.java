package com.fb.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElement {

	WebDriver driver;
	
	public HomePageElement(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_1frb']")
	public WebElement txtSearchBox;
	
	@FindBy(xpath="//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']")
	public WebElement searchButton;
	
	@FindBy(xpath="//a[@href='/profile.php?id=100002468350989&ref=br_rs']")
	public WebElement myFriendId;

}
