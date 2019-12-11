package com.BridgeLabz.test;
import com.BridgeLabz.basics.Permutation;
import com.BridgeLabz.util.UtilClass;

public class TestPermutation {
      public static void main(String[] args) {
		System.out.println("Enter the input string");
		String str=UtilClass.StringInput();
		int n=str.length();
		Permutation.permute(str, 0, n-1);

	}

}
