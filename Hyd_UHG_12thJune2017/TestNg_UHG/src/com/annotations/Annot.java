package com.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Annot {
	
	@Test
	public void testcase1(){
		//Selenium code to composemail
		System.out.println("Composemail");
	} 
	
	@Test
	public void testcase2(){
		//Selenium code to SaveMail
		System.out.println("SaveMail");
	} 
	@BeforeMethod
	public void bmethod(){
		System.out.println("OpenBrowser,URL,Login");
	}
	@AfterMethod
	public void amethod(){
		System.out.println("Logout,CloseBrowser");
	}
	@BeforeClass
	public void bclass(){
		System.out.println("Start Server....");
	}
	@AfterClass
	public void aclass(){
		System.out.println("Shutdown Server...");
	}
	@Test
	public void testcase3(){
		//Selenium code to DraftMail
		System.out.println("DraftMail");
	} 
	
	
	

}
