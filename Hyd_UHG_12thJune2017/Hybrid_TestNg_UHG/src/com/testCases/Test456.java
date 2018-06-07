package com.testCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.library.Library;

import xls.ShineXlsReader;

public class Test456 extends Library{
	@BeforeMethod
	public void bmethod(){
		if(!ht.get("Test456").equalsIgnoreCase("yes")){
			throw new SkipException("This testcase is not set for execution in the moduledriver sheet");
		}
	}
	@Test(dataProvider="T1")
	public void testcase123(String cname,String pname,String pdesc,String pradio){
		System.out.println(cname+"==="+pname+"==="+pdesc+"==="+pradio);
	}
	
	@DataProvider(name="T1")
	public Object[][] getdata(){
		ShineXlsReader xls=new ShineXlsReader(".\\src\\com\\excelFiles\\DataPool.xlsx");
		int rcount = xls.getRowCount("Test2");
		int ccount = xls.getColumnCount("Test2");
		Object obj[][]=new Object[rcount-1][ccount];
		for(int i=2;i<=rcount;i++){
			for(int j=0;j<ccount;j++){
				obj[i-2][j]=xls.getCellData("Test2", j, i);
			}
		}
		
		return obj;
	}
	
}
