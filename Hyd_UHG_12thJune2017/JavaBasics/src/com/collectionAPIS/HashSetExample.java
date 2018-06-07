package com.collectionAPIS;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
	
		Set<String> s=new HashSet<String>();
		s.add("H");
		s.add("C");
		s.add("B");
		s.add("H");
		s.add("C");
		
		System.out.println("size="+s.size());
		
		Iterator<String> it=s.iterator();
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());*/
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*for(int i=0;i<s.size();i++){
			System.out.println(s.g);
		}*/
		
		/*for(String x:s){
			System.out.println(x);
		}*/

	}

}
