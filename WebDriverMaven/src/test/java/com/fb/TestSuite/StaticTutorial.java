package com.fb.TestSuite;

import org.openqa.selenium.WebDriver;

public class StaticTutorial {
	
	static String a = "null";
	static WebDriver driver = null;

	public static void main(String[] args) {
		System.out.println(a);
		/*WebElement b = driver.findElement(By.id("a"));
		boolean c = b.isDisplayed();*/
		Overdng d = new Overdng();
		d.show();
	}

	public static class Overdng{
		
		public void show() {
			System.out.println("e");

		}
	}

}
