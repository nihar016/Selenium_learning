package com.testCases;

import org.testng.annotations.Test;

import com.library.Library;

public class Test1 extends Library {
	@Test
	public void testcase1(){
		
		login();
		clickontask();
		clickonproandcustomer();
		clickonaddnewcustomer();
		createcustomer("CustomerA","DescriptionA","cradio1");
		verifysucessmsg();
		assertall();
	}

}
