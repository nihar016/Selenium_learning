package com.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class ParamWithExcel {
    @Test(dataProvider="getdata")
	public void testcase1(String cname,String cpwd){
		//Selenium code to login
		System.out.println(cname+" password is "+cpwd);
	}
    
    @DataProvider
    public Object[][] getdata(){
    	ShineXlsReader xls = new ShineXlsReader("TestData.xlsx");
    	int rcount = xls.getRowCount("Sheet1");
    	int ccount=xls.getColumnCount("Sheet1");
    	Object obj[][]=new Object[rcount-1][ccount];
    	for(int i=2;i<=rcount;i++){
    		for(int j=0;j<ccount;j++){
    			obj[i-2][j]=xls.getCellData("Sheet1", j, i);
    		}
    	}
    	return obj;
    }
}
