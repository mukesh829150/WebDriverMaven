package com.fb.TestSuite;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

import com.fb.GenericReusable.XlsReader;


public class PrintTestStatus{
	XlsReader xls = new XlsReader(System.getProperty("user.dir")+"//src//test//resources//Data//excelWork.xlsx");
	String sheetName = "PrintStatus";
	
	@Test
	public void printStatus(){	 
		/* String cellvalue = xls.getCellData(sheetName, "Login to Fb", "To be Executed");
		 System.out.println(cellvalue);*/
		 
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
		 
		 System.out.println(executionList);
	}

}
