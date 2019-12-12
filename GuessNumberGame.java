package com.BridgeLabz.AlgorithmBased;

import java.util.Scanner;

public class GuessNumberGame {
	
	static Scanner s=new Scanner(System.in);
	public static int find()
	{
		int low=0,high=127,mid;
		while(low!=high)
		{
			mid=(low+high)/2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c=s.nextInt();
			mid=(low+high)/2;
			if(c==1)
			{
				high=mid;
			}
             low=mid+1;
	}
		return low;

}
}
