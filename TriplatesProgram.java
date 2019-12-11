package com.BridgeLabz.basics;

public class TriplatesProgram {

	public static void triplates(int[] num)
	{
		int n=num.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(num[i]+num[j]+num[k]==0)
						System.out.println(num[i]+","+num[j]+","+num[k]);
					break;
				}
			}
		}
		//System.out.println("The given numbers are not triplets!!");
	}
	

}
