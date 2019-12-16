package com.BridgeLabz.basics;

import com.BridgeLabz.AlgorithmBased.Util;
import com.BridgeLabz.util.UtilClass;

public class TestMonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter principle,year and rate");
		double p=UtilClass.IntInput();
		double y=UtilClass.IntInput();
		double r=UtilClass.doubleInput();
        System.out.println("monthly payment is "+Util.monthlyPayment(p,y,r));
        
	}

}
