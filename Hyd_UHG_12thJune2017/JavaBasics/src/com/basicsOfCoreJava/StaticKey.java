package com.basicsOfCoreJava;

public class StaticKey {
	
	String model;
	static int wheels=4;
	
	public  void test(){
		System.out.println("Testing for static ");
	}
	public static void main(String[] args) {
	
		StaticKey x=new StaticKey();
		x.test();
	}

}
