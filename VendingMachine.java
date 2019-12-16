package com.BridgeLabz.AlgorithmBased;

public class VendingMachine {
	
static int COUNT,TOTAL;//I to change notes,total to count the notes
static int[] NOTES= {1000,500,100,50,10,5,2,1};//Array to store values of notes

//method to find the notes and print the output
public static void notes(int value)
{
	if(value/NOTES[COUNT]!=0)
	{
		TOTAL+=(value/NOTES[COUNT]);
		System.out.println(NOTES[COUNT]+"Rs Notes: "+value/NOTES[COUNT]);
		value=value%NOTES[COUNT];
	}
	COUNT++;
	if(value==0)
	{
		System.out.println("total notes: "+TOTAL );
		return;
	}
	notes(value);
}

}
