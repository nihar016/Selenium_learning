package com.testCases;

import org.testng.annotations.Test;

import com.library.Library;

public class Test3 extends Library {
	@Test
	public void testcase3(){
		
		login();
		clickontask();
		clickonproandcustomer();
		clickonaddnewcustomer();
		createcustomer("CustomerC","DescriptionC","cradio3");
		verifysucessmsg();
		assertall();
	}

}
