package com.collectionAPIS;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Object> ar=new ArrayList<Object>();
		
		ar.add("B");
		ar.add("H");
		ar.add("D");
		ar.add("B");
		ar.add("H");
			
	//	System.out.println(ar.get(0));
		/*System.out.println("size="+ar.size());
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}*/
		
		for(Object x:ar){
			System.out.println(x);
		}

	}
//ArrayList is a built in class in java where we can store elements dynamically.
// add is the method to add elements into array. get is the method to get the elements.
//size() is the method to know the size of the array.
	
}
