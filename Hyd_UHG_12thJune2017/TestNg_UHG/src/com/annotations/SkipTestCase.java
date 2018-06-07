package com.annotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {
	
	@Test(priority=1)
	public void login(){
		//Selenium code to Login
		System.out.println("Login");
	} 
		
	@Test(priority=2)//(priority=2,enabled=false)
	public void composemail(){
		//Selenium code to composemail
		//System.out.println("Composemail");
		throw new SkipException("This testcase is skipping for so and so reason...");
	} 
		
	@Test(priority=3)
	public void Savemail(){
		//Selenium code to SaveMail
		System.out.println("SaveMail");
	} 
}
