package com.fb.TestSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.fb.TestBase.Browser;

public class WebTablePractice extends Browser{
	
	String url = "http://toolsqa.com/automation-practice-table/";
	
	@Test
	public void practice() {
		driver.navigate().to("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		int rownum = rows.size();
		System.out.println(rownum);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement builtcolumn;
		WebElement structure = null;
		int highest=1;
			for (int i=1; i<=rownum; i++) {
				try {
					builtcolumn = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//tbody/tr["+i+"]/td[4]"))));
					//System.out.println(builtcolumn.getText());
					int columnvalue = Integer.parseInt(builtcolumn.getText());
					if(columnvalue > highest) {
						highest = columnvalue;
						structure=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//tbody/tr["+i+"]/th"))));
					}
				}catch(Exception e) {
					System.out.println("Column not present");
				}
			}
			System.out.println(structure.getText());	
	}

	

}
