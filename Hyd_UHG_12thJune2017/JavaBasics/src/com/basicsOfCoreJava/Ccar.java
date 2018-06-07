package com.basicsOfCoreJava;

public class Ccar {
	
	String model;

	public static void main(String[] args) {
	
		Ccar a=new Ccar();
		Ccar b=new Ccar();
		Ccar c=new Ccar();
		
		a.model="BMW";
		b.model="Maruthi";
		c.model="Skoda";
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
	}

}
