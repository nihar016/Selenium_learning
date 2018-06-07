package com.exceptionHandling;

public class Basics {
//Uncaught Exception
	public static void main(String[] args) {
		
		System.out.println("A");
		try{
		System.out.println(8/0);
		}catch(Throwable t){
		System.out.println(t.getMessage());
		}
		System.out.println("B");

	}

}
