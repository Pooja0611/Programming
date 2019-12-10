package com.BridgeLabz.basics;

import com.BridgeLabz.util.UtilClass;

public class ToFindPrimeFactor {

	public static void main(String[] args) {
		System.out.println("Enter the N value");
		int n=UtilClass.IntInput();
		System.out.println("The prime factors are ");
        for(int i=2;i<=n;i++)
        {
        	if(n%i==0)
        	   System.out.println(i+"");
        	n/=i;
        }
       
	}

}
