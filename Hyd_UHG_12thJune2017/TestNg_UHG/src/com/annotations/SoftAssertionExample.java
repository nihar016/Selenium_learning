package com.annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
	
	@Test
	public void testcase1(){
		SoftAssert st=new SoftAssert();
		int ActLinks=10;
		int ExpLinks=12; // Selenium code
		System.out.println("A");
		st.assertEquals(ActLinks, ExpLinks,"Comparing number of links");
		st.assertEquals(3, 2,"comparing number of radio buttons");
		System.out.println("B");
		
		
		st.assertAll();
		
	}

}
