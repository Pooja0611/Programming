package com.BridgeLabz.AlgorithmBased;

import java.util.ArrayList;

public class Utility {
	/*
	 * 3.bubbleSort for integer
	 */
	  public static int[] bubbleSort(int[] arr)
	  {
		  int temp;
		  for(int i=0;i<arr.length-1;i++)
		  {
			  for(int j=i+1;j<arr.length;j++)
			  {
				  
				  if(arr[i]>arr[j])
				  {
					  temp=arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				  }
			  }
		  }
		  return arr;
	  }
	  
	  /*
	   * 4.bubbleSort for string
	   */
	  public static void bubbleSort(String[] arr)
	  {
		  String temp;
		  for(int i=0;i<arr.length-1;i++)
		  {
			  for(int j=i+1;j<arr.length;j++)
			  {
				  if(arr[i].compareToIgnoreCase(arr[j])>0)
				  {
					  temp=arr[i];
					  arr[i]=arr[j];
					  arr[j]=temp;
				  }
			  }
		  }
	  }
	  


	/*
 * 1.binary search method for integer
 */
	public static int binary(int[]arr,int n)
	{
		int high=arr.length-1,low=0,mid;
		arr=bubbleSort(arr);
		while(low<=high)
		{
			mid=(low+high)/2;
			if(n==arr[mid])
				return mid;
			else if(arr[mid]<n)
				low=mid+1;
			else
				high=mid-1;		
		}
		return -1;	
	}
	
	/*
	 * 2.binary search method for string
	 * 
	 */
	public static int binary(String[] arr,String s)
	{
		int high=arr.length-1,low=0,mid;
		bubbleSort(arr);
		while(low<=high)
		{
			mid=(low+high)/2;
		
		if(s.equalsIgnoreCase(arr[mid]))
			return mid;
		else if(arr[mid].compareToIgnoreCase(s)<0)
			low=mid+1;
		else
			high=mid-1;
	    }
	return -1;
  }
	/*
	 * 5.insertion sort for integers
	 */
	public static void insertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[i]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		
	}
	/*
	 * 6.insertion sort for strings
	 */
    public static String[] insertionSort(String[] arr)
    {
    	for(int i=1;i<arr.length;i++)
    	{
    		String temp=arr[i];
    		int j=i-1;
    		while(j>=0 && arr[j].compareToIgnoreCase(temp)<0)
    		{
    			arr[i]=arr[j];
    			j=j-1;
    		}
    		arr[j+1]=temp;
    	}
    	return arr;
    }
    /*
     * 7.count the characters in the string
     */
    public static int[] count(String s)
    {
    	s=s.toLowerCase();
    	int[] c=new int[25];
    	for(int i=0;i<s.length();i++)
    	{
    		c[s.charAt(i)-97]++;
    	}
    	return c;
    }
    /*
     * 8.count numbers
     */
    public static int[] count(int n)
    {
    	int[] count=new int[10];
    	int temp=n;
    	while(temp!=0)
    	{
    		int r=temp%10;
    		count[r]++;
    		temp=temp/10; 		
    	}
    	return count;
    	
    }
    /*
     * 9.to find anagram for Strings
     */
    public static boolean anagram(String s1,String s2)
    {
    	if(s1.length()!=s2.length())
    	{
    		return false;
    	}
    	int[] s1Count=count(s1);
    	int[] s2Count=count(s2);
    	for(int i=0;i<s2Count.length;i++)
    	{
    		if(s2Count[i]!=s1Count[i])
    		{
    			return false;
    		}
    	}
    	return true;
    }
    /*
     * 10.to find anagram for integers
     */
    public static boolean anagram(int n1,int n2)
    {
    	int[] n1Count=count(n1);
    	int[] n2Count=count(n1);
    	for(int i=0;i<n2Count.length;i++)
    	{
    		if(n1Count[i]!=n2Count[i])
    		{
    			return false;
    		}
    	}
    	return true;
    }
    /*
     * 11.to find prime numbers blw 1 to 1000
     */
    public static void prime()
    {
    	System.out.println();
    	boolean b;
    	for(int j=2;j<=1000;j++)
    	{
    		b=true;
    		for(int i=2;i<j/2;i++)
    		{
    			if(j%i==0)
    			{
    				b=false;
    				break;
    			}
    		}
    		if(b)
    			System.out.println(j+"");
    	}
    }
    /*
     * 12.to find out if a number is prime or not
     */
    public static boolean isPrime(int n)
    {
    	
        boolean flag = false;
        if(n==0 || n==1)
        	return false;
        if(n%2==0)
        	return false;
        for(int i = 3; i <= n/2; i+=2)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }
    /*
     * 13.palindrome program
     */
     public static boolean isPalindrome(int n)
     {
    	 int temp=n;
    	 int sum=0;
    	 while(temp!=0)
    	 {
    		 int r=temp%10;
    		 sum=sum*10+r;
    		 temp=temp/10;
    	 }
    	 if(sum==n)
    		 return true;
    	 else
    	 {
        return false;
    	 }
     }
     /*
      * 14.primePalindrome
      */
     public static void primePalindrome() {
    	 System.out.println();
    	 boolean b;
    	 for(int j=2;j<=1000;j++)
    	 {
    		 b=true;
    		 for(int i=2;i<j/2;i++)
    		 {
    			 if(j%i==0)
    			 {
    				 b=false;
    				 break;
    			 }
    		 }
    		 if(b && isPalindrome(j))
    			 System.out.println(j+"");
    	 }
     }
     /*
      * 15.primeAnagrams
      */
      public static void primeAnagrams()
      {
    	  ArrayList<Integer> ar=new ArrayList<Integer>();
    	  System.out.println();
    	  boolean b;
    	  for(int j=2;j<=1000;j++)
    	  {
    		  b=true;
    		  for(int i=2;i<j/2;i++)
    		  {
    			  if(j%i==0)
    			  {
    				  b=false;
    				  break;
    			  }
    		  }
    		  if(b)
    			  ar.add(j);
    	  }
    	  for(int i=0;i<ar.size();i++)
    	  {
    		  for(int j=i+1;j<ar.size();j++)
    		  {
    			  if(anagram(ar.get(i),ar.get(j))) 
    				  System.out.println(ar.get(i)+" "+ar.get(j));
    		  }
    	  }
      }
    }
    


