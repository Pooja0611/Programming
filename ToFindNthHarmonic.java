package com.BridgeLabz.basics;

import com.BridgeLabz.util.UtilClass;

public class ToFindNthHarmonic {
	
    public static void main(String[] args)
    {
    	System.out.println("Enter the number");
    	int num=UtilClass.IntInput();
    	double sum=0;
    	for(int i=1;i<=num;i++)
    	{
    		sum+=(double)1/i;
    		System.out.println(sum);
    	}
    	System.out.println("nth harmonic is "+sum);
    }
}
