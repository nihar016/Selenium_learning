package com.testCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.testBase.TestBase;

public class OpenAndCloseBrowser extends TestBase{
	
	@BeforeSuite
	public void bsuite() throws Throwable {
		OpenBrowser();
		ModuleDriver();
	}

	@AfterSuite
	public void asuite(){
		CloseBrowser();
	}

}
