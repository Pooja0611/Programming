package com.BridgeLabz.test;

import com.BridgeLabz.AlgorithmBased.Anagram;

public class TestAnagram {

	public static void main(String[] args) {
		char[] str1= {'t','e','r','h','a'};
		char[] str2= {'h','e','a','t','r'};
		if(Anagram.areAnagram(str1,str2))
		
			System.out.println("Two strings are anagram of each other");
		
		else
			System.out.println("Two strings are not anagram of each other");
	}

}
