package com.BridgeLabz.basics;

public class PowerOf2 {

	public static void main(String[] args) {
		int n=0;
		try
		{
			n=Integer.parseInt(args[0]);
			
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		int result=1;
		System.out.println(args[0]);
		for(int i=0;i<=n;i++)
		{
			result=2*result;
			System.out.println(2+"^"+i+"="+result);
		}
		
		
	}

}
