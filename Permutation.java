package com.BridgeLabz.basics;

public class Permutation {
public static void permute(String str,int l,int r)
{
	/*
	 * l is the starting index and r is the end index!
	 */
	if(l==r)
	{
		System.out.println(str);
	}
	else
	{
		for(int i=l;i<=r;i++)
		{
			str=swap(str,l,i);
			permute(str,l+1,r);
			str=swap(str,l,i);
		}
	}
}
public static String swap(String a,int i,int j)
{
	char temp;
	char[] charArray=a.toCharArray();
	temp=charArray[i];
	charArray[i]=charArray[j];
	charArray[j]=temp;
	return String.valueOf(charArray);
}
}
