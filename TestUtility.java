package com.BridgeLabz.test;

import com.BridgeLabz.AlgorithmBased.Utility;
import com.BridgeLabz.util.UtilClass;

public class TestUtility {

	public static void main(String[] args) {
		int[] arr= {50,90,80,60,10,20,40,30};
		String[] s = { "John", "Anthony", "Angelina", 
                "George", "Victor", "Joe", "Jackson" };
	
		 System.out.println("binary search for integers "+Utility.binary(arr, 4));
		 System.out.println("binary search for strings "+Utility.binary(s, "Joe"));
		 System.out.println("Enter first string");
		 String s1=UtilClass.StringInput();
		 System.out.println("Enter second string");
		 String s2=UtilClass.StringInput();
		 System.out.println("String anagram "+Utility.anagram(s1, s2));
		 System.out.println("Enter first integer value");
		 int i1=UtilClass.IntInput();
		 System.out.println("Enter the second integer value");
		 int i2=UtilClass.IntInput();
		 System.out.println("integer anagram "+Utility.anagram(i1, i2));
	     Utility.prime();
	     System.out.println("IsPrime "+Utility.isPrime(4));
		 System.out.println("IsPalindrome "+Utility.isPalindrome(i1));
         Utility.primePalindrome();
         Utility.primeAnagrams();
	}
}
