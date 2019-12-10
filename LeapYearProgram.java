package com.BridgeLabz.basics;

import com.BridgeLabz.util.UtilClass;

public class LeapYearProgram {

	public static void main(String[] args) {
		System.out.println("enter year");
		String y=UtilClass.StringInput();
		if(y.length()==4)
		{
		int i=Integer.parseInt(y);
		if((i%400==0) || ((i%4==0) && (i%100!=0)))
		{
			System.out.println("the given number is a leap year "+i);
		}
		else
		    System.out.println("the given number is not a leap year "+i);
		}
		else
		{
			System.out.println("pls enter a valid input!!");
		}
		

	}

}
