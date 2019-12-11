package com.BridgeLabz.test;

import java.util.Scanner;

import com.BridgeLabz.AlgorithmBased.BubbleSort;
import com.BridgeLabz.util.UtilClass;

public class TestBubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		int n=UtilClass.IntInput();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			
			arr[i]=UtilClass.IntInput();
		}
			
		BubbleSort.bubbleSort(arr);
		
		
		

	}

}
