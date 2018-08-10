package com.fb.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimelinePageElement {
	
	WebDriver driver;
	
	public TimelinePageElement(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class, '_1vp5')]")
	public WebElement homeNameButton;
	
	/*@FindBy(xpath="//li[2]//a[@class='_6-6']")
	WebElement homeAboutButton;*/

	@FindBy(xpath="//div[@class='_1mf _1mj']")
	public WebElement txtPost;
	
	@FindBy(xpath="//button[contains(@class, '_1mf7')]")
	public WebElement btnPost;
}
