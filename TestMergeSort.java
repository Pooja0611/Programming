package com.BridgeLabz.test;

import com.BridgeLabz.AlgorithmBased.MergeSort;

public class TestMergeSort {

	public static void main(String[] args) {
		String[] arr = { "John", "Anthony", "Angelina", 
                "George", "Victor", "Joe", "Jackson" };

            String[] sortedArray = MergeSort.mergeSort(arr);
           for(String s:sortedArray)
        	   System.out.println(s);
            }


	}


