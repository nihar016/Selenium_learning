package com.testCases;

import org.testng.annotations.Test;

import com.library.Library;

public class Test2 extends Library {
	@Test
	public void testcase2(){
		
		login();
		clickontask();
		clickonproandcustomer();
		clickonaddnewcustomer();
		createcustomer("CustomerB","DescriptionB","cradio2");
		verifysucessmsg();
		assertall();
	}

}
