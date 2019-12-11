package com.BridgeLabz.test;

import com.BridgeLabz.basics.TriplatesProgram;
import com.BridgeLabz.util.UtilClass;

public class TestTriplates {

	public static void main(String[] args) {
		
		//int[] arr={3, -1,-7, -4, -5, 9, 10};
		//int[] arr= {1,2,3,4,5};
		 System.out.println("enter the size of array!!");
		 System.out.println("Enter the array elements");
			int arr[]=UtilClass.intArrayInput();
		    TriplatesProgram.triplates(arr);
	}

}
