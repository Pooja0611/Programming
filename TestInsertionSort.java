package com.BridgeLabz.test;

import com.BridgeLabz.AlgorithmBased.BubbleSort;
import com.BridgeLabz.AlgorithmBased.InsertionSort;
import com.BridgeLabz.util.UtilClass;

public class TestInsertionSort {

	public static void main(String[] args) {
		System.out.println("Enter the String array size");
		int n=UtilClass.IntInput();
		String[] arr=new String[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			
			arr[i]=UtilClass.StringInput();
		}
			
		InsertionSort.insertionSort(arr);
		
		
		
	}

}
