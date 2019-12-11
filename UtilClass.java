package com.BridgeLabz.util;

import java.util.Scanner;

public  class UtilClass {
	
   public static String StringInput()
 {
	 Scanner s=new Scanner(System.in);
	 String str=s.nextLine();
	 return str;
 }
   public static int IntInput()
   {
	 Scanner s=new Scanner(System.in);
  	 int i=s.nextInt();
  	 return i;
   }
  
   
   public static int[] intArrayInput()
   {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   return arr;
   }
  	
}
