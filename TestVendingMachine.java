package com.BridgeLabz.test;

import com.BridgeLabz.AlgorithmBased.VendingMachine;
import com.BridgeLabz.util.UtilClass;

public class TestVendingMachine {

	public static void main(String[] args) {
		try
		{
		System.out.println("Enter the amount");
		int amt=UtilClass.IntInput();
		VendingMachine.notes(amt);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
