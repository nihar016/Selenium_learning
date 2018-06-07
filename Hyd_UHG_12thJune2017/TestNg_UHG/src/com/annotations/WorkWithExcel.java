package com.annotations;

import org.testng.annotations.Test;

import xls.ShineXlsReader;



public class WorkWithExcel {
	@Test
	public void workwithExcel(){
		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
	 int rcount = xls.getRowCount("Sheet1");
	 int ccount = xls.getColumnCount("Sheet1");
	 System.out.println("row count="+rcount);
	 System.out.println("col count="+ccount);
	 
	 for(int i=2;i<=rcount;i++){
		 for(int j=0;j<ccount;j++){
			 String cellData = xls.getCellData("Sheet1", j, i);
			 System.out.println(cellData);
		 }
	 }
	}

}
