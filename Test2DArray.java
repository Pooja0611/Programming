package com.BridgeLabz.test;

import com.BridgeLabz.basics.TwoDArray;
import com.BridgeLabz.util.UtilClass;

public class Test2DArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows to be printed!");
		int m=UtilClass.IntInput();
		System.out.println("Enter the number of columns to be printed!");
		int n=UtilClass.IntInput();
		int a[][]=TwoDArray.inputInt(m, n);
		TwoDArray.display(a, m, n);
	}

}
