 package com.BridgeLabz.AlgorithmBased;

public class InsertionSort {
   public static void insertionSort(String[] arr)
   {
	   int n=arr.length;
	   String temp="";
	   for(int i=0;i<n;i++)
	   {
		   for(int j=i+1;j<n;j++)
		   {
			   if(arr[i].compareToIgnoreCase(arr[j])>0)
			   {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
   
   for(String s:arr)
   {
	   System.out.println(s);
   }
	   
   }
}
