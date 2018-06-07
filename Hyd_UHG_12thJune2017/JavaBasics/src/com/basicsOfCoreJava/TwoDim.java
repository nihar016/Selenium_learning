package com.basicsOfCoreJava;

public class TwoDim {

	public static void main(String[] args) {
		
		Object obj[][]=new Object[3][2];
		
		obj[0][0]="N1";
		obj[0][1]="P1";
		
		obj[1][0]="N2";
		obj[1][1]="P2";
		
		obj[2][0]="N3";
		obj[2][1]="P3";
		
		System.out.println("rowsize="+obj.length);
		System.out.println("col size="+obj[0].length);
		
		for(int i=0;i<obj.length;i++){
			for(int j=0;j<obj[0].length;j++){
				System.out.println(obj[i][j]);
			}
		}
		
	}

}
