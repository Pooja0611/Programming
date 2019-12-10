package com.BridgeLabz.basics;

import com.BridgeLabz.util.UtilClass;

public class FlipCoin_Percentage {

	
		public static void main(String[] args) {
			System.out.println("Enter the number of flips to be done?");
			int flips=UtilClass.IntInput();
			int heads=0;
			int tails=0;
			int count=0;
		    double percentageHeads,percentageTails;
			while(count<=flips)
			{
				if(Math.random()<=0.5)
				{
					heads++;
					System.out.println("heads count= "+heads);
				}
				else
				{
				tails++;
				System.out.println("tails count= "+tails);
				}
				count++;
			}
			 percentageHeads=(double)heads/flips*100;
			 percentageTails=(double)tails/flips*100;
			 
			 System.out.println("percentage number of heads "+percentageHeads);
			 System.out.println("percentage number of tails "+percentageTails);
		}
	

	}


