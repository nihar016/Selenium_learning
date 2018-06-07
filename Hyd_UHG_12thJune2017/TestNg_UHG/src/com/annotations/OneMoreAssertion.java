package com.annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneMoreAssertion {
	@Test
	public void testcase1(){
		SoftAssert st=new SoftAssert();
		boolean window_exists=true; // isDisplayed() 
		System.out.println("A");
	//	st.assertTrue(window_exists);
		st.assertFalse(window_exists);
		System.out.println("B");
		
		st.assertAll();
}
}