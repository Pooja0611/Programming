package com.BridgeLabz.basics;

import com.BridgeLabz.util.UtilClass;

public class GamblingProgram {

	public static void main(String[] args) {
		System.out.println("Enter $stake value");
		int stake=UtilClass.IntInput();
		System.out.println("Enter $Goal value");
		int goal=UtilClass.IntInput();
		System.out.println("Enter number of trails");
		int trails=UtilClass.IntInput();
		int bets=0;int wins=0;
		for(int i=0;i<trails;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
				if(cash==goal)
					wins++;
			}
			System.out.println("wins "+wins+"out of number of trails "+trails);
			System.out.println("percentage of games won "+100*wins/trails);
			System.out.println("Avg number of bets= "+bets/trails);
		}
	}

}
