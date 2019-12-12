package com.BridgeLabz.test;

import java.util.Scanner;

import com.BridgeLabz.AlgorithmBased.GuessNumberGame;

public class TestGuessNumberGame {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Guess a number between 0 and 127");
        s.next();
        try
        {
        	System.out.println(GuessNumberGame.find());
        	
        }catch(Exception e)
        {
        	System.out.println("Enter the correct i/p");
        }

	}

}
