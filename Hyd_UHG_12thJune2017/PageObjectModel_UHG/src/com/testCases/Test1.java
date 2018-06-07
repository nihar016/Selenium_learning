package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.Activeprojectandcustomer;
import com.pageFactory.Entertimetrack;
import com.pageFactory.Loginpage;
import com.pageFactory.Opentask;
import com.testBase.TestBase;

public class Test1 extends TestBase{
	@Test
	public void testcase1() throws Throwable{
		
		OpenBrowser();
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		Entertimetrack entertimetrack = loginpage.login();
		Opentask opentask = entertimetrack.clickontask();
		Activeprojectandcustomer activeprojectandcustomer = opentask.clickonproandcust();
		activeprojectandcustomer.clickoncreatenewcustomer();
	
		
	}

}
