package com.annotations;

import org.testng.annotations.Test;

public class PriorityExample {

	
	@Test(priority=1)
	public void login(){
		//Selenium code to Login
		System.out.println("Login");
	} 
	
	
	@Test(priority=2)
	public void composemail(){
		//Selenium code to composemail
		System.out.println("Composemail");
	} 
	
	
	@Test(priority=3)
	public void Savemail(){
		//Selenium code to SaveMail
		System.out.println("SaveMail");
	} 
}
