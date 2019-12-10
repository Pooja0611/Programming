package com.BridgeLabz.basics;

import com.BridgeLabz.util.UtilClass;

public class CouponProgram {

	public static void main(String[] args) {
		System.out.println("Enter the coupon number");
		int n=UtilClass.IntInput();
		boolean[] isNewCoupon=new boolean[n];
		int count=0;int distinct=0;
		while(distinct<n)
		{
			int value=(int)(Math.random()*n);
			count++;
			if(!isNewCoupon[value])
			{
				distinct++;
			}
				isNewCoupon[value]=true;
			
		}
		System.out.println("count is "+count);
		System.out.println("distinct is "+distinct);

	}

}
