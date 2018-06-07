package com.constructorExamples;

public class Car {
	String model;
	int price;
	//Default constructor
	public Car(){
		System.out.println("We are in Car constructor...");
	}
	//parameterized constructor
	public Car(String m){
		System.out.println("model of the car is "+m);
	}
	
	public Car(String model,int price){
		//System.out.println("model of the car is "+m+" price is "+p);
		this.model=model;
		this.price=price;
	}
	
	public static void main(String[] args) {
		Car x=new Car("BMW",20000);
		System.out.println(x.model);
		System.out.println(x.price);
		/*new Car("Skoda",10000);
		new Car("Maruti",2000);*/
		

	}

}
//Constructor is a method in the class whose name is same as class name.
//Rule1: Should not be static 
//Rule2: Should not have return datatype.
//Redesigning the method with different parameters datatype and number of parameters called as method overloading.
