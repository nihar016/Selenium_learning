package com.annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneMoreMethodFail {
	@Test
	public void testcase1(){
		SoftAssert st=new SoftAssert();
		String Expstr="Bangalore";
		String Actstr="Bengaluru";
		System.out.println("A");
		if(!Expstr.equals(Actstr)){
			st.fail("Comparing two strings");
		}
		System.out.println("B");
		st.assertAll();
}
}