package com.BridgeLabz.basics;

import com.BridgeLabz.util.UtilClass;

public class QuadraticProgram {

	public static void main(String[] args) {
		System.out.println("Enter the value for a");
		int a=UtilClass.IntInput();
		System.out.println("Enter the value for  b");
		int b=UtilClass.IntInput();
		System.out.println("Enter the value for c");
		int c=UtilClass.IntInput();
		
		double delta=(b*b)-(4*a*c);
		double x1=(-b+Math.sqrt(delta))/(2*a);
		double x2=(-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("x1= "+x1);
		System.out.println("x2= "+x2);
	}

}
